package com.huflit.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExamDto {

	private int id;
	
	private String title;
	
	private int time;
	
	private int categoryId;
	
	private String lastUpdate;
	
	private String createDate;
	
}
