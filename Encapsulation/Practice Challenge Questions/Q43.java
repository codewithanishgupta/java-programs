// 43. Create a CricketPlayer class with private runs and wickets. 

class CricketPlayer{
    private int run;
    private int wickets;
    private String name;

    void setName(String name){
        this.name = name;
    }
    void setRun(int run){
        this.run = run;
    }
    void setWickets(int wickets){
        this.wickets = wickets;
    }

    String getName(){
        return name;
    }
    int getRun(){
        return run;
    }
    int getWickets(){
        return wickets;
    }

    void details(){
        System.out.println("=====Player details=======");
        System.out.println("Name : "+name);
        System.out.println("Runs : "+run);
        System.out.println("Wickets : "+wickets);
    }
}

public class Q43 {
    public static void main(String[] args) {
        CricketPlayer c = new CricketPlayer();
        c.setName("Mahendra Sing Dhoni");
        c.setRun(17266 );
        c.setWickets(1);
        c.details();
    }
}
