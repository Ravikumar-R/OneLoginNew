/**
 * 
 */
package com.ravi.angularmvc.domain;

import java.util.ArrayList;

/**
 * @author Ravi
 *
 */
public class SpecifiedDomain {

	private String SDName;
	private ArrayList<Applications> applicationsList;

	/**
	 * @return the sDName
	 */
	public String getSDName() {
		return SDName;
	}

	/**
	 * @param sDName
	 *            the sDName to set
	 */
	public void setSDName(String sDName) {
		SDName = sDName;
	}

	/**
	 * @return the applicationsList
	 */
	public ArrayList<Applications> getApplicationsList() {
		return applicationsList;
	}

	/**
	 * @param applicationsList
	 *            the applicationsList to set
	 */
	public void setApplicationsList(ArrayList<Applications> applicationsList) {
		this.applicationsList = applicationsList;
	}
}
