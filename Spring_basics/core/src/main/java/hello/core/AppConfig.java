package hello.core;

import hello.core.Member.MemberService;
import hello.core.Member.MemberServiceImple;
import hello.core.Member.MemoryMemberRepository;
import hello.core.Order.OrderService;
import hello.core.Order.OrderServiceImpl;
import hello.core.discount.FixDiscountPolicy;

public class AppConfig {
    //생성자 주입
    public MemberService memberService() {
        return new MemberServiceImple(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
