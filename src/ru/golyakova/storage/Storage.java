package ru.golyakova.storage;

public class Storage<T>{
    private final T item;

    public Storage(T item){
        this.item = item;
    }

    public T getValue(T alternative){
        if(this.item != null){
            return this.item;
        }else{
            return alternative;
        }
    }

    public boolean isNull(){
        return this.item == null;
    }

    @Override
    public String toString() {
        if(item != null){
            return "Хранилище содержит: " + item;
        }else{
            return "Хранилище содержит: null";
        }
    }
}
