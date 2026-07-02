// 12.Create interfaces Camera and MusicPlayer. Implement both in a class SmartPhone. 

interface Camera {
    void camera();
}

interface MusicPlayer {
    void musicPlay();
}

class SmartPhone implements Camera , MusicPlayer {
    String name;

    public SmartPhone(String name) {
        this.name = name;
    }
    @Override
    public void camera () {
        System.out.println("Add Camera in  "+name+" SmartPhone -> Taking photo with "+name+" Camera");
    }
    @Override
    public void musicPlay(){
        System.out.println("Added MusicPlayer in "+name + " SmartPhone -> Play music on "+name+" Music Player");
    }
    
}

public class Q12 {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone("Redmi");
        s.camera();
        s.musicPlay();
    }
}
