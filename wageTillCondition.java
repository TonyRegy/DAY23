public class wageTillCondition{
	 public static final int IS_FULL_TIME=1;
 	public static final int IS_PART_TIME=0;
	public static final int RATE_PER_HOUR=20;
      	public static final int NUMBER_OF_WORKING_DAYS=10;
	public static final int HOURS_PER_MONTH=20;
public static void main(String[] args){
        int WORK_HOURS=0,WAGE=0,totalhrs=0,totaldays=0;
        double empCheck=0;
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
	System.out.println("employee worked hours:"+totalhrs);
	System.out.println("employee worked days:"+totaldays);
	}
WAGE=WORK_HOURS*RATE_PER_HOUR;
System.out.println("emply wage is:"+WAGE);
	}
}
