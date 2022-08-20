package driver;
import model.AdminDepartment;
import model.HrDepartment;
import model.TechDepartment;

public class main {


	public static void main(String[] args) {
		AdminDepartment Ad=new AdminDepartment();
		TechDepartment Te=new TechDepartment();
		HrDepartment hrd=new HrDepartment();
	
		System.out.println("Welcome to"+ " " + Ad.DepartmentName());
		System.out.println(Ad.getTodaysWork());
		System.out.println(Ad.getWorkDeadline());
		System.out.print("\n");
		
		System.out.println("Welcome to"+ " " + Te.DepartmentName());
		System.out.println(Te.getTodaysWork());
		System.out.println(Te.getWorkDeadline());
		System.out.println(Te.isTodayAHoliday());
		System.out.print("\n");
		
		System.out.println("Welcome to"+ " " + hrd.DepartmentName());
		System.out.println(hrd.getTodaysWork());
		System.out.println(hrd.getWorkDeadline());
		System.out.println(hrd.doActivity());
		System.out.print("\n");
		

	}

}
