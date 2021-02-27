package lessons.lesson2;

public class If_Else1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 4;

        // допустимо на одной строке if(someCondition) print("someString"); при этом скобки не нужны. Но мы так не делаем.

        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        }
        if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        }
        if ((a == b && b != c && c != a) || (a != b && b == c && c != a) || (a != b && b != c && c == a)) {
            System.out.println("Это равнобедренный треугольник");

        }
    }

    /* Метод main() отличается от всех остальных методов тем, что является, как правило, точкой входа в программу.
    Этот метод вызывается виртуальной машиной Java. Как только заканчивается выполнение метода main(), тем самым сразу же завершается работа самой программы.
    Метод main(), так и любой другой метод, должен быть обязательно вложен в класс. После компиляции класс, содержащий метод main(), запускается на выполнение командой
    java ПолноеИмяКласса
    Если задать другое имя методу, то он отразится и сработает в файле, но консоль выйдет результат только в рамках метода main() */
    public static void main1(String[] args) {
        int a = 7;
        int b = 4;
        int c = 4;

        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        }
        if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        } else {
            System.out.println("Это равнобедренный треугольник");
        }
    }
}

