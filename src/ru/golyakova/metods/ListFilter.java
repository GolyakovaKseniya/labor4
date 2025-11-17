package ru.golyakova.metods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListFilter<T> {
    private List<T> original;
    private List<T> filtered;
    private Predicate<T> filterCondition;

    public List<T> getOriginal() {
        return original;
    }

    public List<T> getFiltered() {
        return filtered;
    }

    public ListFilter(List<T> original, Predicate<T> filterCondition){
        this.original = new ArrayList<>(original);
        this.filterCondition = filterCondition;
        this.filtered = filterList(original, filterCondition);
    }
//    private List<T> applyFilter(){
//        List<T> result = new ArrayList<>();
//        for(T item : original){
//            if(filterCondition.test(item)){
//                result.add(item);
//            }
//        }
//        return result;
//    }

    public static <T> List<T> filterList(List<T> inputList, Predicate<T> predicate){
        List<T> resultList = new ArrayList<>();
        for(T item : inputList){
            if(predicate.test(item)){
                resultList.add(item);
            }
        }
        return resultList;
    }

    @Override
    public String toString() {
        return "Вход: " + original + " -> Результат: " + filtered;
    }
}
