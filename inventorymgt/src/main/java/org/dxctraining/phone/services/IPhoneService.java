package org.dxctraining.phone.services;

import com.dxctraining.phone.entities.Phone;

public interface IPhoneService {
	Phone add(Phone phone);
	Phone findPhoneBySerialnum(int serialnum);
		 void remove(int serialnum);


}
