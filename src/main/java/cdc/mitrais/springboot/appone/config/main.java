package cdc.mitrais.springboot.appone.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class main {

	public static void main(String[] args) {
		String encoded=new BCryptPasswordEncoder().encode("password");
		System.out.println(encoded);

	}

}
