package com.example.demo;

public class Student {
    private String name;
    private int studentNumber;
    private double grade;

    public Student(String name, int studentNumber, double grade) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public double getGrade() {
        return grade;
    }
}


 class StudentList {
    private Student[] students;

    public StudentList(int maxSize) {
        students = new Student[maxSize];
    }

    public void addStudent(String name, int studentNumber, double grade) {
        // Créez une nouvelle instance de Student avec les données fournies
        Student newStudent = new Student(name, studentNumber, grade);

        // Ajoutez cette instance au tableau students
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = newStudent;
                break; // Sortez de la boucle une fois l'ajout effectué
            }
        }
    }

    public void displayStudents() {
        // Parcourez le tableau students et affichez les détails de chaque étudiant
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println("Étudiant " + (i + 1) + ":");
                System.out.println("Nom : " + students[i].getName());
                System.out.println("Numéro d'étudiant : " + students[i].getStudentNumber());
                System.out.println("Note : " + students[i].getGrade());
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        // Créez une instance de StudentList pouvant contenir jusqu'à 5 étudiants
        StudentList myStudentList = new StudentList(5);

        // Ajoutez des étudiants à la liste
        myStudentList.addStudent("Alice", 101, 90.5);
        myStudentList.addStudent("Bob", 102, 85.0);
        myStudentList.addStudent("Charlie", 103, 78.5);

        // Affichez les détails des étudiants dans la liste
        myStudentList.displayStudents();
    }
}
