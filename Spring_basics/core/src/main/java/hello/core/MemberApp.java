package hello.core;

import hello.core.Member.Grade;
import hello.core.Member.Member;
import hello.core.Member.MemberService;
import hello.core.Member.MmeberServiceImple;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MmeberServiceImple();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.joinMember(member);

        Member findmember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findmember.getName());
    }
}
