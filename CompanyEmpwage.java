public class CompanyEmpwage{
	public final String company;
        public final int empRatePerHour;
        public final int numOfWorkingDays;
        public final int maxHoursPerMonth;
        public int totalEmpWage;

        public CompanyEmpwage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
        this.company=company;
        this.empRatePerHour=empRatePerHour;
        this.numOfWorkingDays=numOfWorkingDays;
        this.maxHoursPerMonth=maxHoursPerMonth;
        }

	public void setTotalEmpWage(int totalEmpWage){
	this.totalEmpWage=totalEmpWage;
	}
	}

public class EmpWageBuilderArray{
 	public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=0;
	private int numOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmpWageBuilderArray(){
	companyEmpWageArray=new CompanyEmpWage[5];
	}

	private void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
	companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
	numOfCopany++;
	}

	private void computeEmpWage(){
	for(int i=0;i<numOfCompany;i++){
	companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]))
	}
	}


        private int computeEmpWage(CompanyEmpWage companyEmpWage){
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
        totalEmpWage=WORK_HOURS*empRatePerHour;
        System.out.println("emply wage is:"+totalEmpWage);
        }
        }

        public static void main(String[] args){
        EmpWageBuilderArray empWageBuilder=new EmpWageBuilderArray();
        empWageBuilder.addCompanyEmpWage("Nike", 40, 3, 10);
	empWageBuilder.addCompanyEmpWage("Adidas", 10, 2, 10);
        empWageBuilder.computeEmpWage();
	}
}
