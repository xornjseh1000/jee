/**
 * 
 */
package grade;

/**
 * @date :2016. 6. 21.
 * @author :김동혁
 * @file :GradeBean.java
 * @story :
 */
public class GradeBean {
	private String id, grade, seq,examDate;
	private int java, sql, html, javascript;

	
	
	
	

	public String getExamDate() {
		return examDate;
	}

	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getSql() {
		return sql;
	}

	public void setSql(int sql) {
		this.sql = sql;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}

	public int getJavascript() {
		return javascript;
	}

	public void setJavascript(int javascript) {
		this.javascript = javascript;
	}

	@Override
	public String toString() {
		return "성적표 [No.=" + seq + ",ID:" + id + ", 학점:" + grade + ",  java:" + java + ", sql:" + sql + ", html5:"
				+ html + ", javascript:" + javascript + "]";
	}

}
