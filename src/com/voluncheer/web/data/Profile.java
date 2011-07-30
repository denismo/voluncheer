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
public class Profile {

	@PrimaryKey
	@Persistent (valueStrategy=IdGeneratorStrategy.IDENTITY)
	private Key key;

	public List<Achievement> achievements; 
	
	public static Profile getProfile() {
		PersistenceManager man = PMF.get().getPersistenceManager();
		Query q = man.newQuery(Profile.class);
		List<Profile> list = (List<Profile>)q.execute();
		if (list == null || list.size() == 0) {
			Profile prof = new Profile();
			man.makePersistent(prof);
			return prof;
		} else {
			return list.get(0);
		}
	}
}
