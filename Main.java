import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int n = sc.nextInt(); n > 0; n /= 2){
            System.out.println(n + " " + n % 2);
        }
    }
}

