import java.awt.*;
import java.awt.event.*;
 
public class Divide implements ActionListener
{
	
	Frame f=new Frame();
	Label l1=new Label("First Number");
    Label l2=new Label("Second Number");
    Label l3=new Label();
    Label l4=new Label();
    

	
	TextField t1=new TextField();
	TextField t2=new TextField();
    
    
	

	Button b1=new Button("Div");
	
	
	Divide()
	{
	
		l1.setBounds(100,100,100,20);
		l2.setBounds(100,140,100,20);
        l3.setBounds(100,180,100,20);
        l4.setBounds(100,220,300,20);
    
		
		t1.setBounds(250,100,150,20);
		t2.setBounds(250,140,150,20);
        
        
		
		b1.setBounds(200,275,50,20);


		f.add(l1);
		f.add(l2);
        f.add(l3);
        f.add(l4);

		
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

        try {
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            l3.setText("Result : "+String.valueOf(n1/n2));
            l4.setText("Division Successful!");
        } catch (Exception ex) {
            l4.setText(String.valueOf(ex));
            l3.setText("Result : Error");
        }
	}
	
	public static void main(String args[])
	{
		new Divide();
	}
}