package Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        System.out.println("Добрый день. Введите два числа: размер списка и верхнюю границу значений элементов в списке");
        logger.log("Просим пользователя ввести входные данные для списка");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер списка");
        int N = scanner.nextInt();
        System.out.println("Введите верхнюю границу значений элементов в списке");
        int M = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> listNumber = createList(N, M);
        System.out.println("Вот случайный список: " + listNumber);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int threshold = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(threshold);
        logger.log("Выводим результат на экран");
        filter.filterOut(listNumber);
        System.out.println("Отфильтрованный список: " + filter.filterOut(listNumber));
        logger.log("Завершаем программу");
    }

    public static List<Integer> createList(int N, int maxValue) {
        List<Integer> numList = new ArrayList<>(N);
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            numList.add(random.nextInt(maxValue));
        }
        return numList;
    }
}