package com.webonise.loginapp.main;

import com.webonise.loginapp.App;
import com.webonise.loginapp.login.LoginChoice;
import com.webonise.loginapp.user.User;

import java.util.Scanner;

public class Main {

    private static App app;

    private final static String LOGOUT = "logout";

    public static void main(String[] args) {
	// write your code here
        String username = args[0];
        String pass = args[1];
        String[] securePass = pass.split("");

        User user;

        System.out.println("Please enter your login choice");
        System.out.println("f for Facebook");
        System.out.println("t for Twitter");
        System.out.println("l for LinkedIn");
        System.out.println("s for simple");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        LoginChoice.Choice choice = LoginChoice.Choice.fromString(input);
        user = loginUserForChoiceWith(choice, username, securePass);

        startApp(user);

        System.out.println("Feel free to logout by typing the word logout");

        while(!LOGOUT.equalsIgnoreCase(scanner.next())) {
            //use the app
        }

        app.onTapSignOut();
    }

    static User loginUserForChoiceWith(LoginChoice.Choice choice, String username, String[] pass) {
        try {
            return User.login(username, pass, choice);
        } catch (LoginChoice.InvalidChoiceException e) {
            e.printStackTrace();
        }
        return null;
    }

    static void startApp(User user) {
        app = new App(user);
        app.run();
    }
}
