package contoh.kelasC;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Logika extends JFrame{
    
    public Logika(){
        aturKomponen();
    }
    
    private void aturKomponen(){
        JPanel panel = new JPanel(new GridLayout(0, 2));
        JTextField inputan = new JTextField();
        inputan.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if(!Character.isDigit(c)){
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        }); 
        JButton aksi = new JButton("Lihat Nilai"); 
        aksi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nilai = nilai(inputan);
                JOptionPane.showMessageDialog(null, nilai); 
            }
        });         
        panel.add(inputan);
        panel.add(aksi);
        add(panel);
        //setSize(400, 250);
        pack();
        setLocationRelativeTo(null); 
    }
    
    private String nilai(JTextField c){
        double nilai = Double.valueOf(c.getText()); 
        if (nilai >= 81 && nilai <= 100) {
            return "A";
        } else if (nilai >= 69 && nilai <= 80.99) {
            return "B";
        } else if (nilai >= 60 && nilai <= 68.99) {
            return "C";
        } else if (nilai >= 49 && nilai <= 59.99) {
            return "D";
        } else if (nilai < 49) {
            return "E";
        } else {
            return "undefined!";
        }
    }
    
    public static void main(String[] args) {
        Logika l = new Logika();
        l.setVisible(true); 
    }
}
