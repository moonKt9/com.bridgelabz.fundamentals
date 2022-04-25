class Test5
{
int i;
public Test5(int k)
{
i=k;
}
public Test5(int k,int m )
{
System.out.println("Hi i am mary");
if(k>m)
{
i=k;
}
else
{
i=m;
}
}
}
public class Main
{
public static void main(String args[])
{
Test5 test1=new Test5(10);
Test5 test2=new Test5(12,15);
System.out.println(test1.i);
System.out.println(test2.i);
}
}


