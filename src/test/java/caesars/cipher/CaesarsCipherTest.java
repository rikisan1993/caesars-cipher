package caesars.cipher;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaesarsCipherTest {
	
	private CaesarsCipher caesarsCipher = new CaesarsCipher();
	
	@Test
	public void testCipheredMessageWithOffsetOf12() {
		assertEquals("tai mdq kag pauzs fapmk", caesarsCipher.cipher("how are you doing today", 12));
	}
	
	@Test
	public void testEmptyString() {
		assertEquals("", caesarsCipher.cipher("", 12));
	}
	
	@Test
	public void testCipheredMessageWithOffsetOf11() {
		assertEquals("tai mdq kag pauzs fapmk", caesarsCipher.cipher("how are you doing today", 11));
	}

}
