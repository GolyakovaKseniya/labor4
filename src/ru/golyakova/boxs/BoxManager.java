package ru.golyakova.boxs;

import java.util.ArrayList;
import java.util.List;

public class BoxManager {
    private List<Box<?>> boxes;

    public List<Box<?>> getBoxes() {
        return boxes;
    }

    public BoxManager(){
        this.boxes = new ArrayList<>();
    }

    public void putPointInBox(Box<? super Point3D> box, Point3D point){
        if(box.isFull()){
            throw new IllegalStateException("Коробка занята");
        }
        box.put(point);
    }

    public void addBox(Box<?> box){
        boxes.add(box);
    }

    @Override
    public String toString() {
        return "Коробка: " + boxes;
    }
}
