                                     Home works
Homework №1
1. Вывести на дисплей рубаи (четверостишье), соблюдая все отступы в
   следующем виде:

   РУБАИ

   Много лет размышлял я над жизнью земной.

   Непонятного нет для меня под луной.

   Мне известно, что мне ничего не известно!

   Вот последняя правда, открытая мной.

                                   О. Хайям


Homework №2
1. Создать по 4 переменные всех целочисленных типов данных в следующем виде:
   
   • Все 4 переменные типа byte должны равняться 12 и быть записанны в разных
   системах счисления;
 
   • Все 4 переменные типа short должны равняться -1300 и быть записанны в разных
   системах счисления;

   • Все 4 переменные типа int должны равняться 0 и быть записанны в разных
   системах счисления;

   • Все 4 переменные типа long должны равняться 123456789 и быть записанны в
   разных системах счисления;

   И вывести их на экран.

2. Создать по 2 переменные типов данных float, double и boolean. И вывести их на
   экран.
3. Создать n-ное количество переменных типа данных char всеми возможными
   способами. И вывести их на экран.

Homework №3

1. Вычислите следующую часть кода:
   int i1=5;

   int i2=11;

   double d1 = 5.5;

   double d2 = 1.3;

   long l = 20l;

   double result=0;

   result = i2 / d1 + d2 % i1 - l;

2. Чему равны выражения:

   • a-- - --a + ++a + a++ + a; где а=5

   • ++b - b++ + ++b - --b; где b=8

Homework №4

1. Создайте 2 класса. 1-ый назовите Student. Он должен содержать в себе
   следующие атрибуты: номер студенческого билета, имя, фамилию, год
   обучения, средняя оценка по математике, средняя оценка по экономике,
   средняя оценка по иностранному языку. 2-ой класс назовите StudentTest.
   В нём Вы должны будете создать 3 разных объекта класса Student,
   вывести на экран в читабельном виде среднюю арифметическую оценку
   каждого студента (учитывая все 3 предмета).

   P.S.: Старайтесь писать код, понятный не только для Вас, а для всех.

Homework №5

1. В класс BankAccount добавьте 2 метода. Первый метод называется
   popolnenieScheta и увеличивает баланс на сумму, которая указана в
   параметре этого метода. Второй метод называется snyatieSoScheta и
   уменьшает баланс на сумму, которая указана в параметре этого метода.
2. Измените класс StudentTest так, чтобы среднюю арифметическую оценку
   студента выводил на экран метод. Т. е. создайте 1 метод, параметр
   которого – это объект класса Student, а в теле метода будет вычисляться
   средняя арифметическая оценка и выводиться на экран.
3. Создайте класс Employee с атрибутами id, surname, age, salary,
   department, которые должны задаваться в конструкторе. В данном классе
   также создайте метод увеличения зарплаты вдвое. Создайте второй
   класс EmployeeTest, в котором создайте 2 объекта класса Employee.
   Увеличьте зарплату каждому работнику вдвое с помощью метода и
   выведите на экран значение новой зар платы.

Homework №6

1. Создайте класс, в котором будут 5 overloaded методов,
   которые вычисляют сумму нуля, одного, двух, трёх и четырёх
   целых чисел соответственно, передают эту сумму в output и
   выводят её на экран. В случае, когда слагаемые отсутствуют
   (т.е. когда параметров нет) сумма пусть равняется 0.
2. Измените класс Student так, чтобы он имел 3 конструктора. 1-
   ый принимает все параметры. 2-ой – только id, name,
   surname, course. 3-ий не принимает значений. Создайте в
   классе StudentTest 3 объекта с помощью разных
   конструкторов.

Homework №7

1. Пересоздайте класс Employee таким образом, чтобы
   переменная salary была недоступна вне класса, переменная
   surname была доступна отовсюду, а переменная id только
   внутри пакета. Также создайте 3 public метода, которые будут
   показывать на дисплее значения этих переменных. Создайте
   для данного класса 3 разных конструктора с public, default и
   private access modifier-ами. В конструкторах присваивайте
   переменным класса значения из параметров. Создайте
   новые классы в том же и в другом пакете. Попытайтесь в них
   создать объекты класса Employee и вывести на экран
   значения переменных данного объекта с помощью метода
   println и методов самого класса.

Homework №8

1. В первом классе создайте 2 static метода. 1-ый пусть умножает 3 числа из
   параметра метода и возвращает их произведение; 2-ой – делит первое
   число из параметра на второе и ничего не возвращает, лишь выводит на
   дисплей в читабельном виде целое частное и остаток. Во втором классе
   по два раза используйте данные методы.
2. В первом классе создайте static final переменную Пи = 3,14. Используйте
   данную константу в non-static методе, который принимает в параметре
   значение радиуса и вычисляет площадь круга по формуле: Площадь = Пи * радиус * радиус. 
   Также используйте данную константу в static методе,
   который принимает в параметре значение радиуса и вычисляет длину
   окружности по формуле: Длина окружности = 2 * Пи * радиус. Создайте ещё один
   non-static метод, который принимает в параметре значение радиуса и
   выводит на экран информацию о радиусе, площади круга и длине
   окружности. Используйте все 3 метода во 2-м классе.

Homework №9

1. Напишите программу, в которой будет создано 8 объектов, но к
последней строке метода main останется всего 2.

2. Вычислите устно output-ы данных программ, а затем проверьте в
   NetBeans:

   class Test1{

   int a=1;

   static int a=2;

   void abc(int a){

   System.out.println(a);

   System.out.println(this.a);

   }

   public static void main(String [] args){

   Test1 t = new Test1();

   t.abc(3);

   }

   }
 
   class Test2{

   int a=1;

   static int b=2;

   static void abc(final int a){

   System.out.println(a);

   System.out.println(Test2.b);

   }

   public static void main(String [] args){

   abc(5);

   }

   }

   class Test3{

   int a=1;

   static int b=2;

   void abc(int a){

   System.out.println(b);

   System.out.println(a);

   System.out.println(this.a);

   System.out.println(Test3.b);

   }
   public static void main(String [] args){

   Test3 t = new Test3();

   t.abc(4);

   }

   }

Homework №10

1. Создайте пакет p1, в нём класс А. В пакете p1 создайте подпакет p2, в нём
   класс B со static элементами. В подпакете p2 создайте подпакет p3, в нём
   класс C. Создайте новый пакет p4, в нём класс D. В пакете p4 создайте
   подпакет p5, в нём класс E. Внутри класса D напишите код, который
   будет задействовать любые элементы классов A, C, E, а также static
   элементы класса B. Используя выражения import и import static,
   работайте с не полными именами классов.

Homework №11

1. Создайте класс Car с тремя переменными: цвет, мотор и количество
   дверей. Затем создайте класс CarTest, в котором должны быть 2 метода.
   1-ый изменяет количество дверей объекта класса Car на количество,
   прописанное в параметре метода. 2-ой принимает в параметры 2 объекта
   класса Car и меняет их цвета местами. Примените оба метода в main и
   выведите на экран атрибуты всех объектов.

Homework №12

1. В классе StudentTest написать 2 метода, которые принимают 2 input
   параметра – 2 объекта класса Student из Lesson11. Первый метод
   сравнивает 2-х студентов, используя 1 if statement и логические
   операторы внутри него и выводит на экран информацию о том, равны ли
   студенты. Второй метод использует nested if statement, сравнивает все
   атрибуты студента по отдельности, выводит на экран информацию о том,
   равны ли студенты, а если не равны, то в чём именно было обнаружено
   первое неравенство.

Homework №13

1. В классе Month создайте метод, у которого 1 параметр типа данных int.
   Этот параметр будет указывать порядковый номер месяца. Используя
   функционал switch, выведите на экран количество дней этого месяца
   (для не високосного года). Проверьте работу данного метода в main.

Homework №14

1. Создать класс. В классе создать статичный метод, который будет
   выводить на экран время в формате «час:минута:секунда» в интервале от
   0 до 6 часов. Если час больше единицы и минута кратна 10-ти, то метод
   нужно закончить. Если же (секунда умноженная на час) больше минуты,
   то пора переходить на другую минуту. Продемонстрировать данный
   метод в действии.