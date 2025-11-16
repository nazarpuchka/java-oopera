package main.java.ru.yandex.practicum.theatre; // Здравствуйте! Все поправил, спасибо!

import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        System.out.println("Поехали!");

        Actor actor1 = new Actor("Фрэнк", "Дреблин", Gender.MALE, 90);
        Actor actor2 = new Actor("Эмилия", "Кларксон", Gender.FEMALE, 55);
        Actor actor3 = new Actor("Аль", "Пачинов", Gender.MALE, 80);

        Director director1 = new Director("Роберт", "Земекисян", Gender.MALE, 30);
        Director director2 = new Director("Квентин", "Тарантинов", Gender.MALE, 55);

        Person musicAuthor = new Person("Ханц", "Циммер", Gender.MALE);

        Person choreographer = new Person("Мигель", "Танцоров", Gender.MALE);

        ArrayList<Actor> actorsMusicalShow = new ArrayList<>();
        actorsMusicalShow.add(actor1);
        actorsMusicalShow.add(actor2);
        actorsMusicalShow.add(actor3);
        MusicalShow musicalShow = new MusicalShow("Гамлет — точка G", 180, director2, actorsMusicalShow,
                musicAuthor, "На протяжении 180 минут танцуют и что-то ищут");
        System.out.println("Список актеров main.java.ru.yandex.practicum.theatre.MusicalShow: " + actorsMusicalShow);

        ArrayList<Actor> actorsOpera = new ArrayList<>();
        actorsOpera.add(actor1);
        actorsOpera.add(actor3);
        Opera opera = new Opera("Не все так плохо, как на самом деле, Пафнутий!", 185, director1,
                actorsOpera, musicAuthor, 30, "Дед Пафнутий пришел на прием к психоаналитику.");
        System.out.println("Список актеров main.java.ru.yandex.practicum.theatre.Opera: " + actorsOpera);

        ArrayList<Actor> actorsBallet = new ArrayList<>();
        actorsBallet.add(actor2);
        actorsBallet.add(actor3);
        Ballet ballet = new Ballet("Прогулка из Пасси в Курбевуа, которую следует совершать гомеопатически",
                195, director2, actorsBallet, musicAuthor, choreographer,
                "Поют, прогуливаясь из точки А в точку Б, гомеопатически.");
        System.out.println("Список актеров main.java.ru.yandex.practicum.theatre.Ballet: " + actorsBallet);

        int index = ballet.getListOfActors().indexOf(actor3);
        if (index != -1) {
            ballet.getListOfActors().remove(index);
            ballet.getListOfActors().add(index, actor1);
            System.out.println("Актёр успешно заменён.");
        } else {
            System.out.println("Актёр для замены не найден в списке.");
        }
        System.out.println("Обновленный список актёров main.java.ru.yandex.practicum.theatre.Ballet: " + ballet.getListOfActors());

        index = opera.getListOfActors().indexOf(actor3);
        if (index != -1) {
            opera.getListOfActors().remove(index);
            opera.getListOfActors().add(index, actor2);
            System.out.println("Актёр успешно заменён.");
        } else {
            System.out.println("Актёр для замены не найден в списке.");
        }
        System.out.println("Обновленный список актёров main.java.ru.yandex.practicum.theatre.Opera: " + ballet.getListOfActors());

        opera.printLibretto();
        ballet.printLibretto();
    }
}
