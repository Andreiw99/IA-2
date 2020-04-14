package menu;
import java.util.ArrayList;

public class Main {
	
	 private static Menu initializeMainMenu()
	    {
		 
		 	Circle t;
	        t = new Circle(0);
	        Square t1;
	        t1 = new Square(0, 0);
			ArrayList<IMenuItem> mainMenuItems = new ArrayList<IMenuItem>();
	        ArrayList<IMenuItem> addMenuItems = new ArrayList<IMenuItem>();
	        ArrayList<IMenuItem> removeMenuItems = new ArrayList<IMenuItem>();
	        ArrayList<IMenuItem> modifyMenuItems = new ArrayList<IMenuItem>();
	        addMenuItems.add(new MenuItem("Cerc", 1, (parameters)-> {t.paint(11);}));
	        addMenuItems.add(new MenuItem("Patrat", 2,(parameters)->{t1.paintSquare(2, 7);}));
	        removeMenuItems.add(new MenuItem("Cerc", 1,(parameters)-> {t.removeCircle();}));
	        removeMenuItems.add(new MenuItem("Patrat" ,2,(parameters)->{t1.removeSquare();}));
	        modifyMenuItems.add(new MenuItem("Cerc",1, (parameters)-> {t.modifyCircle();}));
	        modifyMenuItems.add(new MenuItem("Patrat", 2, (parameters)-> {t1.modifySquare();}));
	       
	        mainMenuItems.add(new Menu("Adaugare", 1,addMenuItems));
	        mainMenuItems.add(new Menu("Stergere", 2,removeMenuItems));
	        mainMenuItems.add(new Menu("Modificare", 3, modifyMenuItems));  
	        //mainMenuItems.add(new Menu("Decode", 1, ));
	        return new Menu("Main Menu", 0, mainMenuItems); 
	        
	        
	    }
	
	 public static void main(String[] args) {
	        
	        
	        Menu mainMenu = initializeMainMenu();           
	        mainMenu.execute();        
	        
	    
	    
	   
	   
	 }

		
}
