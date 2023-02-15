import java.util.concurrent.ThreadLocalRandom;

public class Pastelero extends Thread{

    private Pastel pastel;

    public Pastelero(Pastel pPastel)
    {
        pastel=pPastel;
    }
    public void revisar()
    {
        while (pastel.consultarEstadoPedido()==false)
        {
            try {
                System.out.println("el cliente aun no se decide");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
                System.out.println("verificando detalles del pedido");
                System.out.println(pastel.consultarDetallesPedido());
                Thread.sleep(ThreadLocalRandom.current().nextInt(5,16));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void run() {
        revisar();
    }
}
