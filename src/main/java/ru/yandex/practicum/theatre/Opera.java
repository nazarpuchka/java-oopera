package main.java.ru.yandex.practicum.theatre;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor,
                 int choirSize, String librettoText) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public void printLibretto() {
        System.out.println("Либретто оперы:\n" + getLibrettoText());
    }
}
