package lesson3;

//2. Задача:
//
//    Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//    Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//    Для хранения фруктов внутри коробки можно использовать ArrayList;
//    Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
//    Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
//    Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
//    Не забываем про метод добавления фрукта в коробку.

import java.util.*;

public class FruitBox<T extends Fruit> {
    private ArrayList<T> contents = new ArrayList<>();

    public void putInto(T fruit) {
        contents.add(fruit);
    }

    public void putInto(Collection<T> fruits) {
        contents.addAll(fruits);
    }

    public Collection<T> getContents() {
        return new ArrayList<>(contents);
    }

    public Double getWeight() {
//        Double totalWeight = 0.0;
//        for (int i = 0; i< contents.size(); i++) {
//            totalWeight += contents.get(i).getWeight();
//        }
//        return totalWeight;
        return contents.stream().mapToDouble(Fruit::getWeight).sum();
    }

    public boolean compare(FruitBox<?> anotherBox) {
        return Objects.equals(getWeight(), anotherBox.getWeight());
    }

    public void transfer(FruitBox<T> anotherBox) {
        anotherBox.putInto(contents);
        contents.clear();
    }


    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Apple> anotherAppleBox = new FruitBox<>();
        FruitBox<Orange> orangeBox = new FruitBox<>();

        appleBox.putInto(
                Arrays.asList(
                        new Apple(2.0),
                        new Apple(2.5),
                        new Apple(1.5),
                        new Apple(1.2))
        );

        for (int i = 0; i < 15; i++) {
            appleBox.putInto(new Apple());
        }

        System.out.println("Общий вес коробки с яблоками: " + appleBox.getWeight());

        orangeBox.putInto(
                Arrays.asList(
                        new Orange(2.0),
                        new Orange(2.5),
                        new Orange(1.5),
                        new Orange(1.2))
        );

        for (int i = 0; i < 11; i++) {
            orangeBox.putInto(new Orange());
        }

        System.out.println("Общий вес коробки с апельсинами: " + orangeBox.getWeight());
        System.out.println("Сравнение массы ящика яблок и апельсинов: " + orangeBox.compare(appleBox));


        appleBox.transfer(anotherAppleBox);
        System.out.println("Общий вес коробки с яблоками из которой пересыпали яблоки: " + appleBox.getWeight());
        System.out.println("Общий вес коробки с яблоками в которую пересыпали яблоки: " + anotherAppleBox.getWeight());

    }
}
