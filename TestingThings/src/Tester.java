


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String getSessionAttribute = "a,s,df:as,dfs,d:";
		String[] data = null ;
		String[] sessionAttrinutes = getSessionAttribute.split(":");
		for (String sessObj : sessionAttrinutes) {
			 data  = sessObj.split(",");
			
		}
		
		for (int i =0; i<data.length;i++){
			System.out.println(data[i]+", ");
		}
		System.out.println("---------------------");
		for (int i =0; i<sessionAttrinutes.length;i++){
			System.out.println(sessionAttrinutes[i]+", ");
		}
		
		System.out.println(" "+getSessionAttribute.indexOf("df"));
	}

}
