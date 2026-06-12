// 26. Create a Hospital Management System with private patient records. 

import java.util.Scanner;

class Patient{
    private String name;
    private int age;
    private int id;
    private String disease;

    void setName(String name){
        this.name= name;
    }

    void setAge(int age){
        if(age>0)
            this.age=age;
        else
            System.out.println("Invalid age ! must be positive");
    }

    void setId(int id ){
        this.id=id;
    }

    void setDisease(String disease){
        this.disease=disease;
    }

    void showDetails(){
        System.out.println("--------Patient Record---------");
        System.out.println("ID      : "+id);
        System.out.println("Name    : "+name);
        System.out.println("Age     : "+age);
        System.out.println("Disease : "+disease);
    }
}

class Hospital{
    private Patient[] patients;
    private int count;

    public Hospital(int capacity) {
        patients = new Patient[capacity];
        count =0;
    }

    void addPatient(Patient p){
        if(count<patients.length){
            patients[count++]=p;
            System.out.println("Patient Added succissfully!");
        }else {
            System.out.println("Hospital Capacity full !");
        }
    }

    void showAllPatients(){
        System.out.println("=======All Patients Details========");
        for(int i=0;i<count ;i++){
            patients[i].showDetails();
        }
    }
    
}


public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital h = new Hospital(3);

        for(int i = 0; i < 3; i++) {
            Patient p = new Patient();
            System.out.print("Enter Patient ID: ");
            p.setId(sc.nextInt());
            sc.nextLine();

            System.out.print("Enter Patient Name: ");
            p.setName(sc.nextLine());

            System.out.print("Enter Patient Age: ");
            p.setAge(sc.nextInt());
            sc.nextLine();

            System.out.print("Enter Disease: ");
            p.setDisease(sc.nextLine());

            h.addPatient(p);
        }

        h.showAllPatients();
    }
}
