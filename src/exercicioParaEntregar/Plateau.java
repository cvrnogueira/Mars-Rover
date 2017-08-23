package exercicioParaEntregar;

public class Plateau {
	private double[][] plateau;
	private int height;
	private int width;
	
	public Plateau(int height, int width){
		this.height = height;
		this.width = width;
		plateau = new double[height][width];
	}
	public int height(){
		return height;
	}
	public int width(){
		return width;
	}
	
}
