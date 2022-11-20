package com.sofia.dataloader;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sofia.dataloader.beans.Fest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.List;

@SpringBootApplication
@Slf4j
public class DataLoaderApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(DataLoaderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();

		List<Fest> festList = objectMapper.readValue(new File("src/main/resources/json/panorama-des-festivals.json"), new TypeReference<List<Fest>>(){});
		log.info(festList.toString());

	}
}
