package com.swagger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class AddAddress_Output_Pojo {
	private int status;
    private String message;
    private int address_id;

}
