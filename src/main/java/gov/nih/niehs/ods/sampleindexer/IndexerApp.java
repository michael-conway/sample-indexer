/**
 * 
 */
package gov.nih.niehs.ods.sampleindexer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author conwaymc
 *
 */
@SpringBootApplication
public class IndexerApp implements CommandLineRunner {

	public IndexerApp() {
	}

	public static void main(String[] args) {
		SpringApplication.run(IndexerApp.class, args);
	}

	// Only if I implement the CommandLineRunner interface...
	public void run(String... args) throws Exception {
	}
}
