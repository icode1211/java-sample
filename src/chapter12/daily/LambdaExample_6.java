package chapter12.daily;

import java.util.function.Function;

public class LambdaExample_6 {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("저팔계", 95, 93)
    };


    /*  avg() 메소드 작성
     */
    static double avg(Function<Student, Integer> function) {
        int sum = 0;
        for (Student student : students) {
            sum = sum + function.apply(student);
        }
        return (double) sum / students.length;
    }

    public static void main(String[] args) {
        double englishAvg = avg(Student::getEnglishScore);    // 매개변수의 메소드 참조!
        System.out.println("영어 평균 점수: " + englishAvg);

        double mathAvg = avg(Student::getMathScore);
        System.out.println("수학 평균 점수: " + mathAvg);
    }

    public static class Student {
        private String name;
        private int englishScore;
        private int mathScore;

        public Student(String name, int englishScore, int mathScore) {
            this.name = name;
            this.englishScore = englishScore;
            this.mathScore = mathScore;
        }

        public String getName() {
            return name;
        }

        public int getEnglishScore() {
            return englishScore;
        }

        public int getMathScore() {
            return mathScore;
        }
    }
}
