package xxx;

import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
public class test4 {

	
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
				Parsing();
		}
		public static void Parsing() throws Exception {
			URL url = new URL("http://findbook.tw/book/9789866031557/price"); 
			Document xmlDoc =  Jsoup.parse(url, 3000); //�ϥ�Jsoup jar �h�ѪR����
			
			//(�n�ѪR�����,timeout)
			Elements title = xmlDoc.select("title"); //�n�ѪR��tag������title
			Elements happy = xmlDoc.select("td");  //�n�ѪR��tag������td
				
			System.out.println("Title is "+title.get(0).text()); //�o��title tag�����e
			System.out.println("you select mood is "+happy.get(0).text()); //�o��td tag�����e
			//�`�N: �]�����n�h��td �ڷQ�n���o���O<td>��</td> �O��2��td �ҥH��get(1)

		

	}

}
