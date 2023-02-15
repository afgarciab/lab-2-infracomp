public class Cliente extends Thread{

    private Pastel pastel;

    public Cliente(Pastel pPastel)
    {
        pastel=pPastel;
    }
    public void configurarPastel(){
        System.out.println("el cliente va a hacer el pedido");
        pastel.hacerPedido(5,5,"chocolate","cafe");

        System.out.println("el cliente recibe el pastel");
        System.out.println("final del programa");
    }

    @Override
    public void run() {
        configurarPastel();
    }
}
