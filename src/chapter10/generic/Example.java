package chapter10.generic;

import java.util.List;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}

class Zoo {
    // Animal 및 Animal의 자식 클래스만 받을 수 있음
    public void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }

    public void addAnimal(List<Animal> animals, Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + "이(가) 동물원에 추가되었습니다.");
    }
}

public class Example {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        // 동물 리스트 생성
        List<Animal> animalList = List.of(new Dog("강아지"), new Cat("고양이"));

        // 동물원에 있는 동물 출력
        zoo.printAnimals(animalList);

        // 새로운 동물 추가
        zoo.addAnimal(animalList, new Animal("동물"));

        // Animal의 부모 클래스인 Object를 추가하려고하면  컴파일 시 에러
        // zoo.addAnimal(animalList, new Object());
    }
}


