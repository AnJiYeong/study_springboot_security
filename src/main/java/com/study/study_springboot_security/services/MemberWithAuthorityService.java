package com.study.study_springboot_security.services;

import com.study.study_springboot_security.daos.sharedDao;

public class MemberWithAuthorityService {
    String sqlMapId = "Memberwithauthority.insertWithUID";
    Object result = sharedDao.insert(sqlMapId, dataMap);
    return result;
}
