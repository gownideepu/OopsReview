package Com.BridgeLabs;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.EnumSet;
public class Hospital {
Scanner src =new Scanner (System.in);
	
	static List<Patient> Patienttslist=new ArrayList<>();
	enum hospital{
		ONCOLOGY,
		NEUROLOGY,
		CARDIOLOGY,
		GYNOCOLOGY,
		
	}
	void show() {
		for (Patient i:Patienttslist) {
			System.out.println(i.getName());
			System.out.println(i.getAge());
			System.out.println(i.getDepartment());
			System.out.println(i.getPhoneNumber());
			System.out.println(i.getState());
			
		}
	}
	void PationtsList(Patient patient) {
		Patienttslist.add(patient);
		
	}
	
	void addPatient() {
		System.out.println("the details");
		String Name=src.next();
		String Age=src.next();
		String PhoneNumber=src.next();
		String City=src.next();
		String State=src.next();
		String Department=src.next();
		Patient patient = new Patient();
		patient.setName(Name);
		patient.setAge(Age);
		patient.setCity(City);
		patient.setDepartment(Department);
		patient.setPhoneNumber(PhoneNumber);
		patient.setState(State);
		
		PationtsList(patient);
		
	}
	
	
//	void add(){
//		hospital Hospital=new hospital();
//		hospital x = hospital.CARDIOLOGY;
//		
//	}
	
	
	
	
	
//	src. String ONCOLOGY; 
//	src. String NEUROLOGY;
//	src. String CARDIOLOGY;
//	src. String GYNOCOLOGY;
	
//	void Contact(String ONCOLOGY,String NEUROLOGY,String CARDIOLOGY,String GYNOCOLOGY) {
		
//	}
	
	
}
