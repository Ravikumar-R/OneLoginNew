/**
 * 
 */
package com.ravi.angularmvc.domain;

import java.util.ArrayList;

/**
 * @author Ravi
 *
 */
public class Domain {

	private String domain;
	private ArrayList<SpecifiedDomain> specifiedDomainList;

	/**
	 * @return the domain
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * @param domain
	 *            the domain to set
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * @return the specifiedDomainList
	 */
	public ArrayList<SpecifiedDomain> getSpecifiedDomainList() {
		return specifiedDomainList;
	}

	/**
	 * @param specifiedDomainList
	 *            the specifiedDomainList to set
	 */
	public void setSpecifiedDomainList(
			ArrayList<SpecifiedDomain> specifiedDomainList) {
		this.specifiedDomainList = specifiedDomainList;
	}

}
