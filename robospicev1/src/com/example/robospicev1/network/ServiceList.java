package com.example.robospicev1.network;

import com.example.robospicev1.model.Example;

import retrofit.http.GET;

public interface ServiceList {

	@GET("/boot/get")
	public Example getLeads();
}
