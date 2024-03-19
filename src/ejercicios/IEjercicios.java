package ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * A continuación se presentan un conjunto de ejercicios junto con su enunciado.
 * En algunas ocasiones un mismo enunciado corresponde a dos funciones, una
 * implementada utilizando colecciones y otra utilizando arrays.  
 */

public interface IEjercicios {

	/**
	 * Suma acumulativa: Escribe una función que tome una lista de números como
	 * argumento y devuelva una nueva lista donde cada elemento sea la suma
	 * acumulativa de los elementos anteriores en la lista.
	 */

	public int[] sumaAcumulativa(int[] listaNumeros, int n);

	/**
	 * Número de ocurrencias: Escribe una función que tome una lista y un elemento
	 * como argumentos, y devuelva el número de veces que ese elemento aparece en la
	 * lista.
	 */
	public int numeroOcurrencias(int[] listaNumeros, int n, int elemento);

	public int numeroOcurrencias(ArrayList<Integer> listaNumeros, int elemento);

	/**
	 * Intercambio de elementos: Escribe una función que tome una lista como
	 * argumento y devuelva una nueva lista donde el primer elemento y el último
	 * estén intercambiados.
	 */
	public int[] intercambioElementos(int[] listaNumeros, int n);

	public ArrayList<Integer> intercambioElementos(ArrayList<Integer> listaNumeros);

	/**
	 * Palabras más cortas: Escribe una función que tome una lista de palabras como
	 * argumento y devuelva la palabra más corta.
	 */

	public String palabraMasCorta(String[] listaPalabras, int n);

	public String palabraMasCorta(ArrayList<String> listaPalabras);

	/**
	 * Lista sin elementos repetidos: Escribe una función que tome una lista como
	 * argumento y devuelva una nueva lista sin elementos repetidos, manteniendo el
	 * orden original.
	 */

	public String[] eliminarRepetidos(String[] listaPalabras, int n);

	public ArrayList<String> eliminarRepetidos(ArrayList<String> listaPalabras);

	/**
	 * Concatenar y ordenar: Escribe una función que tome dos listas de números como
	 * argumentos, las concatene y devuelva una nueva lista ordenada de forma
	 * ascendente.
	 */

	public String[] concatenarListas(String[] listaPalabras1, String[] listaPalabras2);

	public ArrayList<String> concatenarListas(ArrayList<String> listaPalabras1, ArrayList<String> listaPalabras2);

	/**
	 * Escribe una función que tome una lista y un elemento como argumentos, y
	 * devuelva una lista con los índices donde se encuentra ese elemento en la
	 * lista.
	 */

	public int[] indicesElemento(String[] listaPalabras1, int n, int elemento);

	public int[] indicesElemento(ArrayList<String> listaPalabras, String elemento);

	/**
	 * Promedio de elementos: Escribe una función que tome una lista de números como
	 * argumento y devuelva el promedio de los elementos.
	 */

	public double promedioElementos(int[] listaPalabras1, int n);

	public double promedioElementos(ArrayList<Integer> listaNumeros);

	/**
	 * Palíndromos: Escribe una función que tome una lista de palabras como
	 * argumento y devuelva una lista con las palabras que son palíndromos (se leen
	 * igual de izquierda a derecha y de derecha a izquierda).
	 */

	public ArrayList<String> palabrasPalindromo(String[] listaPalabras1, int n);

	/**
	 * Duplicar elementos: Escribe una función que tome una lista como argumento y
	 * devuelva una nueva lista donde cada elemento se duplica.
	 */

	public ArrayList<Integer> duplicarElementos(int[] listaNumeros, int n);

	/**
	 * Suma de elementos: Escribe una función que tome un Set de números como
	 * argumento y devuelva la suma de todos los elementos del Set.
	 */

	public double promedioElementos(TreeSet<Double> conjuntoReales);

	/**
	 * Número máximo: Escribe una función que tome un conjunto de números como
	 * argumento y devuelva el número máximo del Set.
	 */

	public double maximoElementos(TreeSet<Double> conjuntoReales);

	public double maximoElementos(LinkedList<Double> listaReales);

	/**
	 * Contar elementos: Escribe una función que tome una lista y un elemento como
	 * argumentos, y devuelva el número de veces que ese elemento aparece en la
	 * lista.
	 */

	public int contarElementos(LinkedList<Double> listaReales, Double elemento);

	public int contarElementos(Double[] listaReales, Double elemento);

	/**
	 * Concatenar listas: Escribe una función que tome dos listas como argumentos y
	 * devuelva una nueva lista que contenga todos los elementos de ambas tuplas.
	 */

	public Double[] concatenarListas(LinkedList<Double> lista1, TreeSet<Double> conjunto1);

	/**
	 * lista al revés: Escribe una función que tome una lista como argumento y
	 * devuelva una nueva lista con los elementos en orden inverso.
	 */

	public LinkedList<Double> invertirLista(LinkedList<Double> lista1);

	public Double[] invertirLista(Double[] lista1);

	/**
	 * Eliminar elementos específicos: Escribe una función que tome una tupla y un
	 * elemento como argumentos, y devuelva una nueva tupla donde se eliminan todas
	 * las ocurrencias de ese elemento.
	 */

	public LinkedList<String> eliminarElemento(LinkedList<String> lista1, String elemento);

	/**
	 * Subtupla: Escribe una función que tome una lista y dos índices como
	 * argumentos, y devuelva una nueva lista que contenga los elementos desde el
	 * primer índice (incluido) hasta el segundo índice (excluido).
	 */

	public LinkedList<String> subLista(LinkedList<String> lista1, int min, int max);

	/**
	 * Unión de tuplas: Escribe una función que tome una lista de tuplas como
	 * argumento y devuelva una nueva tupla que contenga todos los elementos de las
	 * tuplas originales de forma ordenada.
	 */

	public LinkedList<Integer> concatenarOrdenadas(LinkedList<Integer> lista1, LinkedList<Integer> lista2);

	public Integer[] concatenarOrdenadas(Integer[] lista1, Integer[] lista2);

	/**
	 * Crear una función que devuelva un Map que utilice como claves nombres de
	 * personas y como valor un número (este número puede representar las personas
	 * de clase que se llaman asi).
	 */

	public HashMap<String, Integer> crearMap();

	/**
	 * Dado un diccionario con nombres y edades, filtrar aquellos cuya edad sea
	 * mayor que 25.
	 */

	public HashMap<String, Integer> filtrarPersonas(HashMap<String, Integer> map);

	/**
	 * Crea una función que dada una frase, devuelva un diccionario en el que
	 * aparezca cuántas veces aparece cada palabra.
	 */

	public HashMap<String, Integer> contarOcurrenciasPalabras(String frase);

	/**
	 * Crea una función en la que dado un diccionario cuya clave es el nombre de un
	 * producto y el valor su precio, devuelva un diccionario con aquellos productos
	 * cuyo precio sea menor de 20.
	 */

	public HashMap<String, Double> filtrarProductos(HashMap<String, Double> map);

	/**
	 * Escribe una función que reciba un HashMap de tipo <String, Integer> y
	 * devuelva la suma de todos los valores enteros en el mapa.
	 * 
	 */
	public int sumarValores(HashMap<String, Integer> mapa);

	/**
	 * Escribe una función que reciba un HashMap de tipo <String, String> y devuelva
	 * una cadena que concatene todas las cadenas de valor del mapa separadas por un
	 * espacio.
	 */
	public String concatenarCadenasMap(HashMap<String, String> mapa);

	/**
	 * Escribe una función que reciba un HashMap de tipo <String, Integer> y un
	 * valor entero. La función debe devolver true si el valor está presente al
	 * menos una vez en el mapa, y false en caso contrario.
	 */
	public boolean valorPresente(HashMap<String, Integer> mapa, int valor);

	/**
	 * Escribe una función que reciba un HashMap de tipo <String, Integer> y un
	 * valor entero. La función debe eliminar todas las entradas del mapa que tengan
	 * el valor igual al proporcionado.
	 */
	public void eliminarPorValor(HashMap<String, Integer> mapa, int valor);

	/**
	 * Ordenar lista: Escribe una función que devuelva ordenada de menor a mayor una
	 * lista pasada por parámetro.
	 */
	public LinkedList<Integer> ordenarListaMenorMayor(LinkedList<Integer> lista1);

	public Integer[] ordenarListaMenorMayor(Integer[] lista1, int n);

	/**
	 * Ordenar lista: Escribe una función que devuelva ordenada de mayor a menor una
	 * lista pasada por parámetro.
	 */
	public LinkedList<Integer> ordenarListaMayorMenor(LinkedList<Integer> lista1);

	public Integer[] ordenarListaMayorMenor(Integer[] lista1, int n);

	/**
	 * Ordenar lista: Escribe una función que reciba como parámetro una lista y una
	 * variable booleana. Si la variable booleana es verdadero, devolverá la lista
	 * ordenada de menor a mayor y si es falso la devolverá ordenada de mayor a
	 * menor.
	 */
	public LinkedList<Integer> ordenar(LinkedList<Integer> lista1, boolean ordenamiento);

	public Integer[] ordenar(Integer[] lista1, int n, boolean ordenamiento);

}
