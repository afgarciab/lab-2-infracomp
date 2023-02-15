public class Main {
    public static void main(String[] args) {
        System.out.println("el programa va a iniciar");
        Pastel pastel = new Pastel();
        Pastelero pastelero = new Pastelero(pastel);
        Cliente cliente= new Cliente(pastel);
        cliente.start();
        pastelero.start();
    }
}