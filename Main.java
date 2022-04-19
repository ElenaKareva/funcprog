import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        String text = "Великий вождь племени Умба-юмба передает чужеземцам привет";


        final Function<String, List<String>> dictionary = (a) ->
                Arrays.stream(a.split(" "))
                        .sorted()
                        .distinct()
                        .collect(Collectors.toList());
        dictionary.apply(text).forEach(System.out::println);;

    }
}

// о функциональном стиле свидетельствуют интерфейс function и монады