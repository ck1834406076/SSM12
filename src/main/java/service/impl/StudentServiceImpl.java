package service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import exception.SysException;
import mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Student;
import service.StudentServiceI;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentServiceI {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public PageInfo<Student> query(Integer pageNo, Student student) {
        PageHelper.startPage(pageNo,4);
        List<Student> list = studentMapper.query(student);

        return new PageInfo<>(list);
    }

    @Override
    public void add(Student student) throws SysException {
        studentMapper.add(student);
        int i=1/0;
        studentMapper.add(student);
    }
}
