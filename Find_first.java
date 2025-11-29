import java.util.Arrays;
import java.util.List;

public class Find_first {
    public static void main(String args[]){
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,9,0,12,23,34,64,4,4);
        int result = ls.stream().filter(n->n%2!=0).findFirst().orElse(-1);
        System.out.println(result);
    }
}
