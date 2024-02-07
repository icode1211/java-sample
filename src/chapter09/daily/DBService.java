package chapter09.daily;

/**
 * 예외 사용 예시
 */
public class DBService {
    public static void main(String[] args) {
        // Profile : (이름, 나이), 취미, 좋아하는 음식, ...
        try {
            save("name" ,"age", "hobby", "food");
        } catch (NotExistsAgeException e) {
            // logging
        }
    }

    public static void save(String name, String age, String hobby, String food) throws NotExistsAgeException {
        // DB 필수값 save 시도할 때 SQLException 예외 방지
        if (name.equals("")) {
            throw new NotExistsAgeException("이름이 비어있습니다. name: " + name);
        }

        // dbRepository.save(name, age, hobby, food);
    }
}
