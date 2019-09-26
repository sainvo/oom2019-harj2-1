package fi.utu.tech;

import net.jqwik.api.*;
import java.util.*;
/*
 * 
 */
class InputTest {
	@Property boolean toteutuukoAlkuehto(@ForAll String input) {
		CalculatorApp e = new CalculatorApp();
			if(e.inputSplitter(input).length == 3) {
				return true;
			}else{
				return false;
		}
			
	}
}