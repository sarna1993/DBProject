package com.buildings.dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.buildings.dao.interfaces.BaseDao;

@SuppressWarnings("hiding")
public class BaseDaoImpl<Entity extends Serializable> implements BaseDao<Entity> {

	@PersistenceContext
	private EntityManager entityManager;
	
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    protected Session getSession() {
    	return entityManager.unwrap(Session.class);
    }
    
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Entity persist(Entity entity) {
		entityManager.persist(entity);
		return entity;
	}

	@Override
	public Entity merge(Entity entity) {
		return entityManager.merge(entity);
	}

	@Override
	public void remove(Entity entity) {
		entityManager.remove(entity);
	}

	@Override
	public Entity refresh(Entity entity) {
		entityManager.refresh(entity);
		return entity;
	}

	@Override
    public Entity find(Class<Entity> clas, Object entityId) {
    	return entityManager.find(clas, entityId);
    }

	@Override
	public void clear() {
		entityManager.clear();
	}

	@Override
	public Criteria createCriteria(Class<? extends Serializable> clas) {
		return getSession().createCriteria(clas);
	}

	@Override
	public void flush() {
		entityManager.flush();
	}

	@Override
	public void flushClear() {
		entityManager.flush();
		entityManager.clear();
	}

}
