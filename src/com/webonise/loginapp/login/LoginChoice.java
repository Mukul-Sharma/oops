package com.webonise.loginapp.login;

/**
 * Created by mukuls-webonise on 9/8/16.
 */
public class LoginChoice {

    public enum Choice {

        FACEBOOK("f"), TWITTER("t"), LINKED_IN("l"), SIMPLE("s");

        private final String choice;
        Choice(String choice) {
            this.choice = choice;
        }

        public static Choice fromString(String text) {
            if (text != null) {
                for (Choice c : Choice.values()) {
                    if (text.equalsIgnoreCase(c.choice)) {
                        return c;
                    }
                }
            }
            return null;
        }
    }

    public static class InvalidChoiceException extends Exception {
        public InvalidChoiceException() {
            super("Invalid choice for login\n Choose either one of f, t, l, s");
        }
    }
}
