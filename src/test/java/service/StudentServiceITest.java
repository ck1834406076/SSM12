package service;

import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.Student;

import static org.junit.Assert.*;
@ContextConfiguration(locations = "classpath:spring/applicationConfig-*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class StudentServiceITest {
    @Autowired
private StudentServiceI studentServiceI;
    @Test
    public void query() {
        PageInfo<Student> pageInfo = studentServiceI.query(1, null);;
    }
}