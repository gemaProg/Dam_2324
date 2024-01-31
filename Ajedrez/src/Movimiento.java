public class Movimiento {
    private Posicion posIni;
    private Posicion posFin;

    public boolean isVertical(){
        boolean respuesta = false;
        if (posIni.columna==posFin.columna)
            respuesta = true;
        return respuesta;
    }

    public int saltoHorizontal(){
        return posFin.columna- posIni.columna;

    }
}
