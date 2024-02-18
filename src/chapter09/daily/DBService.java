package chapter09.daily;

/**
 * 예외 사용 예시
 */
public class DBService {

    // A 개발자가 개발한 main메서드
    public static void main(String[] args) {
        // Profile : (이름, 나이), 취미, 좋아하는 음식, ...
        try {
            save("name" ,"age", "hobby", "food");
        } catch (NotExistsNameException e) {
            System.out.println("필수값 누락!");
        }
        // 1. A개발자가 save만 하고 그 결과에 대한 후처리는 신경쓰지 않아도 된다.
        // 2. B개발자는 필수값이 있다는 사실을 A개발자에게 꼭 인지 시키고싶다.
    }


    // B 개발자가 개발한 save메서드
    public static void save(String name, String age, String hobby, String food) throws NotExistsNameException {
        // DB 필수값 save 시도할 때 SQLException 예외 방지
        if (name.equals("")) {
            // 1. logging만 남기고 끝.

            // 2. 외부 개발자에게 인지시키기 위한 예외 발생시키고 throw
            throw new NotExistsNameException("이름이 비어있습니다. name: " + name);
        }

        // 최종적으로 Database에 Profile정보 저장하는 로직 수행
        // dbRepository.save(name, age, hobby, food);
    }
}
