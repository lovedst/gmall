package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.beans.UmsMember;
import com.atguigu.gmall.user.mapper.UmsMemberMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServieImpl implements UserService {

    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Override
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMembers= umsMemberMapper.selectAllUser();

        return umsMembers;
    }

    @Override
    public UmsMember getUserById(String id) {

        UmsMember umsMember = new UmsMember();

        umsMember.setId(id);

        UmsMember umsMember1=umsMemberMapper.selectOne(umsMember);

        return umsMember1;
    }


}
