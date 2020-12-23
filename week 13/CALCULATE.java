import java.awt.*;
import java.awt.event.*;
 
public class calc implements ActionListener
{
	
	Frame f=new Frame();
	Label l1=new Label("First Number:");
    Label l2=new Label("Second Number:");
    Label l3=new Label("Enter operator:");
    Label l4=new Label();
    Label l5=new Label();
    

	
	TextField t1=new TextField();
	TextField t2=new TextField();
    TextField t3=new TextField();
    
	

	Button b1=new Button("Result");
	
	
	calc()
	{
	
		l1.setBounds(100,100,100,20);
		l2.setBounds(100,140,100,20);
        l3.setBounds(100,180,100,20);
        l4.setBounds(100,220,300,20);
        l5.setBounds(100,260,300,20);
    
		
		t1.setBounds(250,100,150,20);
        t2.setBounds(250,140,150,20);
        t3.setBounds(250,180,150,20);
        
        
		
		b1.setBounds(200,300,50,20);


		f.add(l1);
		f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);

		
		f.add(t1);
        f.add(t2);
        f.add(t3);
    

		
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
            String s=t3.getText();
            char c=s.charAt(0);
           
            switch(c)
            {
                case'+':
                l4.setText("Result : "+String.valueOf(n1+n2));
                l5.setText("Calculation Successful!");
                break;
                case'-':
                l4.setText("Result : "+String.valueOf(n1-n2));
                l5.setText("Calculation Successful!");
                break;
                case'*':
                l4.setText("Result : "+String.valueOf(n1*n2));
                l5.setText("Calculation Successful!");
                break;
                case'/':
                l4.setText("Result : "+String.valueOf(n1/n2));
                l5.setText("Calculation Successful!");
                break;
                case'%':
                l4.setText("Result : "+String.valueOf(n1%n2));
                l5.setText("Calculation Successful!");
                break;
                default:
                l4.setText("Result: Error");
                l5.setText("Invalid operator: "+t3.getText());
            }
            

        } catch (Exception ex) {
            l5.setText(String.valueOf(ex));
            l4.setText("Result : Error");
        }
	}
	
	public static void main(String args[])
	{
		new calc();
	}
}