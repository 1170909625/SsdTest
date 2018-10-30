package com.example.demo.service;

import com.example.demo.jpa.SsdTest;
import com.example.demo.repository.jpa.SsdTestRepository;
import com.example.demo.vo.SsdTestVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SsdTestServiceImpl implements SsdTestService{

    @Autowired
    private SsdTestRepository ssdTestRepository;

    @Override
    public SsdTest insert(SsdTest ssdTest) {
        ssdTestRepository.save(ssdTest);
        return ssdTest;
    }

    @Override
    public SsdTest update(SsdTest ssdTest) {
        ssdTestRepository.save(ssdTest);
        return ssdTest;
    }

    @Override
    public Optional<SsdTest> selectById(Long id) {

        return ssdTestRepository.findById(id) ;
    }

    @Override
    public SsdTestVO selectByIdVO(Long id) {
        Optional<SsdTest> optional = ssdTestRepository.findById(id);

        if(optional.isPresent()){
            SsdTest ssdTest = new SsdTest();
            ssdTest=optional.get();
            SsdTestVO ssdTestVO = new SsdTestVO();
            BeanUtils.copyProperties(ssdTest,ssdTestVO);
            return ssdTestVO;
        }
        return null;
    }

    @Override
    public Boolean deleteById(Long id) {
        return null;
    }
}
