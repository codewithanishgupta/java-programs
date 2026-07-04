// 21.Write a Java program to achieve abstraction using interfaces. 

interface Person {
    void setName(String name);
    String getName();
}

class A implements   Person {
    String name;
    @Override
    public void setName (String name){
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }
}

class Q21 {
    public static void main(String[] args) {
        Person p = new A();    
        p.setName("Anish Gupta ");
        System.out.println("Name is : "+p.getName());
        

    }
}