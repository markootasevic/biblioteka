/**
 * 
 */
package biblioteka;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Marko
 *
 */
public class BibliotekaTest {
	Biblioteka biblioteka;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		biblioteka = new Biblioteka();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		biblioteka = null;
	}

	/**
	 * Test method for {@link biblioteka.Biblioteka#dodajKnjigu(biblioteka.Knjiga)}.
	 */
	@Test
	public void testDodajKnjigu() {
		Knjiga knjiga = new Knjiga();
		
		biblioteka.dodajKnjigu(knjiga);
		assertEquals(1 , biblioteka.vratiSveKnjige().size());
		assertEquals(knjiga, biblioteka.vratiSveKnjige().get(0)); // get(0) vraca knjigu sa indexom nula iz liste
	}
	
	/**
	 * Test method for {@link biblioteka.Biblioteka#dodajKnjigu(biblioteka.Knjiga)}.
	 */
	@Test
	public void testDodajKnjigu2() {
		Knjiga knjiga = new Knjiga();
		knjiga.setISBN(123);
		
		Knjiga knjiga2 = new Knjiga();
		knjiga2.setISBN(987);
		
		biblioteka.dodajKnjigu(knjiga);
		biblioteka.dodajKnjigu(knjiga2);
		
		assertEquals(2 , biblioteka.vratiSveKnjige().size());
		assertEquals(knjiga, biblioteka.vratiSveKnjige().get(0)); // get(0) vraca knjigu sa indexom nula iz liste
		assertEquals(knjiga2, biblioteka.vratiSveKnjige().get(1));
	}
	
	/**
	 * Test method for {@link biblioteka.Biblioteka#dodajKnjigu(biblioteka.Knjiga)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajKnjiguKnjigaVecPostoji() {
		Knjiga knjiga = new Knjiga();
		knjiga.setISBN(123);
		
		Knjiga knjiga2 = new Knjiga();
		knjiga2.setISBN(123);
		
		biblioteka.dodajKnjigu(knjiga);
		biblioteka.dodajKnjigu(knjiga2);
		
		
	}
	
	/**
	 * Test method for {@link biblioteka.Biblioteka#dodajKnjigu(biblioteka.Knjiga)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajKnjiguNull() {

		biblioteka.dodajKnjigu(null);
		
		
	}

}
