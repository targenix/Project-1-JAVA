import java.util.Arrays;
import java.util.Scanner;

public class Tournament{
	private String TournamentName;
	private int year;
	private Team[] teams=new Team[10];
	private int Teamcounter;
	public Tournament()
	{
		Teamcounter=0;
	}
	public Tournament(String tournamentName, int year, Team[] teams, int teamcounter) {
		super();
		TournamentName = tournamentName;
		this.year = year;
		this.teams = teams;
		Teamcounter = teamcounter;
		Teamcounter=0;
	}
	public String getTournamentName() {
		return TournamentName;
	}
	public void setTournamentName(String tournamentName) {
		TournamentName = tournamentName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Team[] getTeams() {
		return teams;
	}
	public void setTeams(Team[] teams) {
		this.teams = teams;
	}
	public int getTeamcounter() {
		return Teamcounter;
	}
	public void setTeamcounter(int teamcounter) {
		Teamcounter = teamcounter;
	}
	@Override
	public String toString() {
		return super.toString() +"Tournament [TournamentName=" + TournamentName + ", year=" + year + ", teams=" + Arrays.toString(teams)
				+ ", Teamcounter=" + Teamcounter + "]";
	}
	public void addTeam()
	{
		Scanner sc=new Scanner(System.in);
		teams[Teamcounter]=new Team();
		System.out.println("Team name and CEO ");
		teams[Teamcounter].setTeamname(sc.next());
		teams[Teamcounter].setCEO(sc.next());
		System.out.println("Enter no.of Players");
		int nop=sc.nextInt();
		for(int i=0;i<nop;i++)
			teams[Teamcounter].addPlayer();
		Teamcounter++;
		
	}
	public void display()
	{
		System.out.println("TournamentName: "+TournamentName);
		System.out.println("Year: "+year);
		for(int i=0;i<Teamcounter;i++)
		{
			teams[i].displayteam();
		}
	}
	
	
}