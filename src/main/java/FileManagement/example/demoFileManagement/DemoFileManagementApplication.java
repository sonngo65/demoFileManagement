package FileManagement.example.demoFileManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import DemoFileManagement2.example.demo.storage.StorageProperties;

@EnableConfigurationProperties(StorageProperties.class)
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DemoFileManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFileManagementApplication.class, args);
	}

}
