package chapter13.quiz;

import java.util.ArrayList;
import java.util.List;

/**
 * 수업 중 퀴즈 2
 */
public class Quiz2 {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        members.add(new Member("홍길동", "RED", 10));
        members.add(new Member("이길동", "BLACK", 36));
        members.add(new Member("삼길동", "BLUE", 20));

        List<Person> personList = members.stream()
                .map(member -> new Person(member.getName(), member.getAge()))
                .toList();
        System.out.println("personList = " + personList);
    }
}
