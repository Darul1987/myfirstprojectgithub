package com.firstflight;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employeepojo1 {
	
	private int page;
    private int per_page;
    private int total;
    private int total_pages;
    private ArrayList<Employeepojo> data;
    private Employeepojo2 support;

}
