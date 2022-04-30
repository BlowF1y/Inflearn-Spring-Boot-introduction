package hello.core.Member;

public interface MemberService {
    void joinMember(Member member);
    Member findMember(Long memberid);
}
