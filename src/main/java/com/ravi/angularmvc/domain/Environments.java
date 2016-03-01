/**
 * 
 */
package com.ravi.angularmvc.domain;

import java.util.ArrayList;

/**
 * @author Ravi
 *
 */
public class Environments {

	private String EName;
	private String URL;
	private ArrayList<LoginInformation> loginInformationList;

	/**
	 * @return the eName
	 */
	public String getEName() {
		return EName;
	}

	/**
	 * @param eName
	 *            the eName to set
	 */
	public void setEName(String eName) {
		EName = eName;
	}

	/**
	 * @return the loginInformationList
	 */
	public ArrayList<LoginInformation> getLoginInformationList() {
		return loginInformationList;
	}

	/**
	 * @param loginInformationList
	 *            the loginInformationList to set
	 */
	public void setLoginInformationList(
			ArrayList<LoginInformation> loginInformationList) {
		this.loginInformationList = loginInformationList;
	}

	/**
	 * @return the uRL
	 */
	public String getURL() {
		return URL;
	}

	/**
	 * @param uRL
	 *            the uRL to set
	 */
	public void setURL(String uRL) {
		URL = uRL;
	}
}
