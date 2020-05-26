public class wageBuilder{

        public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=0;

        private final String company;
        private final int empRatePerHour;
        private final int numOfWorkingDays;
        private final int maxHoursPerMonth;
        private int WAGE;

        public wageBuilder(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
        this.company=company;
        this.empRatePerHour=empRatePerHour;
        this.numOfWorkingDays=numOfWorkingDays;
        this.maxHoursPerMonth=maxHoursPerMonth;
        }

        public void computeWage(){
        int totalhrs=0,totaldays=0,WORK_HOURS=0;
        while(totaldays<=numOfWorkingDays && totalhrs<=maxHoursPerMonth){
        totaldays++;
        totalhrs++;
        int empCheck=(int)Math.floor(Math.random() * 10) % 3;
        switch(empCheck){
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
        System.out.println("employee worked hours for company" +company+ "is" +totalhrs);
        System.out.println("employee worked days for company" +company+ "is" +totaldays);
        WAGE=WORK_HOURS*empRatePerHour;
        System.out.println("emply wage is:"+WAGE);
        }
        }

        public static void main(String[] args){
        wageBuilder adidas=new wageBuilder("Adidas", 30, 4, 10);
        wageBuilder nike=new wageBuilder("Nike", 40, 3, 10);
        adidas.computeWage();
	nike.computeWage();
	}
}
