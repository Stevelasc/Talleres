  package banco;

  import java.util.ArrayList;
  import banco.*;

  public class Banco {
    String nombre;
    ArrayList<Cuenta> cuentas;

    public Banco(String nombre) {
      this.nombre = nombre;
      this.cuentas = new ArrayList<Cuenta>();
    }

    public Cuenta buscarCuenta(String numero) {
      for (Cuenta cuentaTemporal : this.cuentas) {
        if (cuentaTemporal.getNumero().equals(numero)) {
          return cuentaTemporal;
        }
      }
      return null;
    }

    public Cuenta consultarCuentaMayorSaldo() {
      double mayorSaldo = 0;
      Cuenta cuentaConMayorSaldo = null;
      
      for (Cuenta cuenta : this.cuentas) {
          if (cuenta.getSaldo() > mayorSaldo && cuenta.getSaldo() != 0) {
              mayorSaldo = cuenta.getSaldo();
              cuentaConMayorSaldo = cuenta;
          }
      }
      
      return cuentaConMayorSaldo;
  }
  


    public boolean adicionarCuenta(
      String numero,
      double saldoInicial,
      String tipo,
      String nombre,
      String cedula
    ) {
      // for (Cuenta cuentaTemporal : this.cuentas) {
      // if (!cuentaTemporal.getNumero().equals(numero)) {
      // Cuenta nuevaCuenta = new Cuenta(numero, tipo, saldoInicial);
      // this.cuentas.add(nuevaCuenta);
      // return true;
      // }
      // }
      // return false;

      if (buscarCuenta(numero) != null) {
        return false;
      } else {
        Cliente nuevoCliente = new Cliente(nombre, cedula);
        Cuenta nuevaCuenta = new Cuenta(numero, tipo, saldoInicial, nuevoCliente);
        this.cuentas.add(nuevaCuenta);
        return true;
      }
    }

    public double consultarTotalDinero() {
      double totalDinero = 0;

      for (Cuenta cuenta : this.cuentas) {
        totalDinero += cuenta.getSaldo();
      }
      return totalDinero;
    }

    public ArrayList<Cuenta> getCuentas() {
      return this.cuentas;
    }

    public String getNombre() {
      return this.nombre;
    }

  }
