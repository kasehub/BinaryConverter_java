import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter positive integer: ");
        int num=input.nextInt();

        int [] binary=new int[32];
        int i =0;

        while(num>0){
            binary[i]=num%2;
            num=num/2;
            i++;
        }

        System.out.println("Binary Equivelince: ");
        for(int j=i-1; j>=0;j--){
            System.out.print(binary[j]);
        }
    }
}