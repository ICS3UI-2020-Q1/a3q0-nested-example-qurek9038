import java.util.Scanner;
/**
 *This is the example code for nested if statements and switch statements
 * @author Khazina
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create the scanner for user input
    Scanner input = new Scanner(System.in);

    //Ask the user if the animal has feathers 
    System.out.println("Does this animal have feathers? yes/no");
    String feathers = input.nextLine();

    //Does the animal have feathers
    if(feathers.equals("yes")){
      //What colour are the feathers
      System.out.println("Are the feathers blue or red?");
      String featherColour = input.nextLine();
      //Check to see which colour they entered
      if(featherColour.equals("red")){
        System.out.println("This is a cardinal");
      {else if(featherColour.equals("blue")){
        System.out.println("This is a bluejay");
      }
    }else{
      //Fur or scales?
      System.out.println("Does the animal have scales or fur?");
      String outside = input.nextLine();

      //Scales?
      if(outside.equals("scales")){

      }else if(outside.equals("fur")){

      }
      //Switch case example
      //Vending machine code
      System.out.println("Please select a choice from 1 to 6");
      int choice = input.nextInt();
      if(choice == 1){

      }else if(choice == 2){

      }else if(choice == 3){

      }

      switch(choice){
        case 1:
        System.out.println("Here is your chocolate bar");
         break;
        case 2:
        System.out.println("Here is your bubble gum");
         break;
        case 3:
        System.out.println("Here is your candy");
         break;
        case 4:
        System.out.println("Here is your skittles");
         break; 
        default:
        System.out.println("That is an invalid choice");
         break;
      }
  }
}
