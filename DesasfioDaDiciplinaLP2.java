import java.util.LinkedList;
import java.util.List;

public class DesasfioDaDiciplinaLP2 {
    public static void main(String[] args) {
        int[] cartas;
        Jogador[] jogadores = {new Jogador("Joao"), new Jogador("Maria"), new Jogador("Jose"), new Jogador("Raimundo"), new Jogador("Joana")};

        int quantidadeDeCartas = 52-52%jogadores.length;

        cartas = new int[quantidadeDeCartas];
        
        for(int i = 0; i < quantidadeDeCartas; i++){
            cartas[i] = i;
        }

        for(int i = 0; i < quantidadeDeCartas; i++){
            jogadores[i%jogadores.length].adicionarCarta(cartas[i]);
        }

        for(int i = 0; i < jogadores.length; i++){
            for(int carta: jogadores[i].getCartas()){
                System.out.println(jogadores[i].getNome() + ": " + carta);
            }
            System.out.println();
        }
    }
}

class Jogador{
    private String nome;
    private List<Integer> cartas;

    public Jogador(String nome){
        this.nome = nome;
        this.cartas = new LinkedList<>();
    }

    public List<Integer> getCartas() {
        return cartas;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarCarta(Integer carta){
        this.cartas.add(carta);
    }
}
