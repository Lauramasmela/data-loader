package com.sofia.dataloader;

import com.sofia.dataloader.service.FestService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@AllArgsConstructor
public class DataLoaderApplication implements CommandLineRunner {

	private FestService festService;

	public static void main(String[] args) {

		SpringApplication.run(DataLoaderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if(args.length > 0 && args[0].equals("load")){
			festService.saveDataset();
		}else {
			System.out.println("array vide");
		}

	}
}
