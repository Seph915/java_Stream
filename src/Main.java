import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        try {
            Stream<String> lines = Files.lines(Paths.get("src/file.txt"));
            lines.forEach(System.out::println);
            lines.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
