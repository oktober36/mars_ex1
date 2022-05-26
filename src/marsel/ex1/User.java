package marsel.ex1;

import javax.jws.soap.SOAPBinding;

public class User implements Comparable<User> {
    public String login;
    public String password;
    public int age;
    public char gender;

    public User(String login, String password, int age, char gender) {
        this.login = login;
        this.password = password;
        this.age = age;
        this.gender = gender;
    }

    public String greeting(){
        return "Hello, " + login; // Добавим функцию приветсвия
    }

    @Override
    public int compareTo(User o) {
        return login.compareTo(o.login); // В самом классе сравнение по фамилии
    }

    @Override
    public String toString() {
        return login + "(" +
                "age=" + age + ")";
    }
}
