package com.example.demo;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.UserRepository;
import com.example.demo.entities.User;
import com.example.demo.util.RandomNamesUtil;

@SpringBootApplication
public class DataUsageApplication /* implements CommandLineRunner */ {

	/*
	 * @Autowired UserRepository repository;
	 */

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DataUsageApplication.class, args);
		UserRepository repository = context.getBean(UserRepository.class);
		/*
		 * user.setName("Jeevan"); user.setImsi("3434342689");
		 * user.setDownloadData(3524); user.setUploadData(1243);
		 * user.setCurrTime(System.currentTimeMillis());
		 */

		/*
		 * User user1 = repository.save(user); System.out.print(user1);
		 */

		for (int i = 0; i <= 100; i++) {
			User user = new User();
			Map<String, String> nameImsi = RandomNamesUtil.getRNames();
			Set<String> names = nameImsi.keySet();
			String name = null;
			for (String n : names) {
				name = n;
			}
			user.setName(name);
			user.setImsi(nameImsi.get(name));
			user.setDownloadData(RandomNamesUtil.getRNumbers());
			user.setUploadData(RandomNamesUtil.getRNumbers());
			user.setCurrTime(System.currentTimeMillis());

			repository.save(user);
		}

	}

	/*
	 * @Override public void run(String... args) throws Exception { User user = new
	 * User(); user.setImsi("34234123"); user.setDownloadData(1000);
	 * user.setUploadData(1243);
	 * 
	 * User user1 = repository.save(user); System.out.print(user1); }
	 */

}
