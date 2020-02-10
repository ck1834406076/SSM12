package service;

import com.github.pagehelper.PageInfo;
import exception.SysException;
import pojo.Student;

public interface StudentServiceI {

    PageInfo<Student> query(Integer pageNo,Student student);
    void add(Student student) throws SysException;
}
