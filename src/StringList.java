
import java.util.Arrays;
import java.util.List;
import java.util.Map;


import static java.util.stream.Collectors.groupingBy;

public class StringList {
    public static void main(String[] args) {
        List<String> strlist = Arrays.asList("Amir", "Hatef", "Mehran", "Mojtaba", "Mohammad", "Ali", "Davood", "Reza", "Mohsen");
        Map<Integer, List<String>> resultlist=strlist.stream()
                .collect(groupingBy(String::length));

        System.out.println(resultlist);
    }
}
