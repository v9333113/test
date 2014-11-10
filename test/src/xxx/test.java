package xxx;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class test {

	 public static void main(String[] args) {
	  
	  //要獲取的網頁地址
	//  String myurl = "http://findbook.tw/r/b/tw.books/9789866675652";//博客來 等一個人咖啡
		 String myurl = "http://findbook.tw/r/b/tw.books/9789862767931";//博客來
	//	 String myurl ="http://findbook.tw/r/b/tw.cite/9789866675652";// 城邦 等一個人咖啡
	//	 String myurl ="http://findbook.tw/r/b/tw.cite/9865728141";
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
			  //輸出頁面上取得的字符串做處理
			  System.out.println(len.substring(3379,3444)); //博客來
			//  System.out.println(len.substring(3382,3418));//城邦
		  }
		
		  
	  	} catch (Exception e) {
	  		// TODO Auto-generated catch block
	  		e.printStackTrace();
	  		}
	 }
}