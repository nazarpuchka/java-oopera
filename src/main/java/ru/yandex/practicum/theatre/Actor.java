package main.java.ru.yandex.practicum.theatre;

public class Actor extends Person {

    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "main.java.ru.yandex.practicum.theatre.Actor{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return height == actor.height &&
                getName().equals(actor.getName()) &&
                getSurname().equals(actor.getSurname()) &&
                getGender() == actor.getGender();
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getSurname().hashCode();
        result = 31 * result + getGender().hashCode();
        result = 31 * result + height;
        return result;
    }
}
