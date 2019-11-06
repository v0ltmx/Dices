/*
 * Códigos gerados para ensino
 */
package jogodados;

public class Principal {
   
    public static void main(String[] args) {
        Jogo j = new Jogo();
        j.inserirJogadores();
        j.inserirApostas();
        j.jogarDados();
        j.mostrarResultado();
        j.mostrarVencedor();
    }
    
}
