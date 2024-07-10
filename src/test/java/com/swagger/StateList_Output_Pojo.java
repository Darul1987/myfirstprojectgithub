package com.swagger;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class StateList_Output_Pojo {

	private int status;
	 private String message;
	 private ArrayList<DatumStateList> data;
}
