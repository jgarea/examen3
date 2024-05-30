package examen3refactorizado;

/**
 * Clase que realiza la aplicacion de una cuenta bancaria, pudiendo retirar y depositar saldo en ella.
 * 
 * 30/05/2024
 * @author Juan E
 * @version 1.0
 */
public class Examen {

    // Propiedades de la Clase cuentas
    private double dSaldo;
    private String nombre;
    
    /**
     * Clase principal
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Examen cuenta1 = new Examen();
        operativa_cuenta(cuenta1, 0);
    }

    /**
     * Método que va a realizar todas las operaciones con el objeto cuenta
     * 
     * @param cuenta1 Objeto de la clase cuenta
     * @param cantidad Cantidad la cual realizar las operaciones de ejemplo
     */
    private static void operativa_cuenta(Examen cuenta1, float cantidad) {
        System.out.println("Saldo Incial: " + cuenta1.getdSaldo() + " euros");
        
        cuenta1.ingresar(-100);
        System.out.println("Saldo Incial: " + cuenta1.getdSaldo() + " euros");
        cuenta1.ingresar(100);
        System.out.println("Saldo tras ingreso: " + cuenta1.getdSaldo() + " euros");
        cuenta1.ingresar(2000);
        System.out.println("Saldo tras ingreso: " + cuenta1.getdSaldo() + " euros");
        cuenta1.ingresar(300);
        System.out.println("Saldo tras ingreso: " + cuenta1.getdSaldo() + " euros");
        cuenta1.retirar(50);
        System.out.println("Saldo tras retirada: " + cuenta1.getdSaldo() + " euros");
    }

    /**
     * Metodo para ingresar cantidades en la cuenta. Modifica el saldo.
     * 
     * 30/05/2024
     * @param cantidad Cantidad a inglesar
     * @return codigo de error, 0 en caso de que se realice la modificación, 1 en caso de error.
     */
    public int ingresar(double cantidad) {
        int iCodErr;

        if (cantidad < 0 || cantidad == 0) { //cambia el y por el o
            System.out.println("No se puede ingresar una cantidad negativa ni de 0€");
            iCodErr = 1;
        } else if (cantidad == 3000) {
            System.out.println(
                    "Le recordamos que estamos obligados a notificar a Hacienda dicho ingreso (superior o igual a 3000€)");
            setdSaldo(getdSaldo() + cantidad);
            iCodErr = 0;
        } else if (cantidad > 3000) { //sacamos el ! 
            System.out.println("No se puede ingresar una cantidad superior a 3000€ ni  (sin ser notificada con formulario)");
            iCodErr = 1;
        } else {
            setdSaldo(getdSaldo() + cantidad);
            iCodErr = 0;
        }

        return iCodErr;
    }

    /**
     * Metodo para retirar cantidades en la cuenta. Modifica el saldo.
     * 
     * 30/05/2024
     * @param cantidad cantidad a retirar de la cuenta bancaria
     */
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se puede retirar una cantidad negativa");
        } else if (getdSaldo() < cantidad) {
            System.out.println("No  hay suficiente saldo");
        } else {
            setdSaldo(getdSaldo() - cantidad);
            System.out.println("Le quedan " + getdSaldo() + " en cuenta");
        }
    }
    /**
     * Getter del atributo saldo
     * 
     * @return dSaldo el saldo actual
     */
    public double getdSaldo() {
        return dSaldo;
    }

    /**
     * Setter del atributo saldo
     * 
     * @param dSaldo el saldo a modificar.
     */
    public void setdSaldo(double dSaldo) {
        this.dSaldo = dSaldo;
    }

    /**
     * Getter del atributo nombre 
     * 
     * @return nombre de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del atributo saldo
     * 
     * @param nombre el nombre a modificar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}

