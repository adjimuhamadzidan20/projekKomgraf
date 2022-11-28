package projekakhirkomgraf;
import java.awt.*;
import java.applet.Applet;

public class ProjekAkhirKomgraf extends Applet {
//    int x, x2, x3, x4 = 0;
//    Thread berjalan;
    
//    public void start() {
//        Thread berjalan = new Thread(this);
//        berjalan.start();
//    }
//    
//    public void run() {
//        while (true){
//            // mobil-1
//            if (x < 1600){
//                x=x+10;
//            }else {
//                x=-100;
//            }
//            if (x2 > -900){
//                x2=x2-10;
//            }else {
//                x2=700;
//            }
//            if (x3 < 800){
//                x3=x3+10;
//            }else {
//                x3=-100;
//            }
//            if (x4 > -450){
//                x4=x4-10;
//            }else {
//                x4=700;
//            }
//                            
//            //menghapus objek yg sudah berlalu
//            repaint();
//            
//            try {
//                Thread.sleep(30);//milimeter per detik
//            } catch(InterruptedException ex){
//                ex.printStackTrace();
//            }
//        }
//    }
      
    public void paint (Graphics E) {
        // custom warna
        Color pondasi1 = new Color(97, 56, 6);
        Color pondasi2 = new Color(145, 145, 145);
        Color background = new Color(150, 233, 255);
        Color atap = new Color(255, 33, 33);
        Color tiangPenyangga = new Color(255, 124, 35);
        Color tiangAtas = new Color(224, 91, 0);
        Color gerbong = new Color(240, 240, 240);
        Color namaStasiun = new Color(249, 249, 249); 
        
        // latar background
        setBackground(background);
        
        // atap 
        E.setColor(atap);
        E.fillRect(0, 35, 1500, 100);
        
        // nama stasiun
        E.setColor(namaStasiun);
        E.fillRect(500, 90, 380, 45);
        
        // tulisan
        Font tulisan = new Font("TimesRoman", Font.BOLD, 25);
        E.setFont(tulisan);
        E.setColor(Color.GRAY);
        E.drawString("B E K A S I   K O T A", 570, 122);
        
        // tiang penyangga
        E.setColor(tiangPenyangga); 
        E.fillRect(30, 145, 30, 285); // tiang1
        E.fillRect(430, 145, 30, 285); // tiang2
        E.fillRect(910, 145, 30, 285); // tiang3
        E.fillRect(1310, 145, 30, 285); // tiang4
        
        // tiang atas
        E.setColor(tiangAtas);
        E.fillRect(0, 135, 1500, 20);
               
        // ubin atas
        E.setColor(Color.YELLOW);
        E.fillRect(0, 420, 1500, 15);
        
        // pondasi atas
        E.setColor(pondasi2);
        E.fillRect(0, 430, 1500, 100);
        
        // pondasi bawah
        E.setColor(pondasi1);
        E.fillRect(0, 540, 1500, 120);
        
        // rel
        E.setColor(Color.BLACK);
        E.fillRect(0, 530, 1500, 15);
        
        // gerbong kereta
        E.setColor(gerbong);
        E.fillRect(200, 285, 500, 220); // gerbong1
        E.fillRect(710, 285, 500, 220); // gerbong2
        E.fillRect(1220, 285, 500, 220); // gerbong3
        
        E.setColor(Color.DARK_GRAY);
        E.fillRect(200, 305, 40, 70); // jendela
        E.fillRect(250, 305, 70, 70); // jendela
        E.fillRect(600, 305, 70, 70); // jendela
        
        E.fillRect(730, 305, 460, 70); // jendela
        E.fillRect(1240, 305, 460, 70); // jendela
        
        // roda kereta
        E.setColor(Color.DARK_GRAY);
        E.fillArc(260, 480, 60, 50, 0, -180); // gerbong1
        E.fillArc(320, 480, 60, 50, 0, -180);
        E.fillArc(520, 480, 60, 50, 0, -180);
        E.fillArc(580, 480, 60, 50, 0, -180);
        
        E.fillArc(770, 480, 60, 50, 0, -180); // gerbong2
        E.fillArc(830, 480, 60, 50, 0, -180);
        E.fillArc(1030, 480, 60, 50, 0, -180);
        E.fillArc(1090, 480, 60, 50, 0, -180);
        
        E.fillArc(1280, 480, 60, 50, 0, -180); // gerbong3
        E.fillArc(1340, 480, 60, 50, 0, -180);
        E.fillArc(1540, 480, 60, 50, 0, -180);
        E.fillArc(1600, 480, 60, 50, 0, -180);
        
    }
}
