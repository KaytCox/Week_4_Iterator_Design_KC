package cookieMenu;

public class menuBoard {

	   public static void main(String[] args) {  
		   cookieMenuItems cmpnyProducts = new cookieMenuItems();  
		   
		   System.out.println("The Cookie Corner");
		   System.out.println("The cookies in this menu are currently available.");
		   System.out.println(" ");
	            
	          for(cookieOrder iter = cmpnyProducts.getcookieInventory(); iter.hasNext();){  
	              String name = (String)iter.next(); 
	              System.out.println("Cookie Type : " + name);  
	           }      
	    }  
	} 
