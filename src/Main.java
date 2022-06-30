import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String>words=new ArrayList<>(List.of("дом","стул","кровать","окно","окно","дом","диван"));
        printAll(nums);
        Collections.sort(nums);
        task2(nums);
        task3(words);
        task4(words);
    }

    public static void printAll(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println(" ");
    }

    public static void task2(List<Integer> nums) {
        TreeSet treeSet = new TreeSet(nums);
        for (int i = 0; i < treeSet.size(); i++) {
            if (i % 2 == 0&&i!=0) {
                System.out.print(i+" ");
            }
        }
        System.out.println(" ");
    }
    public static void task3(List<String>words){
        Set<String > wordsArr=new HashSet<>(words);
        System.out.println(wordsArr);
    }
    public static void task4(List<String>words){
        Set<String > wordsArr=new HashSet<>(words);
        System.out.println(words.size()-wordsArr.size());
    }

}
