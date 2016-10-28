package MovieClassLayer;

import java.util.ArrayList;
import java.util.List;


public class Film {
	public String FilmID;
	public String FilmName;
	public String ImdbRating;
	public String FilmYear;
	
	public List<Actor> Actors = new ArrayList<>(); 
	public List<Director> Directors = new ArrayList<>();
	


	public Film(){
		this.Directors = new ArrayList<>();
		this.Actors = new ArrayList<>();
	}

	public Film(String filmID, String filmName, String imdbRating, String filmYear) {
		this.FilmID = filmID;
		this.FilmName = filmName;
		this.ImdbRating = imdbRating;
		this.FilmYear = filmYear;

	}
	public Film(String filmID, String filmName, String imdbRating, List<Director> directors, List<Actor> actors,String filmYear) {
		this.FilmID = filmID;
		this.FilmName = filmName;
		this.ImdbRating = imdbRating;
		this.FilmYear = filmYear;
		this.Directors = directors;
		this.Actors = actors;

	}

	public String getFilmID() {
		return FilmID;
	}

	public void setFilmID(String filmID) {
		FilmID = filmID;
	}

	public String getFilmName() {
		return FilmName;
	}

	public void setFilmName(String filmName) {
		FilmName = filmName;
	}

	public String getImdbRating() {
		return ImdbRating;
	}

	public void setImdbRating(String imdbRating) {
		ImdbRating = imdbRating;
	}

	public String getFilmYear() {
		return FilmYear;
	}

	public void setFilmYear(String filmYear) {
		FilmYear = filmYear;
	}

	public List<Actor> getActors() {
		return Actors;
	}

	public void setActors(Actor actors) {
		Actors.add(actors); //new
	}

	public List<Director> getDirectors() {
		return Directors;
	}

	public void setDirectors(Director directors) {
		Directors.add(directors);
	}


}