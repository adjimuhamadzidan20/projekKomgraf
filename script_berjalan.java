package komputer_grafik;
import java.applet.Applet;

public class script_berjalan extends Applet implements Runnable {
    int x = 0;
    Thread jln;
    
    public void start(){
       Thread jln = new Thread(this);
       jln.start();
    }
    public void run(){
            while (true){
            // mobil-1
            if (x < 1600){
                x=x+10;
            }else {
                x=-100;
            }
            
            //menghapus objek yg sudah berlalu
            repaint();
            try{
                Thread.sleep(50);
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}
