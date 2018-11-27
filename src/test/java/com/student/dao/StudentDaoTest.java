package com.student.dao; 

import com.student.pojo.Student;
import com.sun.scenario.effect.impl.prism.ps.PPSBlend_MULTIPLYPeer;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.List;

public class StudentDaoTest {
    public static void main(String[] args) {
        StudentDao stuDao=new StudentDao();
        List<Student> students = stuDao.studentSerchAll();
        System.out.println("zdc"+students.get(0).getAge());
    }
} 
