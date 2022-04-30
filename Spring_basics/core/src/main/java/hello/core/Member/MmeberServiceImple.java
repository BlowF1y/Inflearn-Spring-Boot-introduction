package hello.core.Member;

public class MmeberServiceImple implements MemberService{
    private final MemberRepository memberRepository = new MemoryMemberRepository();



    @Override
    public void joinMember(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberid) {
        return memberRepository.findByID(memberid);
    }
}
