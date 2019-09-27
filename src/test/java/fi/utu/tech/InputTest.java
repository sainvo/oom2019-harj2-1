package fi.utu.tech;

//import org.junit.jupiter.api.*;

import net.jqwik.api.*;
/*
 * 
 */
class InputTest {
	@Property boolean toteutuukoAlkuehto(@ForAll String input) {
		boolean toteutuuko = false;
		CalculatorApp e = new CalculatorApp();
		if(input !=null && input.length() > 0) {
			String[] test = e.inputSplitter(input);
			if(test.length == 3) {
				toteutuuko = true;
			}
		}return toteutuuko;
	}
}