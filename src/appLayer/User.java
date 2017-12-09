package appLayer;

import dataLayer.DB_user;

public class User {
    private String login;
    private String password;

    public User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public boolean isValid(){
        DB_user db_user = new DB_user();
        return db_user.isValid(login, password);
    }
}
