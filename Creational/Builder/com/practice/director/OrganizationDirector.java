package com.practice.director;

import com.practice.builder.CoFounderRoomBuilder;
import com.practice.builder.EmployeeRoomBuilder;
import com.practice.model.Electronic;
import com.practice.model.Furniture;

/**
 * Object Director : constructing object which have repetitive/fixed task
 * @author Manish Luste
 *
 */
public class OrganizationDirector {

	public OrganizationDirector() {
		super();
	}
	
	public void constructCoFounderCabin(CoFounderRoomBuilder ceoRoomBuilder) {
		// construct the room 
		ceoRoomBuilder.setElectronic(new Electronic(0, 2));
		ceoRoomBuilder.setFurnitur(new Furniture(4, 1));
	}
	
	public void constructEmployeeCabin(EmployeeRoomBuilder empRoomBuilder) {
		// construct the room 
		empRoomBuilder.setType("EMP");
		empRoomBuilder.setElectronic(new Electronic(1, 3));
		empRoomBuilder.setFurnitur(new Furniture(9, 3));
	}

}
