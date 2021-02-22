package Fedor.les02_13Objects;

public class DateClass { // Каждый новый класс, который созлается становится новым одноименным типом
    short year;          // поля (члены) нового класса - нового типа DateClass
    byte month;          // Переменные int a, int b и double d — примитивные и хранят значение внутри себя.
    byte day;            // При присваивании примитивного значения переменной примитивного типа, его значение копируется (дублируется).
    String str;          // Переменная String str — ссылочная и хранит адрес (ссылку) объекта типа String в памяти.
    DateClass name;      // При присваивании же ссылочной переменной копируется только адрес объекта, сам объект при этом не копируется.

    public static void main(String[] args) {
        final DateClass date1 = new DateClass();
        date1.year = 2021;
        date1.month = 2;
        date1.day = 13;

        final DateClass date2 = new DateClass();
        date2.year = 2020;
        date2.month = 2;
        date2.day = 13;


        final DateClass date3 = date1;

        date3.day++;

        System.out.printf("%d.%d.%d", date1.day, date3.month, date2.year);

        final String s1 = "qweqweqwe";
        final String s2 = "qweqweqwe";

        if (s1 == s2) {
            // TODO
        }
    }
}
//
//struct date {
//    short year;
//    byte month;
//    byte day;
//}
//
//date d1 = {2020,02,13}
//date d2 = {2021,02,13}
//
//printf("%d.%d.%d", d1.day + "-" + d1.month + "-" + d1.year);

/*6. Сравнение с языком С/С++
Иногда Java-программистов спрашивают на собеседовании: как передаются данные в методы в Java? Иногда еще уточняют: по ссылке или по значению?

Этот вопрос идет из языка С++ — в языке Java он не имеет смысла. В Java переменным-параметрам всегда просто присваиваются значения переменных-аргументов.
Так что правильным ответом будет — по значению.

Но будьте готовы к тому, чтобы объяснить свою позицию, т.к. вам могут тут же возразить, что «примитивные типы передаются по значению, а ссылочные – по ссылке».

Истоки этой проблемы связаны с тем, что многие Java-программисты были в прошлом С++ программистами. А там вопрос «как передаются параметры в методы» играл очень важную роль.

В Java все однозначно: примитивные типы хранят значения, ссылочные тоже хранят значение — ссылку. Все дело в том, что считать значением переменной.

В языке C++ в переменной можно было хранить как ссылку на объект, так и сам объект. То же касалось примитивных типов: в переменной можно было хранить значение или
объявить переменную ссылкой на тип int. Поэтому чтобы не путаться, С++ программисты ссылку на объект всегда называют ссылкой, а сам объект — значением.

В С++ легко могла сложиться ситуация, что одна переменная содержит объект, а другая — ссылку на этот же объект. Поэтому вопрос, что хранит в себе переменная — сам объект
или только ссылку на него — был очень важен. При передаче в метод объекта он копировался (если передавался по значению), и не копировался (если передавался по ссылке).

В Java этой двойственности нет, и правильный ответ звучит так: параметры в методы Java передаются по значению. Просто в случае с ссылочными переменными это значение — ссылка.

/*Переменные, адреса и указатели
Переменная — это область памяти, к которой мы обращаемся за находящимися там данными, используя идентификатор (в данном случае, имя переменной).
При этом у этой помеченной именем области есть еще и адрес, выраженный числом и понятный компьютерной системе.
Этот адрес можно получить и записать в особую переменную. Переменную, содержащую адрес области памяти, называют указателем.

Когда мы меняем значение обычной переменной, то, можно сказать, просто удаляем из конкретной области памяти данные и записываем туда новые.
Когда мы меняем значение переменной-указателя, то начинаем работать с совершенно иным участком памяти, т.к. меняем содержащийся в ней адрес.
Тема указателей тесно связана с темой динамических типов данных. Когда программа компилируется, то под объявленные переменные так или иначе
(в зависимости от того, где они были объявлены) выделяются участки памяти. Потом размер этих участков не меняется, может меняться только их содержимое (значения или данные).
Однако именно с помощью указателей можно захватывать и освобождать новые участки памяти уже в процессе выполнения программы. Динамические типы данных будут рассмотрены позже.

Прежде чем перейти к рассмотрению объявления и определения переменных-указателей, посмотрим, что из себя представляет адрес любой переменной и как его получить.

int i = 0;
printf ("i=%d, &i=%p \n", i, &i);
В результате выполнения данного программного кода на экране появляется примерно следующее (шестнадцатеричное число у вас будет другим):

i=0, &i=0x7fffa40c5fac
Знак амперсанда (&) перед переменной позволяет получить ее адрес в памяти. Для вывода адреса переменной на экран используется специальный формат %p.
Адреса обычных переменных (не указателей) в процессе выполнения программы никогда не меняются. В этом можно убедиться:


int a = 6;
float b = 10.11;
char c = 'k';

printf("%5d - %p\n", a, &a);
printf("%5.2f - %p\n", b, &b);
printf("%5c - %p\n", c, &c);

a = 2;
b = 50.99;
c = 'z';

printf("%5d - %p\n", a, &a);
printf("%5.2f - %p\n", b, &b);
printf("%5c - %p\n", c, &c);
Результат:

    6 - 0x7fff653532e0
10.11 - 0x7fff653532e4
    k - 0x7fff653532df
    2 - 0x7fff653532e0
50.99 - 0x7fff653532e4
    z - 0x7fff653532df
Как мы видим, несмотря на то, что значения переменных поменялись, ячейки памяти остались прежними.

Зная адрес, можно получить значение, которое находится по этому адресу, поставив знак * перед адресом:

int a = 8;
printf("%d \n", *&a);
На экране будет выведено число 8.

Однако запись типа &a не всегда возможна или удобна. Поэтому существует специальный тип данных — указатели, которым и присваивается адрес на область памяти.

Указатели в языке C, как и другие переменные, являются типизированными, т.е. при объявлении указателя надо указывать его тип. Как мы узнаем позже,
с указателями можно выполнять некоторые арифметические операции, и именно точное определение их типа позволяет протекать им корректно.
Чтобы объявить указатель, надо перед его именем поставить знак *. Например:


int *pi;
float *pf;
Обратите внимание на то, что в данном случае * говорит о том, что объявляется переменная-указатель. Когда * используется перед указателем не при его объявлении,
а в выражениях, то обозначает совсем иное — "получить значение (данные) по адресу, который присвоен указателю". Посмотрите на код ниже:


int x = 1, y, z = 3;
int *p, *q;

p = &x;
printf("%d\n", *p); // 1

y = *p;
printf("%d\n", y); // 1

*p = 0;
printf("%d %d\n", x, y); // 0 1

q = &z;
printf("%d\n", *q); // 3

p = q;
*p = 4;
printf("%d\n", z); // 4

printf("%p %p\n", p, q); // p == q
С помощью комментариев указаны текущие значения ячеек памяти. Подробно опишем, что происходит:

Выделяется память под пять переменных: три типа int и два указателя на int. В ячейки x и z записываются числа 1 и 3 соответственно.
Указателю p присваивается адрес ячейки x. Извлекая оттуда значение (*p), получаем 1.
В область памяти, которая названа именем у, помещают значение равное содержимому ячейки, на которую ссылается указатель p. В результате имеем две области памяти (x и y),
в которые записаны единицы.

В качестве значения по адресу p записываем 0. Поскольку p указывает на x, то значение xменяется. Переменная p не указывает на y, поэтому там остается прежнее значение.
Указателю q присваивается адрес переменной z. Извлекая оттуда значение (*q), получаем 3.
Переменной p присваивается значение, хранимое в q. Это значит, что p начинает ссылаться на тот же участок памяти, что и q.
Поскольку q ссылается на z, то и p начинает ссылаться туда же.
В качестве значения по адресу p записываем 4. Т.к. p является указателем на z, следовательно, меняется значение z.
Проверяем, p и q являются указателями на одну и туже ячейку памяти.
Под сам указатель (там, где хранится адрес) также должна быть выделена память. Объем этой памяти можно узнать с помощью функции sizeof():

int *pi;
float *pf;

printf("%lu\n", sizeof(pi));
printf("%lu\n", sizeof(pf));
Под указатели всех типов выделяется одинаковый объем памяти, т.к. размер адреса не зависит от типа, а зависит от вычислительной системы.
В таком случае, зачем при объявлении указателя следует указывать тип данных, на который он может ссылаться? Дело в том, что по типу данных определяется,
сколько ячеек памяти занимает значение, на которое ссылается указатель, и через сколько ячеек начнется следующее значение.

Если указатель объявлен, но не определен, то он ссылается на произвольный участок памяти с неизвестно каким значением:

int *pa, *pb;
float *pc;

printf(" %p %p %p\n", pa, pc, pb);

// может возникнуть ошибка
printf(" %d %f\n", *pa, *pc);
Результат (в Ubuntu):

 0x400410 0x7fff5b729580 (nil)
 -1991643855 0.000000
Использование неопределенных указателей в программе при вычислениях чревато возникновением серьезных ошибок. Чтобы избежать этого, указателю можно присвоить значение,
говорящее, что указатель никуда не ссылается (NULL). Использовать такой указатель в выражениях не получится, пока ему не будет присвоено конкретное значение:

int a = 5;
float c = 6.98;
int *pa;
float *pc;

pa = NULL;
pc = NULL;

printf(" %15p %15p\n", pa, pc);

// Error
// printf(" %15d %15f\n", *pa, *pc);

pa = &a;
pc = &c;

printf(" %15p %15p\n", pa, pc);
printf(" %15d %15f\n", *pa, *pc);
Результат (в Ubuntu):

           (nil)           (nil)
  0x7ffd8e77e550  0x7ffd8e77e554
               5        6.980000
В данном случае, если попытаться извлечь значение из памяти с помощью указателя, который никуда не ссылается, то возникает "ошибка сегментирования".

На этом уроке вы должны понять, что такое адрес переменной и как его получить (&var), что такое переменная-указатель (type *p_var; p_var = &var) и как получить значение,
хранимое в памяти, зная адрес ячейки (*p_var). Однако у вас может остаться неприятный осадок из-за непонимания, зачем все это надо? Это нормально.
Понимание практической значимости указателей придет позже по мере знакомства с новым материалом.
 */