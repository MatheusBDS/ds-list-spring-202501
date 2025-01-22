package br.com.mbs.dslist;

import org.springframework.boot.SpringApplication;

public class TestDslistApplication {

	public static void main(String[] args) {
		SpringApplication.from(DslistApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
