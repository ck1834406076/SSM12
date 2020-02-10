package exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SysExceptionHandler implements HandlerExceptionResolver{
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mv = new ModelAndView();
        if(ex instanceof SysException){
            String msg = ((SysException) ex).getMsg();
            mv.addObject("msg",msg);
        }else {
            mv.addObject("msg","服务器正忙，如有紧急情况请联系管理员");
        }
        mv.setViewName("exception");
        return mv;
    }
}
