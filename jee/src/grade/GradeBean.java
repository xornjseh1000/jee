/**
 * 
 */
package grade;


/**
 * @date   :2016. 6. 21.
 * @author :김동혁
 * @file   :GradeBean.java
 * @story  :
 */
public class GradeBean {
	private int kor,eng,math;
	private String name;
	
	
	public GradeBean(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	
	
	public String getname(){
		return name;
	}
	public int getkor(){
		return kor;
	}
	public int geteng(){
		return eng;
	}
	public int getmath(){
		return math;
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GradeBean [kor=" + kor + ", eng=" + eng + ", math=" + math + ", name=" + name + "]";
	}

	
	
	
	


	
}


