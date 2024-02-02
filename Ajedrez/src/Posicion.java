public class Posicion {

    protected int fila;
    protected int columna;

    /**
     * método que devuelve el valor de la fila de la posición
     * @return fila que tiene la posición
     */
    public int getFila() {
        return fila;
    }

    /**
     *
     * @param fila nueva
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

}
