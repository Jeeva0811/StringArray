public class OnlyString
{
public static void main(String args[])
{
String words="Mathematics Optics Phonics";
for(int i=0;i<words.length();i=i+1)
{
if(words.charAt(i)==(' '))
{
System.out.println();
}
else
{
System.out.print(words.charAt(i));
}
}
}
}
