package TareaDos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Intrdouce un numero");
        Scanner num = new Scanner(System.in);
        int numero = num.nextInt();
        AplicaIva(numero);
    }
    public static void AplicaIva (int precio){
        double preciIva= precio*0.21;
        double preciofinal = precio+preciIva;
        System.out.println("El precio con iva es: "+preciofinal);

    }
}