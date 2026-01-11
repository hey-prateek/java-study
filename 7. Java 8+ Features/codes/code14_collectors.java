import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class code14_collectors {
    public static void main(String[] args)
    {
        
        List<String> lst=Arrays.asList("hey", "kanye", "west");
        //collecting to a linkedlist through collectors
        LinkedList<String> ll=lst.stream().collect(Collectors.toCollection(LinkedList::new));
        for(String l : ll)
        {
            System.out.println(l);
        }

        //collectors.joining, used to concatenate data
        List<String> lst1=Arrays.asList("hey", "kanye", "west");
        String s=lst1.stream().collect(Collectors.joining(", ")); //separated with ,
        System.out.println(s);

        //collectors.counting, to count number of elements
        long count=lst1.stream().collect(Collectors.counting());
        System.out.println(count);

        //collectors.partitioningBy
        List<Integer> lst2=Arrays.asList(1,2,3,4,5,6);
        Map<Boolean, List<Integer>> map=lst2.stream().collect(Collectors.partitioningBy(n -> n%2==0));
        map.forEach((k, v) -> System.out.println(k+"-"+v));
    }
}
