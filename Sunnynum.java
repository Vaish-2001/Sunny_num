class Sunnynum
 {
  /*A number is called a sunny number if the number
   next to the given number is a perfect square.
  */
  public static void main(String[]args)
   {
    int num=4;
    int result=1;
    int i =1;
    while(result<=num)
     {
      if(result==num)
       {
        System.out.println("it is sunny square");
        break;
       }
       result=i*i;
       i++;
       num=num+1;
    }
   if(result>num)
    {
      System.out.println("it is not sunny square");
    }
  }
 }
      