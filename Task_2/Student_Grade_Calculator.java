package Task_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks of Java Subject");
        double Java=sc.nextInt();
        System.out.println("Enter Marks Of Data Structure");
        double DS=sc.nextInt();
        System.out.println("Enter Marks Of Computer Organisation");
        double COA=sc.nextInt();
        System.out.println("Enter Marks of DataBase Management");
        double DBMS=sc.nextInt();
        System.out.println("Enter Marks Of Python");
        double Python=sc.nextInt();

        double total=(Java+DS+COA+DBMS+Python);
        System.out.println("The Total Marks Of Student is:-"+ total);

        double avg=total/5;
        System.out.println("The Average Marks Of Student is:- "+ avg);




    }
}
