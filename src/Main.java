import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void printList(ArrayList<Person> list) {
        for (Person person : list) {
            System.out.println(person);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Владимир","Владимиров",10));
        list.add(new Person("Карл","Ангальт Бернбург Хойм",11));
        list.add(new Person("Леопольд","Гогенцоллерн Зигмаринген",12));
        list.add(new Person("Генрих","Бомон ле Роже",20));
        list.add(new Person("Эдуард","Саксен Кобург Гот",12));
        list.add(new Person("Пьер","Сен Поль",10));
        list.add(new Person("Джеффри","Степлтон",21));
        list.add(new Person("Франциск","Ла Ферте суз Жарре",20));
        list.add(new Person("Бертелеме","Жюльен де Тур Овернь",21));
        System.out.println("Список до сортировки");
        printList(list);
        Predicate<Person> filter = person -> person.getAge() <= 18;
        list.removeIf(filter);
        System.out.println("Список после сортировки");
        printList(list);
    }
}