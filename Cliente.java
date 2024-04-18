package banco;

public class Cliente {
    String nombre;
    String cedula;

    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getnombre(){
        return nombre;
    } 

    public String getcedula(){
        return cedula;
    }
}
