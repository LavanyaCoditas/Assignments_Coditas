package Assignment2;

import java.io.*;

public class EmployeeSerializeObjectDrive
{
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", "bhosale", 121,200021.2,2,"java dveeloper");

        String filePath = "emp.txt";


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(emp);
            System.out.println("Employee object saved to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Employee empsaved = (Employee) ois.readObject();
            System.out.println("Deserialized Student object:");
            System.out.println(empsaved);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
