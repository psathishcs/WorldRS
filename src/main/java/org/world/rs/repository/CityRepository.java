package org.world.rs.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.world.rs.entity.City;

public class CityRepository implements WorldRepository{
	@Autowired
	private SessionFactory _sessionFactory;
	
	private Session getSession(){
		return _sessionFactory.getCurrentSession();
	}
	
	@Override
	public City getByID(Object id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<City> getAll() {
		List<City> citys = getSession().createQuery("from City").list();
		return citys;
	}
}
