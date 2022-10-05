package lesson4;
import java.util.*;

import java.util.Objects;

public class HomeWork4 {
    public static void main(String[] args) {
        TakeArray();
        PhoneList();


    }

    private static void TakeArray(){
        String[] blaba = {"Петя", "Вася", "Вася", "Вася", "Федя", "Саша", "Петя"};
        HashMap<String, Integer> Uniqblaba = new HashMap<>();

        //int[] BlaCount = new int [blaba.length];

        for (int i = 0; i < blaba.length; i++) {
            if (Uniqblaba.containsKey(blaba[i])){
                Uniqblaba.put(blaba[i], Uniqblaba.get(blaba[i]) + 1);
            } else {
                Uniqblaba.put(blaba[i], 1);
            }
        }
        System.out.println(Uniqblaba);

    }
    private static void PhoneList() {
        PList phones = new PList();

        phones.add("Иванов", "2353454365");
        phones.add("Петров", "56754878");
        phones.add("Иванов", "784568458");
        phones.add("Сидоров", "4568548");
        phones.add("Иванов", "67985694679");
        phones.add("Петров", "4764375367");
        phones.add("Андреев", "23563464575");
        phones.add("Ложкин", "34665456");
        phones.add("Петров", "56754688658");

        System.out.println("Иванов "+phones.get("Иванов"));
        System.out.println("Ложкин "+phones.get("Ложкин"));
        System.out.println("Руковишненко "+phones.get("Руковишненко"));
        System.out.println("Петров "+phones.get("Петров"));
    }


static class PList {
    private Map<String, List<String>> phones_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (phones_hm.containsKey(surname)) {
            phone_number_list = phones_hm.get(surname);
            phone_number_list.add(phone_number);
            phones_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            phones_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return phones_hm.get(surname);
    }


        }

}