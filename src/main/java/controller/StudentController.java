package controller;

import com.github.pagehelper.PageInfo;
import exception.SysException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.Student;
import service.StudentServiceI;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentServiceI studentServiceI;
    @RequestMapping("/query")
    public String query(@RequestParam(required = true,defaultValue = "1") Integer pageNo, Student student){
        System.out.println("执行了分页查询");
        student.setSname("三");
        PageInfo<Student> pageInfo = studentServiceI.query(pageNo, student);
        System.out.println(pageInfo);
        return "success";
    }
    @RequestMapping("/add")
    public String add(Student student) throws SysException {
        student.setSname("嘻嘻哈哈");
        studentServiceI.add(student);
        return "success";
    }
}
