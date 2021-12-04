package graphics;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener
{
    JLabel titleLabel;
	JButton ANDbutton;
    JButton ORbutton,NOTbutton,NANDbutton,NORbutton,XORbutton;
  //JFrame frame = new JFrame();//creates a frame
    public MyFrame()
    {	
		//Border border = BorderFactory.createLineBorder(Color.green,3);
        this.setTitle("Logic Gate Simulator"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application
        this.setResizable(false); //prevent frame from being resized
        this.setSize(420,420); //sets the x-dimension, and y-dimension of frame
        this.setVisible(true); //make frame visible
        
        ImageIcon image = new ImageIcon("img.jpg"); //create an ImageIcon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(new Color(0x123456)); //change color of background
		
		titleLabel = new JLabel(); //create a label
		titleLabel.setText("CHOOSE A GATE"); //set text of label
		titleLabel.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon
		titleLabel.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER, BOTTOM of imageicon
		titleLabel.setForeground(new Color(000000)); //set font color of text
		titleLabel.setFont(new Font("Times New Roman",Font.PLAIN,20)); //set font of text
		//titleLabelsetBackground(Color.black); //set background color
		titleLabel.setOpaque(false);//display background color
		//titleLabelsetBorder(border); //sets border of label (not image+text)
		titleLabel.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
		titleLabel.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
		titleLabel.setBounds(125, 65, 250, 20); //set x,y position within frame as well as dimensions
       
		ORbutton = new JButton();
		ORbutton.setBounds(200, 100, 100, 30);
		ORbutton.addActionListener(this);
		ORbutton.setText("OR");

        ANDbutton = new JButton();
		ANDbutton.setBounds(200, 150, 100, 30);
		ANDbutton.addActionListener(this);
		ANDbutton.setText("AND");       
		
		NOTbutton = new JButton();
		NOTbutton.setBounds(200, 200, 100, 30);
		NOTbutton.addActionListener(this);
		NOTbutton.setText("NOT");  

		NANDbutton = new JButton();
		NANDbutton.setBounds(200, 250, 100, 30);
		NANDbutton.addActionListener(this);
		NANDbutton.setText("NAND");  

		NORbutton = new JButton();
		NORbutton.setBounds(200, 300, 100, 30);
		NORbutton.addActionListener(this);
		NORbutton.setText("NOR");  

		XORbutton = new JButton();
		XORbutton.setBounds(200, 350, 100, 30);
		XORbutton.addActionListener(this);
		XORbutton.setText("XOR");

		ANDbutton.setFocusable(false);
		ANDbutton.setHorizontalTextPosition(JButton.LEFT);
		ANDbutton.setVerticalTextPosition(JButton.BOTTOM);
		ANDbutton.setFont(new Font("Times New Roman",Font.BOLD,15));
		ANDbutton.setIconTextGap(-15);
		ANDbutton.setForeground(Color.BLACK);
		ANDbutton.setBackground(Color.lightGray);
		ANDbutton.setBorder(BorderFactory.createEtchedBorder());

        ORbutton.setFocusable(false);
		ORbutton.setHorizontalTextPosition(JButton.CENTER);
		ORbutton.setVerticalTextPosition(JButton.BOTTOM);
		ORbutton.setFont(new Font("Times New Roman",Font.BOLD,15));
		ORbutton.setIconTextGap(-15);
		ORbutton.setForeground(Color.black);
		ORbutton.setBackground(Color.lightGray);
		ORbutton.setBorder(BorderFactory.createEtchedBorder());     
		
		NOTbutton.setFocusable(false);
		NOTbutton.setHorizontalTextPosition(JButton.LEFT);
		NOTbutton.setVerticalTextPosition(JButton.BOTTOM);
		NOTbutton.setFont(new Font("Times New Roman",Font.BOLD,15));
		NOTbutton.setIconTextGap(-15);
		NOTbutton.setForeground(Color.BLACK);
		NOTbutton.setBackground(Color.lightGray);
		NOTbutton.setBorder(BorderFactory.createEtchedBorder());

		NORbutton.setFocusable(false);
		NORbutton.setHorizontalTextPosition(JButton.LEFT);
		NORbutton.setVerticalTextPosition(JButton.BOTTOM);
		NORbutton.setFont(new Font("Times New Roman",Font.BOLD,15));
		NORbutton.setIconTextGap(-15);
		NORbutton.setForeground(Color.BLACK);
		NORbutton.setBackground(Color.lightGray);
		NORbutton.setBorder(BorderFactory.createEtchedBorder());

		NANDbutton.setFocusable(false);
		NANDbutton.setHorizontalTextPosition(JButton.LEFT);
		NANDbutton.setVerticalTextPosition(JButton.BOTTOM);
		NANDbutton.setFont(new Font("Times New Roman",Font.BOLD,15));
		NANDbutton.setIconTextGap(-15);
		NANDbutton.setForeground(Color.BLACK);
		NANDbutton.setBackground(Color.lightGray);
		NANDbutton.setBorder(BorderFactory.createEtchedBorder());
		
		XORbutton.setFocusable(false);
		XORbutton.setHorizontalTextPosition(JButton.LEFT);
		XORbutton.setVerticalTextPosition(JButton.BOTTOM);
		XORbutton.setFont(new Font("Times New Roman",Font.BOLD,15));
		XORbutton.setIconTextGap(-15);
		XORbutton.setForeground(Color.BLACK);
		XORbutton.setBackground(Color.lightGray);
		XORbutton.setBorder(BorderFactory.createEtchedBorder());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(NOTbutton);
        this.add(ORbutton);
		this.add(ANDbutton);
		this.add(NANDbutton);
		this.add(NORbutton);
		this.add(titleLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
    {
		if(e.getSource()==ANDbutton) 
        {
			System.out.println("choice1");
			ANDbutton.setEnabled(false);
			System.out.println("AND chosen");
			this.dispose();
			NewWindow myWindow = new NewWindow();
		}	
        if(e.getSource()==ORbutton) 
        {
			System.out.println("choice 2");
			ORbutton.setEnabled(false);
			System.out.println("OR chosen");
		}	
		if(e.getSource()==NOTbutton) 
        {
			System.out.println("choice 3");
			NOTbutton.setEnabled(false);
			System.out.println("NOT chosen");
		}	
		if(e.getSource()==NANDbutton) 
        {
			System.out.println("choice 4");
			ORbutton.setEnabled(false);
			System.out.println("NAND chosen");
		}	
		if(e.getSource()==NORbutton) 
        {
			System.out.println("choice 5");
			ORbutton.setEnabled(false);
			System.out.println("NOR chosen");
		}	
		if(e.getSource()==XORbutton) 
        {
			System.out.println("choice 6");
			ORbutton.setEnabled(false);
			System.out.println("NOR chosen");
		}	
	}

        
}


