import javax.swing.*;

public class Message_Box {
    public static void main(String[] args) {

        while (true) {
            // JOptionPane.showMessageDialog(null, "Simple message", "Title", JOptionPane.PLAIN_MESSAGE); // Simple message
            // JOptionPane.showMessageDialog(null, "Info message", "Title", JOptionPane.INFORMATION_MESSAGE); // Info message
            // JOptionPane.showMessageDialog(null, "Question message", "Title", JOptionPane.QUESTION_MESSAGE); // Question message
            // JOptionPane.showMessageDialog(null, "Warning message", "Title", JOptionPane.WARNING_MESSAGE); // Warning message
            // JOptionPane.showMessageDialog(null, "Error message", "Title", JOptionPane.ERROR_MESSAGE); // Error message

//===============================================================================================================================

//            Message box Yes / No / Cancel
//            int answer = JOptionPane.showConfirmDialog(null, "Bro do you code", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
//            if (answer == 1) {
//                System.out.println("Why don't you code?");
//            } else {
//                System.out.println("That's great!");
//            }

//===============================================================================================================================

//            Print Hello + name
//            String name = JOptionPane.showInputDialog("What is you name?");
//            System.out.println("Hello " + name);

//===============================================================================================================================

            String[] responses = {
                    "No, you are awesome!",
                    "Thank you!",
                    "Blake!"};
            ImageIcon icon = new ImageIcon("logo.png");

            JOptionPane.showOptionDialog(null,
                    "You are awesome",
                    "Secret Message",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    icon,
                    responses,
                    0);
        }

    }
}