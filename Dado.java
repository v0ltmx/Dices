/*
 * Códigos gerados para ensino
 */
package jogodados;

public class Dado {

    private int valorFace;

    public int getValorFace() {
        return valorFace;
    }

    public void setValorFace() {
        valorFace = (int) (1 + Math.random() * 6);
    }

}
