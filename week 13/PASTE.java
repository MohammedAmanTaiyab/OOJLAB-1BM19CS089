import java.awt.*;
import java.awt.event.*;
 
public class paste implements ActionListener
{
	
	Frame f=new Frame();
	Label l1=new Label("First text:");
    Label l2=new Label("Second text:");
    

	
	TextField t1=new TextField();
	TextField t2=new TextField();
    
    
	

	Button b1=new Button("Paste");
	
	
	paste()
	{
	
		l1.setBounds(100,100,100,20);
		l2.setBounds(100,140,100,20);
    		
		t1.setBounds(250,100,150,20);
		t2.setBounds(250,140,150,20);
        
        
		
		b1.setBounds(200,200,50,20);


		f.add(l1);
		f.add(l2);

		
		f.add(t1);
		f.add(t2);
    

		
		f.add(b1);

		
		b1.addActionListener(this);

		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(500,350);
	}
	
	public void actionPerformed(ActionEvent e)
	{

        String s1=t1.getText();
        t2.setText(s1);


	}
	
	public static void main(String args[])
	{
		new paste();
	}
}