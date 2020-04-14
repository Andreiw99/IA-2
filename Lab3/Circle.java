package menu;

import java.util.Scanner;

public class Circle
{
    static int r_num, 
max = 20, min = 4;
    public Circle (int r_num)
    {
    	Circle.r_num = r_num;

    }
    private static int Path(int x, int y)
{
        return (int) (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }
     
    public  void paint(int r_num)
{      
        int width = r_num;
        int length = (int) (width * 1.5);
        int y = width;
        while (y >= - width) {
            int x = - length;
            while (x <= length) {
                if(Path(x, y) == r_num){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                x += 1; 
            }
            System.out.println();
            y -= 2;
        }
        
    }
    
    public  void modifyCircle()
    {      
    		Scanner scan = new Scanner (System.in);
    		System.out.print("Introduceti raza noului cercului");
    		int r_num = scan.nextInt();
  
            int width = r_num;
            int length = (int) (width * 1.5);
            int y = width;
            while (y >= - width) {
                int x = - length;
                while (x <= length) {
                    if(Path(x, y) == r_num){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    x += 1; 
                }
                System.out.println();
                y -= 2;
            }
            
        }
    
    public void removeCircle()
    {
    	System.out.println("Cercul a fost sters");
    }
}
