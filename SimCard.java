//Has-a-Relationship using Lazy-Instanciation
package hasarelationship_lazy_instantiation;

public class SimCard 
{
	String name;
	String type;
	double price;
	double plan;
	
	public SimCard() {
		// TODO Auto-generated constructor stub
	}
	SimCard(String name,String type,double price,double plan)
	{
		this.name=name;
		this.type=type;
		this.price=price;
		this.plan=plan;	
		System.out.println("SimCard created");
	}
	
	public void displaySimCard()
	{
		System.out.println("Name : "+name);
		System.out.println("Type : "+type);
		System.out.println("Price : "+price);
		System.out.println("Plan : "+plan);
	}

}
//-----------------------------------------------------------------
package hasarelationship_lazy_instantiation;

public class Mobile 
{
	String brand;
	String name;
	String processor;
	int ram;
	int rom;
	double price;
	SimCard s1;
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	Mobile(String brand,String name,String processor,int ram,int rom,double price)
	{
		this.brand=brand;
		this.name=name;
		this.processor=processor;
		this.ram=ram;
		this.rom=rom;
		this.price=price;
		System.out.println("Mobile Created");
	}
	public void displayMobile()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Name : "+name);
		System.out.println("Processor : "+processor);
		System.out.println("RAM : "+ram);
		System.out.println("ROM : "+rom);
		System.out.println("Price : "+price);
		System.out.println("-----------------------------");
	}
	
	public void insertSimCard(String name,String type,double price,double plan)
	{
		s1=new SimCard(name,type,price,plan);
		System.out.println("Simcard Inserted");
	}

}
//------------------------------------------------------------------------------------
package hasarelationship_lazy_instantiation;

public class MobileDriver 
{
	public static void main(String[] args) 
	{
		Mobile m1=new Mobile("Smasung","A-56","SnapDragon",4,128,30000.0);
		m1.displayMobile();
		m1.insertSimCard("jio","4G",100.0,399.0);
		m1.s1.displaySimCard();	
	}

}

