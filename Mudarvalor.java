public class Main {
    public static void main(String[] args) {
        Bloco b1 = new Bloco();
        
        b1.setValor("10");
        System.out.println("Valor do bloco: " + b1.getValor());

        bloco.setValor("20");
        System.out.println("Novo valor do bloco: " + b1.getValor());
    }
}


class Bloco {
    private String valor;
    
    public String getValor() {
        return valor;
    }
    
    public void setValor(String valor) {
        this.valor = valor;
    }
}
