package com.swagger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Login_Output_pojo {
	    private int status;
	    private String message;
	    private Login data;
	    private String refer_msg;
	    private int cart_count;
	    private String role;
}
