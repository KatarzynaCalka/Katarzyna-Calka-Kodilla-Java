package com.kodilla.good.patterns.allegro;

public class MailService implements InformationService {

    public void sendMessageToUser(User user){
        System.out.println("Send e-mail to: " + user.getUserName() + " "
                + user.getUserSurname() + " <" + user.getUserAddressEmail() + ">");
    }
}
