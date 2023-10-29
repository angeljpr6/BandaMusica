public class Musico extends Thread {

    private String nombre;

    public Musico(String nombre) {
        this.nombre = nombre;
    }

    public synchronized void tocarMusica(){
        System.out.println(nombre+" ha empezado a tocar");
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(nombre+" ha dejado de tocar");

    }

    @Override
    public void run() {
        super.run();
        tocarMusica();
    }
}
