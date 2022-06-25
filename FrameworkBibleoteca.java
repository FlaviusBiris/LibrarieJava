import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.lang.*;

public class FrameworkBibleoteca{
	static ArrayList<String> carti = new ArrayList<String>();
public static ArrayList<Integer> idCarti = new ArrayList<Integer>();
	static boolean isOpen = false;
	static boolean isEmpty = true;
	public static void main(String[] args){
		JFrame cartFrame = new JFrame("Cart");
		cartFrame.setSize(300, 300);
		cartFrame.setLayout(null);
		JTextArea cartTA = new JTextArea("Your cart is empty");
		cartFrame.add(cartTA);
		cartFrame.setVisible(false);
		cartTA.setBounds(0, 0, 1450, 800);
		ImageIcon cartButton = new ImageIcon("D:\\Java\\FrameworkBibleoteca\\cartButton.png");
		Image cartScaledImage = cartButton.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		JLabel cartLabel = new JLabel(new ImageIcon(cartScaledImage));
		cartLabel.setBounds(0, 0, 100, 100);
		cartLabel.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				if(isOpen == false){
					if(isEmpty == false){
						cartTA.setText(Carte.setText());
					}
					cartFrame.setVisible(true);
					isOpen = true;
				}
				else{
					cartFrame.setVisible(false);
					isOpen = false;
				}
				
			}
		});
		
		JFrame bibleoteca = new JFrame("Bibleoteca");
		bibleoteca.setSize(1450, 900);
		ImageIcon jpg = new ImageIcon("D:\\Java\\FrameworkBibleoteca\\BruceD.jpg");
		Image scaledImage = jpg.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
		JLabel carteLabel = new JLabel(new ImageIcon(scaledImage));
		carteLabel.setBounds(50, 100, 300, 300);
		JButton info1 = new JButton("Bruce D.");
		info1.setBounds(50, 500, 300, 50);
		carti.add("BruceD");
		idCarti.add(0);
		info1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				int thisId = cautare("BruceD");
				Carte BruceD = new Carte("BruceD", "blablabla", 15, scaledImage, thisId);
			}
		});
		
		
		ImageIcon jpg2 = new ImageIcon("D:\\Java\\FrameworkBibleoteca\\EricEmmanuel.jpg");
		Image scaledImage2 = jpg2.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
		JLabel carteLabel2 = new JLabel(new ImageIcon(scaledImage2));
		carteLabel2.setBounds(380, 100, 300, 300);
		JButton info2 = new JButton("EricEmmanuel");
		info2.setBounds(380, 500, 300, 50);
		carti.add("EricEmmanuel");
		idCarti.add(0);
		info2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				int thisId = cautare("EricEmmanuel");
				Carte EricEmmanuel = new Carte("EricEmmanuel", "blablabla", 20, scaledImage2, thisId);
			}
		});
		
		
		ImageIcon jpg3 = new ImageIcon("D:\\Java\\FrameworkBibleoteca\\MonaLisa.jpg");
		Image scaledImage3 = jpg3.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
		JLabel carteLabel3 = new JLabel(new ImageIcon(scaledImage3));
		carteLabel3.setBounds(710, 100, 300, 300);
		JButton info3 = new JButton("MonaLisa");
		carti.add("MonaLisa");
		idCarti.add(0);
		info3.setBounds(710, 500, 300, 50);
		info3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				int thisId = cautare("MonaLisa");
				Carte MonaLisa = new Carte("MonaLisa", "blablabla", 35, scaledImage3, thisId);
			}
		});
		
		ImageIcon jpg4 = new ImageIcon("D:\\Java\\FrameworkBibleoteca\\ChrisWhitaker.png");
		Image scaledImage4 = jpg4.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
		JLabel carteLabel4 = new JLabel(new ImageIcon(scaledImage4));
		carteLabel4.setBounds(1040, 100, 300, 300);
		JButton info4 = new JButton("Chris Whitaker");
		info4.setBounds(1040, 500, 300, 50);
		carti.add("ChrisWhitaker");
		idCarti.add(0);
		info4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				int thisId = cautare("ChrisWhitaker");
				Carte ChrisWhitaker = new Carte("ChrisWhitaker", "blablabla", 35, scaledImage4, thisId);
			}
		});
		
		bibleoteca.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		bibleoteca.setLayout(null);
		bibleoteca.add(carteLabel);
		bibleoteca.add(info1);
		bibleoteca.add(cartLabel);
		bibleoteca.add(carteLabel2);
		bibleoteca.add(info2);
		bibleoteca.add(carteLabel3);
		bibleoteca.add(info3);
		bibleoteca.add(carteLabel4);
		bibleoteca.add(info4);
		bibleoteca.setVisible(true);
		
		
		
		
		
		
		
		
		
		while(1 == 1){
			if(cartFrame.isVisible() == true){
				isOpen = true;
			}
			else{
				isOpen = false;
			}
		}
		
		
		
	}
	static int cautare(String numeCarte){
		int id = 0;
		for(int i = 0; i<carti.size(); i++){
					if(carti.get(i) == numeCarte){
						id=i;
					}
		}
		return id;
	}
	
}

















class Carte{
	String numeCarte = " ";
	String descriere = " ";
	int pret = 0;
	int Id = 0;
	Image scaledImage;
	
	
	Carte(String numeCarte, String descriere, int pret, Image scaledImage, int Id){
		this.numeCarte = numeCarte;
		this.descriere = descriere;
		this.pret = pret;
		this.scaledImage = scaledImage;
		JLabel imagCarte = new JLabel(new ImageIcon(scaledImage));
		this.Id = Id;
		
		JFrame frame = new JFrame(numeCarte);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(890, 520);
		
		imagCarte.setBounds(30, 30, 300, 300);
		frame.add(imagCarte);
		
		JTextArea descriereLabel = new JTextArea(descriere+"\n Pret:"+pret + " lei");
		descriereLabel.setBounds(360, 30, 500, 300);
		descriereLabel.setEditable(false);
		frame.add(descriereLabel);
		
		JTextArea cantitate = new JTextArea();
		cantitate.setBounds(30, 360, 300, 100);
		frame.add(cantitate);
		
		JButton addToCart = new JButton("Add to cart");
		addToCart.setBounds(360, 360, 500, 100);
		addToCart.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				int aux = FrameworkBibleoteca.idCarti.get(Id);
				int cantitateTA = Integer.parseInt(cantitate.getText());
				aux+=cantitateTA;
				FrameworkBibleoteca.idCarti.set(Id, aux);
				if(FrameworkBibleoteca.isEmpty == true){
					FrameworkBibleoteca.isEmpty = false;
				}
			}
		});
		frame.add(addToCart);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	static String setText(){
		String text = "";
		for(int i = 0; i<FrameworkBibleoteca.idCarti.size(); i++){
			if(FrameworkBibleoteca.idCarti.get(i)!=0){
				text+=Integer.toString(FrameworkBibleoteca.idCarti.get(i))+" "+FrameworkBibleoteca.carti.get(i)+"\n";
			}
		}
		return text;
	}
	
	
	
	
	
}