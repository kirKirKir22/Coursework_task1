import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("Яна", "Юля", "Иван");

        List<String> newNames = names.stream().map(n -> n.substring(1)).sorted().collect(Collectors.toList());

        newNames.forEach(System.out::println);


    }
}