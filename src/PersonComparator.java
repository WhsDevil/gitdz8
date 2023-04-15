import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int maxCountOfWords;

    public PersonComparator(int maxCountOfWords) {
        this.maxCountOfWords = maxCountOfWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int firstCount = o1.getSurname().split(" ").length;
        int secondCount = o2.getSurname().split(" ").length;
        if (firstCount >= maxCountOfWords && secondCount >= maxCountOfWords) {
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
    }
}
