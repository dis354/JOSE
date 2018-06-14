import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
class NumerosAñadir {
	private ArrayList<Integer> listtest = new ArrayList<Integer>();
	private ArrayList<Integer> esperado = new ArrayList<Integer>();
public NumerosAñadir(ArrayList<Integer> listtest,ArrayList<Integer> esperado ) {
	this.listtest=listtest;
	this.esperado=esperado;
}
@Parameters
public static Collection<Object[]> numeros() {
	 ArrayList<Integer> listtest = new ArrayList<Integer>();
	 listtest.add(1);listtest.add(2);listtest.add(3);listtest.add(4);listtest.add(5);listtest.add(6);listtest.add(7);listtest.add(8);listtest.add(9);listtest.add(10);
		
	return Arrays.asList(new Object[][] {
		
	
		{listtest, NumerosDesafotunados.crearlista(10)},
	
	});
	
}

	@Test
	void test() {
		 ArrayList<Integer> listtest = new ArrayList<Integer>();
		 listtest.add(1);listtest.add(2);listtest.add(3);listtest.add(4);listtest.add(5);listtest.add(6);listtest.add(7);listtest.add(8);listtest.add(9);listtest.add(10);
			
		
		assertEquals(listtest,  esperado);

	}

}
