package main.java.ru.yandex.practicum.theatre;

import java.util.ArrayList;

public class Show {

    private String title;
    private int duration;
    private Director director;
    public static ArrayList<Actor> listOfActors;


    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public void printActors() {
        System.out.println("Список актёров:");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void replaceActor(Actor oldActor, Actor newActor) {
        int index = listOfActors.indexOf(oldActor);
        if (index != -1) {
            listOfActors.set(index, newActor);
            System.out.println("Актёр успешно заменён!!!");
        } else {
            System.out.println("Актёр для замены не найден в списке(((");
        }
    }
}
