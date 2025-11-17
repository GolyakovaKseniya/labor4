package ru.golyakova.boxs;

public class Box<T> {
    private T item;

    public Box(){
        this.item = null;
    }

    public Box(T item){
        this.item = item;
    }

    public void put(T item){
        if(this.item != null){
            throw new IllegalStateException("Коробка уже занята");
        }
        this.item = item;
    }

    public T get(){
        T temp = this.item;
        this.item = null;
        return temp;
    }

    public boolean isFull(){
        return this.item != null;
    }

    public boolean isEmpty(){
        return this.item == null;
    }

    @Override
    public String toString() {
        if(item != null){
            return "Коробка содержит: " + item + " (тип: " + item.getClass().getSimpleName() + ")";
        }else{
            return "Коробка пуста";
        }
    }
}
