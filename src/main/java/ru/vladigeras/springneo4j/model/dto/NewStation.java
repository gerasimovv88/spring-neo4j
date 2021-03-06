package ru.vladigeras.springneo4j.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vladi_geras on 09.01.2020
 */
@ApiModel(description = "Station info")
public class NewStation {
	@ApiModelProperty("station name")
	private String name;

	@ApiModelProperty("line identifier")
	private Long lineId;

	@ApiModelProperty("neighbors")
	private List<Neighbor> neighbors = new ArrayList<>();

	public String getName() {
		return name;
	}

	public NewStation setName(String name) {
		this.name = name;
		return this;
	}

	public Long getLineId() {
		return lineId;
	}

	public NewStation setLineId(Long lineId) {
		this.lineId = lineId;
		return this;
	}

	public List<Neighbor> getNeighbors() {
		return neighbors;
	}

	public NewStation setNeighbors(List<Neighbor> neighbors) {
		this.neighbors = neighbors;
		return this;
	}
}
