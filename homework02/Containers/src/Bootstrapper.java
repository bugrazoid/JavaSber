import java.util.*;

class MyStringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int diff = o1.length() - o2.length();

        if (diff == 0)
            return o1.compareTo(o2);

        return diff;
    }
}

public class Bootstrapper {
    public static void main(String[] args) {
        String data =
                "He as compliment unreserved projecting.\n" +
                "Between had observe pretend delight for believe.\n" +
                "Do newspaper questions consulted sweetness do.\n" +
                "Our sportsman his unwilling fulfilled departure law.\n" +
                "Now world own total saved above her cause table.\n" +
                "Wicket myself her square remark the should far secure sex.\n" +
                "Smiling cousins warrant law explain for whether.\n" +
                "Was drawing natural fat respect husband.\n" +
                "An as noisy an offer drawn blush place.\n" +
                "These tried for way joy wrote witty.\n" +
                "In mr began music weeks after at begin.\n" +
                "Education no dejection so direction pretended household do to.\n" +
                "Travelling everything her eat reasonable unsatiable decisively simplicity.\n" +
                "Morning request be lasting it fortune demands highest of.\n";

        String[] s = data.split("\\W+");
        System.out.println("Total words: " + s.length);
        HashSet<String> set = new HashSet<String>();
        TreeSet<String> treeSet = new TreeSet<>(new MyStringComparator());

        for (String ss : s) {
            set.add(ss);
            treeSet.add(ss);
        }

        System.out.println("Unique words: " + set.size());
        System.out.println(treeSet);
    }

}