package com.voluncheer.web.data;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Achievement {
	@PrimaryKey
	@Persistent (valueStrategy=IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	public Key opportunity;
	
	@Persistent
	public Date date;
	
	@Persistent
	public float duration;	
}
