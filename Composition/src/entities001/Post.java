package entities001;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title, content;
	private int likes;
	private List<Comment> comments = new ArrayList<>();

	public Post(Date moment, String title, String content, int likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	public Post(Date moment, String title, String content) {
		this.moment = moment;
		this.title = title;
		this.content = content;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
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

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}
	
	public void addComments(Comment comment) {
		this.comments.add(comment);
	}
	
	public void removeComments(Comment comment) {
		this.comments.remove(comment);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.title + "\n");
		sb.append(this.likes + " Likes - " + dateFormat.format(this.moment) + "\n");
		sb.append(this.content + "\n");
		
		for (Comment comment : this.comments) {
			sb.append(comment.getComment() + "\n");
		}
		
		return sb.toString();
	}
}
