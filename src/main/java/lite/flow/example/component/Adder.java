package lite.flow.example.component;


/**
 * Simple component which performs addition of numbers.
 * 
 * Note!!! component is without explicit Output port!
 * Method result is treated by framework automatically as output port.
 * And method name is output name.
 * 
 *	@author ToivoAdams
 */
public class Adder {

	public int number( int a, int b) {
		return a + b;
	}
}
