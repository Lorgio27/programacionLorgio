package modelos;
/*
AQUI EN ESTE ARCHIVO SE DEFINE LAS
 CARACTERISITCAS QUE TENDRA CADA COCHE
 */
public class Coche {
  //ATRIBUTOS
    private String marca;
    private String modelos;
    private int cv;
    private int velocidad;
    private int KmRecorridos;
    private double precio;

    //CONSTRUCTOR
    public Coche (String marca){
        this.marca = marca;
    }
    public Coche (String modelos){
        this.modelos = modelos;
    }
}
