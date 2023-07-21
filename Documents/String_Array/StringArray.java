public class StringArray
{
public static void main(String args[])
{
String words="Mathematics Optics Phonics";
String a[]=words.split(" ");
for(int i=0;i<a.length;i=i+1)
{
System.out.println(a[i]);
}
}
}
