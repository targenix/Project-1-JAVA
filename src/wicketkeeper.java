import java.util.Scanner;

public class wicketkeeper extends BatsMan
{
	private int wickets;
	private int stumps;
	public wicketkeeper()
	{
	
	}
	public wicketkeeper(int wickets, int stumps) {
		super();
		this.wickets = wickets;
		this.stumps = stumps;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public int getStumps() {
		return stumps;
	}
	public void setStumps(int stumps) {
		this.stumps = stumps;
	}
	@Override
	public String toString() {
		return super.toString() +"wicketkeeper [wickets=" + wickets + ", stumps=" + stumps + "]";
	}
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		super.read();
		System.out.println("Enter stumps");
		stumps=sc.nextInt();
		System.out.println("Enter number of Wickets");
		wickets=sc.nextInt();

	}
	
}