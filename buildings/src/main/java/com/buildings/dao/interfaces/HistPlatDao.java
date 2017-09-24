package com.buildings.dao.interfaces;

import java.util.List;

import com.buildings.model.HistPlat;

public interface HistPlatDao extends BaseDao<HistPlat> {

	List<HistPlat> getHistPlat(Integer idLokat);
}
