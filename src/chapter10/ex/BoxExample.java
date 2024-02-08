package chapter10.ex;

import chapter09.account.Account;

import java.util.ArrayList;
import java.util.HashMap;

public class BoxExample {
    public static void main(String[] args) {
//        Box box = new Box();
//        box.set("string");
//        String str = (String) box.get();

        Box<Integer> integerBox = new Box<>();
        integerBox.set(1234);
        Integer integer = integerBox.get();
        System.out.println(integer);

        Box<String> stringBox = new Box<>();
        stringBox.set("123문자열");
        String str = stringBox.get();
        System.out.println(str);

        Box<Account> accountBox = new Box<>();
        accountBox.set(new Account());

        ArrayList<Account> arrayList = new ArrayList<>();
        arrayList.add(new Account());
    }
}
