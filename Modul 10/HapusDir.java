import java.io.File;

public class HapusDir {
    public static void main(String[] args) {
        var dir = new File("folder_test");

        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();

            if (files != null) {
                for (File f : files) {
                    var result = f.delete();
                    System.out.println(
                        (result ? "Berhasil" : "Gagal") + " hapus: " + f.getName()
                    );
                }
            }

            var result = dir.delete();
            System.out.println(
                (result ? "Berhasil" : "Gagal") + " hapus direktori: " + dir.getName()
            );
        } else {
            System.out.println("Direktori tidak ada.");
        }
    }
}
