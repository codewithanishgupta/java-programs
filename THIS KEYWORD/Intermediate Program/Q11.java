// 11.Write a Java program to return current object using this keyword.


class Demo{
    int age;
    String name;

    public Demo(int age , String name) {
        this.age=age;
        this.name=name;
    }
    void show(){
        System.out.println("Age= "+age);
        System.out.println("NAme= "+name);
    }

    Demo display(){
        return this;
    }
    
}

class Q11{

    public static void main(String[] args) {
        Demo D = new Demo(21, "Anish Gupta");
        D.display().show();
    }
}