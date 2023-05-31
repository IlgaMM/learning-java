package com.sda.she_likes_java.database_in_memory;

import java.util.List;

//CRUD
//create
//read
//update
//delete
public class AccentureStudentsRepository {
    public List<AccentureStudent> getAllStudents(){
        return List.of();
    }
    public AccentureStudent getStudentByID(Long id) {
        return null;
    }
    public AccentureStudent saveStudent(AccentureStudent student) {
        return  null;
    }
    public boolean deleteStudentById(Long id) {
        return true;
    }
    public AccentureStudent  updateStudent(AccentureStudent student) {
        return null;
    }

}
