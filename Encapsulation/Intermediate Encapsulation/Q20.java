// 20.Create a VotingSystem class where voting is allowed only if age ≥ 18. 

class VotingSystem {
    private String voterName;
    private int age;

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void vote() {
        if(age >= 18) {
            System.out.println(voterName + " is eligible to vote.");
        } else {
            System.out.println(voterName + " is NOT eligible to vote.");
        }
    }
}


public class Q20 {
    public static void main(String[] args) {
        VotingSystem v =new VotingSystem();
        v.setVoterName("Anish Gupta");
        v.setAge(21);
        v.vote();
        v.setAge(12);
        v.vote();
    }
}
