
public class TeaParty {
	
	private String name;
	private boolean isWoman;
	private boolean isKnighted;

       public welcome(String name, boolean isWoman, boolean isKnighted)
       {
    	   		this.name = name;
    	   		this.isWoman = isWoman;
    	   		this.isKnighted = isKnighted;
       }
       
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
       
       void String welcome(String name, boolean isWoman, boolean isknighted) {
    	   		if(isWoman == true) {
    	   			if(isKnighted == true) {
    	   				return "Hello lady " + name;
    	   			}
    	   			
    	   		}
       }
       
       
}