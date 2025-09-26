import java.io.*;
class SimpleInterest
{
   public static void main(String args[])throws Exception
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int P,T,R;
      float I;
      P=Integer.parseInt(br.readLine());
      T=Integer.parseInt(br.readLine());
      R=Integer.parseInt(br.readLine());
      I=(float)(P*T*R)/100;

      System.out.println(I);

    }
}