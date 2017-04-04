
package javaprj;
class Student {

	private String hakgwa;
	private int stdnum;
		
	public String getHakgwa(){ 	//get
		return hakgwa;
	}
	
	public int getstdNum(){ //get
		return stdnum;
	}
	
	public void setHakgwa(String h){ //set
		hakgwa = h;
	}
	
	public void setstdNum(int n){	//set
		stdnum = n;
	}

	public static void main(String args[]){
		Student std = new Student();
		std.setHakgwa("컴퓨터정보공학과");
		std.setstdNum(20130672);
		
		System.out.println("학과 :"+std.getHakgwa());
		System.out.println("학번 :"+std.getstdNum());
	}
}
