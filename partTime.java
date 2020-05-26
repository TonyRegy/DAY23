public class partTime{

public static void main(String[] args){

	int IS_PART_TIME=0,IS_FULL_TIME=1;
	int HOURS=8,PART_HOURS=4;
	int RATE_PER_HOUR=20;
	int p=0,q=0;
	double empCheck=Math.floor(Math.random() * 10) %2;
	if(empCheck==IS_PART_TIME)
{
	p=PART_HOURS*RATE_PER_HOUR;
	System.out.println("employee is parttime AND WAGE IS"+p);
}
	else if(empCheck==IS_FULL_TIME)
{
	q=HOURS*RATE_PER_HOUR;
	System.out.println("fulltime employee wage is"+q);
}
	else
{
	System.out.println("no employee");
}

}
}
