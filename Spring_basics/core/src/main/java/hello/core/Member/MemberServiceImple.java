package hello.core.Member;

public class MemberServiceImple implements MemberService{

    private final MemberRepository memberRepository;
    public MemberServiceImple(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void joinMember(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberid) {
        return memberRepository.findByID(memberid);
    }
}
