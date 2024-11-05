package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Отримуємо вхідні дані
        String[] data = getData();
        // Формуємо об'єкт з вхідних даних
        Product product = new Product(data[0],
                Integer.parseInt(data[1]),
                Double.parseDouble(data[2]));
        // Розраховуємо базову вартість товару
        CalcCostBase costBase = new CalcCostBase();
        double baseCost = costBase.calcCost(product);
        // Розраховуємо вартість товару, з урахуванням доставки
        CalcCostDelivery costDelivery = new CalcCostDelivery();
        double deliveryCost = costDelivery.calcCost(product);
        // Формуємо виведення
        String baseOutput = product + "\nCost is " +
                Constants.CURRENCY + " " + baseCost + ".";
        String deliveryOutput = product + "\nCost is " +
                Constants.CURRENCY + " " + deliveryCost + ".";
        // Виводимо результат
        getOutput(baseOutput);
        getOutput(deliveryOutput);
    }

    // Набір вхідних даних
    public static String[] getData() {
        Scanner scanner = new Scanner(System.in);
        String[] productData = new String[3];

        // Input product name
        System.out.println("Введите название товара: ");
        productData[0] = scanner.nextLine();

        //Input product quota
        System.out.println("Введите кол-во товара: ");
        productData[1] = scanner.nextLine();

        //Input product price
        System.out.println("Введите цену товара: ");
        productData[2] = scanner.nextLine();

        scanner.close();

        return productData;
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
