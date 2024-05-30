package examen3refactorizado;

import examen3refactorizado.Examen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de test unitarios para el examen.
 *
 * 30/05/2024
 * @author Juan E
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
    /**
     * Método que comprueba que no ingrese una cantidad negativa
     */
    public void testCamino1(){
        double saldo=e1.getdSaldo();
        assertEquals(1, e1.ingresar(-2),"Tiene que devoler 1");
        assertEquals(saldo, e1.getdSaldo(),"El saldo tiene que ser igual");
    }
    @Test
    /**
     * Método que comprueba que no pueda ingresar 0€
     */
    public void testCamino2(){
        double saldo=e1.getdSaldo();
        assertEquals(1, e1.ingresar(0),"Tiene que devoler 1");
        assertEquals(saldo, e1.getdSaldo(),"El saldo tiene que ser igual");
    }
    @Test
    /**
     * Método que comprueba en el caso de ingresar 3000 euros que lo ingrese y se devuelva 0
     */
    public void testCamino3(){
        double saldo=e1.getdSaldo();
        assertEquals(0, e1.ingresar(3000),"Tiene que devoler 0");
        assertEquals(saldo+3000, e1.getdSaldo(),"El saldo tiene que ser 3000€ mayor");
    }
    @Test
    /**
     * Método que comprueba que no ingrese nada en el caso de ingresar una cifra mayor que 3000
     */
    public void testCamino4(){
        double saldo=e1.getdSaldo();
        assertEquals(1, e1.ingresar(3030),"Tiene que devoler 1");
        assertEquals(saldo, e1.getdSaldo(),"El saldo tiene que ser igual");
    }
    @Test
    /**
     * Método que comprueba que en los demas casos se ingrese la cantidad indicada
     */
    public void testCamino5(){
        double saldo=e1.getdSaldo();
        assertEquals(0, e1.ingresar(2500),"Tiene que devoler 0");
        assertEquals(saldo+2500, e1.getdSaldo(),"El saldo tiene que ser 2500€ mayor");
    }
}
