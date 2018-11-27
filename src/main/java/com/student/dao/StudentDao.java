package com.student.dao;

import com.student.pojo.Student;
import com.student.util.SqlHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author HMY
 * @date 2018/11/22-14:49
 */
public class StudentDao {
    public void studentAdd(Student student){
        String sql="insert into student (snum,name,age,intro) VALUES (?,?,?,?)";
        String [] params={student.getSnum(),student.getName(),student.getAge()+"",student.getIntro()};
        new SqlHelper().executeUptate(sql,params);
    }

    public List<Student> studentSerchAll(){
        String sql="select * from student where 1=?";
        String [] params={"1"};
        return new SqlHelper().executeQuery(sql, params);
    }

    public void studentDel(String id){
        String sql = "delete from student where id=?";
        String [] params={id};
        new SqlHelper().executeUptate(sql,params);
    }

    public List<Student> studentFindById(String id){
        String sql = "select * from student where id=?";
        String [] params={id};
        return new SqlHelper().executeQuery(sql, params);
    }

    public void studentEdit(Student student){
        String sql = "update student set snum=?,name=?,age=?,intro=? where id = ?";
        String [] params={student.getSnum(),student.getName(),student.getAge()+"",student.getIntro(),student.getId()+""};
        new SqlHelper().executeUptate(sql,params);
    }
}
