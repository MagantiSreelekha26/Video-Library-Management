package com.example.adminservice.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

import com.example.adminservice.model.Admin;
@Repository
@Transactional
public interface AdminDao extends JpaRepository<Admin,Integer> {

}
