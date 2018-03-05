public class Ex6{
	public static void main(String[] args){
		int x=4;
		long y = x * 4 - x++;
		if(y<10) System.out.println("Too Low");
		else System.out.println("Just right");

		System.out.println("Y: " + y + "; X: "+ x);
	}
} 