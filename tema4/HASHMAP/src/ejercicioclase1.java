import java.util.HashMap;

public class ejercicioclase1 {
    public static void main(String[] args) {
        HashMap<Integer, String> alumnos = new HashMap<>();
        alumnos.put(1234, "Juanito");
        alumnos.put(2345, "Maria");
        String nombre = alumnos.get(2345);
        if(nombre != null){
            System.out.println("el nomrbre correspondiente es "+nombre);
        }else{
            System.out.println("el nombre no esta en la lista");
        }
        System.out.println("El tamaño de la lista es"+nombre);
        System.out.println("El tamaño de la lista es"+alumnos.size());


    }
}
