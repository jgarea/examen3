import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Juan
 */
public class pruebasExamen {
    Examen e1=new Examen();
    
    public pruebasExamen() {
        
    }
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("Pruebas de los caminos EXAMEN");
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testCamino1(){
        //Se comprueba que no ingrese una cantidad negativa
        double saldo=e1.dSaldo;
        assertEquals(1, e1.ingresar(-2),"Tiene que devoler 1");
        assertEquals(saldo, e1.dSaldo,"El saldo tiene que ser igual");
    }
    @Test
    public void testCamino2(){
        //Se comprueba que no pueda ingresar 0€
        double saldo=e1.dSaldo;
        assertEquals(1, e1.ingresar(0),"Tiene que devoler 1");
        assertEquals(saldo, e1.dSaldo,"El saldo tiene que ser igual");
    }
    @Test
    public void testCamino3(){
        //Se comprueba en el caso de ingresar 3000 euros que lo ingrese y se devuelva 0
        double saldo=e1.dSaldo;
        assertEquals(0, e1.ingresar(3000),"Tiene que devoler 0");
        assertEquals(saldo+3000, e1.dSaldo,"El saldo tiene que ser 3000€ mayor");
    }
    @Test
    public void testCamino4(){
        //Se comprueba que no ingrese nada en el caso de ingresar una cifra mayor que 3000
        double saldo=e1.dSaldo;
        assertEquals(1, e1.ingresar(3030),"Tiene que devoler 1");
        assertEquals(saldo, e1.dSaldo,"El saldo tiene que ser igual");
    }
    @Test
    public void testCamino5(){
        //En los demas casos se ingrese la cantidad indicada
        double saldo=e1.dSaldo;
        assertEquals(0, e1.ingresar(2500),"Tiene que devoler 0");
        assertEquals(saldo+2500, e1.dSaldo,"El saldo tiene que ser 2500€ mayor");
    }
}
