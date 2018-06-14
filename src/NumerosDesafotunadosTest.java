import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class NumerosDesafotunadosTest {

	@Test
	public void testCrearlista() {

		ArrayList<Integer> listtest = new ArrayList<Integer>();
		listtest.add(1);listtest.add(2);listtest.add(3);listtest.add(4);
		
		assertEquals(listtest,NumerosDesafotunados.crearlista(4));
	}@Test
	public void testCrearlista4() {

		ArrayList<Integer> listtest = new ArrayList<Integer>();
		listtest.add(1);listtest.add(2);listtest.add(3);listtest.add(4);listtest.add(5);listtest.add(6);listtest.add(7);listtest.add(8);listtest.add(9);listtest.add(10);listtest.add(11);listtest.add(12);listtest.add(13);listtest.add(14);listtest.add(15);listtest.add(16);listtest.add(17);listtest.add(18);listtest.add(19);listtest.add(20);listtest.add(21);listtest.add(22);listtest.add(23);listtest.add(24);listtest.add(25);listtest.add(26);listtest.add(27);listtest.add(28);listtest.add(29);listtest.add(30);listtest.add(31);listtest.add(32);listtest.add(33);listtest.add(34);listtest.add(35);listtest.add(36);listtest.add(37);listtest.add(38);listtest.add(39);listtest.add(40);
		
		
		assertEquals(listtest,NumerosDesafotunados.crearlista(40));
	}
	@Test
	public void testCrearlista3() {

		ArrayList<Integer> listtest = new ArrayList<Integer>();
		listtest.add(1);listtest.add(2);listtest.add(3);listtest.add(4);listtest.add(5);listtest.add(6);listtest.add(7);listtest.add(8);listtest.add(9);listtest.add(10);listtest.add(11);listtest.add(12);listtest.add(13);listtest.add(14);listtest.add(15);listtest.add(16);listtest.add(17);listtest.add(18);listtest.add(19);listtest.add(20);
		
		assertEquals(listtest,NumerosDesafotunados.crearlista(20));
	}
	@Test
	public void testCrearlista2() {

		ArrayList<Integer> listtest = new ArrayList<Integer>();
		
		listtest.add(1);listtest.add(2);listtest.add(3);listtest.add(4);listtest.add(5);listtest.add(6);listtest.add(7);listtest.add(8);listtest.add(9);listtest.add(10);
		
		assertEquals(listtest,NumerosDesafotunados.crearlista(10));
	}
	@Test
	public void testEliminar() {
		
		ArrayList<Integer> listtest1 = new ArrayList<Integer>();
		listtest1.add(1);listtest1.add(2);listtest1.add(3);listtest1.add(4);
		listtest1.remove(1);
		assertEquals(listtest1,NumerosDesafotunados.eliminar(4));
		
		
	}
	
	@Test
	public void testEliminar2() {
		
		ArrayList<Integer> listtest1 = new ArrayList<Integer>();
		listtest1.add(1);listtest1.add(2);listtest1.add(3);listtest1.add(4);listtest1.add(5);
		listtest1.remove(4);listtest1.remove(1);
		assertEquals(listtest1,NumerosDesafotunados.eliminar(5));
		
		
	}@Test
	public void testEliminar3() {
		
		ArrayList<Integer> listtest1 = new ArrayList<Integer>();
		listtest1.add(1);listtest1.add(2);listtest1.add(3);listtest1.add(4);listtest1.add(5);listtest1.add(6);listtest1.add(7);listtest1.add(8);listtest1.add(9);listtest1.add(10);
		listtest1.remove(9);listtest1.remove(7);listtest1.remove(5);listtest1.remove(4);listtest1.remove(2);listtest1.remove(1);
		assertEquals(listtest1,NumerosDesafotunados.eliminar(10));
		
		
	}
	
	@Test
	public void testMain() {
		testCrearlista();
		testCrearlista2();
		testCrearlista3();
		testCrearlista4();
	}

}

