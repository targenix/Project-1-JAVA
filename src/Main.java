import java.util.Scanner;

public class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Tournament tournament=new Tournament();
		System.out.println("Enter Tournament name and year: ");
		tournament.setTournamentName(sc.next());
		tournament.setYear(sc.nextInt());
		int choice;
		do {
			System.out.println("Enter 1--Add Team, 2-- Display Team, 3--Exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				tournament.addTeam();
				break;
			case 2:
				tournament.display();
				break;
			case 3:
				break;
			}
		}while(choice!=3);
		
	}
}