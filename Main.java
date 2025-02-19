import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        List<Voador> voadores = new ArrayList<>();
        povoandoListaVoadores(voadores);
        voaTodosVoadores(voadores);
        planaTodosVoadores(voadores);
        pousaTodosVoadores(voadores);

    }

    private static void pousaTodosVoadores(List<Voador> voadores) {
        for(Voador voador : voadores)
        {
            voador.pousar();//chamadas polimórficas
        }
    }

    private static void planaTodosVoadores(List<Voador> voadores) {
        for(Voador voador : voadores)
        {
            voador.planar();//chamadas polimórficas
        }
    }

    private static void voaTodosVoadores(List<Voador> voadores) {
        for(Voador voador : voadores)
        {
            voador.voar();//chamadas polimórficas
        }
    }

    private static void povoandoListaVoadores(List<Voador> voadores) {
        for(int i = 0; i < 10; i++)
        {
            voadores.add(gerandoClassesVoadores());
        }
    }

    private static Voador gerandoClassesVoadores() {
        Random r = new Random();
        int escolhaClasse = r.nextInt(3);
        if (escolhaClasse == 0)
        {
            return new Pato("preto", true);
        }
        else if (escolhaClasse == 1)
        {
            return new Drone("Sansung");
        }
        else
        {
            return new GalinhaVoadora();
        }
    }
}
