package chapter06;

public class PersonExample {
    public static void main(String[] args) {

        // Person 클래스에서 바로 접근 가능 = 객체 생성하지 않아도 사용 가능
        System.out.println(Person.NATION);  // static final 변수(=상수)

        // 일반변수 : 객체를 생성해야 사용 가능
        Person person = new Person();
        System.out.println(person.name);
    }
}
