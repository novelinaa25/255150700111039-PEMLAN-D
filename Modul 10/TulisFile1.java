import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TulisFile1 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan teks yang akan disimpan: ");
        String text = keyboard.nextLine();

        // Percobaan 1: false (overwrite)
        try (FileWriter writer = new FileWriter("test.txt", false)) {

            writer.write(text);

        } catch (IOException e) {

            System.err.println("Gagal menulis ke file");

        }

        /*
        // Percobaan 2: true (append)

        try (FileWriter writer = new FileWriter("test.txt", true)) {

            writer.write(text);

        } catch (IOException e) {

            System.err.println("Gagal menulis ke file");

        }
        */

        keyboard.close();
    }
}