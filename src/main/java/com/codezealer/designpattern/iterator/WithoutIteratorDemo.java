package com.codezealer.designpattern.iterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * 不用迭代器的版本
 * 功能：教室里面有很多学生，我们需要遍历里面的所有学生
 *
 * 我们可以看到当前Classroom里面的Student的存储用的是数组来进行存储
 * 如果我们将Student的存储改为List的话，main方法里面的for循环就需要进行调整了
 * 这就是所谓的耦合
 */
public class WithoutIteratorDemo {

    public static void main(String[] args) {

        Classroom classroom = new Classroom();
        classroom.addStudent(new Student("张三", 10));
        classroom.addStudent(new Student("李四", 11));

        /*for (int i=0; i<classroom.getStudents().length; i++) {
            System.out.println(classroom.getStudents()[i]);
        }*/
        for (int i=0; i<classroom.getStudents().size(); i++) {
            System.out.println(classroom.getStudents().get(i));
        }

    }



    public static class Classroom {
//        Student[] students = new Student[2];
        List<Student> students = new ArrayList<>();

        int index = 0;

//        public Student[] getStudents() {
//            return students;
//        }

//        public void addStudent(Student student) {
//            students[index++] = student;
//        }

        public List<Student> getStudents() {
            return students;
        }
        public void  addStudent(Student student) {
            students.add(student);
        }


    }

    public static class Student {
        private String name;
        private int age;

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
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
    }

}
