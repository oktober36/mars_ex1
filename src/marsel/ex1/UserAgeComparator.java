package marsel.ex1;
import java.util.Comparator;

public class UserAgeComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return Integer.compare(o1.age, o2.age); // Сравнение по возрасту
    }
}
