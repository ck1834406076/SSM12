package aop;

import exception.SysException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Log implements Ordered{
    @Pointcut("execution(* service.impl.*.*(..))")
    public void pt(){}
    @Around("pt()")
    public Object logger(ProceedingJoinPoint pjp) throws SysException {

        Object[] args = pjp.getArgs();
        Object rtValue=null;
        try {
            System.out.println("前置通知");
             rtValue= pjp.proceed(args);
            System.out.println("后置通知");
        } catch (Throwable throwable) {
            System.out.println("异常通知");
            throw new SysException("数据异常");
        /*    throwable.printStackTrace();*/
        }
        return  rtValue;
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
