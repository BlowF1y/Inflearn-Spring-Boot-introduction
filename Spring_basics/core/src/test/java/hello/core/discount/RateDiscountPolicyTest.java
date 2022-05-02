package hello.core.discount;

import hello.core.Member.Grade;
import hello.core.Member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {
    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("vip 는 10% 할인이 적용되어야 한다")
    void vip_0() {
        //given
        Member member = new Member(1L, "memberVip", Grade.VIP);
        //when
        int discount = discountPolicy.discount(member, 10000);
        //then
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("vip가 아니면 할인 적용이 안된다")
    void vip_x() {
        Member member = new Member(2L, "memberNo_vip", Grade.Basic);

        int discount = discountPolicy.discount(member, 10000);

        assertThat(discount).isEqualTo(0);
    }


}