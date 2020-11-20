public class xygraphWIP.java
{
   public static void main(String[] args)
   
   {
      for (int j = 25; j >= -25; j--)
      {
         if (j == 0)
         {
   
            for (int i = -25; i <= 25; i++)
            {
               if (i % 5 == 0)
               {
                  
                  System.out.print(Math.abs(i/5) + " ");
               }
               else
               {
                  System.out.printf("- ");
               }
              
            }//end for
            System.out.println();
         }
         else
         {
            if (j % 5 == 0)
            {
               System.out.printf("%51d%n", Math.abs(j/5));
            }
            else
            {
               System.out.printf("%51s%n", "-");
            }
         }
      }//end for
      
   }//end main
   
}//end class