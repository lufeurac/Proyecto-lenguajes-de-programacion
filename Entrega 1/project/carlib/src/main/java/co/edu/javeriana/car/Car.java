package co.edu.javeriana.car;

/** Interfaz para manejar el carro. 
 * Basta con invocar cada método para que el carro automáticamente
 * realice la acción correspondiente.
 * @author jaimepavlich-mariscal
 *
 */
public interface Car {

	/** Define el color del lápiz que usará el carro en su siguiente movimiento.
	 * El color se define con los parámetros (r,g,b,a), donde r es el nivel de rojo
	 * g es el nivel de verde, b es el nivel de azul y a es el nivel de transparencia.
	 * 
	 * Nota: Si se desea que el carro no dibuje, basta con definir un valor de transparencia
	 * de 255 (sin importar el valor de los demás parámetros)
	 * 
	 * @param r nivel de rojo. Puede ser un valor entre 0 (sin color rojo) hasta 255 (máximo nivel de rojo)
	 * @param g nivel de verde. Puede ser un valor entre 0 (sin color verde) hasta 255 (máximo nivel de verde)
	 * @param b nivel de azul. Puede ser un valor entre 0 (sin color azul) hasta 255 (máximo nivel de azul)
	 * @param a nivel de transparencia. Puede ser un valor entre 0 (totalmente transparente) hasta 255 (totalmente opaco)
	 */
	public abstract void color(float r, float g, float b, float a);

	/** Mueve el carro hacia atrás la distancia indicada
	 * @param steps Número de pixeles que se mueve el carro hacia atrás
	 */
	public abstract void back(float steps);

	/** Mueve el carro hacia adelante la distancia indicada
	 * @param steps Número de pixeles que se mueve el carro hacia adelante
	 */
	public abstract void forward(float steps);

	/** Rota el carro hacia la izquierda la cantidad de grados indicada
	 * @param angle Grados a rotar el carro hacia la izquierda
	 */
	public abstract void left(float angle);

	/** Rota el carro hacia la derecha la cantidad de grados indicada
	 * @param angle Grados a rotar el carro hacia la derecha
	 */
	public abstract void right(float angle);

}
