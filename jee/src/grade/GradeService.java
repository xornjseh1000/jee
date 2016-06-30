/**
 * 
 */
package grade;

/**
 * @date   :2016. 6. 21.
 * @author :김동혁
 * @file   :GradeService.java
 * @story  :
 */
public interface GradeService {

	public abstract int total(int kor,int eng, int math);
	public int avg(int total);
	public String grade(int avg);
}

