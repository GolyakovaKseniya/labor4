package ru.golyakova.validate;

import ru.golyakova.boxs.Box;
import ru.golyakova.boxs.Point3D;

import java.util.Scanner;

public class Validator {
    static Scanner scanner = new Scanner(System.in);
    public static int inputInt(){
        while (true){
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Ошибка! Введите целое число.");
            }
        }
    }
    public static double inputDouble(){
        while (true){
            try {
                return Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Ошибка! Введите число.");
            }
        }
    }
    public static void putPointInBox(Box<? super Point3D> box){
        if(box.isFull()){
            System.out.println("Ошибка: Коробка уже занята!");
        }else{
            System.out.println("Введите координаты трехмерной точки (начало отсчета):");
            System.out.print("Координата X: ");
            double x = Validator.inputDouble();
            System.out.print("Координата Y: ");
            double y = Validator.inputDouble();
            System.out.print("Координата Z: ");
            double z = Validator.inputDouble();
            Point3D point = new Point3D(x,y,z);
            try {
                box.put(point);
                System.out.println("Трехмерная точка " + point + " помещена в коробку");
            }catch (IllegalStateException e){
                System.out.println("Не удалось поместить точку: " + e.getMessage());
            }
        }
    }
}
