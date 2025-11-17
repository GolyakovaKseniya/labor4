package ru.golyakova.main;

import ru.golyakova.boxs.*;
import ru.golyakova.boxs.BoxManager;
import ru.golyakova.boxs.Point3D;
import ru.golyakova.storage.*;
import ru.golyakova.validate.*;
import ru.golyakova.metods.*;
import java.util.*;
import java.util.Scanner;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();
        Box<Double> doubleBox = new Box<>();
        boolean flag = false;
        while (!flag) {
            System.out.println("Задача 1.1");
            System.out.println("Задача 1.2");
            System.out.println("Задача 2.3");
            System.out.println("Задача 3.1");
            System.out.println("Задача 3.2");
            System.out.println("Задача 3.3");
            System.out.println("Задача 3.4");
            System.out.println("0 - Выход");
            System.out.print("Ваш выбор: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1.1":{
                    boolean flag1 = true;
                    while (flag1){

                        System.out.println("1 - Работа с целочисленной коробкой");
                        System.out.println("2 - Работа со строковой коробкой");
                        System.out.println("3 - Работа с дробночисловой коробкой");
                        System.out.println("4 - Показать все коробки");
                        System.out.println("5 - Передать целочисленную коробку в метод");
                        System.out.println("0 - Выход");
                        System.out.print("Ваш выбор: ");
                        int choice1 = Validator.inputInt();
                        switch (choice1){
                            case 1:{
                                System.out.println("Текущее состояние: " + integerBox);

                                System.out.println("1 - Положить число");
                                System.out.println("2 - Извлечь число");
                                System.out.println("3 - Проверить заполненность");
                                System.out.print("Ваш выбор: ");
                                int choice2 = Validator.inputInt();
                                switch (choice2){
                                    case 1:{
                                        if(integerBox.isFull()){
                                            System.out.println("Ошибка: Коробка уже занята!");
                                        }else{
                                            System.out.print("Введите целое число: ");
                                            int number = Validator.inputInt();
                                            integerBox.put(number);
                                            System.out.println("Число добавлено: " + integerBox);
                                        }
                                        break;
                                    }
                                    case 2:{
                                        if(integerBox.isEmpty()){
                                            System.out.println("Коробка пуста, нечего извлекать");
                                        }else {
                                            Integer number = integerBox.get();
                                            System.out.println("Извлечено число: " + number);
                                            System.out.println("Текущее состояние: " + integerBox);
                                        }
                                        break;
                                    }
                                    case 3:{
                                        System.out.println("Коробка заполнена: " + integerBox.isFull());
                                        break;
                                    }
                                    default:{
                                        System.out.println("Неверный выбор!");
                                    }
                                }
                                break;
                            }
                            case 2:{
                                System.out.println("Текущее состояние: " + stringBox);

                                System.out.println("1 - Положить строку");
                                System.out.println("2 - Извлечь строку");
                                System.out.println("3 - Проверить заполненность");
                                System.out.print("Ваш выбор: ");
                                int choice3 = Validator.inputInt();
                                switch (choice3){
                                    case 1:{
                                        if(stringBox.isFull()){
                                            System.out.println("Ошибка: Коробка уже занята!");
                                        }else{
                                            System.out.print("Введите текст: ");
                                            String text = scanner.nextLine();
                                            stringBox.put(text);
                                            System.out.println("Текст добавлен: " + stringBox);
                                        }
                                        break;
                                    }
                                    case 2:{
                                        if(stringBox.isEmpty()){
                                            System.out.println("Коробка пуста, нечего извлекать");
                                        }else{
                                            String text = stringBox.get();
                                            System.out.println("Извлечен текст: " + text);
                                            System.out.println("Текущее состояние: " + stringBox);
                                        }
                                        break;
                                    }
                                    case 3:{
                                        System.out.println("Коробка заполнена: " + stringBox.isFull());
                                        break;
                                    }
                                    default:{
                                        System.out.println("Неверный выбор!");
                                    }
                                }
                                break;
                            }
                            case 3:{
                                System.out.println("Текущее состояние: " + doubleBox);

                                System.out.println("1 - Положить дробное число");
                                System.out.println("2 - Извлечь дробное число");
                                System.out.println("3 - Проверить заполненность");
                                System.out.print("Ваш выбор: ");
                                int choice4 = Validator.inputInt();
                                switch (choice4){
                                    case 1 :{
                                        if(doubleBox.isFull()){
                                            System.out.println("Ошибка: Коробка уже занята!");
                                        }else{
                                            System.out.print("Введите какое-нибудь число: ");
                                            double number = Validator.inputDouble();
                                            doubleBox.put(number);
                                            System.out.println("Число добавлено: " + doubleBox);
                                        }
                                        break;
                                    }
                                    case 2:{
                                        if(doubleBox.isEmpty()){
                                            System.out.println("Коробка пуста, нечего извлекать");
                                        }else{
                                            Double number = doubleBox.get();
                                            System.out.println("Извлечено число: " + number);
                                            System.out.println("Текущее состояние: " + doubleBox);
                                        }
                                        break;
                                    }
                                    case 3:{
                                        System.out.println("Коробка заполнена: " + doubleBox.isFull());
                                        break;
                                    }
                                    default:{
                                        System.out.println("Неверный выбор!");
                                    }
                                }
                                break;
                            }
                            case 4:{
                                System.out.println("ВСЕ КОРОБКИ");
                                System.out.println("Целочисленная: " + integerBox);
                                System.out.println("Строковая: " + stringBox);
                                System.out.println("Дробночисловая: " + doubleBox);
                                break;
                            }
                            case 5:{
                                System.out.println("Текущее состояние целочисленной коробки: " + integerBox);
                                if(integerBox.isFull()){
                                    Integer number = integerBox.get();
                                    System.out.println("Извлечено из коробки в методе: " + number);
                                    System.out.println("После работы метода: " + integerBox);
                                }else{
                                    System.out.println("Коробка пуста, нечего извлекать");
                                }
                                break;
                            }
                            case 0:{
                                flag1 = false;
                                System.out.println("Выход из программы");
                                break;
                            }
                            default:{
                                System.out.println("Неверный выбор! Попробуйте снова");
                                break;
                            }
                        }
                        System.out.println();
                    }
                    break;
                }
                case "1.2":{
                    boolean flag1 = true;
                    while (flag1){
                        System.out.println("1 - Создать числовое хранилище");
                        System.out.println("2 - Создать строковое хранилище");
                        System.out.println("0 - Выход");
                        System.out.print("Ваш выбор: ");
                        int choice5 = Validator.inputInt();
                        switch (choice5){
                            case 1:{
                                System.out.println("1 - Ввести число");
                                System.out.println("2 - Использовать null");
                                System.out.print("Ваш выбор: ");
                                int choice1 = Validator.inputInt();
                                Integer value = null;
                                if(choice1 == 1){
                                    System.out.print("Введите целое число: ");
                                    value = Validator.inputInt();
                                }
                                Storage<Integer> storage = new Storage<>(value);
                                System.out.println("Создано: " + storage);
                                System.out.print("Введите альтернативное значение (если null): ");
                                int alternative = Validator.inputInt();
                                Integer result = storage.getValue(alternative);
                                System.out.println("Результат: " + result);

                                System.out.println("Передача числового хранилища в метод");
                                System.out.println("Исходное хранилище: " + storage);
                                Integer value1 = storage.getValue(alternative);
                                System.out.println("Извлеченное значение: " + value1);
                                System.out.println();
                                break;
                            }
                            case 2:{
                                System.out.println("1 - Ввести текст");
                                System.out.println("2 - Использовать null");
                                System.out.print("Ваш выбор: ");
                                int choice1 = Validator.inputInt();
                                String value = null;
                                if(choice1 == 1){
                                    System.out.print("Введите текст: ");
                                    value = scanner.nextLine();
                                }
                                Storage<String> storage = new Storage<>(value);
                                System.out.println("Создано: " + storage);
                                System.out.print("Введите альтернативный текст: ");
                                String alternative = scanner.nextLine();
                                String result = storage.getValue(alternative);
                                System.out.println("Результат: " + result);
                                System.out.println("Передача строкового хранилища в метод");
                                System.out.println("Исходное хранилище: " + storage);
                                String value1 = storage.getValue(alternative);
                                System.out.println("Извлеченное значение: " + value1);
                                break;
                            }
                            case 0:{
                                flag1 = false;
                                System.out.println("Выход из программы");
                                break;
                            }
                            default:{
                                System.out.println("Неверный выбор! Попробуйте снова");
                                break;
                            }
                        }
                        System.out.println();
                    }
                    break;
                }
                case "2.3":{
                    BoxManager manager = new BoxManager();
                    Box<Point3D> pointBox = new Box<>();
                    Box<Object> objectBox = new Box<>();

                    manager.addBox(pointBox);
                    manager.addBox(objectBox);
                    boolean flag1 = true;
                    while (flag1){
                        System.out.println("1 - Положить точку в коробку для ru.golyakova.boxs.Point3D");
                        System.out.println("2 - Положить точку в коробку для Object");
                        System.out.println("3 - Показать состояние коробок");
                        System.out.println("4 - Извлечь объекты из коробок");
                        System.out.println("0 - Выход");
                        System.out.print("Ваш выбор: ");
                        int choice1 = Validator.inputInt();
                        switch (choice1){
                            case 1:{
                                System.out.println("Введите координаты трехмерной точки (начало отсчета):");
                                System.out.print("Координата X: ");
                                double x = Validator.inputDouble();
                                System.out.print("Координата Y: ");
                                double y = Validator.inputDouble();
                                System.out.print("Координата Z: ");
                                double z = Validator.inputDouble();
                                Point3D point = new Point3D(x,y,z);
                                try {
                                    manager.putPointInBox(pointBox, point);
                                    System.out.println("Точка " + point + " помещена в коробку для ru.golyakova.boxs.Point3D");
                                }catch (IllegalStateException e){
                                    System.out.println("Ошибка: " + e.getMessage());
                                }
                                System.out.println();
                                break;
                            }
                            case 2:{
                                System.out.println("Введите координаты трехмерной точки (начало отсчета):");
                                System.out.print("Координата X: ");
                                double x = Validator.inputDouble();
                                System.out.print("Координата Y: ");
                                double y = Validator.inputDouble();
                                System.out.print("Координата Z: ");
                                double z = Validator.inputDouble();
                                Point3D point = new Point3D(x,y,z);
                                try{
                                    manager.putPointInBox(objectBox, point);
                                    System.out.println("Точка " + point + " помещена в коробку для Object");
                                }catch (IllegalStateException e){
                                    System.out.println("Ошибка: " + e.getMessage());
                                }
                                System.out.println();
                                break;
                            }
                            case 3:{
                                System.out.println("СОСТОЯНИЕ КОРОБОК: ");
                                List<Box<?>> boxes = manager.getBoxes();
                                for(int i = 0; i< boxes.size(); i++){
                                    System.out.println((i+1) + " - " + boxes.get(i));
                                }
                                break;
                            }
                            case 4:{
                                System.out.println("1. Из коробки для ru.golyakova.boxs.Point3D: ");
                                if(pointBox.isFull()){
                                    Point3D point = pointBox.get();
                                    System.out.println("Извлечена точка: " + point);
                                    System.out.println("Координаты: X=" + point.getX() + ", Y=" + point.getY() +
                                            ", Z=" + point.getZ());
                                }else{
                                    System.out.println("Коробка пуста");
                                }
                                System.out.println();
                                System.out.println("2. Из коробки для Object: ");
                                if(objectBox.isFull()){
                                    Object obj = objectBox.get();
                                    if(obj instanceof Point3D){
                                        Point3D point = (Point3D) obj;
                                        System.out.println("Извлечена точка: " + point);
                                        System.out.println("Координаты: X=" + point.getX() + ", Y=" + point.getY() +
                                                ", Z=" + point.getZ());
                                    }else{
                                        System.out.println("Извлечен объект: " + obj + " (тип: " + obj.getClass().getSimpleName() + ")");
                                    }
                                }else{
                                    System.out.println("Коробка пуста");
                                }
                                break;
                            }
                            case 0:{
                                flag1 = false;
                                System.out.println("Вы вышли");
                                break;
                            }
                            default:{
                                System.out.println("Неверный выбор!");
                            }
                        }
                        System.out.println();
                    }
                    break;
                }
                case "3.1":{
                    List<ListProcessor<?,?>> processors = new ArrayList<>();
                    boolean flag1 = true;
                    while (flag1){
                        System.out.println("1 - Длина строк");
                        System.out.println("2 - Абсолютные значения чисел");
                        System.out.println("3 - Максимумы массивов");
                        System.out.println("0 - Выход");
                        System.out.print("Ваш выбор: ");
                        int choice1 = Validator.inputInt();
                        switch (choice1){
                            case 1:{
                                List<String> strings = new ArrayList<>();
                                System.out.print("Введите количество строк: ");
                                int count = Validator.inputInt();
                                for(int i = 0; i<count; i++){
                                    System.out.print("Введите строку " + (i + 1) + ": ");
                                    strings.add(scanner.nextLine());
                                }
                                ListProcessor<String, Integer> lengths = new ListProcessor<>(strings, str -> str.length());
                                processors.add(lengths);
                                System.out.println("Результат:");
                                System.out.println("Исходные строки: " + strings);
                                System.out.println("Длины строк: " + lengths.getOutputList());
                                break;
                            }
                            case 2:{
                                List<Integer> numbers = new ArrayList<>();
                                System.out.print("Введите количество чисел: ");
                                int count = Validator.inputInt();
                                System.out.println("Введите числа (положительные и отрицательные):");
                                for(int i = 0; i< count; i++){
                                    System.out.print("Число " + (i + 1) + ": ");
                                    numbers.add(Validator.inputInt());
                                }
                                ListProcessor<Integer, Integer> absolute = new ListProcessor<>(numbers, num -> Math.abs(num));
                                processors.add(absolute);
                                System.out.println("Результат:");
                                System.out.println("Исходные числа: " + numbers);
                                System.out.println("Абсолютные значения: " + absolute.getOutputList());
                                break;
                            }
                            case 3:{
                                List<int[]> arrays = new ArrayList<>();
                                System.out.print("Введите количество массивов: ");
                                int count = Validator.inputInt();
                                for(int i = 0; i<count; i++){
                                    System.out.print("Введите размер массива " + (i + 1) + ": ");
                                    int size = Validator.inputInt();
                                    int[] array = new int[size];
                                    System.out.println("Введите элементы массива " + (i + 1) + ":");
                                    for(int j = 0; j<size; j++){
                                        System.out.print("Элемент " + (j + 1) + ": ");
                                        array[j] = Validator.inputInt();
                                    }
                                    arrays.add(array);
                                }
                                ListProcessor<int[], Integer> maxValues = new ListProcessor<>(arrays, arr -> {
                                    if(arr.length == 0){
                                        return 0;
                                    }
                                    int max = arr[0];
                                    for(int value : arr){
                                        if(value > max){
                                            max = value;
                                        }
                                    }
                                    return max;
                                });
                                processors.add(maxValues);
                                System.out.println("Результат:");
                                System.out.println("Исходные массивы:");
                                for(int i = 0; i<arrays.size(); i++){
                                    System.out.println("Массив " + (i + 1) + ": " + Arrays.toString(arrays.get(i)));
                                }
                                System.out.println("Максимальные значения: " + maxValues.getOutputList());
                                break;
                            }
                            case 0:{
                                flag1 = false;
                                System.out.println("Вы вышли");
                                break;
                            }
                            default:{
                                System.out.println("Неверный выбор! Попробуйте снова");
                            }
                        }
                        System.out.println();
                    }
                    break;
                }
                case "3.2":{
                    List<ListFilter<?>> filters = new ArrayList<>();
                    boolean flag1 = true;
                    while (flag1){
                        System.out.println("1 - Фильтрация строк по длине");
                        System.out.println("2 - Фильтрация чисел по знаку");
                        System.out.println("3 - Фильтрация массивов по содержимому");
                        System.out.println("0 - Выход");
                        System.out.print("Ваш выбор: ");
                        int choice1 = Validator.inputInt();
                        switch (choice1){
                            case 1 :{
                                List<String> strings = new ArrayList<>();
                                System.out.print("Введите количество строк: ");
                                int count = Validator.inputInt();
                                for(int i = 0; i<count; i++){
                                    System.out.print("Введите строку " + (i + 1) + ": ");
                                    strings.add(scanner.nextLine());
                                }
                                ListFilter<String> filtered = new ListFilter<>(strings, str -> str.length() >= 3);
                                filters.add(filtered);
                                System.out.println("Результат фильтрации:");
                                System.out.println("Исходный список: " + strings);
                                System.out.println("Отфильтрованный список: " + filtered.getFiltered());
                                break;
                            }
                            case 2:{
                                List<Integer> numbers = new ArrayList<>();
                                System.out.print("Введите количество чисел: ");
                                int count = Validator.inputInt();
                                System.out.println("Введите числа (положительные и отрицательные):");
                                for(int i = 0; i<count; i++){
                                    System.out.print("Число " + (i + 1) + ": ");
                                    numbers.add(Validator.inputInt());
                                }
                                ListFilter<Integer> filtered = new ListFilter<>(numbers, num -> num <= 0);
                                filters.add(filtered);
                                System.out.println("Результат фильтрации:");
                                System.out.println("Исходный список: " + numbers);
                                System.out.println("Отфильтрованный список: " + filtered.getFiltered());
                                break;
                            }
                            case 3:{
                                List<int[]> arrays = new ArrayList<>();
                                System.out.print("Введите количество массивов: ");
                                int count = Validator.inputInt();
                                for(int i = 0; i<count; i++){
                                    System.out.print("Введите размер массива " + (i + 1) + ": ");
                                    int size = Validator.inputInt();
                                    int[] array = new int[size];
                                    System.out.println("Введите элементы массива " + (i + 1) + ":");
                                    for(int j = 0; j < size; j++){
                                        System.out.print("Элемент " + (j + 1) + ": ");
                                        array[j] = Validator.inputInt();
                                    }
                                    arrays.add(array);
                                }
                                ListFilter<int[]> filteredArrays = new ListFilter<>(arrays, arr -> {
                                    for(int value : arr){
                                        if(value > 0){
                                            return false;
                                        }
                                    }
                                    return true;
                                });
                                filters.add(filteredArrays);
                                System.out.println("Результат фильтрации:");
                                System.out.println("Исходные массивы:");
                                for(int i = 0; i<arrays.size(); i++){
                                    System.out.println("Массив " + (i + 1) + ": " + Arrays.toString(arrays.get(i)));
                                }
                                System.out.println("Отфильтрованные массивы (без положительных элементов):");
                                for (int i = 0; i<filteredArrays.getFiltered().size(); i++){
                                    System.out.println("Массив " + (i + 1) + ": " + Arrays.toString(filteredArrays.getFiltered().get(i)));
                                }
                                break;
                            }
                            case 0:{
                                flag1 = false;
                                System.out.println("Вы вышли");
                                break;
                            }
                            default:{
                                System.out.println("Неверный выбор! Попробуйте снова");
                            }
                        }
                        System.out.println();
                    }
                    break;
                }
                case "3.3":{
                    List<ListReducer<?>> reducers = new ArrayList<>();
                    boolean flag1 = true;
                    while (flag1){
                        System.out.println("1 - Объединение строк в одну");
                        System.out.println("2 - Сумма чисел");
                        System.out.println("3 - Общее количество элементов во вложенных списках");
                        System.out.println("0 - Выход");
                        System.out.print("Ваш выбор: ");
                        int choice1 = Validator.inputInt();
                        switch (choice1){
                            case 1:{
                                List<String> strings = new ArrayList<>();
                                System.out.print("Введите количество строк: ");
                                int count = Validator.inputInt();
                                for(int i = 0; i<count; i++){
                                    System.out.print("Введите строку " + (i + 1) + ": ");
                                    strings.add(scanner.nextLine());
                                }
                                ListReducer<String> stringListReducer = new ListReducer<>(strings, (str1, str2) -> str1 + str2, "");
                                reducers.add(stringListReducer);
                                System.out.println("Результат сокращения:");
                                System.out.println("Исходный список: " + strings);
                                System.out.println("Объединенная строка: \"" + stringListReducer.getResult() + "\"");

                                if(count == 0){
                                    System.out.println("(Список пуст)");
                                }
                                break;
                            }
                            case 2:{
                                List<Integer> numbers = new ArrayList<>();
                                System.out.print("Введите количество чисел: ");
                                int count = Validator.inputInt();
                                System.out.println("Введите числа:");
                                for(int i = 0; i<count; i++){
                                    System.out.print("Число " + (i + 1) + ": ");
                                    numbers.add(Validator.inputInt());
                                }
                                ListReducer<Integer> sumReducer = new ListReducer<>(numbers, (num1, num2) -> num1+num2, 0);
                                reducers.add(sumReducer);
                                System.out.println("Результат:");
                                System.out.println("Исходные числа: " + numbers);
                                System.out.println("Сумма: " + sumReducer.getResult());
                                if (count == 0){
                                    System.out.println("(Список пуст)");
                                }
                                break;
                            }
                            case 3:{
                                List<List<Integer>> nested = new ArrayList<>();
                                System.out.print("Введите количество вложенных списков: ");
                                int count = Validator.inputInt();
                                for(int i = 0; i< count; i++){
                                    List<Integer> inner = new ArrayList<>();
                                    System.out.print("Введите количество элементов в списке " + (i + 1) + ": ");
                                    int elemCount = Validator.inputInt();
                                    System.out.println("Введите элементы списка " + (i + 1) + ":");
                                    for(int j = 0; j<elemCount; j++){
                                        System.out.print("Элемент " + (j + 1) + ": ");
                                        inner.add(Validator.inputInt());
                                    }
                                    nested.add(inner);
                                }
                                List<Integer> sizes = new ArrayList<>();
                                for(List<Integer> list : nested){
                                    sizes.add(list.size());
                                }
                                ListReducer<Integer> totalElem = new ListReducer<>(sizes, (size1, size2) -> size1 + size2, 0);
                                reducers.add(totalElem);
                                System.out.println("Результат сокращения:");
                                System.out.println("Исходные списки:");
                                if(nested.isEmpty()){
                                    System.out.println("[]");
                                }else {
                                    for (int i = 0; i < nested.size(); i++) {
                                        System.out.println("Список " + (i + 1) + ": " + nested.get(i));
                                    }
                                }
                                System.out.println("Общее количество элементов: " + totalElem.getResult());
                                if(count == 0){
                                    System.out.println("(Список пуст)");
                                }
                                break;
                            }
                            case 0:{
                                flag1 = false;
                                System.out.println("Вы вышли");
                                System.out.println();
                                break;
                            }
                            default:{
                                System.out.println("Неверный выбор! Попробуйте снова");
                            }
                        }
                        System.out.println();
                    }
                    break;
                }
                case "3.4":{
                    List<ListCollection<?, ?>> allCollect = new ArrayList<>();
                    boolean flag1 = true;
                    while (flag1){
                        System.out.println("1 - Разделение чисел на положительные и отрицательные ");
                        System.out.println("2 - Группировка строк по длине");
                        System.out.println("3 - Уникальные строки (удаление дубликатов)");
                        System.out.println("0 - Выход");
                        System.out.print("Ваш выбор: ");
                        int choice1 = Validator.inputInt();
                        switch (choice1){
                            case 1:{
                                List<Integer> numbers = new ArrayList<>();
                                System.out.print("Введите количество чисел: ");
                                int count = Validator.inputInt();
                                System.out.println("Введите числа:");
                                for(int i = 0; i<count; i++){
                                    System.out.print("Число " + (i + 1) + ": ");
                                    numbers.add(Validator.inputInt());
                                }
                                List<Integer> positiveNumbers = ListCollection.collectToList(numbers, ArrayList::new, num -> num > 0);
                                List<Integer> negativeNumbers = ListCollection.collectToList(numbers, ArrayList::new, num -> num < 0);
                                List<Integer> zero = ListCollection.collectToList(numbers, ArrayList::new, num -> num == 0);

                                List<List<Integer>> results = Arrays.asList(numbers, positiveNumbers, negativeNumbers, zero);
                                ListCollection<Integer, List<List<Integer>>> result = new ListCollection<>(numbers,results);
                                allCollect.add(result);

                                System.out.println("Результат разделения:");
                                System.out.println("Исходные числа: " + numbers);
                                System.out.println("Положительные числа: " + positiveNumbers);
                                System.out.println("Отрицательные числа: " + negativeNumbers);
                                if(!zero.isEmpty()){
                                    System.out.println("Нули: " + zero);
                                }
                                break;
                            }
                            case 2:{
                                List<String> strings = new ArrayList<>();
                                System.out.print("Введите количество строк: ");
                                int count = Validator.inputInt();
                                for(int i = 0; i<count; i++){
                                    System.out.print("Введите строку " + (i + 1) + ": ");
                                    strings.add(scanner.nextLine());
                                }
                                Set<Integer> uniqueLenghts = new HashSet<>();
                                for(String str : strings){
                                    uniqueLenghts.add(str.length());
                                }
                                Map<Integer, List<String>> grouped = new HashMap<>();
                                for(int lenght : uniqueLenghts){
                                    List<String> string = ListCollection.collectToList(strings, ArrayList::new, str -> str.length() == lenght);
                                    grouped.put(lenght, string);
                                }
                                ListCollection<String, Collection<List<String>>> result = new ListCollection<>(strings,new ArrayList<>(grouped.values()));
                                System.out.println("\nРезультат группировки:");
                                System.out.println("Исходные строки: " + strings);

                                for(int length : uniqueLenghts){
                                    List<String> string = grouped.get(length);
                                    System.out.println("Строки длиной " + length + ": " + string);
                                }
                                break;
                            }
                            case 3:{
                                List<String> strings = new ArrayList<>();
                                System.out.print("Введите количество строк: ");
                                int count = Validator.inputInt();
                                for(int i = 0; i<count; i++){
                                    System.out.print("Введите строку " + (i + 1) + ": ");
                                    strings.add(scanner.nextLine());
                                }
                                Set<String> uniqueStrings = ListCollection.collectToList(strings, HashSet::new, str->true);
                                ListCollection<String, Set<String>> result = new ListCollection<>(strings, uniqueStrings);
                                allCollect.add(result);
                                System.out.println("Результат:");
                                System.out.println("Исходные строки: " + strings);
                                System.out.println("Уникальные строки: " + uniqueStrings);
                                break;
                            }
                            case 0:{
                                flag1 = false;
                                System.out.println("Вы вышли");
                                System.out.println();
                                break;
                            }
                            default:{
                                System.out.println("Неверный выбор! Попробуйте снова");
                            }
                        }
                        System.out.println();
                    }
                    break;
                }
                case "0":{
                    System.out.println("Выход из программы");
                    return;
                }
                default:{
                    System.out.println("Неверный выбор! Попробуйте снова");
                    break;
                }
            }
        }
    }
}