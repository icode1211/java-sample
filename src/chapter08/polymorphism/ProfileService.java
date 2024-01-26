package chapter08.polymorphism;

public class ProfileService {

    public void saveProfileOne() {
        // db로 저장하는 로직 ~~~
        // ~~~
        // ~~~
    }
    public void saveProfile(ProfileRepository repository) {
        repository.save();
    }
}
