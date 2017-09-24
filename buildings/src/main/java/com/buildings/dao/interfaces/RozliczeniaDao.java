package com.buildings.dao.interfaces;

import java.util.List;

import com.buildings.model.Rozliczenie;

public interface RozliczeniaDao extends BaseDao<Rozliczenie> {

	List<Rozliczenie> getRozliczenieList(Integer idLokat);
}
