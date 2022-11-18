public class Main {
    public static void main(String[] args) {
        System.out.println("Решение 3й задачи");
        for (int currentYear = 1896; currentYear <= 2092; ) {
            currentYear += 4;
            if (currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0) {
                System.out.println(currentYear + " Год високосный!!!");
            } else {
                System.out.println("Год-ОБЫЧНЫЙ.");
            }

        }
    }
}