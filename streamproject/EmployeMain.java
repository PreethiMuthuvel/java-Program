package streamproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;

public class EmployeMain {
	static List<Employee> employeeList = new ArrayList<>();

	public static void main(String[] args) {
		EmployeFactory employeeFactory = new EmployeFactory();
		employeeList = employeeFactory.getAllEmployee();

		employeeList.stream().flatMap(employe -> employe.getProjects().stream()).distinct()
				.sorted(Comparator.comparing(Project::getName).reversed()).forEach(System.out::println);

		employeeList.stream().filter(employe -> employe.getFirstName().startsWith("A"))
				.map(employe -> employe.getFirstName()).forEach(System.out::println);

		employeeList.stream().filter(employe -> employe.getId().substring(0, 4).equals(Integer.toString(2023)))
				.forEach(System.out::println);
 
		employeeList.stream().sorted(Comparator.comparing(Employee::getFirstName).thenComparingInt(Employee::getSalary))
				.map(employe -> employe.getFirstName() + " " + employe.getSalary()).forEach(System.out::println);
       
		//employeeList.stream().sorted(Comparator.comparing(Employee :: getFirstName).then)
		Optional<Integer> minSalary = employeeList.stream().min(Comparator.comparingInt(Employee::getSalary))
				.map(employee -> employee.getSalary());
		System.out.println( "min salary"+minSalary);

		List<Employee> employeList = employeeList.stream().filter(employe -> employe.getSalary() == minSalary.orElse(0))
				.collect(Collectors.toList());
		System.out.println("min"+employeList);

		List<Employee> employeeListMoreThanTwo = employeList.stream()
				.filter(employe -> employe.getProjects().size() > 2).collect(Collectors.toList());

		Long count = employeeList.stream().mapToLong(Employee::getTotalLaptopsAssigned).sum();
		System.out.println(count);

		Long countt = employeeList.stream().flatMap(employee -> employee.getProjects().stream())
				.filter(project -> project.getProjectManager().equals("Robert Downey Jr")).distinct().count();
		System.out.println(countt);

		List<Project> projectsWithRobertDowneyJr = employeeList.stream()
				.flatMap(employee -> employee.getProjects().stream())
				.filter(project -> project.getProjectManager().equals("Robert Downey Jr")).distinct()
				.collect(Collectors.toList());

		System.out.println("Projects by Robert Downey Jr  " + projectsWithRobertDowneyJr);

		// List of all people working with Robert Downey Jr.
		
		/* * List<Employee> employees=employeeList.stream()
		 * .flatMap(employe->employe.getProjects().stream())
		 * .filter(project->project.getProjectManager().
		 * equalsIgnoreCase("Robert Downey Jr"))
		 * 
		 * .collect(Collectors.toList());*/
		List<Employee> employeListt=employeeList.stream()
				.filter(employe->employe.getProjects().stream().anyMatch(project->project.getProjectManager().equals("Robert Downey Jr")))
				.collect(Collectors.toList());
		System.out.println(employeListt);
		 
		Map<String, List<Employee>> map = employeeList.stream()
				.collect(Collectors.groupingBy(employee -> employee.getId().substring(0, 4)));
		System.out.println(map);
		
		Map<String, Long> countMap = employeeList.stream()
				 .collect(Collectors.groupingBy(
	                        employee -> employee.getId().substring(0, 4),
	                        Collectors.counting()));
		System.out.println(countMap);
		
		String word="language";
		Map<Character,Long> characterMap=word.chars().mapToObj(e->(char) e).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
		Optional<Character> firstCharacter=characterMap.entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.getKey()).findFirst();
		firstCharacter.orElseThrow();
	    System.out.println(firstCharacter.orElseThrow());
	    
	    
	    Integer[] arr= {1,2,3,4,5};
	    List<Integer> numbers = Arrays.asList(arr);
	    Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);
	    sum.ifPresent(System.out::println); // Output: 15 (1 + 2 + 3 + 4 + 5)

	     employeeList.stream().flatMap(employe ->employe.getProjects().stream()).distinct()
	     .map(project->project.getName())
	    .forEach(System.out::println);
	    

	}

}
