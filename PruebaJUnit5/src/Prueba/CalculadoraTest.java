package Prueba;

import org.junit.jupiter.api.Test ;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
	
	
	Calculadora cal= new Calculadora() ;	
	String mensaje = null;
	
	int[] esperado = {1, 2, 3};
	int [] resultado = {1, 3, 3};
	@Test
	void testSumar() {
		 
	  /*assertEquals(4, cal.sumar(2,2)) ;
		assertEquals (4,5);
		assertEquals (4,4);*/               
		
		/*assertAll(
				() ->assertEquals(4, cal.sumar(2,2)),
				() ->assertEquals (4,5),
				() ->assertEquals (4,4)
				);*/
		
		//--------------------------------------------
		
		assertNotEquals(4, cal.sumar(3,2)); //Si no son iguales
		assertTrue(4<5) ; //Si la condición se cumple dando True
		assertFalse(4==5) ; //Si la condición se cumple dando False
		assertNull(mensaje) ; //Si es null 
		assertNotNull(mensaje) ; //Si no es null 
		//assertArrayEquals(esperado == resultado) ;
		
		
		
	}
}
        