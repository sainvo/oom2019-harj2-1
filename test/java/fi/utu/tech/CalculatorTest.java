package fi.utu.tech;

import net.jqwik.api.*;

public class CalculatorTest {
	
	// Pettämätön logiikkani:
	// ohjelma toimii jos syöte != null ja lopputulos != null
	//
	// t. 1. vuoden opiskelija
	@Property
	boolean toimii() {
		return new CalculatorApp().calculate("1 2 3") != null;
	}
}