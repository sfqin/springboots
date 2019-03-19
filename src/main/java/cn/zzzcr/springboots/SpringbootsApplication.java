package cn.zzzcr.springboots;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.zzzcr.springboots.dao.mapper")
public class SpringbootsApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootsApplication.class, args);
	}

}
