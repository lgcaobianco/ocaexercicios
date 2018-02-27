public class InstanceVar{
	public double valorDouble;
	public int valorInt;
	public String valorString;
	public boolean valorBoolean;

	public static void main(String[] args){
		InstanceVar var = new InstanceVar();

		System.out.println("Default de Double: " + var.valorDouble + ";");
		System.out.println("Default de int: " + var.valorInt + ";");
		System.out.println("Default de String: " + var.valorString + ";");
		System.out.println("Default de Boolean: " + var.valorBoolean + ";");

	}
}