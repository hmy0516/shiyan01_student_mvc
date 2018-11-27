package com.student.pojo;

/**
 * @author HMY
 * @date 2018/11/22-14:46
 */
public class Student {
    /*
    * `id` int(11) NOT NULL AUTO_INCREMENT,
      `snum` varchar(20) DEFAULT NULL,
      `name` varchar(255) DEFAULT NULL,
      `age` int(11) DEFAULT NULL,
      `intro` varchar(2000) DEFAULT NULL,
    * */
    private int id;
    private String snum;
    private String name;
    private int age;
    private String intro;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", snum='" + snum + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", intro='" + intro + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSnum() {
        return snum;
    }

    public void setSnum(String snum) {
        this.snum = snum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
