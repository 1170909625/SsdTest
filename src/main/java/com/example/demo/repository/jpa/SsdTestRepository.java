package com.example.demo.repository.jpa;


import com.example.demo.jpa.SsdTest;
import com.example.demo.vo.SsdTestVO;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SsdTestRepository extends CrudRepository<SsdTest,Long>  {
    Optional<SsdTest> findById(Long id);

     SsdTestVO findByAge(int age);



    @Override
    void deleteById(Long id);


}
