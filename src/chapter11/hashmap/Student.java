package chapter11.hashmap;

public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {  // 학번과 이름이 동일할 경우 true
        if (obj instanceof Student) {
            Student student = (Student)obj;
            return (no == student.no) && (name.equals(student.name));
        }
        return false;
    }

    @Override
    public int hashCode() {     // 학번과 이름이 같다면 동일한 값을 리턴
        return no + name.hashCode();
    }
}
