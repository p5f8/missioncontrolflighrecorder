package com.mission.control.missioncontrolflighrecorder.service;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.mission.control.missioncontrolflighrecorder.model.Cliente;
import com.mission.control.missioncontrolflighrecorder.model.ComparadorClientes;

@Service
public class MeuService {

	public String run() throws IOException {
		
		long start = System.nanoTime();
		
		File clientesCSV = ResourceUtils.getFile("classpath:clientes.csv");
		
		List<String> linhas = Files.readAllLines(Paths.get(clientesCSV.getAbsolutePath()));
		
		List<String[]> arrays = new ArrayList<>();
		for(String linha : linhas) {
			arrays.add(linha.split(","));
		}
		
		
		Collection<Cliente> clientes = new TreeSet<>(new ComparadorClientes());
		for(String arr[] : arrays) {
			clientes.add(new Cliente(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]));
		}
		
		int count = 0;
		try(PrintWriter out = new PrintWriter(new File("clientes-ordenados.csv"))) {
			for(Cliente c : clientes) {
				count++;
				
				out.print(c.getId());
				out.print(", ");
				out.print(c.getNome());
				out.print(", ");
			}
		}
		
		long end = System.nanoTime();
		
		
		
		StringBuilder result = new StringBuilder();
		
		result.append("Concluída ordenação de [" + count + "] clientes");
		result.append("Tempo total: " + (end - start) / 1000000000.0 + " s");
		
		return result.toString();
	}

}
