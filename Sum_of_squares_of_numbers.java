import java.util.Arrays;
import java.util.List;

public class Sum_of_squares_of_numbers {
    public static void main(String[] args){
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
       int sum = ls.stream().map(n->n*n).reduce(0,Integer::sum);
       System.out.println(sum);

    }
}
