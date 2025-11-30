import java.util.Arrays;
import java.util.List;

public class Find_the_maximum_number {
    public static void main(String[] args){
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,9,0,12,23,34,64,4,4);
       int  max = ls.stream().max(Integer::compare).get();
       System.out.println(max);

    }
}
