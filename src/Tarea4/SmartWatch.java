package Tarea4;

public class SmartWatch extends SmartDevice {
    String correaIncluida;
    double pulgadas;
    String estilo;
    String tarjeta;
    String camara;
    public SmartWatch(){}
    public SmartWatch(String marca,String nombres,int año,double precio,String correaIncluida,double pulgadas,String estilo,String camara, String tarjeta){
        super(marca,nombres,precio,año );
        this.correaIncluida=correaIncluida;
        this.pulgadas=pulgadas;
        this.estilo=estilo;
        this.tarjeta=tarjeta;
        this.camara=camara;

    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "correaIncluida='" + correaIncluida + '\'' +
                ", pulgadas=" + pulgadas +
                ", estilo='" + estilo + '\'' +
                ", tarjeta='" + tarjeta + '\'' +
                ", camara='" + camara + '\'' +
                ", marca='" + marca + '\'' +
                ", nombres='" + nombres + '\'' +
                ", precio=" + precio +
                ", año=" + año +
                '}';
    }
}
