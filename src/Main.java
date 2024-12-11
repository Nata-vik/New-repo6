
public class Main {
    public static void main(String[] args) {

        int count = 300;                   // сумма на счету
        int replenishment = 1100;          // сумма пополнения
        int bonus = replenishment / 100;   // кол-во начисленных бонусов

        if (replenishment > 1000) {
            System.out.println("Количество бонусов: = " + bonus);
            System.out.println("Итоговая сумма на счету: = " + (count + replenishment + bonus) + " руб.");

        } else {
            System.out.println("Количество бонусов: = " + 0);
            System.out.println("Итоговая сумма на счету: = " + (count + replenishment) + " руб.");
        }
    }
}