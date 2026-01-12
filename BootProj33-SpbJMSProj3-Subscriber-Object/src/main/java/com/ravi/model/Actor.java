package com.ravi.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Actor implements Serializable{

	private Integer aid;
	private String aname;
	private String addrs;
}
