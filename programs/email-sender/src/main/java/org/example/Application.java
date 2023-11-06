package org.example;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {

        File folder = new File("src/main/resources");
        File[] listOfFiles = folder.listFiles();
        String result = "";

        for (File file : listOfFiles) {
            int count = 0;
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if (line.equals("Denis")) {
                    count++;
                }
            }
            result = "Denis = " + count;
        }

        // Outlook email configuration
        String smtpHost = "outlook.office365.com";
        String sender = "test@outlook.com";
        String password = "**********";

        // Recipient's email address
        String recipient = "denis.buserski@gmail.com";

        Properties properties = new Properties();
        properties.put("mail.store.protocol", "imaps");
        properties.put("mail.imaps.host", smtpHost);
        properties.put("mail.imaps.port", "993");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.starttls.required", "true");

        // Create a mail session
        Session session = Session.getDefaultInstance(properties, null);

        try {
            // Create a message
            Message message = new MimeMessage(session);
            InternetAddress internetAddressSender = new InternetAddress(sender);
            message.setFrom(internetAddressSender);
            InternetAddress internetAddressReceiver = new InternetAddress(recipient);
            message.setRecipient(Message.RecipientType.TO, internetAddressReceiver);
            message.setSubject("Hello, this is a test email");
            message.setText("This is a test email sent from Java. I searched for Denis in logs.txt and I found that " + result);

            // Connect and authenticate recipient the SMTP server
            Transport transport = session.getTransport("smtp");
            transport.connect(smtpHost, 587, sender, password);

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
