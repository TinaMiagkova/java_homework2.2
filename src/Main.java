public class Main {
    public static void main(String[] args) {
        int initial = 700;
        int added = 2000;
        int total = initial + added;
        int bonus;
        if (added > 1000) {
            bonus = added / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый счет: " + total);
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}