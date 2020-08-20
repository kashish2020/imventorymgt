package org.dxctraining.computer.services;

import com.dxctraining.computer.entities.Computer;

public interface IComputerService {
	Computer add(Computer  computer);
	Computer findComputerBySerialnum(int serialnum);
		 void remove(int serialnum);

}


