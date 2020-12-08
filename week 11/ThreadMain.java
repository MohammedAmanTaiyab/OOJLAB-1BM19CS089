class Thread1 implements Runnable {
String name; 
Thread t;
Thread1(String threadname) {
name = threadname;
t = new Thread(this, name);
t.start(); 
}

public void run() {
try {
for(int i = 5; i > 0; i--) {
if(name=="BMS")
{System.out.println("BMS College Of Engineering");
Thread.sleep(10000);
}
else
{
	System.out.println("CSE");
	Thread.sleep(2000);
}
}
} catch (InterruptedException e) {
System.out.println(name + " thread Interrupted");
}
System.out.println(name + " thread exiting.");
}
}


public class ThreadMain {
	public static void main(String args[])
	{
		new Thread1("BMS");
		new Thread1("CSE");
	}
}