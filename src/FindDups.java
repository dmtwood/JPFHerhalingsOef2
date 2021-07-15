import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FindDups {
    public static void main(String[] args) {
//        var distinctWords = new HashSet<>(Arrays.asList(args));
        var distinctWords = new TreeSet<>();
        var duplicateWords = new HashSet<>();

        for (String s : args){
            if( ! distinctWords.add(s)){
                duplicateWords.add(s);
            }
        }

        System.out.println(distinctWords.size() + " unique words: " + distinctWords);
        System.out.println(duplicateWords.size() + " duplicate words: " + duplicateWords );
    }
}
