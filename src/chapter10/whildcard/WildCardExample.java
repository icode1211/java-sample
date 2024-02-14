package chapter10.whildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardExample {

    static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    static void registerStudentCourse(Course<? extends Student> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    static void registerWorkerCourse(Course<? super Worker> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();
        List<Person> personList = new ArrayList<>();
        personList.addAll(workers);
//        workers.addAll(personList);

        Course<Person> personCourse = new Course<>("일반인과정", 4);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HighStudent("고등학생"));

        Course<Worker> workerCourse = new Course<>("직장인과정", 4);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<>("학생과정", 4);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 4);
        highStudentCourse.add(new HighStudent("고등학생"));

        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);
        System.out.println("-------------------------");

//        registerStudentCourse(personCourse);
//        registerStudentCourse(workerCourse);
        registerStudentCourse(studentCourse);
        registerStudentCourse(highStudentCourse);
        System.out.println("-------------------------");

        registerWorkerCourse(personCourse);
        registerWorkerCourse(workerCourse);
//        registerWorkerCourse(studentCourse);
//        registerWorkerCourse(highStudentCourse);
    }
}
