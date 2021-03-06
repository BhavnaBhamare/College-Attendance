package com.pojo;

// Generated Mar 3, 2017 4:37:41 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Busroute generated by hbm2java
 */
public class Busroute implements java.io.Serializable {

	private Integer busRouteId;
	private String routeName;
	private Set busstops = new HashSet(0);

	public Busroute() {
	}

	public Busroute(String routeName, Set busstops) {
		this.routeName = routeName;
		this.busstops = busstops;
	}

	public Integer getBusRouteId() {
		return this.busRouteId;
	}

	public void setBusRouteId(Integer busRouteId) {
		this.busRouteId = busRouteId;
	}

	public String getRouteName() {
		return this.routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public Set getBusstops() {
		return this.busstops;
	}

	public void setBusstops(Set busstops) {
		this.busstops = busstops;
	}

}
