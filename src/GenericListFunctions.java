import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class GenericListFunctions {

    public static <E> void replace(List<E> list, E val, E newVal) {
        for (ListIterator<E> it = list.listIterator(); it.hasNext(); )
            if (val == null ? it.next() == null : val.equals(it.next()))
                it.set(newVal);
    }

    public static <E> void replace(List<E> list, E val, List<? extends E> newVals) {
        for (ListIterator<E> it = list.listIterator(); it.hasNext(); ){
            if (val == null ? it.next() == null : val.equals(it.next())) {
                it.remove();
                for (E e : newVals)
                    it.add(e);
            }
        }
    }

    public static <E> List<E> dealHand(List<E> deck, int n) {
        int deckSize = deck.size();
        //  For many common List implementations, such as ArrayList,
        //  the performance of removing elements from the end of the list
        //  is substantially better than that of removing elements from the beginning.
        List<E> handView = deck.subList(deckSize - n, deckSize);
        List<E> hand = new ArrayList<E>(handView);
        handView.clear();
        return hand;
    }




   static List<String> myList;

    public static void main(String[] args) {
        myList = new ArrayList<>();
        myList.add("string1");
        myList.add("string2");
        System.out.println(myList);
        GenericListFunctions.replace(myList, "string1", "string1aangepapast");
        System.out.println(myList);
        int test = myList.indexOf("string2");
        System.out.println(test);
    }
}
