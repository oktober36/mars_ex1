package marsel.ex1;

import jdk.internal.dynalink.linker.ConversionComparator;

import javax.xml.crypto.Data;
import java.sql.Date;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User[] us = {
                new User("Петя", "12345", 18, 'm'),
                new User("Vasya", "qwerty", 19, 'm'),
                new User("Kate", "aaaaaa", 20, 'f'),
                new User("Bill", "qweasd", 17, 'm'),
        };
        List<User> listUs = Arrays.asList(us);

        System.out.println("Для сравнения по имени:");

        Collections.sort(listUs); // Сортируем по имени
        System.out.println("a)" + listUs);
        System.out.println("б)" + listUs.get(0));
        System.out.println("Для сравнения по возрасту:");

        listUs.sort(new UserAgeComparator()); // Сортируем при помощи компаратора по возрасту
        System.out.println("a)" + listUs);
        System.out.println("б)" + listUs.get(0));
        //Демонстрация полиморфизма:
        User a = new User("Петя", "12345", 18, 'm');
        Admin b = new Admin("Пупа", "228337", 18, 'm');
        BannedUser c = new BannedUser("Пупа", "228322", 18, 'm', "02.11.2014");
        System.out.println(a.greeting() + "\n" + b.greeting() + "\n" + c.greeting()); // для каждого пользователя свое приветствие
    }
}
