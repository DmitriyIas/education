package employee;

import java.util.ArrayList;
import java.util.List;

 class MatchFilter {

     private MatchFilter(){}

     static <E> List<E> getMatchList( List<E> firstList,  List<E> secondList) {
        List<E> matchList = new ArrayList<>();

        for (E element : firstList) {
            if (secondList.contains(element) && !matchList.contains(element)) {
                matchList.add(element);
            }
        }
        return matchList;
    }

     static <E> List<E> getNonMatchList( List<E> firstList,  List<E> secondList) {
        List<E> matchList = new ArrayList<>();

        for (E element : firstList) {
            if (!secondList.contains(element) && !matchList.contains(element)) {
                matchList.add(element);
            }
            for (E elem : secondList){
                if (!firstList.contains(elem) && !matchList.contains(elem)) {
                    matchList.add(elem);
                }
            }
        }
        return matchList;
    }


}
