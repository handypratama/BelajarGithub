package ulertangga;

public class getset {
	private int dice;
	private int Tanda;
	private int Geser;

	public int getdice() {
		return dice;
	}
	public void setdice(int dice) {
		dice = dice;
	}
	public int getTanda() {
		return Tanda;
	}
	public void setTanda(int Tanda) {
		Tanda = Tanda;
	}
	public int getGeser() {
		return Geser;
	}
	public void setGeser(int Geser) {
		Geser = Geser;
	}
	public getset(int dice2 , int Tanda2 , int Geser2) {
		super();
		dice = dice2;
		Tanda = Tanda2;
		Geser = Geser2;
	}

}
