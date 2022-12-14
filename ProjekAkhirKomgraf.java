package projekakhirkomgraf;
import java.awt.*;
import java.applet.Applet;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

// by adji muhamad zidan
public class ProjekAkhirKomgraf extends JApplet {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Projek KomGraf");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new ProjekAkhirKomgraf();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }
    
    public void init() {
        JPanel panel = new panel();
        getContentPane().add(panel);
    }
}
    
class panel extends JPanel implements Runnable {
    int x = 0;
    int y = 1200;
    Thread berjalan = new Thread(this); // untuk mengaktifkan animasi
    // thread = untuk menjalankan aplikasi
     
    public panel() {
        setPreferredSize(new Dimension(900, 480));
        setBackground(Color.white);
        berjalan.start(); // memulai animasi
        // "berjalan" didapat dari inisialisasi dari thread
    }
   
    public void run(){
        while (true) {
            if (x <= 3200) { // jauhnya jarak  kereta berjalan
                y--; // berjalan mulai dari kanan ke arah kiri 
                x++;
            } else {
                x = 0;
                y = 1200; // posisi awal mulai kereta start
            }
            
            try {
                repaint(); // untuk mewarnai lagi
                Thread.sleep(2); // fungsi mengatur kecepatan gerak
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void paintComponent (Graphics E) {
        super.paintComponent(E);
        // custom warna
        Color pondasi1 = new Color(97, 56, 6);
        Color pondasi2 = new Color(108, 108, 108);
        Color background = new Color(150, 233, 255);
        Color atap = new Color(255, 33, 33);
        Color tiangPenyangga = new Color(255, 124, 35);
        Color tiangAtas = new Color(224, 91, 0);
        Color gerbong = new Color(240, 240, 240);
        Color atapGerbong = new Color(218, 218, 218);
        Color namaStasiun = new Color(249, 249, 249); 
        Color pagar = new Color(0, 127, 15);
        Color tiangPagar = new Color(172, 172, 172);
        
        // latar background
        setBackground(background);
        
        // pagar
        E.setColor(pagar); // garis atas
        E.fillRect(0, 270, 1500, 10);
        E.fillRect(0, 300, 1500, 8); // garis pagar 1 H
        E.fillRect(0, 330, 1500, 8); // garis pagar 2 H
        E.fillRect(0, 360, 1500, 8); // garis paagr 3 H
        E.setColor(Color.LIGHT_GRAY); // tembok bawah
        E.fillRect(0, 390, 1500, 30);
        
        // tiang pagar
        E.setColor(tiangPagar);
        E.fillRect(110, 260, 30, 160); // tiang1
        E.fillRect(500, 260, 30, 160); // tiang2
        E.fillRect(870, 260, 30, 160); // tiang3
        E.fillRect(1260, 260, 30, 160); // tiang4
        
        // atap 
        E.setColor(atap);
        E.fillRect(0, 35, 1500, 100);
        // garis atap
        E.setColor(Color.DARK_GRAY);
        E.fillRect(0, 50, 1500, 3);
        E.fillRect(0, 80, 1500, 3);
        E.fillRect(0, 110, 1500, 3);
        
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
        
        // papan no stasiun
        E.setColor(namaStasiun);
        E.fillRect(23, 170, 45, 50);
        E.fillRect(423, 170, 45, 50);
        E.fillRect(903, 170, 45, 50);
        E.fillRect(1303, 170, 45, 50);
        
        E.setColor(Color.GRAY);
        E.drawRect(27, 175, 35, 40);
        E.drawRect(427, 175, 35, 40);
        E.drawRect(907, 175, 35, 40);
        E.drawRect(1307, 175, 35, 40);
        
        E.setColor(Color.GRAY); // no tulisan
        E.drawString("1", 38, 204);
        E.drawString("1", 438, 204);
        E.drawString("1", 918, 204);
        E.drawString("1", 1318, 204);
        
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
        E.fillRect(0, 540, 1500, 180);
        
        // rel
        E.setColor(Color.BLACK);
        E.fillRect(0, 530, 1500, 15);
        
        // gerbong kereta
        E.setColor(gerbong);
        E.fillRoundRect(y+200, 285, 500, 220, 10, 10); // gerbong1
        E.fillRoundRect(y+710, 285, 500, 220, 10, 10); // gerbong2
        E.fillRoundRect(y+1220, 285, 500, 220, 10, 10); // gerbong3
        
        E.setColor(Color.RED);
        E.fillRect(y+200, 400, 500, 15);
        E.fillRect(y+200, 420, 500, 15);
        
        E.fillRect(y+710, 400, 500, 15);
        E.fillRect(y+710, 420, 500, 15);
        
        E.fillRect(y+1220, 400, 500, 15);
        E.fillRect(y+1220, 420, 500, 15);
        
        E.setColor(Color.DARK_GRAY);
        E.fillRoundRect(y+200, 305, 40, 70, 10, 10); // jendela
        E.fillRoundRect(y+250, 305, 70, 70, 10, 10); // jendela
        E.fillRoundRect(y+600, 305, 70, 70, 10, 10); // jendela
        E.fillRoundRect(y+730, 305, 460, 70, 10, 10); // jendela
        E.fillRoundRect(y+1240, 305, 460, 70, 10, 10); // jendela
        
        // atap kereta
        E.setColor(atapGerbong);
        E.fillRect(y+235, 273, 430, 12);
        E.fillRect(y+744, 273, 430, 12);
        E.fillRect(y+1255, 273, 430, 12);
        
        // roda kereta
        E.setColor(Color.DARK_GRAY);
        E.fillArc(y+260, 480, 60, 50, 0, -180); // gerbong1
        E.fillArc(y+320, 480, 60, 50, 0, -180);
        E.fillArc(y+520, 480, 60, 50, 0, -180);
        E.fillArc(y+580, 480, 60, 50, 0, -180);
        
        E.fillArc(y+770, 480, 60, 50, 0, -180); // gerbong2
        E.fillArc(y+830, 480, 60, 50, 0, -180);
        E.fillArc(y+1030, 480, 60, 50, 0, -180);
        E.fillArc(y+1090, 480, 60, 50, 0, -180);
        
        E.fillArc(y+1280, 480, 60, 50, 0, -180); // gerbong3
        E.fillArc(y+1340, 480, 60, 50, 0, -180);
        E.fillArc(y+1540, 480, 60, 50, 0, -180);
        E.fillArc(y+1600, 480, 60, 50, 0, -180);
        
        // copyright name
        Font copyright = new Font("TimesRoman", Font.BOLD, 12);
        E.setFont(copyright);
        E.setColor(Color.WHITE);
        E.drawString("Adji Muhamad Zidan", 1240, 665);
        E.drawString("201943501940 - R7X", 1240, 685);
    }
}
