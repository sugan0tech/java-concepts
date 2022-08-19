import java.util.Date;
import java.util.Scanner;
import java.io.*;

import serial.Employee;

public class SerialCheck {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        try {
            Employee emp = new Employee();
            System.out.println("Enter the id :");
            String id = scn.nextLine();
            scn.close();
            emp.setID(id);
            emp.setAge(18);
            emp.setSalary(10000);
            emp.setDOB(new Date());
            emp.setFirstName("sugan");
            emp.setLastName("tech");
            System.out.println(emp);

            FileOutputStream fout = new FileOutputStream("./ObjectStorage/emp" + id + ".sug");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(emp);
            out.flush();
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ObjectInputStream ob = new ObjectInputStream(new FileInputStream("./ObjectStorage/emp.sug"));
            Employee emp = (Employee) ob.readObject();
            System.out.println(emp);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
