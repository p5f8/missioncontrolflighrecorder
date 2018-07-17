package com.mission.control.missioncontrolflighrecorder.model;

import java.util.Comparator;

public class ComparadorClientes implements Comparator<Cliente> {

	@Override
	public int compare(Cliente o1, Cliente o2) {
		int result = o1.getNome().compareTo(o2.getNome());

		if (result == 0) {
			result = o1.getEmail().compareTo(o2.getEmail());
		}
		if (result == 0) {
			result = o1.getIp().compareTo(o2.getIp());
		}
		if (result == 0) {
			result = o1.getMacAddress().compareTo(o2.getMacAddress());
		}
		if (result == 0) {
			result = o1.getId() - o2.getId();
		}

		return 0;
	}

}
