package org.example;

import org.example.messagepreparation.Log1Message;
import org.example.messagepreparation.Log2Message;
import org.example.messagepreparation.MessagePreparation;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.List;

public class EmailPreparation {


    public static Message prepareMessage(Session session, List<String> result, String caseNumber) throws MessagingException {
        // Create a message
        switch (caseNumber) {
            case "1":
                MessagePreparation messagePreparation1 = new Log1Message();
                return messagePreparation1.prepareMessage(session, result);
            case "2":
                MessagePreparation messagePreparation2 = new Log2Message();
                return messagePreparation2.prepareMessage(session, result);
        }


        return  null;
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
