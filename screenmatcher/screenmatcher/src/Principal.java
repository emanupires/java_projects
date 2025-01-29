import com.manu.screenmatcher.models.Movie;

public class Principal {
    public static void main(String[] args) {
        
        Movie favMovie = new Movie();
        
        favMovie.setName("Coraline");
        favMovie.setReleaseYear(2009);
        favMovie.setDurationInMinutes(120);
        favMovie.ratings(8);
        favMovie.ratings(5);
        favMovie.ratings(10);
        System.out.println(favMovie.obtainSumOfRatings());
        System.out.println("Total de avaliações: " + favMovie.getRating());
        favMovie.showMovieDetails();
    }
}
