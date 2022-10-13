package movies;

import util.Input;

public class MoviesApplication
{
    public static void main(String[] args)
    {
        Input movieInfo = new Input();
        String movieAcc = "";
        System.out.println(movieAcc);
        do {
            movieAcc = movieInfo.getMovieInput();
            switch (movieAcc.toLowerCase())
            {
                case "all":
                    for(Movie movie : MoviesArray.findAll())
                    {
                        System.out.printf("Title: %s and the Category: %s%n",movie.getName(), movie.getCategory());
                    }
                    break;
                case "category":
                    Input inputQuestion = new Input();
                    String findByCat = inputQuestion.getString("Which category would you like?");
                    System.out.println(findByCat);
                    for (Movie movie : MoviesArray.findAll())
                    {
                        if(findByCat.equalsIgnoreCase(movie.getCategory()))
                        {
                            System.out.printf("Title: %s %n",movie.getName());
                        }
                    }
                    break;
            }
        } while (!movieAcc.equalsIgnoreCase("exit"));

    }
}
