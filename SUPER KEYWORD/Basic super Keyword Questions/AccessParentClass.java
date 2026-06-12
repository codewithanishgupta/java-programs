// 1.Write a Java program to access parent class variable using super keyword.

class Parent{
    int n=12;
    String str="parent variable";
}

class Child extends Parent{
    void show(){
        System.out.println(super.str);
        System.out.println(super.n);
    }
}

class AccessParentClass{
    public static void main(String[] args) {
        Child C=new Child();
        C.show();
    }
}