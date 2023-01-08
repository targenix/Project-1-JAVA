import java.util.Scanner;

public class wicketkeeper extends BatsMan
{
	private int catches;
	private int stumps;
	public wicketkeeper()
	{
	
	}
	public wicketkeeper(int catches, int stumps) {
		super();
		this.catches = catches;
		this.stumps = stumps;
	}
	public int getCatches() {
		return catches;
	}
	public void setCatches(int catches) {
		this.catches = catches;
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
		System.out.println("Enter number of Catches");
		catches=sc.nextInt();

	}
	
}