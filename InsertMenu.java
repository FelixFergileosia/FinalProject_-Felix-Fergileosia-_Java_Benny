
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class InsertMenu extends JFrame{
    public InsertMenu(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());
        //pannel
        JPanel Insert = new JPanel(new BorderLayout());
        

        //label
        JLabel InsertNama = new JLabel();
        InsertNama.setText("Insert Nama");
        InsertNama.setHorizontalAlignment(JLabel.CENTER);
        InsertNama.setVerticalAlignment(JLabel.TOP);
        InsertNama.setFont(new Font(null,Font.BOLD, 24));
        Insert.add(InsertNama);

        JLabel InsertHarga = new JLabel();
        InsertHarga.setText("Insert Harga");
        InsertHarga.setHorizontalAlignment(JLabel.CENTER);
        InsertHarga.setVerticalAlignment(JLabel.TOP);
        InsertHarga.setFont(new Font(null,Font.BOLD, 24));
        Insert.add(InsertHarga);

        JLabel InsertStok = new JLabel();
        InsertStok.setText("Insert Stok");
        InsertStok.setHorizontalAlignment(JLabel.CENTER);
        InsertStok.setVerticalAlignment(JLabel.TOP);
        InsertStok.setFont(new Font(null,Font.BOLD, 24));
        Insert.add(InsertStok);


        //button
        JButton Change = new JButton();
        Change.setText("update");
        Change.setPreferredSize(new Dimension(150 , 75));
        Change.setFocusable(false);
        Change.setFont(new Font(null,Font.BOLD, 38));
        //3 x 
        Insert.add(Change);



    }