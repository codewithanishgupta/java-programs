// 19.Write a Java program to create interfaces Teacher and Researcher and implement both.

interface Teacher {
    void teach();
}
interface Researcher{
    void research();
}

class Professor implements Teacher , Researcher{
    @Override
    public void teach(){
        System.out.println("Professor is teaching students...");
    }
    @Override
    public void research(){
        System.out.println("Professor is conducting research...");
    }
}

public class Q19 {
    public static void main(String[] args) {
        Professor p = new Professor();
        p.teach();
        p.research();

        // Polymorphism
        Teacher t = new Professor();
        t.teach();
        Researcher r = new Professor();
        r.research();
    }
}
