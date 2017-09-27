package com.buildings.dao.interfaces;

import java.util.List;

import com.buildings.model.Wynajem;

public interface WynajemDao extends BaseDao<Wynajem> {

	List<Wynajem> getWynajemList();
}
