public class Pastel {

    private int alto;

    private int radio;

    private String sabor;

    private String color_cubierta;

    private boolean estadoPedido=false;





    public synchronized void hacerPedido(int pAlto, int pRadio, String pSabor, String pColor )
    {
        alto=pAlto;
        radio=pRadio;
        sabor=pSabor;
        color_cubierta=pColor;
        estadoPedido=true;
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized String consultarDetallesPedido()
    {
        notify();
        return "el pastel tiene alto de: "+alto+" radio de: "+radio+" sabor de: "+sabor+" y color de cubierta: "+color_cubierta;
    }
    public synchronized boolean consultarEstadoPedido()
    {
        return estadoPedido;
    }
}
