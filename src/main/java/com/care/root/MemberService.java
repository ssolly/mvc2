package com.care.root;

// Service : 연산

public class MemberService {

	MemberDAO dao;
	
	public int insert() {
		dao = new MemberDAO();
		return dao.insert();
	}
}
