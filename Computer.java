//Lazy-Instantiation using Has-a-Relationship
package hasarelationship_lazy_instantiation;

public class Pendrive 
{
	String brand;
	int memory;
	int speed;
	double price;
	
	public Pendrive() {
		// TODO Auto-generated constructor stub
	}
	Pendrive(String brand,int memory,int speed,double price)
	{
		this.brand=brand;
		this.memory=memory;
		this.speed=speed;
		this.price=price;
		
		System.out.println("Pendrive Created ");
	}
	
	public void displayPendrive()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Memory"+memory);
		System.out.println("Speed : "+speed);
		System.out.println("Price : "+price);
		System.out.println("------------------------------");

	}

}
//-----------------------------------------------------------------------
//class Computer
package hasarelationship_lazy_instantiation;

public class Computer 
{
	String name;
	int ram;
	int rom;
	String processor;
	double price;
	Pendrive p;
	
	public Computer() {
		// TODO Auto-generated constructor stub
	}
	
	Computer(String name,int ram,int rom,String processor,double price)
	{
		this.name=name;
		this.ram=ram;
		this.rom=rom;
		this.processor=processor;
		this.price=price;
		
		System.out.println("Computer Created");
	}
	
	public void displayComputer()
	{
		System.out.println("name : "+name);
		System.out.println("RAM : "+ram);
		System.out.println("ROM : "+rom);
		System.out.println("Processor : "+processor);
		System.out.println("Price : "+price);
		System.out.println("------------------------------------");
	}
	public void insertPendrive(String brand,int memory,int speed,double price)
	{
		p=new Pendrive( brand,memory,speed,price);
		
		System.out.println("Pendrive Inserted ");
		
	}
	

}
//--------------------------------------------------------------------
//class ComputerDriver
package hasarelationship_lazy_instantiation;

public class ComputerDriver 
{
	public static void main(String[] args) 
	{
		Computer c1=new Computer("HP",8,512,"i5",30000.0);
		c1.displayComputer();
		c1.insertPendrive("SanDisk", 32, 100, 3000.0);
		c1.p.displayPendrive();
	}
}
//-------------------------------------------------------------------
