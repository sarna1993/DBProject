package com.buildings.dao.interfaces;

import com.buildings.model.Lokator;

public interface LokatorDao extends BaseDao<Lokator> {

	Integer createIfNotExistsLokator(Integer idKont);

}
