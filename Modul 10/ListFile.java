import java.io.File;

public class ListFile {

    public static void main(String[] args) {

        File dir = new File("."); // direktori saat ini

        if (dir.isDirectory()) {

            File[] files = dir.listFiles();

            if (files != null) {

                System.out.println(
                    "Daftar file di direktori: " + dir.getAbsolutePath()
                );

                for (File f : files) {

                    if (f.isFile()) {

                        System.out.println("  - " + f.getName());

                    }
                }
            }

        } else {

            System.out.println("Bukan direktori.");

        }
    }
}