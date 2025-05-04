package inheritancePractice;

import java.util.Comparator;

public class TreeSetDecendingOrder implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        return b.compareTo(a);
    }



}




