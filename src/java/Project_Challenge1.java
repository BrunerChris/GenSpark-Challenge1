import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Project_Challenge1
{
    List<String> c1string = new ArrayList<>();
    Map<String, Integer> order = new HashMap<>();

    Project_Challenge1()
    {

        try
        {
            Stream.of(Files.readAllLines(Path.of("src/resources/input.txt")))
                    .flatMap(List::stream)
                    .forEach(s -> c1string.add(s));
        }
        catch (IOException e) {throw new RuntimeException(e);}

        try
        {
            Stream.of(Files.readAllLines(Path.of("src/resources/order.txt")))
                    .flatMap(List::stream)
                    .map(s -> new String[]{s.split(",")[0], s.split(",")[1]})
                    .forEach(s -> order.put(s[0],Integer.valueOf(s[1])));
        }
        catch (IOException e) {throw new RuntimeException(e);}

        print();
    }

    public void print()
    {
        c1string.forEach(s->System.out.println(s));
    }
}
