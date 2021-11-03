package com.care.root;

import org.springframework.stereotype.Repository;

// DAO : DB와 연관

@Repository
public class MemberDAO {
	
	public MemberDAO() {
		System.out.println("DAO 생성자 실행");
	}
	
	public int insert() {
		System.out.println("DB에 저장 완료");
		return 1;
	}
}
