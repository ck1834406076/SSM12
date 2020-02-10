package mapper;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.ui.ModelMap;
import pojo.Student;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class StudentMapperTest {

    @Test
    public void query() {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("mybatis/mybatisConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(is);
        SqlSession sqlSession = factory.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student();
        student.setSname("三");
        List<Student> list = mapper.query(student);
        System.out.println(list);

    }
}