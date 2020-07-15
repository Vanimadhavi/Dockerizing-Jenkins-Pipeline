package com.devop.myClients;


/**
 * Vani Madhavi
 *
 */
public class App 
{
	private final String message = "Hello My Clients!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }
}
