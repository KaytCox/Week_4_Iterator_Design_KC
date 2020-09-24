package cookieMenu;

public class cookieMenuItems  implements cookieInventory {  
	public String name[]={"Sugar", "Chocolate Chip","Peanut Butter Sugar","Snickerdoodle","Brookie"};   
    
	@Override  
	    public cookieOrder getcookieInventory() {  
	        return new cookieMenuItemsIventory() ;  
	    }  
	    private class cookieMenuItemsIventory implements cookieOrder{  
	        int i;  

	        public boolean hasNext() {  
	            if (i<name.length){  
	                return true;  
	            }  
	            return false;  
	        }  
	 
	        public Object next() {  
	            if(this.hasNext()){  
	                return name[i++];  
	            }  
	            return null;      
	        }  
	    }  
	}  
