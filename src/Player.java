import java.util.Scanner;

public class Player {
	private int pid;
	private String name;
	public Player() {
		
	}
	public Player(int pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Player [pid=" + pid + ", name=" + name + "]";
	}
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter player id and name");
		pid=sc.nextInt();
		name=sc.next();
	}
	
	
}