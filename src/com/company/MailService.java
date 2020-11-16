package com.company;

public class MailService {

    public void sendEmail() {
        connect();
        authenticate();
        // send email
        disconnect();
    }

    private void connect() {
        System.out.println("connected");
    }

    private void disconnect() {
        System.out.println("disconnected...");
    }

    private void authenticate() {
        System.out.println("authenticated");
    }
}
