package com.userfeedback.repositories;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.userfeedback.entities.Feedback;

import lombok.Data;

@Entity
@Data
public class FeedbackRepository {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	private String comments;
	private int rating;
	private String user;
	
	public FeedbackRepository()
	{
		
	}
	public FeedbackRepository(Integer id, String comments, int rating, String user)
	{
		this.id = id;
		this.comments = comments;
		this.rating = rating;
		this.user = user;
	}
	
	@Override
	public String toString()
	{
		return "<br><h3>" + user + " [" + id + "]" + " commented:</h3><h4>\"" + comments + "\"  and rated: " + rating + "</h4><br>";
	}
	public void save(Feedback f) {
		// TODO Auto-generated method stub
		
	}
	public boolean existsById(int i) {
		// TODO Auto-generated method stub
		return false;
	}
	public Iterable<Feedback> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}