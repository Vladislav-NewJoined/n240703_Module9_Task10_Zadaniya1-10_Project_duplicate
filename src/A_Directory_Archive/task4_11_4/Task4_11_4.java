package task4_11_4;

public class Task4_11_4 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                Модуль 4. Наследование. Задание №11:\s
                    4. А второй способ?\s

                Решение:\s""");

        System.out.println("""
                Второй способ проследить цепочку вызовов stacktrace конкретного метода в Java
                - это использовать стек-трейс (stacktrace) в исключениях. Мы можем использовать
                стектрейс для того, чтобы увидеть последовательность вызовов методов до возникновения
                исключения в программе.
                
                Ниже пример кода, который демонстрирует как можно использовать стек-трейс для
                просмотра вызовов методов до возникновения исключения:
                
                В данном примере, мы вызываем метод method1() из метода main(), а затем method2()
                из method1(). Метод method2() генерирует NullPointerException и программа перехватывает
                это исключение. В блоке catch мы выводим стек-трейс исключения, который показывает
                последовательность вызовов методов в обратном порядке до возникновения ошибки.
                
                Использование стек-трейса в исключениях позволяет увидеть цепочку вызовов методов
                в процессе выполнения программы и помогает выявить место возникновения ошибки.
                \s""");

        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        String str = null;
        System.out.println(str.length());
    }
}