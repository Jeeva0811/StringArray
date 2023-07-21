public class StringToArray
{
public static void main(String args[])
{
String s="Malayalam";
char c[]=new char[s.length()];
for(int i=0;i<c.length;i=i+1)
{
c[i]=s.charAt(i);
System.out.println(c[i]);
}

}
}
