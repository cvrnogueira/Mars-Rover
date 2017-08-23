package exercicioParaEntregar;

import static org.junit.Assert.*;

import org.junit.Test;

public class MassRoverTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test 
	public void printaPlateauERobo(){
		Plateau Mars = new Plateau(5, 5); 
		Robot C3PO = new Robot(1, 2, "N");
		Print.robotPosition(1, 2, Mars);
	}
}
