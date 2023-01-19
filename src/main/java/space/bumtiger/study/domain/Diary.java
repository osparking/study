package space.bumtiger.study.domain;

public class Diary {
	private int sno;
	private String title;
	private String content;
	private String studyDate;
	private short durationMin;

	public Diary() {
		super();
	}

	public Diary(int sno, String title, String content, String studyDate,
			short durationMin) {
		super();
		this.sno = sno;
		this.title = title;
		this.content = content;
		this.studyDate = studyDate;
		this.durationMin = durationMin;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStudyDate() {
		return studyDate;
	}

	public void setStudyDate(String studyDate) {
		this.studyDate = studyDate;
	}

	public short getDurationMin() {
		return durationMin;
	}

	public void setDurationMin(short durationMin) {
		this.durationMin = durationMin;
	}

}
