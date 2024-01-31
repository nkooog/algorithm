public class Student implements Comparable<Student>{

    private int no;
    private String name;

    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Student(int no, String name) {
        super();
        this.no = no;
        this.name = name;
    }
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 정렬하는 함수
     * 양수 : 자리바꿈 일어남.
     * 0 :
     * 음수 :
     */
    @Override
    public int compareTo(Student another) {
        return this.no - another.no;
    }

    //객체를 print해 확인하기위한 오버라이드
    @Override
    public String toString() {
        return "Student [no=" + no + ", name=" + name + "]";
    }
}