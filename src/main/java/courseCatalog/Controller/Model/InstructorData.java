package courseCatalog.Controller.Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import courseCatalog.entity.Course;
import courseCatalog.entity.Department;
import courseCatalog.entity.Instructor;
import courseCatalog.entity.Section;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InstructorData {
	

	private Long instructorId;
	private String firstName;
	private String lastName;
	private String email;
	//private List<String> departments = new ArrayList<String>();
	
	//convert from instructor entity to instructor PJO
	public InstructorData(Instructor instructor) 
	{
		instructorId = instructor.getInstructorId();
		firstName = instructor.getFirstName();
		lastName = instructor.getLastName();
		email = instructor.getEmail();	
		
	/*	for (Department department: instructor.getDepartments())
		{
			departments.add(new DepartmentData(department).getDepartmentName());
		}*/
		
	}

}
