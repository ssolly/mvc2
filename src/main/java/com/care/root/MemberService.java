package com.care.root;

import org.springframework.stereotype.Service;

// Service : 연산

@Service
public class MemberService {

	MemberDAO dao;
	
	public MemberService() {
		System.out.println("서비스 생성자 실행");
	}
	
// java문법 스타일
//	public int insert() {
//		dao = new MemberDAO();
//		return dao.insert();
//	}
	
	public int insert() {
		return dao.insert();
	}
}
