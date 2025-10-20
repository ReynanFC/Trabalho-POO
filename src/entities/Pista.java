package entities;

public class Pista {

    private int tamanho;

    public Pista(){}

    public Pista(int tamanho){
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void bordaDaPista() {
        System.out.print( "▒".repeat(tamanho));
        System.out.println("🏁");
    }
}
