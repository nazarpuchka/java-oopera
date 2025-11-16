import java.util.ArrayList;

public class Opera extends MusicalShow{
    private int choirSize;


    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors, MusicAuthor musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
    }
    @Override
    public void printLibretto() {
        System.out.println("Либретто оперы:\n" + getLibrettoText());
    }
}
