package DMQ1;

import java.util.List;

public class Customer {
private int custid;
private String custname;
private List <Order> order ;
//One to many relationship 
//one customer can have many orders
public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}
public String getCustname() {
	return custname;
}
public void setCustname(String custname) {
	this.custname = custname;
}





	
}
