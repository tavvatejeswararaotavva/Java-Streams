import java.util.List;

public class Find_names_starting_with_letters {
    public static void main(String[] args){
        List<String> ls = List.of("java", "spring", "stream", "springboot", "microservices", "spring cloud");
        ls.stream().filter(name->name.startsWith("j")).forEach(System.out::println);
    }
}
