import java.util.ArrayList;

public class Ballet extends MusicalShow{

    Choreographer choreographer;


    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors, MusicAuthor musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
    }

    @Override
    public void printLibretto() {
        System.out.println("Либретто балета:\n" + getLibrettoText());
    }
}
