package uniandes.dpoo.estructuras.logica;

import java.util.HashMap;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
    	int[] copiaEnteros = new int[arregloEnteros.length];
        
        for (int i = 0; i < arregloEnteros.length; i++) {
            copiaEnteros[i] = arregloEnteros[i];
        }
        return copiaEnteros;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
    	String[] copiaCadenas = new String[arregloCadenas.length];
    	copiaCadenas = arregloCadenas.clone();
        return copiaCadenas;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
    	
    	int cantidadEnteros = arregloEnteros.length;
    	
        return cantidadEnteros;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
    	int cantidadCadenas = arregloCadenas.length;
        return cantidadCadenas;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int[] arregloMasGrande = new int[arregloEnteros.length + 1];
    	if ((arregloEnteros.length+1)!=1) {
    		for (int i = 0; i < arregloEnteros.length; i++) {
    			arregloMasGrande[i] = arregloEnteros[i];
    		}
    	}
        
        arregloMasGrande[arregloEnteros.length] = entero;
        arregloEnteros = arregloMasGrande;
    	

    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	String[] arregloMasGrande = new String[arregloCadenas.length + 1];
    	if (arregloCadenas.length+1!=1) {
    		
    	}
        for (int i = 0; i < arregloCadenas.length; i++) {
            arregloMasGrande[i] = arregloCadenas[i];
        }
        arregloMasGrande[arregloCadenas.length] = cadena;
        arregloCadenas = arregloMasGrande;

    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int cantidadRepetidas = 0;
    	int pos=0;
    	int [] arregloDiferente = new int[arregloEnteros.length];
    	for (int entero: arregloEnteros){
    
    		if(valor==entero) {
    			cantidadRepetidas++;
    		}
    		else {
    			arregloDiferente[pos]=entero;
    			pos ++;
    		}
    		
    	}	
    		
    		
    	if (cantidadRepetidas>0) {
    	
    		int tamano = arregloEnteros.length-cantidadRepetidas;
    		int [] arregloCorto = new int[tamano];
    		
    		for(int i =0; i<tamano;i++ ) {
    			arregloCorto[i]= arregloDiferente[i];
    		}
    		arregloEnteros = arregloCorto;
    	}
    	

    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int cantidadRepetidas = 0;
    	int pos=0;
    	String [] arregloDiferente = new String[arregloCadenas.length];
    	for (String palabra: arregloCadenas){
    
    		if(cadena==palabra) {
    			cantidadRepetidas++;
    		}
    		else {
    			arregloDiferente[pos]=palabra;
    			pos ++;
    		}
    		
    	}	
    		
    		
    	if (cantidadRepetidas>0) {
    	
    		int tamano = arregloCadenas.length-cantidadRepetidas;
    		String [] arregloCorto = new String[tamano];
    		
    		for(int i =0; i<tamano;i++ ) {
    			arregloCorto[i]= arregloDiferente[i];
    		}
    		arregloCadenas = arregloCorto;
    	}

    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	
    	
    	if (posicion<=0) {
    		if (arregloEnteros.length==0) {
    			arregloEnteros=new int[1];
    			arregloEnteros[0]=entero;
    		}
    		else {
    			int[] arregloFinal=new int[arregloEnteros.length+1];
    			arregloFinal[0]=entero;
    			int pos=1;
        		for(int i=0;i<arregloEnteros.length;i++) {
        				arregloFinal[pos]=arregloEnteros[i];
        				pos++;
        			}
        		arregloEnteros= arregloFinal;
        		}
    	}	

    	else if (posicion >= arregloEnteros.length) {
    		int[] arregloFinal=new int[arregloEnteros.length+1];
    		for (int i =0; i<arregloEnteros.length;i++) {
    			arregloFinal[i]=arregloEnteros[i];
    		}
    		arregloFinal[arregloEnteros.length]=entero;
    		arregloEnteros= arregloFinal;
    	}
    	
    	
    	else {
    		int[] arregloFinal=new int[arregloEnteros.length+1];
    		int pos =0;
    		for (int i =0; i<arregloEnteros.length+1;i++) {
    			if(i!=posicion) {
    				arregloFinal[i]=arregloEnteros[pos];
    				pos++;
    				
    			}
    			else{
    				arregloFinal[i]=entero;
    			}
    		}
    		arregloEnteros= arregloFinal;
    	}
    		
    	
    	
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	int posicion2 =0;
    	if (posicion>=0 && posicion<arregloEnteros.length) {
    		int[] arregloFinal = new int[arregloEnteros.length-1];
    		
    		for (int i =0; i<arregloEnteros.length;i++) {
    			if(i != posicion) {
    				arregloFinal[posicion2]= arregloEnteros[i];
    				posicion2++;
    			}
    		
    				
    			
    		}
    		arregloEnteros=arregloFinal;
    	}

    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	int [] arregloParadouble = new int[valores.length];
    	for(int i=0; i<valores.length;i++) {
    		arregloParadouble[i] = (int) valores[i];
    	}
    	arregloEnteros = arregloParadouble;
    	

    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	String [] arregloObjetos = new String[objetos.length];
    	for(int i=0; i<objetos.length;i++) {
    		arregloObjetos[i] = objetos[i].toString();
    	}
    	arregloCadenas = arregloObjetos;

    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	for(int i=0; i<arregloEnteros.length;i++) {
    		if (arregloEnteros[i]<0) {
    			arregloEnteros[i]=arregloEnteros[i]*-1;
    			
    		}
    	}
    	

    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	Arrays.sort(arregloEnteros);
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	Arrays.sort(arregloCadenas);

    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	int cantidadApariciones = 0;
    	for( int entero: arregloEnteros) {
    		if(entero==valor) {
    			cantidadApariciones +=1;
    		}
    	}
    	
    	
        return cantidadApariciones;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	cadena=cadena.toLowerCase();
    	int cantidadCadenas = 0;
    	for( String palabra: arregloCadenas) {
    		if(palabra.equals(cadena)) {
    			cantidadCadenas +=1;
    		}
    	}
    	
    	
        return cantidadCadenas;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	int[] otroEnteros = getCopiaEnteros();
    	arregloEnteros = new int[0];
    	for (int i =0; i<otroEnteros.length;i++) {
    		if(otroEnteros[i]==valor) {
    			agregarEntero(i);	
    		}
    		
    	}
    	int[] posicionEntero = arregloEnteros.clone();
    	arregloEnteros = otroEnteros;
    	
    
    	
        
		return posicionEntero;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	int[] arregloRango= new int[2];
    	int mayor = -1000000;
    	int menor = 1000000;
    	if(arregloEnteros.length==0) {
    		arregloRango=new int[0];
    	}
    	else {
    		for(int entero: arregloEnteros) {
    		if(entero>mayor) {
    			mayor = entero;
    		}
    		if(entero<menor) {
    			menor = entero;
    		}
    		}
    		arregloRango[0]=menor;
    		arregloRango[1]=mayor;
    	
    	}
    	
        return arregloRango;
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
    	HashMap<Integer,Integer> mapahistograma= new HashMap<Integer,Integer>();
    	
    	for(int entero : arregloEnteros) {
    		if (mapahistograma.containsKey(entero)) {
    			int repetidos =mapahistograma.get(entero);
    			repetidos++;
    			mapahistograma.put(entero, repetidos);
    		}
    		else {
    			mapahistograma.put(entero,1);
    		}
    	}
        return mapahistograma;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	int[] repetidos=new int[arregloEnteros.length];
    	int posicion=0;
    	int totalRepetidos=0;
    	for(int i=0; i<arregloEnteros.length;i++) {
    		for(int a=0;a<arregloEnteros.length;a++) {
    			if(arregloEnteros[i]==arregloEnteros[a] && i!=a) {
    				if (posicion==0) {
    					repetidos[posicion]=arregloEnteros[i];
    					posicion++;
    					totalRepetidos++;
    				}
    				else {
    					boolean b=false;
    					for (int c=0;c<repetidos.length;c++) {
    						if (arregloEnteros[i]== repetidos[c]) {
    							b=true;
    						}
    					}
    					if (b ==false) {
    						repetidos[posicion]=arregloEnteros[i];
    						posicion++;
    						totalRepetidos++;
    					}
    				}
    			}
    		}
    	}
        return totalRepetidos;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	boolean rta = true;
    	if(arregloEnteros.length != otroArreglo.length) {
    		rta = false;
    	} 
    	for (int i =0; i<arregloEnteros.length;i++) {
    		if(arregloEnteros[i]!=otroArreglo[i]) {
    			rta = false;
    		}
    	}
    
    	
        return rta;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	boolean rta = true;
    	if(arregloEnteros.length!=otroArreglo.length) {
    		rta = false;
    	}
    	
    	
    	boolean[] iguales = new boolean[otroArreglo.length];
    	
    	for (int i = 0; i < arregloEnteros.length; i++) {
    		boolean igual = false;
    		for (int j = 0; j < otroArreglo.length; j++) {
    			
    			if (arregloEnteros[i] != otroArreglo[j]) {
    				iguales[j] = true;
    				igual=true;
    			}
    		}
    		if(!igual) {
    			rta = false;
    		}
    	}
    	for (boolean igual: iguales) {
    		if(!igual) {
    			rta = false;
    		}
    	}
    		 
    		
    	 
        return rta;
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	arregloEnteros=new int[cantidad];
    	for(int i=0;i<cantidad;i++){
    		int entero=(int) (Math.random() * (maximo - minimo + 1)) + minimo;
    		arregloEnteros[i]=entero;
    	}

    }

    

}
