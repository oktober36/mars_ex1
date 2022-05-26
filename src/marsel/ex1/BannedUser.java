package marsel.ex1;

import java.util.Date;

public class BannedUser extends User{
    String dateOfBan;

    public BannedUser(String login, String password, int age, char gender, String dateOfBan) {
        super(login, password, age, gender);
        this.dateOfBan = dateOfBan;
    }

    public String greeting(){
        return "You've been banned since " + dateOfBan; // Для удаленного пользователя никакого приветствия же не будет
    }
}
