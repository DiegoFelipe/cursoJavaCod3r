package fundamentos;

/**
 * Calcula a área da circuferencia
 * @author diegofelipe
 *
 */
public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159; // o final transforma em constante
		
		double area = PI * raio * raio;
		
		System.out.println("Área = " + area + "m2.");
		
	}
}
