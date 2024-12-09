public class Main {
    public static void main(String[] args) {

        int sum = 100;

        int add = 1100;

        short bonusCost = 100;
        int bonus = 0;

        if (add > 1000){

            bonus = add / bonusCost;

            System.out.println(bonus + " бонусных(ый) рублей(ля/ль)");
        }

        sum += add + bonus;

        System.out.println("Всего на счету: " + sum);
    }
}