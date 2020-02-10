package mapper;

import pojo.Student;

import java.util.List;

public interface StudentMapper {

    List<Student>query(Student student);

    void add(Student student);
}
