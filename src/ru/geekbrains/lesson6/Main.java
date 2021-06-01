package ru.geekbrains.lesson6;

import javax.lang.model.element.Name;

public class Main {

    public static void main(String[] args) {
        // write your code here

        class Dog implements Name {

            void voice() {
                System.out.println("run 150");
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public boolean contentEquals(CharSequence cs) {
                return false;
            }

            @Override
            public int length() {
                return 0;
            }

            @Override
            public char charAt(int index) {
                return 0;
            }

            @Override
            public CharSequence subSequence(int start, int end) {
                return null;
            }

            @Override
            public String toString() {
                return null;
            }
        }
    }
}

