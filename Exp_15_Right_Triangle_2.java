import java.util.Scanner;

public class Exp_15_Right_Triangle_2 {
    public static void main(String[] args) {
        int size,c=1;

        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter size of triangle : ");
        size = Scan.nextInt();
        Scan.close();

        for (int i=1;i<=size;i++){
            for (int j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}
