package com.example.kaveritietokanta;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.example.kaveritietokanta.domain.Kaveri;
import com.example.kaveritietokanta.domain.KaveriRepository;

@SpringBootApplication
public class KaveritietokantaApplication extends SpringBootServletInitializer {

	private static final Logger log = LoggerFactory.getLogger(KaveritietokantaApplication.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(KaveritietokantaApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(KaveritietokantaApplication.class, args);
	}

	@Bean
	public CommandLineRunner friendAdresses(KaveriRepository repository) {
		return (args) -> {
			log.info("tallennetaan pari kaveria");
			Kaveri kaveri = new Kaveri("Sakari ja Leila Lukkarinen", "Ojahaantie 8 B 28", "01600", "Vantaa", "Uusimaa",
					"FINLAND");
			Kaveri kaveri2 = new Kaveri("Minna ja Mikko Minkkinen", "Lauttasaarentie 38 C 26", "00200", "Helsinki",
					"Uusimaa", "FINLAND");

			/*
			 * Kaveri kaveri3 = new Kaveri("Amit Mehta", "4311 Wilshire Blvd. # 401",
			 * "90010", "Los Angeles", "CA", "USA"); Kaveri kaveri4 = new
			 * Kaveri("Anssi Hoikkanen", "20 Rockley Court, Rockley Road", "W14 0DB",
			 * "London", "London", "United Kingdom"); Kaveri kaveri5 = new
			 * Kaveri("Dennis Goodrich", "309 Wellons Drive", "50014", "Ames", "IA", "USA");
			 * Kaveri kaveri6 = new Kaveri("Elena Cooke", "110 Richey Road", "29669", "USA",
			 * "SC", "USA"); Kaveri kaveri7 = new Kaveri("Heikki ja Maj Salminen",
			 * "110 Richey Road", "29669", "USA", "SC", "USA"); Kaveri kaveri8 = new
			 * Kaveri("Elena Cooke", "110 Richey Road", "29669", "USA", "SC", "USA"); Kaveri
			 * kaveri9 = new Kaveri("Elena Cooke", "110 Richey Road", "29669", "USA", "SC",
			 * "USA"); Kaveri kaveri10 = new Kaveri("Elena Cooke", "110 Richey Road",
			 * "29669", "USA", "SC", "USA"); Kaveri kaveri11 = new Kaveri("Elena Cooke",
			 * "110 Richey Road", "29669", "USA", "SC", "USA"); Kaveri kaveri12 = new
			 * Kaveri("Elena Cooke", "110 Richey Road", "29669", "USA", "SC", "USA");
			 * 
			 * 
			 * 31 Amit Mehta 4311 Wilshire Blvd. # 401 90010 Los Angeles CA USA POISTA 28
			 * Anssi Hoikkanen 20 Rockley Court, Rockley Road W14 0DB London United Kingdom
			 * POISTA 26 Dennis Goodrich 309 Wellons Drive 50014 Ames IA USA POISTA 30 Elena
			 * Cooke 110 Richey Road 29669 Pelzer SC USA POISTA 23 Heikki ja Maj Salminen
			 * Latvatie 6 01820 Nurmijärvi Uusimaa FINLAND POISTA 8 Jane and Bill Helling
			 * 301 N. Grace Ave. 47933 Crawfordsville IN USA POISTA 22 Kaisa ja Juhani Dabek
			 * Mesenaatintie 4 B 11 00350 Helsinki Uusimaa FINLAND POISTA 27 Kirsi Makkonen
			 * perheineen Kumpurannantie 57 58200 Kerimäki Karjala Finland POISTA 12 Manis
			 * Shakirova Vasilevskogo 14-27 153037 Ivanovo RUSSIA POISTA 3 Minna ja Mikko
			 * Minkkinen Lauttasaarentie 38 C 26 00200 Helsinki Uusimaa FINLAND POISTA 2
			 * Sakari ja Leila Lukkarinen Ojahaantie 8 B 28 01600 Vantaa Uusimaa FINLAND
			 * POISTA 7 Sami Itkonen Mäenrinne 3-5 L 99 02160 Helsinki Uusimaa FINLAND
			 * POISTA 25 Sandra ja Arto Teräs Forggenseestrasse 1 87642 Halblech Bavaria
			 * Germany POISTA 9 Simo ja Kaija Pihamaki Korventie 281 05100 Roykka Uusimaa
			 * FINLAND POISTA 29 Tammy ja Wayne Cooke 53275 Pineridge Drive 48051
			 * Chesterfield MI USA POISTA 6 Tuija Auvinen Lehikuja 10 13720 Parola Häme
			 * FINLAND
			 */

			repository.save(kaveri);
			repository.save(kaveri2);

			/*
			 * 
			 * INSERT INTO `Osoitteet` VALUES (2,'Sakari ja Leila Lukkarinen','Ojahaantie 8
			 * B 28','01600','Vantaa','Uusimaa','FINLAND'), (3,'Minna ja Mikko
			 * Minkkinen','Lauttasaarentie 38 C 26','00200','Helsinki','Uusimaa','FINLAND'),
			 * (4,'Kirsi Makkonen perheineen','Akselinkatu 3 B
			 * 11','57130','Savonlinna','Karjala','FINLAND'), (5,'Wayne and Tammy Cooke','11
			 * Pinerock DR.','29690','Travelers Rest','SC','USA'), (6,'Tuija
			 * Auvinen','Lehikuja 10','13720','Parola','Häme','FINLAND'), (7,'Sami
			 * Itkonen','Mäenrinne 3-5 L 99','02160','Helsinki','Uusimaa','FINLAND'),
			 * (8,'Jane and Bill Helling','301 N. Grace
			 * Ave.','47933','Crawfordsville','IN','USA'), (9,'Simo ja Kaija
			 * Pihamaki','Korventie 281','05100','Roykka','Uusimaa','FINLAND'), (12,'Manis
			 * Shakirova','Vasilevskogo
			 * 14-27','153037','Ivanovo','','Russia'),(13,'&#1076;','','','','','');
			 * 
			 */

			/*
			 * 
			 * // Create users: admin/admin user/user User user1 = new User("user",
			 * "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER"); User
			 * user2 = new User("admin",
			 * "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			 * urepository.save(user1); urepository.save(user2);
			 */

			log.info("haetaan kaikki kaverit tietokannasta");

		};
	}

}
