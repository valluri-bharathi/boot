package com.cg.tms_sprint5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.tms_sprint5.exception.ProgramException;

@SpringBootApplication

public class TmsSprint5Application  {

	public static void main(String[] args) throws ProgramException{
		SpringApplication.run(TmsSprint5Application.class, args);
	}

}
