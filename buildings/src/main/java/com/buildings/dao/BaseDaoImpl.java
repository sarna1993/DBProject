package com.buildings.dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import com.buildings.dao.interfaces.BaseDao;

@Transactional
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

	@Override
	public Query createQuery(String query) {
		return entityManager.createQuery(query);
	}

	@Override
	public <T> TypedQuery<T> createQuery(String query, Class<T> clas) {
		return entityManager.createQuery(query, clas);
	}
	
	@Override
	public Query createNativeQuery(String query) {
		return entityManager.createNativeQuery(query);
	}
	
	@Override
	public Query createNamedQuery(String name) {
		return entityManager.createNamedQuery(name);
	}
}
