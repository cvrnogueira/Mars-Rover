package exercicioParaEntregar;

public class Print {

	public static void print(Plateau plateau){ //ser estático
		for(int i=0; i< plateau.height(); i++){
			for(int j=0; j< plateau.width(); j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void robotPosition(int posX, int posY, Plateau plateau){
		for(int x=0; x< plateau.height(); x++){
			for(int y=0; y< plateau.width(); y++){
				if(x == posX && y == posY ){
					System.out.print("I");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
