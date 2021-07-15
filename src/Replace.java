import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Replace {
    public static <E> void replace(List<E> list, E val, E newVal) {
        for (ListIterator<E> it = list.listIterator(); it.hasNext(); )
            if (val == null ? it.next() == null : val.equals(it.next()))
                it.set(newVal);
    }

   static List<String> myList;

    public static void main(String[] args) {
        myList = new ArrayList<>();
        myList.add("string1");
        myList.add("string2");
        System.out.println(myList);
        Replace.replace(myList, "string1", "string1aangepapast");
        System.out.println(myList);
    }
}
