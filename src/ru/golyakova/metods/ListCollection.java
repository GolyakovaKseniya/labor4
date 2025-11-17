package ru.golyakova.metods;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class ListCollection<T, P> {
    private List<T> original;
    private P result;

    public P getResult() {
        return result;
    }

    public List<T> getOriginal() {
        return original;
    }

    public static <T, P extends Collection<T>> P collectToList(
            List<T> inputList, Supplier<P> collectFactory, Function<T, Boolean> include){
        P result = collectFactory.get();
        for(T item : inputList){
            if(include.apply(item)){
                result.add(item);
            }
        }
        return result;
    }

    public ListCollection(List<T> original, P result){
        this.original = new ArrayList<>(original);
        this.result = result;
    }

    @Override
    public String toString() {
        return original + " -> " + result;
    }
}
