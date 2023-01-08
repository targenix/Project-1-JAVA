import java.util.Scanner;

public class bowler extends BatsMan
{
	private int over;
	private int wicket;
	public  bowler()
	{
		
	}
	public bowler(int over, int wicket) {
		super();
		this.over = over;
		this.wicket = wicket;
	}
	public int getOver() {
		return over;
	}
	public void setOver(int over) {
		this.over = over;
	}
	public int getWicket() {
		return wicket;
	}
	public void setWicket(int wicket) {
		this.wicket = wicket;
	}
	@Override
	public String toString() {
		return super.toString() + "bowler [over=" + over + ", wicket=" + wicket + "]";
	}
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		super.read();
		System.out.println("Enter overs");
		over=sc.nextInt();
		System.out.println("Enter number of wickets");
		wicket=sc.nextInt();
		
	}
}