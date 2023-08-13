import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {


            int n;
            System.out.println("Привет введи количество цветов,а я скажу,сколько нужно вытащить, чтобы попались две с одинаковым цветом (магия!)");
            n = scanner.nextInt();
            System.out.println("Тебе нужно вытащить:" + (n + 1) + " бусин");
        } catch (Exception ex) {
            System.out.println("Ты что то не так ввёл");
        }
    }
}