// 6.·  Create a Person class with private name and age. 


import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();

        System.out.print("Enter Person Name : ");
        p.setName(sc.nextLine());

        System.out.print("Enter Person Age : ");
        p.setAge(sc.nextInt());

        System.out.println("====== Person Details ======");
        System.out.println("Name : " + p.getName());
        System.out.println("Age : " + p.getAge());
    }
}
