import java.util.Arrays;
import java.util.Scanner;

/*Дано:
1) Типы самолетов {Ту154, К7, АН2, АН24, АН124, К9, Ту153}
2) номера рейсов (трехзначные целые числа)
3) названия пункта назначения рейса
1. - Обеспечить возможность ввода новых данных (тип выбираем, номер рейса и пункт назначения вводим (можно тоже выбирать,
 но тогда надо сделать фиксированный набор городов));
Метод должен проверять правильность ввода типа самолета, уведомлять пользователя о его выборе (на экране появляется общение, что: «Вы ввели ….»
или «Ввод некорректной информации»), обеспечивать возможность повторного ввода

3. - Выдавать полную информацию базы;

4. - Осуществлять поиск типа самолёта и его пункта назначения по введенному номеру рейса.

5. - Осуществлять вывод на экран номеров рейсов и типов самолетов, вылетающих в пункт назначения, название которого совпало с названием, введенным с клавиатуры
 (поиск по названию пункта назначения)

6. - Осуществлять вывод на экран номеров рейсов и пунктов назначения, обслуживаемых самолетом, тип которого введен с клавиатуры (поиск по типу самолета).
Во всех случаях вы должны сообщить пользователю информацию, даже при отсутствии информации по запросу.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Flight one = new Flight("Moscow", 647, Types.Ту154);
        Flight second = new Flight("Tokyo", 578, Types.АН2);
        Flight third = new Flight("Paris", 579, Types.К7);
        Flight fourth = new Flight("Moscow", 237, Types.Ту153);
        Flight fifth = new Flight("Tokyo", 673, Types.АН24);
        Flight[] flights = new Flight[5]; //создание массива
        flights[0] = one;
        flights[1] = second;
        flights[2] = third;
        flights[3] = fourth;
        flights[4] = fifth;
        outArray(flights);
        System.out.println("Введите номер рейса");
        int number = input.nextInt();
        searchFlight(number, flights);
        System.out.println("Введите пункт назначения");
        String destination = input.next();
        searchDestination(destination, flights);
        System.out.println("Введите индекс типа самолёта" + " " + Arrays.toString(Types.values()));
        Types value = Types.values()[input.nextInt()];
        searchType(value, flights);

    }

    public static void outArray(Flight[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void searchFlight(int number, Flight[] array) {
        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getFlightNumber() == number) {
                isFound = true;
                System.out.println(array[i]);
                break;

            }
        }
        if (!isFound) {
            System.out.println("Заданный номер рейса отсутствует в базе");
        }
    }

    public static void searchDestination(String destination, Flight[] array) {
        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDestination().equals(destination)) {
                isFound = true;
                System.out.println(array[i]);
                break;
            }
        }
        if (!isFound) {
            System.out.println("Нет рейсов в данный пункт назначения");
        }
    }

    public static void searchType(Types type, Flight[] array) {
        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getFlightType().equals(type)) {
                isFound = true;
                System.out.println(array[i]);
                break;
            }
        }
        if (!isFound) {
            System.out.println("Заданный тип самолёта отсутствует в базе");
        }
    }
}
