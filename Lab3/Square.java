package menu;

import java.util.Scanner;

public class Square {
	private int x;
	private int y;
	
	public Square(int a, int b)
	{
		this.setX(a);
		this.setY(b);
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int path(int x, int y)
	{
		if(x<y)
			return y-x;
		else
			return x-y;
	}
	public void paintSquare(int x, int y)
	{
		int i;
		int j;
			
		for(i=x+1;i<=y;i++)
		{
			for(j=x+1;j<=y;j++)
				System.out.print("*");
			System.out.println();
		}
		
	}
	
	public void modifySquare()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduceti noile coordonate");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int i;
		int j;
		for(i=x+1;i<=y;i++)
		{
			for(j=x+1;j<=y;j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public void removeSquare()
	{
		System.out.println("Patratul a fost sters");
	}
	
	
}
