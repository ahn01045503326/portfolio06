package ahn.sungsin.shop.repository;

import ahn.sungsin.shop.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository  extends JpaRepository<Member, Long> {
    Member findByEmail(String email);
}
