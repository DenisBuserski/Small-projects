import java.io.*;

public class SerializationDsererialization {
    public static void main(String[] args) throws IOException {
        // Serialization - Преобразуване на 1 тип данни в байтове

        // SERIALIZATION
        User user = new User();
        user.name = "Bro";
        user.password = "I love pizza";

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("File saved");

//        public class User implements Serializable {
//            String name;
//            String password;
//
//            public void sayHello() {
//                System.out.println("Hello " + name);
//            }
//
//        }


        // --------------------------------------------------------------------------------------


        // DESERIALIZATION
        User user = null;

        FileInputStream fileIn = new FileInputStream("UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);

        user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();




    }
}
