package com.mycompany.myapp.service;

import com.mycompany.myapp.dto.Member;

public interface MemberService {
	// 회원 가입 처리
    void register(Member member) throws Exception;
}
