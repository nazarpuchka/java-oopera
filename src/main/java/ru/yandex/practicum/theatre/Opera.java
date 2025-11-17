package main.java.ru.yandex.practicum.theatre;

public class Opera extends MusicalShow {
    protected int choirSize;

    public Opera(String title, int duration, Director director, Person musicAuthor,
                 int choirSize, String librettoText) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public void printLibretto() {
        System.out.println("Либретто оперы:\n" + getLibrettoText());
    }
}
