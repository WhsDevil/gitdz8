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
        list.sort((Person o1, Person o2)->{
            int firstCount = o1.getSurname().split(" ").length;
            int secondCount = o2.getSurname().split(" ").length;
            if (firstCount >= 3 && secondCount >= 3) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else {
                if (firstCount > secondCount) {
                    return 1;
                } else if (firstCount < secondCount) {
                    return -1;
                } else {
                    return Integer.compare(o1.getAge(), o2.getAge());
                }
            }
        });
        System.out.println("Список после сортировки");
        printList(list);
    }
}