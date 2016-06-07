import java.util.Scanner; 


public class ChooseAdventure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Two roads diverged in a yellow wood and sorry you can't pick both!");
		System.out.println("Please choose your road.\n 1. The one less traveled by! \n 2. The one more traveled by!");
		
		String road = input.nextLine();
		String result = "";
		
		switch (road){
			case "The one less traveled by!":
				result = "That has made all the difference.";
				break;
			case "The one more traveled by!":
				result = "Everything is the same!";
				break;
			default:
				result = "You are not on a road you are lost!";
				break;
		}
		
		System.out.println(result);
		
		input.close();
		
		
		
	}
	

}
