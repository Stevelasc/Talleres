import banco.Banco;
import banco.Cuenta;

public class MainBanco {
    public static void main(String[] args) {
        boolean pudoCrear;
        Banco banco = new Banco("MuchoDinero");
        pudoCrear = banco.adicionarCuenta("1234", 0, "Ahorros", "karla", "2312");
        System.out.println(pudoCrear);
        pudoCrear = banco.adicionarCuenta("123", 1000000, "corriente", "carlos", "123");
        System.out.println(pudoCrear);
        pudoCrear = banco.adicionarCuenta("1234", 5000000, "Corriente", "eduar", "1223");
        System.out.println(pudoCrear);

        for (Cuenta cuentaTemporal : banco.getCuentas()) {
            System.out.printf("Numero: %s Tipo: %s Saldo: %s \n", cuentaTemporal.getNumero(), cuentaTemporal.getTipo(), cuentaTemporal.getSaldo());
            
        }
        Cuenta cuentaMayorSaldo = banco.consultarCuentaMayorSaldo();
if (cuentaMayorSaldo != null) {
    System.out.println("El titular de la cuenta con el mayor saldo es: " + cuentaMayorSaldo.getTitular().getnombre());
    System.out.println("Saldo de la cuenta con el mayor saldo: " + cuentaMayorSaldo.getSaldo());
} else {
    System.out.println("No hay cuentas en el banco.");
}
    }
    
}
