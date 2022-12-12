package com.example.demo;

import java.util.List;

public class DomainList {

	public List<Domain> domains;

	public List<Domain> getDomains() {
		return domains;
	}

	public void setDomains(List<Domain> domains) {
		this.domains = domains;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((domains == null) ? 0 : domains.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DomainList other = (DomainList) obj;
		if (domains == null) {
			if (other.domains != null)
				return false;
		} else if (!domains.equals(other.domains))
			return false;
		return true;
	}

	public DomainList(List<Domain> domains) {
		super();
		this.domains = domains;
	}

	public DomainList() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DomainList [domains=" + domains + "]";
	}

}
