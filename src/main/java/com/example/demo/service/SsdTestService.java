package com.example.demo.service;

import com.example.demo.jpa.SsdTest;
import com.example.demo.vo.SsdTestVO;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * create by sunshuaidong on 18/10/25
 */
@Service
public interface SsdTestService {
    /**
     *新增
     * @param ssdTest
     * @return
     */
    SsdTest insert (SsdTest ssdTest);

    /**
     * 修改
     * @param ssdTest
     * @return
     */
    SsdTest update (SsdTest ssdTest);

    /**
     * 查询
     * @param id
     * @return
     */
    Optional<SsdTest> selectById(Long id);

    SsdTestVO selectByIdVO(Long id);

    /**
     * 删除
     * @param id
     */
    Boolean deleteById (Long id);
}
