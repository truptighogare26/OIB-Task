import java.io.*;
import java.lang.Math;
  
class Ans {

    // score calculation
    
    int sum=0;
    int cal=0;
 int marks(int differenec,int j)
    {
       if(differenec!=0){
           if(differenec<20){
                 
                    sum+=15*j;
                    
           }
          else if(differenec>20 && differenec <40){
                  sum+=10*j;
          }

          else if(differenec>40 && differenec <60){
                  sum+=5*j;

       }
                 else if(differenec>60 && differenec <80){
                  sum+=3*j;
          }
                           else if(differenec>80 && differenec <100){
                  sum+=2*j;
          }
          

          
       }
       else{
            sum+=50;
       }
            return sum;
     }
  
      public static void main(String args[])throws IOException{
           Ans ans=new Ans();
     
         
          // input from user

         
         InputStreamReader isr=new InputStreamReader(System.in);
         BufferedReader br  = new BufferedReader(isr);



           //     comparision part 

  for(int j=1;j<=10;j++){
          System.out.println("----------------------------------------------------------------------------------");
          System.out.println("welcome in "+j+" round ");
          System.out.println("----------------------------------------------------------------------------------");

                 int rand = 1+(int)(Math.random()*100);        //(int)(Math.random()*range);  
                 int num=rand;
              //System.out.println(rand);
     int count=0;
    for(int i=0;i<5;i++){
             int difference;
             System.out.println("\nenter number between 1-100:");
             int value=Integer.parseInt(br.readLine());
               System.out.println();

    
                       if(value>num)
                       {  
                                 difference=num-value;
                                  System.out.println("                 number is greater than expected value!!!");
                                  System.out.println("                 please try again!!");
                                  int cal=ans.marks(difference,j);
                                  System.out.println("score="+cal);
          System.out.println("----------------------------------------------------------------------------------");


                         }
                         else if(value<num)
                         {
                                   difference=num-value;
                                    System.out.println("                  number is smaller than expected value!!!");
                                    System.out.println("                  please try again");
                                    int cal=ans.marks(difference,j);
                                    System.out.println("score="+cal);
          System.out.println("----------------------------------------------------------------------------------");

                        }
                       else if(value==num)
                       {
                                    difference=num-value;
                                    int cal=ans.marks(difference,j);
                                    System.out.println("score="+cal);
                                    System.out.println("                    Guess is Right!!!");
                                    System.out.println("                    Congratulation!!!");
                                    count ++;
          System.out.println("----------------------------------------------------------------------------------");

                                     break;
            
                        } 
                     if(i==4){
                                   difference=num-value;
                                   int sum=ans.marks(difference,j);
                                    System.out.println("\n                Total score:"+sum);
                                    System.out.println("attemp are finished !!!");
                                    System.out.println("Dont loose hope try agian!!!");
                                    System.out.println("better Luck next time!!!");
                                    System.out.println("the number was: "+num);
                                    System.out.println("                Total score:"+sum);
                                    
                            }
       
                  }
       if(count>0){
          System.out.println("round "+j+" compeleted!!!");
          System.out.println("----------------------------------------------------------------------------------");
         
          
       }
      else
         break;	      



  }
         
    }
}
