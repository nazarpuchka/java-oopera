package main.java.ru.yandex.practicum.theatre;

public class Ballet extends MusicalShow {

    protected Person choreographer;

    public Ballet(String title, int duration, Director director,
                  Person musicAuthor, Person choreographer, String librettoText) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    public void printLibretto() {
        System.out.println("Либретто балета:\n" + getLibrettoText());
    }
}

