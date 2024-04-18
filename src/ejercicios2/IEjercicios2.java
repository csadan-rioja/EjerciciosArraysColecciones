package ejercicios2;

public interface IEjercicios2 {

	/**
	 * Considerando la primera y la última aparicion de un valor cualquiera en el
	 * array. Llamamos span al número de elementos que hay entre ellos (ambos
	 * inclusive). Un elemento que únicamente aparezca una vez tendrá un valor de
	 * span igual a 1. La siguiente función devolverá el span más alto dentro de un
	 * array. Por ejemplo:
	 * 
	 * maxSpan([1, 2, 1, 1, 3], 5) → 4 
	 * maxSpan([1, 4, 2, 1, 4, 1, 4], 7) → 6
	 * maxSpan([1, 4, 2, 1, 4, 4, 4],7) → 6
	 */
	public int maxSpan(int[] numeros, int compSign);

	/**
	 * Dado un array que no está vacio, devolver verdadero si existe una forma de
	 * dividirlo en dos de tal forma que los elementos de la derecha sumen lo mismo
	 * que los de la izquierda
	 * 
	 * canBalance([1, 1, 1, 2, 1], 5) → true 
	 * canBalance([2, 1, 1, 2, 1]) → false
	 * canBalance([10, 10], 2) → true
	 **/
	public boolean canBalance(int[] nums, int compSign);

	/**
	 * Llamamos 'grupo' dentro de un array a una serie de 2 o más elementos
	 * adyacentes con el mismo valor. La siguiente función deberá devolver el número
	 * de grupos que existen en un array
	 */
	public int countGrupos(int[] nums, int compSign);

	/**
	 * Devuelve un array que contenga exactamente los mismos números de un array
	 * pasado por parámetro pero en el que aparezcan todos los ceros al principio.
	 * El resto de números deberán aparecer en el mismo orden que se encontraban.
	 *
	 * zeroFront([1, 0, 0, 1], 4) → [0, 0, 1, 1] 
	 * zeroFront([0, 1, 1, 0, 1], 5) → [0, 0, 1, 1, 1] 
	 * zeroFront([1, 0], 2) → [0, 1]
	 *
	 */
	public int[] zeroFront(int[] nums, int compSign);

	/**
	 * Pasando como parámetro un array de enteros, devolver un nuevo array que
	 * contenga los elementos anteriores a la primera aparición de un 4.
	 * 
	 * 
	 * pre4([1, 2, 4, 1], 4) → [1, 2] 
	 * pre4([3, 1, 4], 3) → [3, 1] 
	 * pre4([1, 4, 4], 3) → [1] 
	 * pre4([1, 2, 3, 5], 4) → [1, 2, 3, 5]
	 *
	 */
	public int[] pre4(int[] nums, int compSign);

	/**
	 * Pasando como parámetro un array de enteros, devolver verdadero si todos los
	 * doses que aparecen están seguidos de otro 2, y falso en caso contrario.
	 * 
	 * twoTwo([4, 2, 2, 3]) → true
	 * twoTwo([2, 2, 4]) → true
	 * twoTwo([2, 2, 4, 2]) → false
	 */
	public int[] twoTwo(int[] nums, int compSign);
	
	
	
	

}
