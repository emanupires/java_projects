import com.manu.screenmatcher.calculations.TimeCalculator;
import com.manu.screenmatcher.models.Movie;
import com.manu.screenmatcher.models.Serie;

public class Principal {
    public static void main(String[] args) {
        
        Movie favMovie = new Movie();
        Movie otherMovie = new Movie();
        
        favMovie.setName("Coraline");
        favMovie.setReleaseYear(2009);
        favMovie.setDurationInMinutes(120);
        favMovie.ratings(8);
        favMovie.ratings(5);
        favMovie.ratings(10);
        System.out.println(favMovie.obtainSumOfRatings());
        System.out.println("Total de avaliações: " + favMovie.getRating());
        otherMovie.setName("Divertidamente");
        otherMovie.setReleaseYear(2018);
        otherMovie.setDurationInMinutes(120);
        otherMovie.showMovieDetails();

        Serie favSerie = new Serie();
        favSerie.setName("Seinfeld");
        favSerie.setReleaseYear(1980);
        favSerie.setSeasons(12);
        favSerie.setMinutesPerEpisode(24);
        favSerie.setEpisodesSeason(20);
        System.out.println("Tempo de série: " + favSerie.getDurationInMinutes());

        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(favMovie);
        calculator.includes(otherMovie);
        calculator.includes(favSerie);
        System.out.println(calculator.getTotalTime());
    }
}
