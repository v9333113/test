package xxx;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
public class test3 {

	 public static void main(String[] args) {
	  
	  //�n����������a�}
		 String ISBN=null;
		 //�իȨ�
		 Scanner scanner = new Scanner(System.in);
		 ISBN=scanner.nextLine();
		 String myurl = "http://findbook.tw/r/b/tw.books/"+ISBN;
		
		 URL urlmy = null;
		 HttpURLConnection con =null;
		 try {
			  urlmy = new URL(myurl);
			  con = (HttpURLConnection) urlmy.openConnection();
			  // con.setFollowRedirects(true);
			  con.setInstanceFollowRedirects(false);
			  con.connect();
		   
			  BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
			  String len = "";
			  while ((len = br.readLine()) != null) {  
				  System.out.println(len.substring(3379,3444)); //�իȨ�
	       	   	  }
		  	} catch (Exception e) {
		  		e.printStackTrace();
		  	}
		  	scanner.close();
		 }
}