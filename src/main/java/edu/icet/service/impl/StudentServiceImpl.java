package edu.icet.service.impl;

import edu.icet.dto.Student;
import edu.icet.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    final StudentRepository repository;
    final ModelMapper mapper;

    @Override
    public void addStudent(Student student) {
        repository.save(mapper.map(student, StudentEntity.class));
    }

    @Override
    public List<Student> getAll() {
        List<Student> studentList = new ArrayList<>();
        List<StudentEntity> all = repository.findAll();

        all.forEach(studentEntity -> {
            studentList.add(mapper.map(studentEntity, Student.class));
        });

        return studentList;
    }

    @Override
    public void deleteStudent(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updateStudent(Student student) {
        repository.save(mapper.map(student,StudentEntity.class));
    }

    @Override
    public Student searchById(Integer id) {
        return mapper.map(repository.findById(id), Student.class);
    }


}
