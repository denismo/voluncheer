package com.voluncheer.web.data;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Opportunity {

	@PrimaryKey
	@Persistent (valueStrategy=IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	public Date date;
	
	@Persistent
	public float duration;	

	@Persistent
	public String name;
	
	@Persistent
	public String description;
	
	@Persistent
	public String location;
	
	@Persistent
	public int points;
	
	@Persistent
	public Key organization;
	
	@Persistent
	public String oppType;
}
