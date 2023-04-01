import java.util.Scanner;

public class HWScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("целое число");
        int a = sc.nextInt();
        String binary = Integer.toBinaryString(a);

        System.out.println("выводить на экран двоичное число " + a);
        System.out.println(binary);








    }
}
