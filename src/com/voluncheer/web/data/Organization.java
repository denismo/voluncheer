package com.voluncheer.web.data;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Organization {
	@PrimaryKey
	@Persistent (valueStrategy=IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	public String name;
	
	@Persistent
	public String orgType;
}
