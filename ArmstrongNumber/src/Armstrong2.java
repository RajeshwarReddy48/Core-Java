public class Armstrong2
{
             public static void main (String [] args)
             {
                   //Program to find Armstrong number from 100 to 999
                   //153, 370, 371, 407

                    for (int number = 100 ; number <= 999 ; number++)
                     {
                        int originalNumber = number, remainder = 0;
                        double result = 0;

                          while (originalNumber != 0)
                              {
                                remainder = originalNumber % 10;
                                result = result + Math.pow(remainder, 3);
                                originalNumber = originalNumber / 10;
                              }
                          if (number == result)
                              {
                                	 
                                System.out.println (number + " is an Armstrong number");
                              }
                        /*  else
                          {
                        	  System.out.println (number + " is Not an Armstrong number");
                          }*/
                       }
             }
}
