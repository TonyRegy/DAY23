public class monthlyWage{
public static void main(String[] args){
	int RATE_PER_HOUR=20,FULL_HOUR=8,PART_HOUR=4,T=20,P=0,Q=0,R=0,S=0;
	P=FULL_HOUR*RATE_PER_HOUR;
	Q=P*T;
	R=PART_HOUR*RATE_PER_HOUR;
	S=R*T;
	System.out.println("monthly wage for regular employee is;"+Q);
	System.out.println("monthly wage for parttime employeeis;"+S);
}
}
