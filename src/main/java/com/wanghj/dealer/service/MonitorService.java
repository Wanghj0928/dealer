package com.wanghj.dealer.service;

import com.wanghj.dealer.domain.Monitor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wanghj
 * @create 2018-01-05 17:06
 **/
public interface MonitorService {

    /**
     * 根据imei号查询记录
     *
     * @param imei
     * @return
     */
    Monitor findByImei(String imei);

    List<Monitor> findAll();
}
