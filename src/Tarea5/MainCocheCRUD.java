package Tarea5;

public class MainCocheCRUD {
    public static void main(String[] args) {
        CocheCRUD Audi = new CocheCRUDImpl();
        Audi.save();
        Audi.delete();
        Audi.findAll();
    }
}
