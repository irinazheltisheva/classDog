package ru.geekbrains.lesson6;

public class Dog {

        public void voice() {
            System.out.println("Dog Bobi run 150");
        }

}

class DogsApp {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.voice();
    }
}

