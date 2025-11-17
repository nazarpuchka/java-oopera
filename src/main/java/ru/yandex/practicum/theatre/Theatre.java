package main.java.ru.yandex.practicum.theatre; // Здравствуйте! Все поправил, немного поменял структуру кода, спасибо!

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Фрэнк", "Дреблин", Gender.MALE, 90);
        Actor actor2 = new Actor("Эмилия", "Кларксон", Gender.FEMALE, 55);
        Actor actor3 = new Actor("Аль", "Пачинов", Gender.MALE, 80);

        Director director1 = new Director("Роберт", "Земекисян", Gender.MALE, 30);
        Director director2 = new Director("Квентин", "Тарантинов", Gender.MALE, 55);

        Person musicAuthor = new Person("Ханц", "Циммер", Gender.MALE);
        Person choreographer = new Person("Мигель", "Танцоров", Gender.MALE);

        String titleNewShow = "Гамлет — точка G";
        String titleNewOpera = "Не все так плохо, как на самом деле, Пафнутий!";
        String titleNewBallet = "Прогулка из Пасси в Курбевуа, которую следует совершать гомеопатически";

        MusicalShow musicalShow = new MusicalShow(titleNewShow, 180, director2,
                musicAuthor, "На протяжении 180 минут танцуют и что-то ищут");
        Opera opera = new Opera(titleNewOpera, 185, director1,
                musicAuthor, 30, "Дед Пафнутий пришел на прием к психоаналитику.");
        Ballet ballet = new Ballet(titleNewBallet,
                195, director2, musicAuthor, choreographer,
                "Поют, прогуливаясь из точки А в точку Б, гомеопатически.");

        musicalShow.addNewActor(actor1, titleNewShow);
        musicalShow.addNewActor(actor2, titleNewShow);
        musicalShow.addNewActor(actor3, titleNewShow);
        opera.addNewActor(actor1, titleNewOpera);
        opera.addNewActor(actor3, titleNewOpera);
        ballet.addNewActor(actor2, titleNewBallet);
        ballet.addNewActor(actor3, titleNewBallet);

        musicalShow.printActorsList(titleNewShow);
        opera.printActorsList(titleNewOpera);
        ballet.printActorsList(titleNewBallet);

        opera.replaceActor(actor1, actor2, titleNewOpera);
        opera.printActorsList(titleNewOpera);

        ballet.replaceActor(actor1, actor3, titleNewBallet);

        opera.printLibretto();
        ballet.printLibretto();
    }
}
