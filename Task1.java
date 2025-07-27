import java.util.Scanner;

public class Task1 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double tariff = 0.77;

        System.out.print("Введите предыдущее показание электросчетчика: ");
        int pvCount = sc.nextInt();

        System.out.print("Введите следующее показание электросчетчика: ");
        int nxCount = sc.nextInt();

        int amountOfEnergy = Math.abs(nxCount - pvCount);

        double result = amountOfEnergy * tariff;


        System.out.println("Вы потребили: " + amountOfEnergy + " кВт");
        System.out.println("Тариф: " + tariff + " сом");
        System.out.println("К оплате: " + result + " сом");

        sc.close();
    }
}