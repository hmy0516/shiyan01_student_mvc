package com.student.util;
//src=类路径
import com.student.pojo.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//这是一个工具栏，主要用于完成对数据库的crud操作
public class SqlHelper
{
	//定义需要的变量
	private static Connection ct=null;//连接
	private static ResultSet rs=null;//结果
	private static PreparedStatement ps=null;


	//把查询封装一个函数
	//sql
	public ArrayList<Student> executeQuery(String sql, String []paras)
	{
		ArrayList<Student> al=new ArrayList();
		try {
			ct=DBUtil.getCon();
			ps=ct.prepareStatement(sql);
			//给sql问号赋值
			for (int i = 0; i < paras.length; i++)
			{
				ps.setString(i+1, paras[i]);
			}
			rs=ps.executeQuery();
			while(rs.next())
			{
				/*
    * `id` int(11) NOT NULL AUTO_INCREMENT,
      `snum` varchar(20) DEFAULT NULL,
      `name` varchar(255) DEFAULT NULL,
      `age` int(11) DEFAULT NULL,
      `intro` varchar(2000) DEFAULT NULL,
    * */
				Student student=new Student();
				student.setId(rs.getInt("id"));
				student.setSnum(rs.getString("snum"));
				student.setName(rs.getString("name"));
				student.setAge(rs.getInt("age"));
				student.setIntro(rs.getString("intro"));
				al.add(student);
			}
			return al;
		} catch (Exception e)
		{
			e.printStackTrace();
		}finally
		{
			DBUtil.close(rs,ps,ct);
		}
		return al;

	}
	public ResultSet executeQuery(String sqlstr)
	{
		Statement stmt = null;
		try
		{
			//得到连接
			ct=DBUtil.getCon();
			//ps=ct.prepareStatement(sqlstr);
			stmt = ct.createStatement();
			//创建结果集
			rs = stmt.executeQuery(sqlstr);
			//将结果集返回
			return rs;
		}
		catch(SQLException e)
		{
			System.out.print("错误");
		}
		return null;
	}

	public  void executeUptate(String sqlstr,String [] paras)
	{
		Statement stmt = null;
		PreparedStatement ps=null;
		int num=0;
		try {
			ct=DBUtil.getCon();
			ps=ct.prepareStatement(sqlstr);
			//给sql问号赋值
			for (int i = 0; i < paras.length; i++)
			{
				ps.setString(i+1, paras[i]);

			}
			ps.executeUpdate();

		} catch (Exception e)
		{
			e.printStackTrace();
		}finally
		{
			DBUtil.close(rs,ps,ct);
		}
	}

}
