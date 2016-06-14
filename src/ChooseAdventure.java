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
		String result1Ba= "";
		String result1B= "";
		String result2B= "";
		String result2B1= "";
		String result2d1= "";

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
		// Option 1
		if (result.contains("difference")) {
			do{
				System.out.println("You should choose to \"Sit down.\" or \"Eat bugs.\" ");
				result2d = input.nextLine();
			
				switch (result2d) {								//options for 'less traveled'- second prompt
					case "Sit down.":
						result21 = "You sat in a field of sleepy poppies. You are in an unbreakable trance. You die! Game over!";
						break;
					case "Eat bugs.":
						result21 = "You ate a magical little beatle who has a big brother. He wants to fight you. ";
						break;
					default:
						result21 = "Please choose FIGHT OR SURRENDER";
						break;
				}
				System.out.println(result21);
			} while (result21.contains("choose"));
		}
		//OPTION 2
		else if(result.contains("same")){
			do{
				System.out.println("You should choose to \"Stay boring.\" or \"Pick thy nose.\". ");
				result2s = input.nextLine();
			
				switch (result2s) {							//options for 'more traveled- also second prompt
					case "Stay boring.":
						result22 = "You are the boring-est!";
						break;
					case "Pick thy nose.":
						result22 = "You have encountered a Booger troll.";
						break;
					default:
						result22 = "Please choose to \"Stay boring!\" or \"Pick thy nose.\"";
						break;
				}
				System.out.println(result22);
			}while (result22.contains("choose"));
		}
		//OPTION 1b
		if (result21.contains("beatle")) {
			do{
				System.out.println("You can \"Fight!\" or \"Surrender.\" ");
				result1B = input.nextLine();
			
				switch (result1B) {								//options for 'less traveled'- second prompt
					case "Fight!":
						result1Ba = "You lost the fight to BIG BROTHER BEATLE. You Died. Game over!";
						break;
					case "Surrender.":
						result1Ba = "You are now BIG BROTHER BEATLE's slave for eternity.";
						break;
					default:
						result1Ba = "Please choose one or the other (Fight! or Surrender.), BUM!";
						break;
				}
				System.out.println(result1Ba);
			} while (result1Ba.contains("choose"));
		}
		
			
		
		//OPTION 2A
				if (result22.contains("boring")) {
					do{
						System.out.println("You can \"Continue.\" or \"Twiddle thy thumbs!\"");
						result2d = input.nextLine();
					
						switch (result2d) {								//options for 'less traveled'- second prompt
							case "Continue.":
								result2d1 = "You are still walking on a road. You have to walk forever and die of exhaustion. Game over.";
								break;
							case "Twiddle thy thumbs!":
								result2d1 = "What to do now? You die of boredom. Game over.";
								break;
							default:
								result2d1 = "Please choose \"Continue.\" or \"Twiddle thy thumbs!\"";
								break;
						}
						System.out.println(result2d1);
					} while (result2d1.contains("choose"));
				}
				//OPTION 2B
				else if(result22.contains("Booger")){
					do{
						System.out.println("You should choose to \"Pay the booger toll to the Booger Troll.\" or \"Bop the troll in the nose.\". ");
						result2B = input.nextLine();
					
						switch (result2B) {							//options for 'more traveled- also second prompt
							case "Pay the booger toll to the Booger Troll.":
								result2B1 = "You cross a booger bridge, slip and fall into the booger river and die. Game over.";
								break;
							case "Bop the troll in the nose.":
								result2B1 = "The troll slimes you like in Nickelodeon-times. You choke on slime and die. Game over.";
								break;
							default:
								result2B1 = "Please choose \"Pay the booger toll to the Booger Troll.\" or \"Bop the troll in the nose.\".!";
								break;
						}
						System.out.println(result2B1);
				
		}while (result2B1.contains("choose"));
				}
		input.close();

	}
}

