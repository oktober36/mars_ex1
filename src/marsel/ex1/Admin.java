package marsel.ex1;

public class Admin extends User {
    // Класс админа, потомок пользователя
    public Admin(String login, String password, int age, char gender) {
        super(login, password, age, gender);
    }

    @Override
    public String greeting(){
        return "Hello, creator"; //Имеет другое приветствие
    }
}
