package lessons.lesson6Methods;

public class StringUtils {
    /* 1 модификатор доступа (одно из 4-хслов) - что такое модификатор доступа и как он проявлется
    * public -    Открытый класс. Все может получить доступ к полю. (государственный - работает везде)
    * protected - Доступ к полю запрещен только другим классам. Доступен для дочерний, внутри пакета, внутри текущего файла и его наследникам.
    *             такой класс или член класса доступен из любого места в текущем классе или пакете или в производных классах, даже если они находятся в других пакетах
    * private -   Encapsulation. Только внутри файла. Доступ только в одном классе. Закрытый класс или член класса доступен только из кода в том же классе (файле).
    * _________   (package)пустой. Отсутствие модификатора у поля или метода класса предполагает применение к нему модификатора по умолчанию. Такие поля или методы видны всем классам в текущем пакете.

по умолчанию-доступно только в одном пакете
Приватный-доступен только в одном классе.
    *
    * 2 - static (может быть или не быть)
    * 3 - возвращаемый тип (или void если его нет) public int - возвращаемый тип — int (целое число)someMethod, т.е. программа может полагаться на метод, возвращающий значение типа int.
    * 4 - название метода (всегда с маленькой буквы в отличие от ссылочных типов)
    * 5 - входящие параметры() - круглые скобки всегда, но они не обязаны содержать входящие параметры, зависит от того, что требуется от метода
    *   ()
    *   тело выполнения данного метода {} в фигурных скобках
    *
    * Encapsulation is one of the four fundamental OOP concepts. The other three are inheritance, polymorphism, and abstraction.
    * инкапсуляция в программировании — объединение данных и методов работы с этими данными в одной упаковке («капсуле»).
     */


    public static void printRevers(String textToReverse) {

        for (int i = textToReverse.length() - 1; i >= 0; i--) {
            System.out.print(textToReverse.charAt(i));

        }
        System.out.println();

    }

    public static void printTextByWord(String text) {
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);

        }
    }

    public static boolean countVowel(String text) {
        String[] strs = {"abcd efjk", "a", "E", "d", "", "\n", "юникод"};
        for (String str : strs) {
            boolean test = str.matches("^(?i:[aeiouy]).*");
            System.out.println(str + ": " + test);

        } return (true);

    }
    public static int countWords (String text){
        String[] words =  text.split(" ");
        return words.length;
    }

    public static void fileExtension (String path) {
        if (path.endsWith("png")||path.endsWith("jpg")||path.endsWith("jpeg")){
            System.out.println("Это картинка");
        }
        else if (path.endsWith("muvi")|| path.endsWith("mp4")){
            System.out.println("Это аудиозапись");
        }
        else if (path.endsWith("exe")){
            System.out.println("Это программа");
        }
        else System.out.println("Это какой-то файл");
    }
}


    /*Должно быть достаточно такого: str.matches("^(?i:[aeiouy]).*"). Для кириллицы - str.matches("^(?ui:[аеёиоуыэюя]).*").

            ^ обозначает начало строки
            (?i:...) - включает CASE_INSENSITIVE для этой группы, чтобы не перечислять повторно заглавные буквы.
            (?ui:...) Важно! Если вы работаете с юникодом, то вышеуказанный ключ не сработает. Нужно добавить UNICODE_CASE, т.е. ?ui.
[aeiouy] - все гласные. Если нужно найти все согласные, то нельзя использовать [^aeiouy], т.к. в эту группу попадают вообще все символы юникода, кроме этих шести. Нужно точно так же перечислить согласные.
            .* - дальше сколько угодно (хоть ноль) любых символов, кроме конца строки.
*/
