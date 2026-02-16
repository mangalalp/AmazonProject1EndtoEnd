package mdule1;

public class Ecncalpulation {
	
	private int age=30;
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	private String name="Mangala";
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private double salary=30000;
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	public static void main(String[] args) {
		 Ecncalpulation t1=new  Ecncalpulation();
		 t1.setAge(50);
System.out.println(t1.getAge());

t1.setName("jaya");
System.out.println(t1.getName());
t1.setSalary(35000);
System.out.println(t1.getSalary());
	}

}
