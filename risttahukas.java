public class risttahukas{

	double a, b, c;
	public risttahukas(double pikkus, double laius, double k6rgus){
	
		a = pikkus;
		b = laius;
		c = k6rgus;
		
	}
	
	public double p6hjaPindala(){
	
		return a*b;
		
	}
	
	public double Ruumala(){

		return a*b*c;
	
	}
	
	public String toString(){
	
		return "Risttahuka("+a+", "+b+", "+c+
			")p6hjapindala: "+p6hjaPindala()+
			" ja ruumala: "+Ruumala();
	
	}
	

}