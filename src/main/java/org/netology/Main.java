package org.netology;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        logger.log("Запуск программы.");
        System.out.println("Добро пожаловать.");
        logger.log("Запрос размера списка.");
        System.out.print("Введите размер списка: ");
        int maxLength = scanner.nextInt();
        logger.log("Запрос верхней границы для значений.");
        System.out.print("Введите верхнюю границу для значений: ");
        int maxNumber = scanner.nextInt();

        ArrayList arrayList = new ArrayList(maxLength);
        Filter filter = new Filter(maxNumber);
        for (int i = 0; i < maxLength; i++) {
            arrayList.add(random.nextInt(10));
        }

        List result = filter.filterOut(arrayList);
        System.out.println(result.toString());
        logger.log("Вывод отфильтрованного списка.");

        logger.log("Завершение программы.");
    }
}