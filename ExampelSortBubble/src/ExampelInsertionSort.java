public class ExampelInsertionSort {
    public static void main(String[] args) {
        int[] lista = new int[4];

        lista[0] = 19;
        lista[1] = 21;
        lista[2] = 18;
        lista[3] = 20;
        sortera(lista);

        for (int a = 0; a < lista.length; a++) {
            System.out.println("Siffra : " + lista[a]);
        }
    }
static void sortera(int[] lista){
        int i;
        //The comparative figure is saved in a temporary variable
        int temp;

        // Skrivs över om vi högerskiftar talen till vänster om det
    for(int n=1;n<lista.length;n++){
    temp=lista[n];
    i=n-1;
// The comparison figure is compared with the numbers on the left.
    // Interrupted only by a small number or if the numbers end
    while(i>=0&&lista[i]>temp){
lista[i+1]=lista[i]; // Förskjuts åt höger----shifted to rigth
i--;
// The comparative figure is inserted on the last index that was shifted to the right (the empty space)
lista[i+1]=temp;

    }
}
}
}
