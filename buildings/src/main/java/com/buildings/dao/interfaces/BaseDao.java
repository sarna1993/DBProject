package com.buildings.dao.interfaces;

import java.io.Serializable;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.springframework.beans.factory.InitializingBean;

public interface BaseDao <Entity> extends InitializingBean {

	/**
	 * Zapis obiektu do bazy
	 */
	Entity persist (Entity entity);
	
	/**
	 * Aktualizacja obiektu
	 */
	Entity merge(Entity entity);
	
	/**
	 * Usuniecie obiektu z bazy
	 */
	void remove (Entity entity);
	 
	/**
	 * Odwieza encje danymi z bazy
	 */
	 Entity refresh(Entity entity);
	 
	 /**
	  * Wyszukanie encji po identyfikatorze
	  */
	 Entity find(Class<Entity> aClazz, Object entityId);
	 
	 /**
	  * Czyszczenie pamieci
	  */
	 void clear();
	 
	 /**
	  * Synchronizuje dane sesji z baza
	  */
	 void flush();
	 
	 /**
	  * Synchronizacja oraz czyszczenie
	  */
	 void flushClear();

	 /**
	  * Tworzy kryterium wyszukiwania dla danej klasy
	  */
	 Criteria createCriteria (Class<? extends Serializable> aClass);
	 
	 /**
	  * Tworzy zapytanie HQL (zmapowane obiekty)
	  */
	 Query createQuery(String query);
	 
	 /**
	  * Tworzy zapytanie, wynik mapowany do klasy Class<T>
	  */
	 <T> TypedQuery<T> createQuery(String query, Class<T> clas);
	 
	 /**
	  * Twworzy zapytanie natywne
	  */
	 Query createNativeQuery(String query);
	 
	 /**
	  * Tworzy zapytanie po nazwie
	  */
	 Query createNamedQuery(String name);
}
