package aquarium;

public class Tank { // como Tank e Water são do mesmo package, java procura no msm package por padrao
	public void print(Water water) {
		System.out.println(water); 
	} 
}