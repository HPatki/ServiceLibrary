package com.gap.inventory.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Period {
	private PeriodType start;
	private PeriodType end;
	public PeriodType getStart() {
		return start;
	}
	public void setStart(PeriodType start) {
		this.start = start;
	}
	public PeriodType getEnd() {
		return end;
	}
	public void setEnd(PeriodType end) {
		this.end = end;
	}
}
