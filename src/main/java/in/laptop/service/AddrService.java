package in.laptop.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.laptop.entity.AddrEntity;
import in.laptop.repo.AddrRepo;

@Service
public class AddrService {
	
	@Autowired
	private AddrRepo addrRepo;
	
	public void insertData() {
		AddrEntity entity = new AddrEntity(5223, "Hyderbad", "Telengana");
		AddrEntity ae = new AddrEntity(59576, "Guntur", "Andhra");
		addrRepo.saveAll(Arrays.asList(entity, ae));
	}

}
