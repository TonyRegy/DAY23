public class wageForMultipleCompanies{
	public static final int IS_FULL_TIME=1;
 	public static final int IS_PART_TIME=0;
	public static int employeeWage(String company,int empHrs,int workDays,int empRate){

        int WORK_HOURS=0,WAGE=0,totalHrs=1,totalDays=1;
        double empCheck=0;
	while(totalDays<=workDays && totalHrs<=empHrs){
		totalDays++;
		totalHrs++;
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
	System.out.println("employee worked hours for Company" +company+ "is" +totalHrs);
	System.out.println("employee worked daysfor Company" +company+ "is" +totalDays);
	WAGE=WORK_HOURS*empRate;
	System.out.println("emply wage for Company" +company+ "is" +WAGE);
}
	return WAGE;
}

	public static void main(String[] args){
	employeeWage("Nike", 10, 3, 20);
	employeeWage("Jordan", 12, 4, 25);
}
}
