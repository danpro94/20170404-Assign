package systemprj;
public class StudentPlus {

    private String hakgwa;
    private int stdnum;

    public String getHak() {	//get
        return hakgwa;
    }

    public int getstdNum() {	//get
        return stdnum;
    }
    
    public void setHak(String hakgwa) {   //set
        this.hakgwa = hakgwa;
    }

    public void setstdNum(int stdnum) {   //set
        this.stdnum = stdnum;
    }
    

    public static void main(String[] args) {
        StudentPlus student = new StudentPlus();
        student.setHak("컴퓨터정보공학과");
        student.setstdNum(20130672);

        System.out.println("학과 :" + student.getHak());
        System.out.println("학번 :" + student.getstdNum());
    }
}
