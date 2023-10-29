public class Cantante extends Thread {

    private Escenario escenario;
    private String nombre;

    public Cantante(Escenario escenario, String nombre) {
        this.escenario = escenario;
        this.nombre = nombre;
    }

    public synchronized void cantar(){
        while(escenario.isCantante()){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        escenario.setCantante(true);
        System.out.println(nombre+" ha empezado a cantar");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(nombre+" ha dejado de cantar");
        escenario.setCantante(false);
        notifyAll();
    }

    @Override
    public void run() {
        super.run();
        cantar();
    }
}
