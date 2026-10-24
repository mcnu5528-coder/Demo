import java.io.*;
class ReadInput
{
   public static void main(String args[])throws Exception
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int x,y,z;
       x=Integer.parseInt(br.readLine());
       y=Integer.parseInt(br.readLine());
       z=x+y;
       System.out.println(z);
       //String name=br.readLine();
       //System.out.println(name);
   }

}
