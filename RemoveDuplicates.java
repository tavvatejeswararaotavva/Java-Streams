import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args){
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,7,9,0,12,23,34,64,4,4);
        ls.stream().distinct().forEach(System.out::print);
    }
}
