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
public class AutorTest {
	
	private Autor autor;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		autor = new Autor();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		autor = null;
	}

	/**
	 * Test method for {@link biblioteka.Autor#setIme(java.lang.String)}.
	 */
	@Test
	public void testSetIme() {
		autor.setIme("Pera");
		
		assertEquals("Pera", autor.getIme());
	}
	
	/**
	 * Test method for {@link biblioteka.Autor#setIme(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetImeNull() {
		autor.setIme(null);

		
	}
	
	/**
	 * Test method for {@link biblioteka.Autor#setIme(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetImeEmptyString() {
		autor.setIme("");

		
	}

	/**
	 * Test method for {@link biblioteka.Autor#setPrezime(java.lang.String)}.
	 */
	@Test
	public void testSetPrezime() {
		autor.setPrezime("Peric");
		
		assertEquals("Peric", autor.getPrezime());
	}
	
	/**
	 * Test method for {@link biblioteka.Autor#setPrezime(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrezimeNull() {
		autor.setPrezime(null);
		
	}
	
	/**
	 * Test method for {@link biblioteka.Autor#setPrezime(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrezimePrazanString() {
		autor.setPrezime("");
		
	}

}
