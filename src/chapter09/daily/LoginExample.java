package chapter09.daily;

public class LoginExample {
    public static void main(String[] args) {
        //
        try {
            login("white", "12345");
        } catch (Exception e) {
            System.out.println(e.getMessage()); // 아이디가 존재하지 않습니다. id:white
        }

        try {
            login("blue", "54321");
        } catch (NotExistsIdException e) {
            System.out.println(e.getMessage());

        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());     // 패스워드가 틀립니다.
        }

    }

    public static void login(String id, String password) throws NotExistsIdException, WrongPasswordException {
        if (!id.equals("blue")) {
//            throw new NotExistsIdException();
            throw new NotExistsIdException("아이디가 존재하지 않습니다. id:" + id);
        }

        if (!password.equals("12345")) {
            throw new WrongPasswordException("패스워드가 틀립니다.");
        }
    }
}
