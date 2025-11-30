import java.util.Comparator;
import java.util.List;

public class SortingUsingStreams {
    public static void main(String[] args){
        List<Integer> ls = List.of(1,2,3,4,5,6,7,8,9,0,12,23,34,64,4,4);
        List<Integer> sortedls =ls.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedls);
    }
}
