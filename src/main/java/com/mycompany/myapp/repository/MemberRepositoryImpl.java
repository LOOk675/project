package com.mycompany.myapp.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.dto.Member;

@Repository
public class MemberRepositoryImpl implements MemberRepository {
	
	private static final String NAMESPACE = "com.company.myapp.MemberMapper";

	    private final SqlSession sqlSession;

	    @Inject
	    public MemberRepositoryImpl(SqlSession sqlSession) {
	        this.sqlSession = sqlSession;
	    }

	@Override
	public void register(Member member) throws Exception {
		  sqlSession.insert(NAMESPACE + ".register", member);
		 
	}

	@Override
	public int insert(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String email) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Member selectOne(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update_emailauth(String email) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert_simplejoin(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

}
