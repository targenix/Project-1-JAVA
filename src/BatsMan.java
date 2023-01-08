import java.util.Scanner;

public class BatsMan extends Player
{
	private int runs;
	private int hundreds;
	private int fifties;
	
	public BatsMan()
	{
		
	}

	public BatsMan(int runs, int hundreds, int fifties) {
		super();
		this.runs = runs;
		this.hundreds = hundreds;
		this.fifties = fifties;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getHundreds() {
		return hundreds;
	}

	public void setHundreds(int hundreds) {
		this.hundreds = hundreds;
	}

	public int getFifties() {
		return fifties;
	}

	public void setFifties(int fifties) {
		this.fifties = fifties;
	}

	@Override
	public String toString() {
		return super.toString() + "BatsMan [runs=" + runs + ", hundreds=" + hundreds + ", fifties=" + fifties + "]";
	}
	public void read()
	{
		super.read();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter runs,hundreds,fifties");
		runs=sc.nextInt();
		//System.out.println("Enter number of Hundreds");
		hundreds=sc.nextInt();
		//System.out.println("Enter number of Fifty");
		fifties=sc.nextInt();
		
	}
	
}