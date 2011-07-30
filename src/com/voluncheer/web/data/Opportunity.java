package com.voluncheer.web.data;

import java.util.Date;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
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
	
	public Opportunity(Key org, Date date, float duration, String name, String description, String location, int points, String oppType) {
		this.organization = org;
		this.date = date;
		this.duration = duration;
		this.name = name;
		this.description = description;
		this.location = location;
		this.points = points;
		this.oppType = oppType;
	}
	
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
	
	public static List<Opportunity> getOpportunities() {
		PersistenceManager man = PMF.get().getPersistenceManager();
		Query q = man.newQuery(Opportunity.class);
		List<Opportunity> list = (List<Opportunity>) q.execute();
		if (list == null || list.size() == 0) {
			Organization org = new Organization();
			org.name = "Australian Museum";
			org.orgType = "Arts/Culture/Heritage";
			man.makePersistent(org);
			list.add(new Opportunity(org.key, new Date(), 2, "Australian Museum", "....", 
					"Domain", 100, "Gardening/Outdoor Activities"));
			org = new Organization();
			org.name = "Sydney City";
			org.orgType = "Emergency Services/Safety";
			man.makePersistent(org);
			list.add(new Opportunity(org.key, new Date(), 2, "Sydney to Surf", "....", 
					"Hyde Park", 100, "Food Service"));			
			man.makePersistentAll(list);
			return list;
		} else {
			return list;
		}
	}
}
