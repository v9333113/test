package xxx;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class test {

	 public static void main(String[] args) {
	  
	  //�n����������a�}
	//  String myurl = "http://findbook.tw/r/b/tw.books/9789866675652";//�իȨ� ���@�ӤH�@��
		 String myurl = "http://findbook.tw/r/b/tw.books/9789862767931";//�իȨ�
	//	 String myurl ="http://findbook.tw/r/b/tw.cite/9789866675652";// ���� ���@�ӤH�@��
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
			  //��X�����W���o���r�Ŧ갵�B�z
			  System.out.println(len.substring(3379,3444)); //�իȨ�
			//  System.out.println(len.substring(3382,3418));//����
		  }
		
		  
	  	} catch (Exception e) {
	  		// TODO Auto-generated catch block
	  		e.printStackTrace();
	  		}
	 }
}