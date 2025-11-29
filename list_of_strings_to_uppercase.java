import java.util.*;

public class list_of_strings_to_uppercase {
    public  static void main(String[] args){
        List<String> ls = Arrays.asList("java", "spring", "stream");
        ls.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
