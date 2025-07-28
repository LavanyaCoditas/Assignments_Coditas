package Assignment2;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeLambdaExp {
    // Employee class implementing Comparable
    static class Employee  {
        private int age;
        private double salary;

        public Employee(int age, double salary) {
            this.age = age;
            this.salary = salary;
        }

        // Getter for age
        public int getAge() {
            return age;
        }

        // Getter for salary
        public double getSalary() {
            return salary;
        }

        // Override toString for readable output
        @Override
        public String toString() {
            return "Employee{Age=" + age + ", Salary=" + salary + "}";
        }

//        // Override compareTo to sort by age
//        @Override
//        public int compareTo(Employee other) {
//            return Integer.compare(this.age, other.age); // Sort by age in ascending order

    }

    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        // Add Employee objects
        emp.add(new Employee(50, 50000.0));
        emp.add(new Employee(27, 60000.0));
        emp.add(new Employee(23, 404904.9));
        emp.add(new Employee(98, 300303.9));
        System.out.println("Before sorting the raw ArrayList of Employees:\n" + emp);

        // Sort the ArrayList using Collections.sort
        //
        //+ve descending (b-a) a comes before b
        //-ve ascending(a-b) a comes after b
        //0 equals(a-b)
        emp.sort((a,b) -> Integer.compare(a.age,b.age));
        System.out.println("\nAfter sorting by age:\n" + emp);
        emp.sort((a,b)->Double.compare(a.salary,b.salary));
    }
}