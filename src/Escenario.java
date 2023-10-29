public class Escenario extends Thread {

    private boolean cantante;

    public Escenario() {
        this.cantante = false;
    }

    public boolean isCantante() {
        return cantante;
    }

    public void setCantante(boolean cantante) {
        this.cantante = cantante;
    }

    @Override
    public void run() {
        super.run();

        Cantante cantante1 = new Cantante(this,"Angel");
        Cantante cantante2 = new Cantante(this,"Dani");
        Cantante cantante3 = new Cantante(this,"Raul");
        Musico musico1 = new Musico("Joni");
        Musico musico2 = new Musico("Lucas");
        Musico musico3 = new Musico("Leo");

        cantante1.start();
        cantante2.start();
        cantante3.start();
        musico1.start();
        musico2.start();
        musico3.start();


    }
}
