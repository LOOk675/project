package com.mycompany.myapp.controller;

import javax.inject.Inject;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mycompany.myapp.dto.Member;
import com.mycompany.myapp.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	 private final MemberService memberService;

	 @Inject
	    public MemberController(MemberService memberService) {
	        this.memberService = memberService;
	    }

	    // 회원가입 페이지
	    @RequestMapping(value = "/register", method = RequestMethod.GET)
	    public String registerGET() throws Exception {
	        return "/member/register";
	    }
	    // 회원가입 처리
	    @RequestMapping(value = "/register", method = RequestMethod.POST)
	    public String registerPOST(Member member, RedirectAttributes redirectAttributes) throws Exception {

	        String hashedPw = BCrypt.hashpw(member.getUser_pw(), BCrypt.gensalt());
	        member.setUser_pw(hashedPw);
	        memberService.register(member);
	        redirectAttributes.addFlashAttribute("msg", "REGISTERED");

	        return "redirect:/member/login";
	    }

	    // 로그인 페이지 (임시로 여기에 작성하고 추후 UserLoginController에서 다시 작성)
	    @RequestMapping(value = "/login", method = RequestMethod.GET)
	    public String login() throws Exception {
	        return "/member/login";
	    }
}
