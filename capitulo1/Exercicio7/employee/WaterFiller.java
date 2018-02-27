package employee;

//letra B imprime FALSE, pois a classe WATER eh trazida do AQUARIUM.WATER
//import aquarium.Water;
//import aquarium.jellies.*;

//letra C imprime true pois a classe Water é trazida de JELLIES.WATER
//import aquarium.*;
//import aquarium.jellies.Water;

//letra D dá conflito pois ambos wildcards contém uma classe water
//import aquarium.*;
//import aquarium.jellies.*;

//letra E dá conflito porque ambos FQCN (Fully Qualified Class Names) contém a msm classe
//import aquarium.Water;
//import aquarium.jellies.Water;


public class WaterFiller {

	public static void main(String[] args){
		Water water = new Water();
	}
}