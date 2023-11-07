package org.example.email;

import org.example.exceptions.MessageNotFoundException;
import org.example.messagepreparation.Log1Message;
import org.example.messagepreparation.Log2Message;
import org.example.messagepreparation.MessagePreparation;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import java.util.List;

public class EmailPreparation {


    public static Message prepareMessage(Session session, List<String> result, String caseNumber) throws MessagingException {
        // Create a message
        switch (caseNumber) {
            case "1" -> {
                MessagePreparation messagePreparation1 = new Log1Message();
                return messagePreparation1.prepareMessage(session, result);
            }
            case "2" -> {
                MessagePreparation messagePreparation2 = new Log2Message();
                return messagePreparation2.prepareMessage(session, result);
            }
        }

        throw new MessageNotFoundException("No message was found!");
    }

    public static void sendMessage(Session session, Message message) throws MessagingException {
        // Connect and authenticate recipient the SMTP server
        Transport transport = session.getTransport("smtp");
        transport.connect(
                EmailConfiguration.getSmtpHost(),
                EmailConfiguration.getPort(),
                EmailConfiguration.getSender(),
                EmailConfiguration.getPassword()
        );

        // Send the email
        transport.sendMessage(message, message.getAllRecipients());

        // Close the transport
        transport.close();

        System.out.println("Email sent successfully!");

    }
}
