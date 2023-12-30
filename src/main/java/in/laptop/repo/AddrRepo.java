package in.laptop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.laptop.entity.AddrEntity;

public interface AddrRepo extends JpaRepository<AddrEntity, Integer> {

}
