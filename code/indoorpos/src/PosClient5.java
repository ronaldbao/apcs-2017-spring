
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class PosClient5 {
public static void main(String[] args) {
		
		Socket socket = null;  
        DataOutputStream os = null;  
		try {  
            socket = new Socket("localhost", 50006);  
            int i = 0;
            while(true){
            	
            	Thread.sleep(1000);
            	os = new DataOutputStream(socket.getOutputStream());
            	switch (i) {
				case 1:
					os.write(("10001,-66;10001,-67;10004,-90;10001,-66;10003,-82;10002,-82;10001,-66;10001,-68;10004,-88;10001,-66;10001,-67;10003,-82;10002,-84;10001,-66;10001,-67;10001,-66;10001,-65;10004,-88;10001,-66;10003,-82;869511023026825"+"\n").getBytes());
					i++;
					break;
				case 2:
					os.write(("10001,-83;10001,-83;10001,-83;10002,-84;10003,-75;10001,-71;10004,-76;10001,-67;10001,-65;10002,-84;10003,-81;10001,-68;10001,-65;10004,-85;10001,-67;10002,-71;10003,-87;10001,-65;10001,-59;10004,-79;10001,-60;10001,-58;10003,-81;10001,-64;10001,-58;869511023026823"+"\n").getBytes());
					i++;
					break;
				case 3:
					os.write(("10001,-60;10004,-74;10001,-64;10002,-73;10003,-80;10001,-76;10003,-73;10001,-76;10004,-87;10003,-78;10001,-90;10001,-81;10001,-78;10004,-76;10001,-81;10001,-83;10002,-70;10003,-75;10001,-73;10001,-81;10001,-83;10001,-89;10004,-80;10001,-78;10003,-73;869511023026826"+"\n").getBytes());
					i++;
					break;
				case 4:
					os.write(("10004,-75;10001,-80;10001,-74;10003,-81;10001,-75;10001,-73;10004,-76;10001,-74;10001,-72;10002,-69;10001,-74;10003,-76;10001,-73;10001,-71;10001,-69;10004,-75;10001,-70;10002,-68;10001,-73;10001,-72;10003,-79;10001,-74;10001,-72;10001,-72;10001,-75;869511023026823"+"\n").getBytes());
					i++;
					break;
				case 5:
					os.write(("10001,-75;10004,-77;10001,-76;10002,-75;10001,-76;10003,-62;10001,-74;10001,-76;10001,-74;10004,-77;10001,-75;10001,-74;10002,-73;10001,-75;10001,-75;10001,-75;10004,-76;10001,-74;10001,-75;10002,-73;10001,-74;10001,-75;10001,-75;10004,-80;10001,-84;869511023026829"+"\n").getBytes());
					i++;
					break;
				case 6:
					os.write(("10001,-85;10003,-64;10001,-85;10004,-79;10001,-84;10001,-84;10002,-80;10003,-64;10001,-86;10001,-84;10001,-85;10004,-81;10001,-85;10001,-86;10002,-80;10001,-85;10003,-66;10001,-84;10001,-86;10004,-78;10001,-86;10001,-87;10001,-87;10004,-80;10001,-86;869511023026827"+"\n").getBytes());
					i++;
					break;
				case 7:
					os.write(("10002,-78;10003,-64;10001,-88;10001,-88;10001,-87;10004,-78;10001,-85;10001,-86;10002,-81;10001,-89;10003,-64;10001,-89;10001,-88;10001,-86;10004,-76;10001,-84;10001,-86;10002,-74;10003,-60;10001,-84;10001,-87;10001,-86;10004,-75;10001,-88;10001,-86;869511023026828"+"\n").getBytes());
					i++;
					break;
				case 8:
					os.write(("10001,-68;10001,-66;10001,-68;10004,-69;10001,-67;10001,-68;10002,-72;10001,-66;10003,-72;10001,-68;10001,-66;10001,-66;10004,-68;10001,-68;10002,-74;10001,-66;10003,-71;10001,-68;10001,-67;10001,-68;10004,-68;10001,-67;10001,-66;10002,-72;10001,-67;869511023026821"+"\n").getBytes());
					i++;
					break;
				case 9:
					os.write(("10002,-69;10001,-79;10001,-75;10001,-72;10004,-72;10001,-72;10002,-72;10001,-71;10003,-82;10001,-71;10001,-69;10001,-71;10004,-78;10001,-70;10001,-72;10002,-71;10003,-81;10001,-72;10001,-70;10004,-74;10001,-72;10001,-72;10002,-73;10001,-71;10003,-81;869511023026825"+"\n").getBytes());
					i++;
					break;
				case 10:
					os.write(("10001,-80;10001,-81;10003,-76;10001,-81;10001,-82;10001,-80;10004,-77;10001,-83;10002,-91;10001,-83;10003,-76;10001,-77;10001,-77;10001,-76;10004,-76;10001,-80;10001,-76;10002,-80;10001,-77;10003,-80;10001,-78;10001,-76;10004,-76;10001,-78;10002,-74;869511023026821"+"\n").getBytes());
					i++;
					break;
				case 11:
					os.write(("10001,-66;10004,-75;10001,-65;10002,-73;10001,-66;10003,-73;10001,-67;10001,-66;10001,-67;10004,-76;10001,-65;10001,-66;10002,-71;10001,-66;10003,-72;10001,-67;10001,-65;10001,-67;10004,-82;10001,-66;10002,-69;10001,-68;10003,-73;10001,-67;10001,-67;869511023026824"+"\n").getBytes());
					i++;
					break;
				case 0:
					os.write(("10001,-76;10002,-74;10001,-79;10003,-75;10001,-79;10001,-81;10001,-76;10004,-75;10001,-80;10001,-80;10002,-77;10001,-74;10003,-75;10001,-68;10001,-68;10004,-72;10001,-69;10001,-67;10002,-73;10001,-69;10003,-69;10001,-71;10001,-68;10001,-69;10004,-84;869511023026829"+"\n").getBytes());
					i++;
					break;

				default:
					os.write(("10001,-74;10001,-79;10001,-82;10004,-88;10001,-81;10001,-84;10003,-89;10004,-84;10002,-78;10003,-94;10001,-73;10001,-85;10001,-84;10004,-92;10001,-78;10002,-76;10001,-82;10001,-81;10003,-88;10001,-85;10001,-91;10004,-75;10001,-94;10002,-71;10001,-75;869511023026826"+"\n").getBytes());
					i=0;
					break;
				}
            	 
            	
            	//System.out.println(is.readUTF());
            	
            	
            }
           /* is = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));  
            Object obj = is.readObject();  */
            
        } catch(IOException ex) {  
            ex.printStackTrace(); 
        } catch (InterruptedException e) {
			e.printStackTrace();
		} finally {  
            try {  
            } catch(Exception ex) {}  
            try {  
                os.close();  
            } catch(Exception ex) {}  
            try {  
                socket.close();  
            } catch(Exception ex) {}  
        }  
	}
}
