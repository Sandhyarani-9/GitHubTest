import java.util.Scanner;
public class ArrayElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter no.of array elements : ");
        int n = scan.nextInt();
        int list[] = new int[n];
        System.out.println("Enter array of elements: " );
        for (int i = 0; i < n; i++) {
            list[i] = scan.nextInt();


        }

        System.out.print("List of array are: [");
        for(int i = 0; i < n; i++){
            System.out.print(" "+list[i]+" ");
        }
        System.out.println(" ] ");

    }
}

