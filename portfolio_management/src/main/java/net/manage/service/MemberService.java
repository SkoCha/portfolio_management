package net.manage.service;

import javax.servlet.http.HttpSession;

import net.manage.domain.MemberVO;

public interface MemberService {

	public void register(MemberVO vo);
	
	public MemberVO login(MemberVO vo);
	
	public void logout(HttpSession session);
}
