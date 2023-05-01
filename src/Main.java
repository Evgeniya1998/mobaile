public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int bonus;
        int startingscore = 100; // Начальные данные
        int amount = 300; // Сумма пополнения
        int finalscore = startingscore + amount; //Итоговая сумма без бонусов

        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        System.out.println(("Сумма бонусов:") + bonus);
        System.out.println(("Итоготовая сумма:") + finalscore);
    }
}
