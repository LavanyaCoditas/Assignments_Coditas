package Assignment2;

import java.io.Serializable;
import java.lang.classfile.constantpool.StringEntry;

public class Employee implements Serializable
{
    private String firstName;
    private String lastName;
    private int empId;
    //non serializable value to prevent other employees from seeing the salary
    private transient double salary;
    private int experience;
    private String position;
    public Employee(String firstName, String lastName, int empId, double salary,int experience,String position)
    {
     this.empId=empId;
     this.firstName=firstName;
     this.lastName=lastName;
     this.salary=salary;
     this.position=position;
     this.experience=experience;
    }
@Override
    public String toString()
{
   return "Employee{name='" + firstName+  " "  +lastName + "', salary=" + salary +  ", position='" + position + "experience: "+experience+ "empId: "+empId+"}";
}
}
