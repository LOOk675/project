package com.mycompany.myapp.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mycompany.myapp.dto.Member;
import com.mycompany.myapp.repository.MemberRepository;


@Service
public class MemberServiceImpl implements MemberService{
	
	   private final MemberRepository memberRepository;

	    @Inject
	    public MemberServiceImpl(MemberRepository memberRepository) {
	        this.memberRepository = memberRepository;
	    }

	    // 회원 가입 처리
	    @Override
	    public void register(Member member) throws Exception {
	    	memberRepository.register(member);
	    }
}
