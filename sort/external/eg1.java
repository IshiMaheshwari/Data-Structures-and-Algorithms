import java.io.*;
import java.util.*;
class eg1psp
{
public static void main(String args[])
{
try
{
String fileName = "external-sort.txt";
Random rand = new Random();
FileWriter fw = new FileWriter(fileName);
PrintWriter pw = new PrintWriter(fw);
for (int i = 0; i <1000; i++) pw.println(rand.nextInt(10100));
pw.close();
}catch(IOException io)
{
io.printStackTrace();
}
}
}