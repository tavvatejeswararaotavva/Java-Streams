import java.util.*;


public class all_even_numbers_from_a_list {
    public  static void main(String[] args){
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,9,0,12,23,34,64,4,4);
        ls.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
