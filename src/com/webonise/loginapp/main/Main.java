package com.webonise.loginapp.main;

import com.webonise.loginapp.App;
import com.webonise.loginapp.login.LoginChoice;
import com.webonise.loginapp.user.User;

import java.util.Scanner;

public class Main {

    private static App app;

    private final static String LOGOUT = "logout";
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//      Read username and pass from args
        String username = args[0];
        String pass = args[1];
//        Convert password into array for security
        String[] securePass = pass.split("");

        //Try to login
        tryInit(username, securePass);
    }

//    Ask user for login method, repeat unless user enters a valid choice
    private static void tryInit(String username, String[] securePass) {
        LoginChoice.Choice choice = askUserForInput();
        try {
            init(choice, username, securePass);
        } catch (LoginChoice.InvalidChoiceException e) {
            System.out.println(e.getMessage());
            tryInit(username, securePass);
        }
    }

//    login user for given choice of service provider
    private static void init(LoginChoice.Choice choice, String username, String[] pass) throws LoginChoice.InvalidChoiceException {
        User user;
        user = loginUserForChoiceWith(choice, username, pass);

        startApp(user);
    }

//    Create a login choice based on entered string input
    private static LoginChoice.Choice askUserForInput() {
        System.out.println("Please enter your login choice");
        System.out.println("f for Facebook");
        System.out.println("t for Twitter");
        System.out.println("l for LinkedIn");
        System.out.println("s for simple");

        String input = scanner.next();

        return LoginChoice.Choice.fromString(input);
    }

    private static User loginUserForChoiceWith(LoginChoice.Choice choice, String username, String[] pass) throws LoginChoice.InvalidChoiceException {
        return User.login(username, pass, choice);
    }

    private static void startApp(User user) {
        app = new App(user);
        app.run();

        System.out.println("Username: " + user.getUsername() + " Provider: " + user.getLoginProvider());

        System.out.println("Feel free to logout by typing the word logout");

        while (!LOGOUT.equalsIgnoreCase(scanner.next())) {
            //use the app
        }

        app.onTapSignOut();
    }
}
