public class dailyWage{

	public static void main(String[] args){
	int RATE_PER_HOUR=20;
	int HOURS_PER_DAY=8,IS_FULL_TIME=1;
	int p;
	double empCheck=Math.floor(Math.random() * 10) % 2;
	if (empCheck==IS_FULL_TIME)
	System.out.println("Employee is present");
	else
	System.out.println("Employee is absent");



	p=RATE_PER_HOUR*HOURS_PER_DAY;
	System.out.println("Daiy wage is:"+p);
}
}
