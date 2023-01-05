package hello.hellospring.repository;


import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);
    //Optional > findById or  findByName으로 가져오는 값이 Null인 경우 그대로 받는 것이 아니라
    //Optional로 받아서 처리한다.
    Optional<Member> findById(Long id); //아이디로 회원을 찾는것을 만듬
    Optional<Member> findByName(String name);
    List<Member> findAll();


}
