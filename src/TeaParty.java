
public class TeaParty {
	
	private String name;
	private boolean isWoman;
	private boolean isKnighted;
	
       public String getName() {
    	   		return name;
       }
       
       public boolean isWoman() {
    	   		return isWoman;
       }
       
       public boolean isKnighted() {
    	   		return isKnighted;
       }
       
       public void setName(String name) {
    	   		this.name = name;
       }
       
       public void setisWoman(boolean isWoman) {
    	   		this.isWoman = isWoman;
       }
       
       public void setisKnighted(boolean isKnighted) {
    	   		this.isKnighted = isKnighted;
       }
       
       public String welcome(String name, boolean isWoman, boolean isKnighted) {
    	   		if(isWoman) {
    	   			if(isKnighted) {
    	   				return "Hello Lady " + name;
    	   			}
    	   			else {
    	   				return "Hello Ms. " + name;
    	   			}
    	   			
    	   		}
    	   		else {
    	   			if(isKnighted) {
    	   				return "Hello Sir " + name;
    	   			}
    	   			else {
    	   				return "Hello Mr. " + name;
    	   			}
    	   		}
       }
        
}