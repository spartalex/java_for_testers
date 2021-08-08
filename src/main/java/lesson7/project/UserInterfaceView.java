package lesson7.project;

import java.io.IOException;
import java.sql.Connection;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserInterfaceView {
    private Controller controller = new Controller();
    private Pattern pattern;

    public void runInterface() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите имя города: ");
            String city = scanner.nextLine();

            if (!Pattern.matches("[a-zA-Z]*\\s?-?[a-zA-Z]*", city)) {
                System.out.println("Введите город корректно");
                continue;
            }

            System.out.println("Введите 1 для получения погоды на сегодня;" +
                    "Введите 5 для прогноза на 5 дней; Для выхода введите 0:");

            String command = scanner.nextLine();

            //TODO* Сделать метод валидации пользовательского ввода

            if (command.equals("0")) break;
            if (!Pattern.matches("[1,5,0]", command)) {
                System.out.println("Введите цифру");
                continue;
            }
            try {
                controller.getWeather(command, city);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}