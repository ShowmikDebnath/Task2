/*
Name:   Showmik Debnath
ID:     2012020075
Section: B
Email:  cse_2012020075@lus.ac.bd
Date:   08-08-2021
 */

package showmik;

public class Student {
    String name;
    int id;
    static String universityName;

    Student()
    {
        System.out.println("Student Information-");
        universityName = "Leading University";
    }

    Student(int id)
    {
        this.id = id;
    }

    Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    void display()
    {
        System.out.println("University Name: "+universityName);
    }

}
