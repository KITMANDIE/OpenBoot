package Tarea4;

public class SmartPhone extends SmartDevice {
    double DuracionBateria;
    int camaras;
    int tarjetas;
    double capacidad;
    String GPS;
    public SmartPhone(String marca,String nombres,double precio, int año,double Duracio,int camaras,int tarjetas, double capacidad,String gps){
        super(marca,nombres,precio,año);
        this.camaras=camaras;
        this.capacidad=capacidad;
        this.DuracionBateria=Duracio;
        this.tarjetas=tarjetas;
        this.GPS=gps;
    }
    public SmartPhone(){}


    @Override
    public String toString() {
        return "SmartPhone{" +
                "DuracionBateria=" + DuracionBateria +
                ", camaras=" + camaras +
                ", tarjetas=" + tarjetas +
                ", capacidad=" + capacidad +
                ", GPS='" + GPS + '\'' +
                ", marca='" + marca + '\'' +
                ", nombres='" + nombres + '\'' +
                ", precio=" + precio +
                ", año=" + año +
                '}';
    }
}
