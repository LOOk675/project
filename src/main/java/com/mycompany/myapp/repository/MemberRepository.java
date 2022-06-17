package com.mycompany.myapp.repository;

import com.mycompany.myapp.dto.Member;

public interface MemberRepository {

    // 회원가입 처리
    void register(Member member) throws Exception;
    	int insert(Member member);
    	int update(Member member);
    	int delete(String email);
    	Member selectOne(String email);
    	int update_emailauth(String email);
    	int insert_simplejoin(Member member);
}


