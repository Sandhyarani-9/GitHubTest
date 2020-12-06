import java.util.Scanner;
public class CashRegisterApplication {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

int iteams;
float costperprice;
float totalprice;

        System.out.println("Skriv items : ");
            iteams=scan.nextInt();
        System.out.println("Skriv costper price : ");
            costperprice=scan.nextFloat();

            totalprice=iteams*costperprice;
        //System.out.println("Total price : " + totalprice);

        if(iteams>=4) {
            totalprice = totalprice - 10;
            System.out.println("Total price with discount : " + totalprice );
        }
            else{
                System.out.println("Total price without discount : " + totalprice );
            }

        }
    }


