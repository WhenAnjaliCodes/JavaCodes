import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Strings {

    public static void wordFrequency() {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");
        Map<String,Long > result = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);

    }

    public static void nonRepeatChar() {
        String s = " Java articles are Awesome";
        Character first =  s.chars().mapToObj(c -> (char) c)
                .filter(ch -> s.indexOf(ch) == s.lastIndexOf(ch) )
                .findFirst()
                .orElse(null);
        System.out.println(first);
    }
}
