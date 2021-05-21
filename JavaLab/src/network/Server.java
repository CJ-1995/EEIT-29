package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		System.out.println("Server啟動中,等候連線...");
		try( ServerSocket ssc = new ServerSocket(8080);
			
			Socket socket = ssc.accept(); //等候連線 if沒有人連 程式會一直停在這行
			//從對方主機讀資料
			InputStream InputStream = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(InputStream,"UTF8");
			BufferedReader br = new BufferedReader(isr);
			//寫到對方主機
			OutputStream outputStream = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(outputStream,"UTF8");
			Scanner scanner = new Scanner(System.in);
				){
			
			InetSocketAddress SocketAddress =(InetSocketAddress) socket.getRemoteSocketAddress();
			System.out.println("收到來自:"+SocketAddress.getHostName());
			
			Thread t1 = new Thread(new Runnable() {//專責接受訊息
				
				@Override
				public void run() {
					String line;
					try {
						while((line = br.readLine())!=null) {
							System.out.println("接收到:"+line);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
			});
			t1.start();
			
			while(true) { //main thread回應訊息
				System.out.println("請輸入回應的訊息");
				//加上換行符號 因為Clinet 也是利用換行符號realdLine()做判斷
				String message = scanner.nextLine()+System.lineSeparator();
				osw.write(message);
				osw.flush();//OutputStreamWriter自帶Buffer,要馬上送出去,要呼叫flush()
			}
			
		}catch (IOException e) {
			
		}
		
		
	}
}
