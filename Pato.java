public class Pato implements Voador{
    String cor;
    boolean sexoM;

    public Pato(String cor, boolean sexoM) {
        this.cor = cor;
        this.sexoM = sexoM;
    }

    public boolean isSexoM() {
        return sexoM;
    }

    public String getCor() {
        return cor;
    }

    public void barulho()
    {
        System.out.println("Qua Qua!");
    }
    @Override
    public double voar() {
        System.out.println("Voa voa Pato");
        return 0;
    }

    @Override
    public void planar() {
        System.out.println("Plana pato");

    }

    @Override
    public boolean pousar() {
        System.out.println("Pousa pato");
        return false;
    }

}