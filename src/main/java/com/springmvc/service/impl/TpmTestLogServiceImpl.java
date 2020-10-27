package com.springmvc.service.impl;

import com.springmvc.mapper.TpmTestLogMapper;
import com.springmvc.model.TpmTestLog;
import com.springmvc.service.TpmTestLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TpmTestLogServiceImpl implements TpmTestLogService {
    @Autowired
    private TpmTestLogMapper tpmTestLogMapper;

    @Override
    public Long ceshi(TpmTestLog tpmTestLog) {
        return tpmTestLogMapper.insert(tpmTestLog);
    }
}
