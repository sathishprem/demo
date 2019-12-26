package org.college;

public class College {
public void collegeCode() {
System.out.println("cc");
}
public void collegeName() {
System.out.println("ca");
}
public void collegeRank() {
System.out.println("cr");
}
public static void main(String[] args) {
	College C=new College();
	C.collegeCode();
	C.collegeName();
	C.collegeRank();
	Student S=new Student();
	S.studentName();
	S.studentDept();
	S.studentId();
	Hostel H=new Hostel();
	H.hostelName();
	Dept D=new Dept();
	D.deptName();
}
}

