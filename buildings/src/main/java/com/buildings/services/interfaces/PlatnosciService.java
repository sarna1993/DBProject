package com.buildings.services.interfaces;

import com.buildings.model.HistPlat;
import com.buildings.model.Rozliczenie;

public interface PlatnosciService {
	public void bookNewPayment(HistPlat platnosc);
	public void createMonthlyCharges(Rozliczenie rozliczenie);
}
