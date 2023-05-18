package com.ssafy.ssafit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssafy.ssafit.domain.Member;

public interface MemberRepository extends JpaRepository<Member, String> {

	Member findByMemberIdAndPassword(Member member);
}
