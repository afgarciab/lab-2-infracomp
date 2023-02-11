import java.util.concurrent.ThreadLocalRandom;

/*
 * el ejercicio de la matriz 2 y 3 son el mismo porque el ejercicio 2 del taller dos pide precisamente 
 * lo que esta en las notas y lo hice sin querer.
 */
public class T extends Thread {
	
	private final static int INT_MAX = 105345;

	private final static int DIM=10;

	private static Maximo m;

	private static Identificar objId;
	
	private static int [][] mat =new int[DIM][DIM];

	@Override
	public void run() {

		int locMax = 0;
		int id = objId.darNumId();
		for (int j=0; j<mat[id].length; j++)
		{
			if (mat[id][j]>locMax)
			{
				locMax=mat[id][j];
			}
		}
		if(m.anotar(locMax))
		{
			System.out.println("Max: "+ m.darMaximo());
		}
	}
		public static void main(String[] args) 
		{
			int n=10;
			inicializar();
			objId = new Identificar();
			m =  new Maximo(n);
			
			for(int i=0; i<n; i++)
			{
				new T().start();
			}
			
		}
		private static void inicializar() {
			// TODO Auto-generated method stub
			for(int i=0;i<DIM; i++)
			{
				for(int j=0; j<DIM; j++)
				{
					mat[i][j]= ThreadLocalRandom.current().nextInt(0,INT_MAX); 
				}
			}
			System.out.println("Matriz:");
			System.out.println("=========================");
			imprimirMatriz();
		}
		
		private static void imprimirMatriz() 
		{
			for (int i=0; i<DIM; i++) 
			{
				for (int j = 0; j<DIM; j++) 
				{
					System.out.println(mat[i][j] + "\t");
				}
				System.out.println();
			}
		}

	

}
