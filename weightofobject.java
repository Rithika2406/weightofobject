import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner S=new Scanner(System.in);
		int t=S.nextInt();
		while(t-->0)
		{
		    int w=S.nextInt();
		    int x=S.nextInt();
		    int y=S.nextInt();
		    int z=S.nextInt();
		    if(w==x || w==y || w==z || w==x+y || w==y+z || w==z+x||w==x+y+z)
		    {
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}

	}
}
