import java.util.Scanner;

/**
 * <h1 style='color:#9ACD32'>Determina Tipo De Primas</h1>
 * 
 * Se determina un tipo de prima (P1,P2,P3,P4) en función de una serie de parámetros.
 * Los parámetros se introducen por teclado, previa petición.
 * 
 * @author <p style='color:#9ACD32'> Celia, Iván </p>
 * @version <p style='color:#B03A2E'> v1.2020 </p>
 *
 */

public class PrimaMainMetodos {
	

	static Scanner  teclado=new Scanner(System.in);

	public static void main(String[] args) {

		int numEmple;
		String nomEmple;
		int meses;
		char esDirectivo;
		char respuesta;
		

		do {
			System.out.println("\nDATOS  EMPLEADO/A");
			numEmple=leerNumEmple();
			nomEmple=leerNomEmple();
			meses=leerMeses();
			esDirectivo=leerEsDirectivo();
			System.out.println("\n\tLe corresponde la prima "+hallarPrima(esDirectivo, meses));
			
			
			System.out.println("\n¿CALCULAR MAS PRIMAS? (S/N): ");
			respuesta=teclado.nextLine().toUpperCase().charAt(0);
		}while(respuesta=='S');		
	}
	
	
	/**
	 * Método que determina el tipo de prima. 
	 * @param esDirectivo  Caracter que indica si lo es o no.
	 * @param meses  Entero que indica el número de meses del empleado.
	 * @return <ul>
	 * <li type=disc style='color:#186A3B'>'P1' entonces SI es directivo;  antiguedad mayor o igual a 12meses. </li>
	 * <li type=disc style='color:#B7950B'>'P3' entonces SI es directivo; antiguedad menor de 12 meses. </li>
	 * <li type=disc style='color:#641E16'>'P2' entonces NO es direcivo; antiguedad mayor o igual a 12 meses. </li>
	 * <li type=disc style='color:#C0392B'>'P4' entonces NO es directivo ; antiguedad menor de 12 meses. </li>
	 * </ul> 
	 */


	public static String hallarPrima(char esDirectivo, int meses) {
		if(esDirectivo=='+') // ES DIRECTIVO
			if(meses>=12)
				return "P1";
			else
				return "P3";
		else 	// NO ES DIRECTIVO
			if(meses>=12)
				return "P2";
			else
				return "P4";
	}
	
	
	/**
	 * Método que lee el número del empleado.
	 * @return Un entero con el número del empleado.
	 */

	
	public static int leerNumEmple() {		
		int numEmple;
		do{
			System.out.println("NÚMERO [100-999]: ");
			numEmple = teclado.nextInt();
		}while(numEmple<100 || numEmple>999);		
		teclado.nextLine();
		return numEmple;
	}
	
	/**
	 * Método que lee el nombre del empleado.
	 * @return Cadena con el nombre del empleado. 
	 */
	
	
	public static String leerNomEmple() {
		String nomEmple;
		do {
			System.out.println("NOMBRE (max 10 caracteres): ");
			nomEmple = teclado.nextLine();
		}while(nomEmple.length()>10);		
		return nomEmple;
	}
	
	
	/**
	 * Metodo que lee la antiguedad del empleado.
	 * @return Un entero que indica el número de meses de antiguedad del empleado. 
	 */
	

	public static int leerMeses() {
		int meses;
		do {
			System.out.println("MESES DE TRABAJO: ");
			meses = teclado.nextInt();
		}while(meses<0);
		teclado.nextLine();
		return meses;
	}
	
	
	/**
	 * Metodo que lee por teclado si el empleado es directivo o no.
	 * @return <ul>
	 * <li type=disc>+ Si es directivo.</li>
	 * <li type=disc>- No es directivo.</li>
	 * </ul>
	 */
	

	public static char leerEsDirectivo() {
		char esDirectivo;
		do {
			System.out.println("¿ES DIRECTIVO? (+/-): ");
			esDirectivo = teclado.nextLine().charAt(0);
		}while(esDirectivo!='+' && esDirectivo!='-');
		return esDirectivo;
	}
}
