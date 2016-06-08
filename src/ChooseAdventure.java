import java.util.Scanner;

public class ChooseAdventure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Two roads diverged in a yellow wood and sorry, you can't pick both!");

		String result = "";							//declare and initialize all strings for following use inputs
		String result2d = "";
		String result21 = "";
		String result2s = "";
		String result22 = "";

		do {
			System.out.println("Please choose your road.\n  \"The one less traveled by!\" \n  \"The one more traveled by!\"");
			String road = input.nextLine();

			switch (road) {											 //options for first prompt
				case "The one less traveled by!":						
					result = "That has made all the difference.\r\n";
					break;
				case "The one more traveled by!":
					result = "Everything is the same!\r\n";
					break;
				default:
					result = "You are not on a road you are lost!\r\n";
					break;
				}
				System.out.println(result);
			} while (result.contains("not"));

		if (result.contains("difference")) {
			do{
				System.out.println("You should choose to \"Sit down.\" or \"Eat bugs\". ");
				result2d = input.nextLine();
			
				switch (result2d) {								//options for 'less traveled'- second prompt
					case "Sit down.":
						result21 = "I think you sat in poop.";
						break;
					case "Eat bugs.":
						result21 = "Yum! Protein!";
						break;
					default:
						result21 = "Please choose another option on your different road!";
						break;
				}
				System.out.println(result21);
			} while (result21.contains("another"));
		}
		
		else if(result.contains("same")){
			do{
				System.out.println("You should choose to \"Stay boring.\" or \"Pick thy nose.\". ");
				result2s = input.nextLine();
			
				switch (result2s) {							//options for 'more traveled- also second prompt
					case "Stay boring.":
						result22 = "Take a nap.";
						break;
					case "Pick thy nose.":
						result22 = "Yum! Protein!";
						break;
					default:
						result22 = "Please choose another option on your same road!";
						break;
				}
				System.out.println(result22);
			}while (result22.contains("another"));
		}
		
		else {
			System.out.println("This isn't how that works");
			
		}

		 

		input.close();

	}
}

