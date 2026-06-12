// 9.·  Create a Movie class with private movieName and rating. 

import java.util.Scanner;

class Movie {
    private String movieName;
    private double rating;

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getMovieName() {
        return movieName;
    }
    public double getRating() {
        return rating;
    }
}

class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie m = new Movie();

        System.out.print("Enter Movie Name : ");
        m.setMovieName(sc.nextLine());

        System.out.print("Enter Movie Rating : ");
        m.setRating(sc.nextDouble());

        System.out.println("====== Movie Details ======");
        System.out.println("Movie Name : " + m.getMovieName());
        System.out.println("Rating : " + m.getRating());
    }
}
