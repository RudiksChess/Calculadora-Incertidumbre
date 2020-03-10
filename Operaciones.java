
public class Operaciones {
	
	private float x;
	private float y; 
	private float xi;
	private float yi; 
	
	public Operaciones(){
		x = 0;
		y = 0;
		xi = 0;
		yi = 0;
	}
	

	public Operaciones(float x, float y, float xi, float yi) {
		this.x = x;
		this.y = y;
		this.xi = xi;
		this.yi = yi;
	}





	public float Suma(){
		float cadena = 0;
		
		cadena = x+y;
		
		return cadena;
	}
	
	public float SumaI(){
		float cadena = 0;
		
		cadena = xi+yi;
		
		return cadena;
	}
	
	
	
	
	public float Resta(){
		float cadena = 0;
		
		cadena = x-y;
		
		return cadena;
	}
	
	public float RestaI(){
		float cadena = 0;
		cadena = xi+yi;
		
		return cadena;
	}
	
	
	
	
	public float Multiplicacion(){
		float cadena = 0;
		
		cadena = x*y;
		
		return cadena;
	}
	
	
	public float MultiplicacionI(){
		float cadena = 0;
		
		cadena = (x*y)*((xi/x)+(yi/y));

		
		return cadena;
	}
	
	public float Division(){
		float cadena = 0;
		cadena = x/y;

		
		return cadena;
	}
	public float DivisionI(){
		float cadena = 0;
		
		cadena = (x/y)*((xi/x)+(yi/y));

		return cadena;
	}

	
}
