package test;

import test.auth.UserChecker;
import test.strategy.DBAuth;
import test.strategy.FileAuth;

public class Main {

    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();


        userChecker.setName("Андрей");
        userChecker.setPassword("Fylhtq");

        userChecker.check(new DBAuth("jdbc://etc"));
        userChecker.check(new FileAuth("c://file.txt"));
    }
}
