package entities;

public class emplyoee {
	
	private Integer id;
	private String name;
	private Double salario;
	
	public emplyoee(Integer id, String name, Double salariio) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalario() {
		return salario;
	}
	public void increaseSalary(double porcentage) {
		 salario += salario * porcentage / 100;
						
	}
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f",salario);
		}
}
