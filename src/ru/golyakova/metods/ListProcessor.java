package ru.golyakova.metods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ListProcessor<T, P> {
    private List<T> inputList;
    private List<P> outputList;
    private Function<T, P> processorFunction;

    public List<T> getInputList() {
        return inputList;
    }

    public List<P> getOutputList() {
        return outputList;
    }

    public ListProcessor(List<T> inputList, Function<T, P> processorFunction){
        this.inputList = new ArrayList<>(inputList);
        this.processorFunction = processorFunction;
        this.outputList = processList(inputList, processorFunction);
    }

    public static <T, P> List<P> processList(List<T> inputList, Function<T,P> function){
        List<P> resultList = new ArrayList<>();
        for(T item : inputList){
            P processedItem = function.apply(item);
            resultList.add(processedItem);
        }
        return resultList;
    }

    @Override
    public String toString() {
        return "Вход: " + inputList + " -> Результат: " + outputList;
    }
}
