import java.util.Arrays;
import java.util.List;

public class Count_how_many_numbers_are_greater_than_particular_Integer {
    public static void main(String[] args){
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,9,0,12,23,34,64,4,4);
      long vount = ls.stream().filter(n->n>6).count();
        System.out.println(vount);
    }
}
