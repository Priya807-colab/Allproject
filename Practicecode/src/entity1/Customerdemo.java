package entity1;

public class Customerdemo {

	public static void main(String[] args) {
		
				Customer c1=new Customer();
				Customer c2=new Customer();
				Customer c3=new Customer();
				Customer c4=new Customer();
				Customer c5=new Customer();
				
				c1.setCid(01);
				c1.setName("jyostna");
				c1.setAddress("lawspet");
				c1.setCity("pondicherry");
				
				
				c3.setCid(03);
				c3.setName("kiru");
				c3.setAddress("Nathapattu");
				c3.setCity("Cuddalore");
				
				c4.setCid(04);
				c4.setName("Mercy");
				c4.setAddress("Semandalam");
				c4.setCity("Cuddalore");
				
				
				
				System.out.println("Customer id:"+c1.getCid()+" Customer name:"+c1.getName()+" Customer address:"+c1.getAddress()+" Customer city:"+c1.getCity());
				System.out.println("Customer id:"+c3.getCid()+" Customer name:"+c3.getName()+" Customer address:"+c3.getAddress()+" Customer city:"+c3.getCity());
				System.out.println("Customer id:"+c4.getCid()+" Customer name:"+c4.getName()+" Customer address:"+c4.getAddress()+" Customer city:"+c4.getCity());
			
			}
		}
