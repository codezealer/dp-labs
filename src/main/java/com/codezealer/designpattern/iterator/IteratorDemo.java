package com.codezealer.designpattern.iterator;


/**
 * 采用iterator模式，遍历的时候统一用的是Iterator对象，这样内部结构变化了，也不需要修改遍历的逻辑
 */

public class IteratorDemo {

    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        classroom.addStudent(new Student("张三", 10));
        classroom.addStudent(new Student("李四", 11));

        Iterator iter = classroom.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.getNext());
        }

    }


    public interface Iterator {
        public boolean hasNext();
        public Object getNext();
    }


    public static class ClassroomIterator implements Iterator {
        private Classroom classroom;
        private int index = 0;

        public ClassroomIterator(Classroom classroom) {
            this.classroom = classroom;
        }

        @Override
        public boolean hasNext() {
            if (index < classroom.getStudents().length) {
                return true;
            } else {
                return false;
            }

        }

        @Override
        public Object getNext() {
            return classroom.getStudents()[index++];
        }
    }


    public static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static class Classroom {
        Student[] students = new Student[2];
        int index = 0;

        public void addStudent(Student student) {
            students[index++] = student;
        }

        public Student[] getStudents() {
            return students;
        }

        public Iterator iterator() {
            return new ClassroomIterator(this);
        }

    }



}
