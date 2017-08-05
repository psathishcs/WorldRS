package org.world.rs.repository;

import java.util.List;

public interface WorldRepository {
	public List getAll();
	public Object getByID(Object id);
}
