package TareaTres;

public class Tarea3 {
    public static void main(String[] args) {
        String []nombres={"David"," Lucia","Jaime","Juan","Paco"};
        int i=0;
        String nuevo="Hola: ";
        for(i=0;i< nombres.length;i++){
            nuevo =nuevo+nombres[i];

        }
        System.out.println(nuevo);
    }
}
