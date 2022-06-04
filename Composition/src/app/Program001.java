package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities001.Comment;
import entities001.Post;

public class Program001 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment com1 = new Comment("Have a nice trip");
		Comment com2 = new Comment("Wow that's awesome!");
		String title = "Traveling to New Zeland";
		Date momment = date.parse("21/06/2018 13:05:44");
		String content = "I'm going to visit this wonderful coutry!";
		Post post = new Post(momment, title, content);
		post.addComments(com1);
		post.addComments(com2);
		
		System.out.println(post);
	}

}
