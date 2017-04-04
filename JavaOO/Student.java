package javaprj;
class Student {

	String hakgwa;
	int stdnum;
	
	void print() {
		System.out.println("학과 :"+hakgwa);
		System.out.println("학번 :"+stdnum);
	}
	
	public static void main(String args[]){
		Student std = new Student();
		std.hakgwa="컴퓨터정보공학과";
		std.stdnum=20130672;
		std.print();
		}
	}