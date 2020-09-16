package com.devsuperior.dspesquisa.DTO;

import java.io.Serializable;

public class RecordInsertDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Integer age;
	private Long gameId;
	
	public RecordInsertDTO() {
		
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public Long getGameId() {
		return gameId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}
	
	
}
