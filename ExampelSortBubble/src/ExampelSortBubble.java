
public class ExampelSortBubble {
    public static void main(String[] args) {
        int[] lista = new int[4];

        lista[0] = 19;
        lista[1] = 21;
        lista[2] = 20;
        lista[3] = 18;

        sortera(lista);

        for (int a = 0; a < lista.length; a++) {
            System.out.println("Array List : " + lista[a]);
        }
    }
//Method for sorting array
    static void sortera(int[] lista){
//outer loop for contunuing the process
        //inner loop for moves up the lasgest number

        for(int m=lista.length-1;m>0;m--){      //(m=3;3>0;2)
            for(int n=0;n<m;n++){
                if(lista[n]>lista[n+1]){
                     int temp=lista[n];
                     lista[n]=lista[n+1];
                     lista[n+1]=temp;
                      }
                  }
            }
        }
    }


