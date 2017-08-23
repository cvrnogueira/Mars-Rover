package exercicioParaEntregar;

public class Robot {

	private int X;
	private int Y;
	private String direction;
	
	public Robot(int X, int Y, String direction){
		this.X = X;
		this.Y = Y;
		this.direction = direction;
	}
	public int getDirectionX(){
		return X;
	}
	public int getDirectionY(){
		return Y;
	}
	public String getDirection(){
		return direction;
	}
	public void incX(){
		X++;
	}
	public void incY(){
		Y++;
	}
	public void spin(String newDirection){
		direction = newDirection;
	}
}
