public class wageToArray{
	public static final int IS_FULL_TIME=1;
 	public static final int IS_PART_TIME=0;
	public static final int RATE_PER_HOUR=20;
      	public static final int NUMBER_OF_WORKING_DAYS=10;
	public static final int HOURS_PER_MONTH=20;
	public static int WORK_HOURS=0;
	public static int WAGE=0,totalhrs=0,totaldays=0;
	public static double empCheck=0;
	array=new int[3];
	array2=new int[4];

	public static void main(String[] args){
	emppresentcheck();
	dailyWage();
	calculatewage(WORK_HOURS);
}
	public static int emppresentcheck(){
	while(totaldays<=NUMBER_OF_WORKING_DAYS && totalhrs<=HOURS_PER_MONTH){
	totaldays++;
	totalhrs++;
        empCheck=Math.floor(Math.random() * 10) % 3;
        switch((int)empCheck){
        case IS_FULL_TIME:
        WORK_HOURS=8;
        break;
        case IS_PART_TIME:
        WORK_HOURS=4;
        break;
        default:
        WORK_HOURS=0;
        break;
 	}
	}
	System.out.println("employee worked hours:"+totalhrs);
	System.out.println("employee worked days:"+totaldays);
	return WORK_HOURS;
	}

	public static int dailyWage(){
	int RATE_PER_HOUR=20;
	int HOURS_PER_DAY=8,IS_FULL_TIME=1;
	int p;
	empCheck=Math.floor(Math.random() * 10) % 2;
	if (empCheck==IS_FULL_TIME)
	System.out.println("Employee is present");
	else
	System.out.println("Employee is absent");
	p=RATE_PER_HOUR*HOURS_PER_DAY;
	array2[1]=new int[p];
	System.out.println("Daiy wage is:"+p);
}

	public static void calculatewage(int WORK_HOURS){
	WAGE=WORK_HOURS*RATE_PER_HOUR;
	array[1]=new int[WAGE];
	System.out.println("emply wage is:"+WAGE);

	}
	}
