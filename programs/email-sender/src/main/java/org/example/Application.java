package org.example;

import org.example.logmanipulator.Log1;
import org.example.logmanipulator.Log2;
import org.example.logmanipulator.LogManipulator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) throws IOException {

        List<String> result;

        Scanner scanner = new Scanner(System.in);
        String task = scanner.nextLine();
        switch (task) {
            case "1":
                List<String> stringFile1 = FileReader.readFile("src/main/resources/logs-1.txt");
                LogManipulator log1Manipulator = new Log1();
                result = log1Manipulator.manipulate(stringFile1);
                break;
            case "2":
                List<String> stringFile2 = FileReader.readFile("src/main/resources/logs-2.txt");
                LogManipulator log1Manipulator2 = new Log2();
                result = log1Manipulator2.manipulate(stringFile2);
                break;
            default:
                throw new FileNotFoundException("No files found!");
        }

//        // Outlook email configuration
//        String smtpHost = "outlook.office365.com";
//        String sender = "java_test_d@outlook.com";
//        String password = "123456789Test";
//
//        // Recipient's email address
//        String recipient = "denis.buserski@gmail.com";

        Properties properties = new Properties();
        properties.put("mail.store.protocol", "imaps");
        properties.put("mail.imaps.host", EmailConfiguration.getSmtpHost());
        properties.put("mail.imaps.port", "587");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.starttls.required", "true");

        // Create a mail session
        Session session = Session.getDefaultInstance(properties, null);

        try {
            // Create a message
            Message message = new MimeMessage(session);
            InternetAddress internetAddressSender = new InternetAddress(EmailConfiguration.getSender());
            message.setFrom(internetAddressSender);
            InternetAddress internetAddressReceiver = new InternetAddress(EmailConfiguration.getRecipient());
            message.setRecipient(Message.RecipientType.TO, internetAddressReceiver);
            message.setSubject("Invalid logins");

            StringBuilder messageBuilder = new StringBuilder();
            messageBuilder.append("We have found ").append(result.size()).append(" logins. Please find below the usernames that were not able to login:").append("\n");
            for (String s : result) {
                messageBuilder.append(s).append("\n");
            }
            message.setText(messageBuilder.toString());

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
        } catch (MessagingException exception) {
            exception.printStackTrace();
        }



    }
}
