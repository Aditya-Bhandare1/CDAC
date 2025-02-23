import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountDownTimerExample {

static int i;
static Timer t;

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter the seconds you want to count down : ");

String sec = sc.nextLine();

int del = 1000;
int per = 1000;
t = new Timer();
i = Integer.parseInt(sec);
System.out.println(sec);

t.scheduleAtFixedRate(new TimerTask()
{

public void run()
{
System.out.println(seti());
}
}, del, per);
}

private static final int seti() {

if (i == 1)
t.cancel();
return --i;
}
}