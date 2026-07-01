// 9.Create an interface Playable with method play(). Implement it in classes Football, Cricket, and Basketball. 

interface Playable {
    void play () ;
}

class Football implements Playable {
    @Override
    public void play(){
        System.out.println("Play Football...");
        System.out.println("____________________________________");
    }
}

class Cricket implements Playable {
    @Override
    public void play(){
        System.out.println("Play Cricket...");
        System.out.println("____________________________________");
    }
}

class Basketball implements Playable {
    @Override
    public void play(){
        System.out.println("Play Basketball...");
        System.out.println("____________________________________");
    }
}

public class Q9 {
    public static void main(String[] args) {
        Playable F = new Football();
        Playable C = new Cricket();
        Playable B = new Basketball();

        System.out.println("Football Action : ");
        F.play();
        System.out.println("Cricket Action : ");
        C.play();
        System.out.println("Basketball Action : ");
        B.play();
    }
}
