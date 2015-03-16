package com.gestdepo.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.gestdepo.model.vo.Rol;

public class AccountUtils {
	
	public static List<Rol> getPossibleRols() {
		List<Rol> rols = new ArrayList<Rol>();
		rols.add(new Rol(1, "Coordinator"));
		rols.add(new Rol(2, "Coach"));
		rols.add(new Rol(3, "Player"));
		return rols;
	}

	public static List<Rol> transformRols(String choosenRoles) {
		String[] rolsArray = choosenRoles.split(", ");
		List<Rol> rols = new ArrayList<Rol>();
		Arrays.asList(rolsArray).forEach((rol)->rols.add(new Rol(Integer.parseInt(rol),"")));
		return rols;
	}
	
}
