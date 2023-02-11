
public class EjThreads01b extends Thread{

	private String name;

	public EjThreads01b(String name) {
		System.out.println("extendiendo la clase thread");
		this.name = name;
	}
	public void run() {
		System.out.println("el nombre del thread es: "+ name);
	}
	public static void main(String[] args) {
		EjThreads01b t1= new EjThreads01b("Thread "+ 1);
		EjThreads01b t2= new EjThreads01b("Thread "+ 2);
		EjThreads01b t3= new EjThreads01b("Thread "+ 3);
		t1.start();
		t2.start();
		t3.start();
	}
	
	
}
