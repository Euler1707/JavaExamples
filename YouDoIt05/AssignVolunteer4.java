// YouDoIt

import java.util.Scanner;
public class AssignVolunteer4
{
   public static void main(String[] args)
   {
   
   int donationType;
   String volunteer;
   final int CLOTHING_CODE = 1;
   final int FURNITURE_CODE = 2;
   final int ELECTRONICS_CODE = 3;
   final int OTHER_CODE = 4;
   final String CLOTHING_PRICER = "Regina";
   final String OTHER_PRICER = "Marco";
   final String FURNITURE_PRICER ="Walter";
   final String ELECTRONICS_PRICER = "Lydia";
   String message;
   
   Scanner input = new Scanner(System.in);
   System.out.println("What type of donation is this?");
   System.out.println("Enter an integer... ");
   donationType = input.nextInt();
         
   
   switch(donationType)
   {
      case(CLOTHING_CODE):
         volunteer = CLOTHING_PRICER;
         message = "a clothing donation";
         break;
      case(FURNITURE_CODE):
         volunteer = FURNITURE_PRICER;
         message = "a clothing donation";
         break;
      case(ELECTRONICS_CODE):
         volunteer = ELECTRONICS_PRICER;
         message = "a clothing donation";
         break;
      case(OTHER_CODE):
         volunteer = OTHER_PRICER;
         message = "a clothing donation";
         break;
      default:
         volunteer = "invalid";
         message = "an invalid donatin type";                 
         
   }   
   System.out.println("You entered " + donationType);
   System.out.println("This is " + message);
   System.out.println("The volunteer who will price this item is " +
      volunteer);       
   
   
   }
}      