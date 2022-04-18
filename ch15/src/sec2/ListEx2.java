package sec2;
import java.util.Date;
import java.util.List;
import java.util.Vector;
class Board{
	private String subject;
	private String content;
	private String writer;
	private Date regdate;
	public Board getTitle() {return title;	}
	public void setTitle(Board title) {	this.title = title;	}
	public Board getContent() {	return Content;	}
	public void setContent(Board content) {	Content = content;	}
	public Board getWriter() {	return Writer;	}
	public void setWriter(Board writer) {	Writer = writer;	}
	public Board getRegdate() {	return Regdate;	}
	public void setRegdate(Board regdate) {	Regdate = regdate;	}
	Board title;
	 Board Content;
 Board Writer;
	 Board Regdate;
	
}
public class ListEx2 {

	public static void main(String[] args) {
		List<Board> boardList = new Vector<Board>();
		Date today = new Date();
		Board board6 = new Board();
		
	}

}
