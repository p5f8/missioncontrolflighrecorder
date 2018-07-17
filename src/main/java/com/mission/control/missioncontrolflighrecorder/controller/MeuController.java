package com.mission.control.missioncontrolflighrecorder.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mission.control.missioncontrolflighrecorder.service.MeuService;

@RestController
public class MeuController {
	
	@Autowired
	MeuService service;
	
	@RequestMapping(method=RequestMethod.GET, value="/")
	public ResponseEntity<String> executa() throws IOException {
		StringBuilder result = new StringBuilder("ok = mensagem : ");
		String retorno = service.run();
		return new ResponseEntity<String>(result.append(retorno).toString(), HttpStatus.OK);
	}

}
