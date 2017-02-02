package ArrayListQ2;

public class Student implements Comparable<Student>{
private String studid;
private String studname;
public String getStudid() {
	return studid;
}
public void setStudid(String studid) {
	this.studid = studid;
}
public String getStudname() {
	return studname;
	}
public void setStudname(String studname) {
	this.studname = studname;
}
public Student(String studid, String studname) {
	super();
	this.studid = studid;
	this.studname = studname;
}

Student(){}
@Override
public String toString() {
	return "Student [studid=" + studid + ", studname=" + studname + "]";
}
@Override
public int compareTo(Student s) {
	// TODO Auto-generated method stub
	return this.getStudid().compareTo(s.getStudid());
}

}


