package ru.golyakova.metods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class ListReducer<T> {
    private List<T> inputList;
    private T result;
    private BinaryOperator<T> reducer;
    private T defaultValue;


    public List<T> getInputList() {
        return inputList;
    }

    public T getResult() {
        return result;
    }

    public T getDefaultValue() {
        return defaultValue;
    }

    public ListReducer(List<T> inputList, BinaryOperator<T> reducer, T defaultValue){
        this.inputList = new ArrayList<>(inputList);
        this.reducer = reducer;
        this.defaultValue = defaultValue;
        this.result = reduceList(inputList, reducer, defaultValue);
    }

//    private T reduce(){
//        if (inputList == null || inputList.isEmpty()){
//            return defaultValue;
//        }
//        T result = inputList.get(0);
//        for(int i = 1; i< inputList.size(); i++){
//            result = reducer.apply(result, inputList.get(i));
//        }
//        return result;
//    }

    public static <T> T reduceList (List<T> inputList, BinaryOperator<T> reducer, T defaultValue){
        if (inputList == null || inputList.isEmpty()){
            return defaultValue;
        }
        T result = inputList.get(0);
        for(int i = 1; i< inputList.size(); i++){
            result = reducer.apply(result, inputList.get(i));
        }
        return result;
    }

    @Override
    public String toString() {
        return "Вход: " + inputList + " -> Результат: " + result;
    }
}
