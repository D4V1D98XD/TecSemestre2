package archivos;
import java.io.*;
public abstract class Persona implements Serializable{

	protected int Age;
	protected String Name;
	protected String Sex;
	
	public Persona(){
		
	}
	
	public Persona(int age, String name, String sex) {
		super();
		Age = age;
		Name = name;
		Sex = sex;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}
	
	public void quienPersona() {
		System.out.println("nombre: "+ Name + " Edad: " + Age + " Sexo: " + Sex);
	}
	
}
