package com.example.demo.controller;

import com.example.demo.jpa.SsdTest;
import com.example.demo.repository.jpa.SsdTestRepository;
import com.example.demo.service.SsdTestService;
import com.example.demo.service.SsdTestServiceImpl;
import com.example.demo.vo.ResultVO;
import com.example.demo.vo.SsdTestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Result;
import java.util.Optional;

@RestController
@RequestMapping("ssd")
public class SsdTestController {

    @Autowired
    private SsdTestRepository ssdTestRepository;
    @Autowired
    private SsdTestServiceImpl  ssdTestService;

    @PostMapping("/createSsdTest")
    public ResultVO createSsdTest(@RequestBody SsdTest ssdTest){
        ssdTestRepository.save(ssdTest);
        return  ResultVO.success();
    }

    @GetMapping("/{age}/age")
    public ResultVO getSsdTest(@PathVariable int age){
       SsdTestVO ssdTestVO = ssdTestRepository.findByAge(age);
        return new ResultVO<>(ssdTestVO);
    }
    @PutMapping("/updateSsdTest")
    public ResultVO updateSsdTest(@RequestBody SsdTest ssdTest){
        ssdTestRepository.save(ssdTest);
        return new ResultVO();
    }
    @DeleteMapping("/{id}")
    public ResultVO deleteByIdSsdTest(@PathVariable Long id){
        ssdTestRepository.deleteById(id);
        return new ResultVO();
    }

    @GetMapping("/VO/{id}")
    public ResultVO getSsdTestVO(@PathVariable Long id){
       SsdTestVO ssdTestVO = ssdTestService.selectByIdVO(id);
       if(ssdTestVO == null){
        return  ResultVO.USER_NOT_FOUND;
       }
       return new ResultVO(ssdTestVO);
    }



}
