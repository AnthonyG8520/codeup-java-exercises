package ExtraWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("ant", "anthony", "tony", "anton"));

        names.stream().forEach(n -> System.out.println(n));

        Stream<String> namesWithA = names.stream().filter(n -> n.contains("a"));
        
    }
}
