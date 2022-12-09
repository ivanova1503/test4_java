import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Игра \"Загадка\" " +
                "\nПравила игры: " +
                "\nУ вас есть три попытки, чтобы отгадать загадку." +
                "\nЕсли на первой попытке ввести слово \"Подсказка\", вы получите подсказку. " +
                "\nЕсли после подсказки вы неверно овтетите на вопрос, игра будет окончена." +
                "\nУдачи!\n");

        System.out.println("Отгадай загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает:");

        Scanner scanner = new Scanner(System.in);

        String otvet = "";

        int i = 1; //номер попытки

        switch (i) {
            case 1: { //первая попытка
                System.out.println("Введите ответ:");
                otvet = scanner.nextLine();
                if (otvet.equalsIgnoreCase("Заархивированный вирус")) {
                    System.out.println("Правильно!");
                    break;
                }
                else if (otvet.equalsIgnoreCase("Подсказка")) {
                    System.out.println("Не распаковывай это!");
                    System.out.println("Введите ответ:");
                    otvet = scanner.nextLine();
                    while (otvet.equalsIgnoreCase("Подсказка")) {
                        System.out.println("Введите ответ:");
                        otvet = scanner.nextLine();
                    }
                    if (otvet.equalsIgnoreCase("Заархивированный вирус")) {
                        System.out.println("Правильно!");
                    } else {
                        System.out.println("Обидно, приходи в другой раз");
                    }
                    break;
                } else { //введен неверный ответ
                    System.out.println("Подумай еще!");
                    i++;

                }
            }


            case 2: { //вторая попытка
                System.out.println("Введите ответ:");
                otvet = scanner.nextLine();
                if (otvet.equalsIgnoreCase("Заархивированный вирус")) {
                    System.out.println("Правильно!");
                    break;
                }
                else if (otvet.equalsIgnoreCase("Подсказка")) {
                    System.out.println("Подсказка уже недоступна!");
                    System.out.println("Введите ответ:");
                    otvet = scanner.nextLine();
                    while (otvet.equalsIgnoreCase("Подсказка")) {
                        System.out.println("Подсказка уже недоступна!");
                        System.out.println("Введите ответ:");
                        otvet = scanner.nextLine();
                    }
                    if (otvet.equalsIgnoreCase("Заархивированный вирус")) {
                        System.out.println("Правильно!");
                    }
                    else {
                        System.out.println("Подумай еще!");
                        i++;
                    }
                }
                else {
                    System.out.println("Подумай еще!");
                    i++;
                }

            }

            case 3: { //третья попытка
                System.out.println("Введите ответ:");
                otvet = scanner.nextLine();
                if (otvet.equalsIgnoreCase("Заархивированный вирус")) {
                    System.out.println("Правильно!");
                }
                else if (otvet.equalsIgnoreCase("Подсказка")) {
                    System.out.println("Подсказка уже недоступна!");
                    System.out.println("Введите ответ:");
                    otvet = scanner.nextLine();
                    while (otvet.equalsIgnoreCase("Подсказка")) {
                        System.out.println("Подсказка уже недоступна!");
                        System.out.println("Введите ответ:");
                        otvet = scanner.nextLine();
                    }
                    if (otvet.equalsIgnoreCase("Заархивированный вирус")) {
                        System.out.println("Правильно!");
                    }
                    else {
                        System.out.println("Обидно, приходи в другой раз");
                    }
                }
                else {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
        }
    }
}








