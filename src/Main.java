import java.util.ArrayList;

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
        list.add(new Person("Леопольд","Гогенцоллерн Зигмаринген",11));
        list.add(new Person("Генрих","Бомон ле Роже",10));
        list.add(new Person("Эдуард","Саксен Кобург Гот",12));
        list.add(new Person("Пьер","Сен Поль",10));
        list.add(new Person("Джеффри","Степлтон",11));
        list.add(new Person("Франциск","Ла Ферте суз Жарре",10));
        list.add(new Person("Бертелеме","Жюльен де Тур Овернь",11));
        System.out.println("Список до сортировки");
        printList(list);
        list.sort(new PersonComparator(3));
        System.out.println("Список после сортировки");
        printList(list);
    }
}