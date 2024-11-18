import javax.sound.sampled.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StreamsFilesDirectories {
    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        // Streams - Потоци
        // Streams are used to transfer data

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        File file = new File("input.txt");
        // file.методи

        // ------------------------------------------------------------------

        // Принтира съдържанието на файла
        String path = "input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        inputStream.close();

        // ------------------------------------------------------------------

        // Принтира int-овете в един файл
        String path = "input.txt";
        FileReader reader = new FileReader(path);
        Scanner scanner = new Scanner(reader);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                System.out.println(scanner.nextInt());
            }
            scanner.next();
        }

        // ------------------------------------------------------------------

        // Принтира числовата репрезентация на String
        String path = "input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        int nextByte = inputStream.read();

        while (nextByte != -1) {
            System.out.print(Integer.toBinaryString(nextByte) + " ");
            nextByte = inputStream.read();
        }

        // ------------------------------------------------------------------

        // Принтира нов файл, като премахва определени символи
        String path = "input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        Set<Character> separators = Set.of(',', '.', '!', '?');
        int nextByte = inputStream.read();
        PrintStream printStream = new PrintStream("out.txt");

        while (nextByte != -1) {
            char symbol = (char) nextByte;
            if (!separators.contains(symbol)) {
                printStream.print(symbol);
            }
            nextByte = inputStream.read();
        }

        // ------------------------------------------------------------------

        // Принтира всеки 3ти ред от файла
        String fileName = "input.txt";
        Path path = Paths.get(fileName);
        List<String> lines = Files.readAllLines(path);

        for (int i = 0; i < lines.size(); i++) {
            if ((i + 1) % 3 == 0) {
                System.out.println(lines.get(i));
            }
        }

        // ------------------------------------------------------------------

        // Принтиране файловите и техните размери
        File file = new File ("input.txt");
        File[] files = file.listFiles();
        for (File f : files) {
            if (!f.isDirectory() ) {
                System.out.printf ("%s:[%d]%n", f.getName(), f.length());
            }
        }

        // ------------------------------------------------------------------

        String path = "input.txt";
        Path path = Path.of("input.txt");
        List<String> lines = Files.readAllLines(path);

        // ------------------------------------------------------------------

        // Сортира линиите в текста
        InputStream inputStream = new FileInputStream ("input.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line = reader.readLine();
        List<String> lines = new ArrayList<>();

        while (line != null) {
            lines.add (line);
            line = reader.readLine();
        }

        // Collections.sort(lines);
        // Files.write(Path.of("sorted-lines.txt"), lines);

        // BufferedWriter writer = new BufferedWriter (new FileWriter("out-test.txt"));
        // writer.write (String.join (System.lineSeparator(), lines));
        // writer.flush();
        // writer.close();

        // ------------------------------------------------------------------

        File file = new File("message.txt");
        if (file.exists()) {
            System.out.println("That file exists");
            System.out.println(file.getPath()); // Gets file name
            System.out.println(file.getAbsolutePath()); // Gets file location
            System.out.println(file.isFile()); // Check if it is a file (not a folder)
            file.delete(); // Deletes the file
        } else {
            System.out.println("That file doesn't exists");
        }

        // ------------------------------------------------------------------

        Scanner scanner = new Scanner(System.in);
        File file = new File("Kamelia_Luda_Po_Tebe.wav"); // Read the song .wav
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";
        while (!response.equals("Q")) {
            System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
            System.out.print("Enter your choice: ");
            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case ("P") -> clip.start(); // start music
                case ("S") -> clip.stop(); // stop music
                case ("R") -> clip.setMicrosecondPosition(0); // restart music
                case ("Q") -> clip.close(); // stop and exit
                default -> System.out.println("Not a valid response"); // if a different letter is entered
            }
        }
        System.out.println("BYE!");

        // ------------------------------------------------------------------

        // Creates a .txt file where the text is written
        try {
            FileWriter writer = new FileWriter("poem.txt"); // Creates .txt file
            writer.write("Roses are red \nviolets are blue \nDenis is cool\n"); // Add text
            writer.append("Beautiful poem"); // Add text
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
