
public class Calculadora {

	public static void main(String[] a) {
		Calculadora calc1 = new Calculadora();
		calc1.teclearNumero( 7 );
		calc1.verEnPantalla();
		calc1.pulsarCuadrado();
		calc1.verEnPantalla();
		Calculadora calc2 = new Calculadora();
		calc2.verEnPantalla();
	}
	
	double numEnPantalla;
	
	/** Toma el n�mero que est� en pantalla
	 * lo eleva al cuadrado y deja el resultado
	 * en pantalla
	 */
	void pulsarCuadrado() {
		numEnPantalla = numEnPantalla * numEnPantalla;
		// o numEnPantalla *= numEnPantalla
	}
	
	/** Visualiza en consola la pantalla
	 */
	void verEnPantalla() {
		System.out.println( numEnPantalla );
	}
	
	/** Teclea el n�mero indicado y lo muestra en pantalla
	 * @param numero	N�mero tecleado
	 */
	void teclearNumero( int numero ) {
		numEnPantalla = (double) numero;
	}

}
