class Theatretester{
public static void main(String theatre[])
{
System.out.println("main started");
Theatre.addMovies("KGF");
Theatre.addMovies("PS1");
Theatre.addMovies("Master");
Theatre.addMovies("Kranti");
Theatre.addMovies("RRR");
Theatre.addMovies("Love 360");
Theatre.addMovies("Kantara");
Theatre.addMovies("Yajamana");
Theatre.addMovies("Jogi");
Theatre.addMovies("Rajkuamr");
Theatre.addMovies("Drama");

System.out.println("movies names are:");
Theatre.getMovies();

System.out.println("updated movies name are");
Theatre.updateMovies("PS1" ,"PS2");
Theatre.getMovies();

String movieName=Theatre.getMovies("RRR");
System.out.println("search movie name is " + movieName);
System.out.println("Main ended");
}
 }