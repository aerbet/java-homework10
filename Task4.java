import java.util.Scanner;

public class Task4 {
    
    public static void main(String[] args) {

        double level1 = 115;
        double level2 = 190 - level1;

        double tariff1 = 1.2;
        double tariff2 = 2.16;
        double tariff3 = 3.28;

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите предыдущее показание электросчетчика: ");
        int pvCount = sc.nextInt();

        System.out.print("Введите следующее показание электросчетчика: ");
        int nxCount = sc.nextInt();

        System.out.print("Введите количество проживающих: ");
        int pplCount = sc.nextInt();

        int amountOfEnergy = Math.abs(nxCount - pvCount);

        double amountOfLevel1 = level1 * pplCount;
        double amountOfLevel2 = level2 * pplCount;
        double amountOfLevel3 = amountOfEnergy - amountOfLevel2 - amountOfLevel1;

        double costOfEnergy1 = Math.round(amountOfLevel1 * tariff1);
        double costOfEnergy2 = Math.round(amountOfLevel2 * tariff2);
        double costOfEnergy3 = Math.round(amountOfLevel3 * tariff3);
        double totalCost = Math.round(costOfEnergy1 + costOfEnergy2 + costOfEnergy3);

        System.out.println("\nВы потребили:");
        System.out.println("Первый уровень: " + amountOfLevel1 + " кВт");
        System.out.println("Второй уровень: " + amountOfLevel2 + " кВт");
        System.out.println("Третий уровень: " + amountOfLevel3 + " кВт\n");

        System.out.println("Тариф: " + tariff1 + " сом, " + tariff2 + " сом, " + tariff3 + " сом\n");
        
        System.out.println("К оплате:");
        System.out.println("Первый уровень: " + costOfEnergy1 + " сом");
        System.out.println("Второй уровень: " + costOfEnergy2 + " сом");
        System.out.println("Третий уровень: " + costOfEnergy3 + " сом");
        System.out.println("\nОбщая сумма: " + totalCost + " сом");

        sc.close();
    }
}
