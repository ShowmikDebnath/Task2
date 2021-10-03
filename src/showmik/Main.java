/*
Name:   Showmik Debnath
ID:     2012020075
Section: B
Email:  cse_2012020075@lus.ac.bd
Date:   08-08-2021
 */

package showmik;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(75);
        Student student3 = new Student(2012020075, "Showmik Debnath");

        System.out.println("Name: "+student3.name+"\n"+"ID: "+student3.id);
        student1.display();
    }
}
