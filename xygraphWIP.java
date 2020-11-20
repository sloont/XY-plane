public class xygraphWIP
{
   public static void main(String[] args)   
   {
      int x = -2;
      int y = 4;
      boolean flag = true;
   
      for (int j = 25; j >= -25; j--)
      {
         if (j/5.0 == y)
         {
            for (int i = -25; i <= 25; i++)
            {
               if (i/5 == x && flag)
               {
                  flag = false;
                  int pointer = -5;
                  
                  while (pointer < x)
                  {
                    
                     System.out.print("          "); //10x space 
                     pointer++;
                  }
                  
                  System.out.printf("@ {%s,%s}%n", x, y);
               }
               
            }// end for
            
         }//end if

      
      
         else if (j == 0)
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
            if (j % 5 == 0 && j/5 != y)
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