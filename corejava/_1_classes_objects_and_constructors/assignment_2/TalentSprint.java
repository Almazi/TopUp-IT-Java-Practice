package corejava._1_classes_objects_and_constructors.assignment_2;

public class TalentSprint {
	void wage(double basePay, int hours){
		double wage;
		if(hours > 0 && hours <= 40){
			wage = basePay*hours;
			System.out.println("Total wage is: "+wage);
		}
		else if(hours > 40 && hours < 60){
			wage = 40*basePay + (hours - 40)*basePay*1.5;
			System.out.println("Total wage is: "+wage);
		}
		else 
		{
			System.out.println("Wrong input");
		}
		
	}

}
