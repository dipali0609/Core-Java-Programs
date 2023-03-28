package threadEx;

import static org.junit.Assert.*;

import org.junit.Test;

public class Source1Test {

	@Test
	public void test() {
		
		Source junit=new Source();
        String s=junit.insertStr("Capgimini");
        assertEquals("c a p g e m i n i",String.valueOf(junit.insertStr("capgemini")));
		
		assertEquals("d i p a l i",String.valueOf(junit.insertStr("dipali")));
		assertEquals("A l e x a",String.valueOf(junit.insertStr("Alexa")));
		assertEquals("c o v i d",String.valueOf(junit.insertStr("covid")));
		assertEquals("m o u s e",String.valueOf(junit.insertStr("mouse")));
		assertEquals("A S C I I",String.valueOf(junit.insertStr("ASCII")));
	}

}
