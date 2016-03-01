/**
 * 
 */
package com.ravi.angularmvc.domain;

import java.util.ArrayList;

/**
 * @author Ravi
 *
 */
public class Applications {

	private String application;
	private ArrayList<Environments> environmentList;

	/**
	 * @return the application
	 */
	public String getApplication() {
		return application;
	}

	/**
	 * @param application
	 *            the application to set
	 */
	public void setApplication(String application) {
		this.application = application;
	}

	/**
	 * @return the environmentList
	 */
	public ArrayList<Environments> getEnvironmentList() {
		return environmentList;
	}

	/**
	 * @param environmentList
	 *            the environmentList to set
	 */
	public void setEnvironmentList(ArrayList<Environments> environmentList) {
		this.environmentList = environmentList;
	}

}
