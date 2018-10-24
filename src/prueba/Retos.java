package prueba;

public class Retos {

	// ACTIVIDAD : Devolver el número menor de SIETE NÚMEROS
	// Subir a Git y luego descargar
		public static int calNumMenor(int x, int y, int z, int w) {
			if (x < y)
				if (x < z)
					if (x < w)
						return x;
					else
						return w;
				else
					if (z < w)
						return z;
				else 
					return w;
				else 
					
				if (y < z)
					if (y < w)
						return y;
					else 
						return w;
				else
					return z;
		}

		public static void main(String[] args) {
			//
			int a = 12, b = 4, c = 8, d = 20;

			System.out.println("el menor es : " + calNumMenor(a, b, c, d));
		
		
		}	
}
