import java.util.Arrays;
import java.util.Scanner;

public class Team{
	private String Teamname;
	private String CEO;
	private Player[] players=new Player[20];
	private int playercounter;
	public Team()
	{
		playercounter=0;
	}
	public Team(String teamname, String cEO, Player[] players, int playercounter) {
		super();
		Teamname = teamname;
		CEO = cEO;
		this.players = players;
		this.playercounter = playercounter;
		playercounter=0;
	}
	public String getTeamname() {
		return Teamname;
	}
	public void setTeamname(String teamname) {
		Teamname = teamname;
	}
	public String getCEO() {
		return CEO;
	}
	public void setCEO(String cEO) {
		CEO = cEO;
	}
	public Player[] getPlayers() {
		return players;
	}
	public void setPlayers(Player[] players) {
		this.players = players;
	}
	public int getPlayercounter() {
		return playercounter;
	}
	public void setPlayercounter(int playercounter) {
		this.playercounter = playercounter;
	}
	@Override
	public String toString() {
		return super.toString() + "Team [Teamname=" + Teamname + ", CEO=" + CEO + ", players=" + Arrays.toString(players)
				+ ", playercounter=" + playercounter + "]";
	}
	public void addPlayer()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 -- batsman ,2 -- bowler, 3 -- wicketkeeper");
		int choice=sc.nextInt();
		if(choice==1)
		{
			players[playercounter]=new BatsMan();
			players[playercounter].read();
		}
		else if(choice==2)
		{
			players[playercounter]=new bowler();
			players[playercounter].read();
		}
		else if(choice==3)
		{
			players[playercounter]=new wicketkeeper();
			players[playercounter].read();
		}
		playercounter++;
	}
	public void displayteam()
	{
		System.out.println("Team Name: "+ Teamname);
		System.out.println("CEO: "+ CEO);
		for(int i=0;i<playercounter;i++)
		{
			System.out.println(players[i]);
			}
	}
	
}