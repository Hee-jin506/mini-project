package mini.project.handler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mini.project.domain.Genre;
import mini.project.domain.Movie;
import mini.project.util.Prompt;
import mini.project.util.Screen;

public class MovieHandler {
  List<Movie> movieList;

  public MovieHandler(List<Movie> movieList) {
    this.movieList = movieList;
  }

  public void manage() {
    while (true) {
      Screen.viewMenu(Screen.MOVIE_MANAGE_PAGE);
      switch (Prompt.inputString("입력>(빈문자열:취소) ")) {
        case "영화추가":
          add();
          break;
        case "영화삭제":
          delete();
          break;
        case "영화수정":
          update();
          break;
        case "영화조회":
          list();
          break;
        case "":
          return;
        default:
          System.out.println("잘못된 입력입니다.");
      }
    }
  }

  public void add() {
    System.out.println("[영화 등록]");

    Movie movie = new Movie();
    movie.setTitle(Prompt.inputString("영화제목? "));
    movie.setGenre(Prompt.inputGenre("장르? "));

    movieList.add(movie);
  }

  public void list() {
    // System.out.println("[영화 목록]");
    Movie[] movies;
    movies = new Movie[movieList.size()];
    Iterator<Movie> iterator = movieList.iterator();
    for (int i = 0; iterator.hasNext(); i++) {
      movies[i] = iterator.next();
    }
    viewMovies(movies);

    // Iterator<Movie> iterator = movieList.iterator();
    // while (iterator.hasNext()) {
    // Movie movie = iterator.next();
    // System.out.printf("%s, %s, %s\n", movie.getTitle(), movie.getGenre(), movie.getViewCount());
    // }

  }

  public static void viewMovies(Movie[] movies) {
    for (int i = 0; i < movies.length; i++) {
      if ((i % 5) == 0 && i != 0) {
        if (Prompt.inputString(String.format("%10s\t:", "")).equalsIgnoreCase("q"))
          break;
      }
      System.out.printf("%10s\t%d. %s\n", "", i + 1, movies[i].getTitle());

    }
    System.out.println();
  }

  public void update() {
    System.out.println("[영화 변경]");
    String title = Prompt.inputString("제목? ");
    Movie movie = findByTitle(title);

    if (title == null) {
      System.out.println("해당 제목의 영화가 없습니다.");
      return;
    }

    Genre genre = Prompt.inputGenre(String.format("장르(%s)? ", movie.getGenre()));
    movie.setGenre(genre);
    System.out.println("영화를 변경하였습니다.");
  }

  public void delete() {
    System.out.println("[영화 삭제]");
    String title = Prompt.inputString("제목? ");
    int index = indexOf(title);

    if (index == -1) {
      System.out.println("해당 번호의 영화가 없습니다.");
      return;
    }

    String response = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ");
    if (!response.equalsIgnoreCase("y")) {
      System.out.println("영화 삭제를 취소하였습니다.");
      return;
    }

    movieList.remove(index);
    System.out.println("영화를 삭제하였습니다.");
  }

  public Movie findByTitle(String title) {
    for (int i = 0; i < movieList.size(); i++) {
      Movie movie = movieList.get(i);
      if (movie.getTitle().equals(title)) {
        return movie;
      }
    }
    return null;
  }

  public List<Movie> findByGenre(Genre genre) {
    List<Movie> genreList = new ArrayList<>();
    for (int i = 0; i < movieList.size(); i++) {
      Movie movie = movieList.get(i);
      if (movie.getGenre().equals(genre)) {
        genreList.add(movie);
      }
    }
    return genreList;
  }


  public int indexOf(String title) {
    for (int i = 0; i < movieList.size(); i++) {
      Movie movie = movieList.get(i);
      if (movie.getTitle().equals(title)) {
        return i;
      }
    }
    return -1;
  }


  public void printGenre(Genre genre) {
    switch (genre) {
      case 액션:
        Screen.logo("ACTION");
        break;
      case 가족:
        Screen.logo("FAMILY");
        break;
      case 호러:
        Screen.logo("HORROR");
        break;
      case 로맨스:
        Screen.logo("Romance");
        break;

    }
    MovieHandler genreHandler = new MovieHandler(findByGenre(genre));
    genreHandler.list();

  }



  public void printBest() {
    List<Movie> bestMovieList = (List<Movie>) ((ArrayList<Movie>) movieList).clone();

    for (int i = 0; i < movieList.size(); i++) {
      for (int j = 0; j < bestMovieList.size() - i - 1; j++) {
        if (bestMovieList.get(i).getViewCount() < bestMovieList.get(j + 1).getViewCount()) {
          Movie temp = bestMovieList.get(j);
          bestMovieList.set(j, bestMovieList.get(j + 1));
          bestMovieList.set(j + 1, temp);
        }
      }
    }
    Screen.logo("Top 5");
    MovieHandler bestHandler = new MovieHandler(bestMovieList);
    bestHandler.list();
  }
}
