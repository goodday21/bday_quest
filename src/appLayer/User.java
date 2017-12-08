package appLayer;

public class User {
    private String login;
    private String password;

    public User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public boolean isValid(){
        return login.equals("John") && password.equals("Doe");
    }
}
