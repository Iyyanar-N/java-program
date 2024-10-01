//Main class
import addition.Add;
import subtraction.Sub;
import multiplication.Mul;
import division.Div;
import java.io.*;
public class Mypack{
public static void main(String [] args)throws IOException {
Add a = new Add();
a.getdata();
Sub s = new Sub();
s.getdata();
Mul m = new Mul();
m.getdata();
Div d = new Div();
d.getdata();
}
}

//Add class
package addition;
import java.io.*;
public class Add
{
int a,b,c;
DataInputStream dis = new DataInputStream(System.in);
public void getdata() throws IOException
{
System.out.println("Addition");
System.out.println("Enter a value:");
a=Integer.parseInt(dis.readLine());
System.out.println("Enter b value:");
b=Integer.parseInt(dis.readLine());
c=a+b;
System.out.println(a + " + " + b +" = " + c);
}
}

//Sub class
package subtraction;
import java.io.*;
public class Sub
{
int a,b,c;
DataInputStream dis = new DataInputStream(System.in);
public void getdata() throws IOException
{
System.out.println("Subtraction");
System.out.println("Enter a value:");
a=Integer.parseInt(dis.readLine());
System.out.println("Enter b value:");
b=Integer.parseInt(dis.readLine());
c=a-b;
System.out.println(a + " - " + b+ " = " + c);
}
}

//Mul class
package multiplication;
import java.io.*;
public class Mul
{
int a,b,c;
DataInputStream dis = new DataInputStream(System.in);
public void getdata() throws IOException
{
System.out.println("Multiplication");
System.out.println("Enter a value:");
a=Integer.parseInt(dis.readLine());
System.out.println("Enter b value:");
b=Integer.parseInt(dis.readLine());
c=a*b;
System.out.println(a + " * " + b +" = " + c);
}
}

//Div class

package division;
import java.io.*;
public class Div
{
int a,b,c;
DataInputStream dis = new DataInputStream(System.in);
public void getdata() throws IOException
{
System.out.println("Division");
System.out.println("Enter a value:");
a=Integer.parseInt(dis.readLine());
System.out.println("Enter b value:");
b=Integer.parseInt(dis.readLine());
c=a/b;
System.out.println(a + " / " + b + " = " + c);
}
}

