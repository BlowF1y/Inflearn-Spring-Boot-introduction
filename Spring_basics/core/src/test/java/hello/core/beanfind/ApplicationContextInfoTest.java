package hello.core.beanfind;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextInfoTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    //스프링의 등록된 모든 빈 출력
    @Test
    @DisplayName("모든 빈 출력")
    void findAllbean() {
        String[] beanDefinitionName = ac.getBeanDefinitionNames();
        for (String beamDefinitionName : beanDefinitionName) {
            Object bean = ac.getBean(beamDefinitionName);
            System.out.println("name = " + beamDefinitionName + "object = " + bean);
        }
    }

    //내가 등록한 빈만 출력
    @Test
    @DisplayName("애플리케이션 빈 출력")
    void findApplicationbean() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            //빈의 정보
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);
            //role ROLE_APPLECATION  : 직접 등록한 애플리케이션 빈
            //role ROLE_INFRASTRUCTURE : 스프링이 내부에서 사용하는 빈
            if (beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                Object bean = ac.getBean(beanDefinitionName);
                System.out.println("name = " + beanDefinitionName + "object = " + bean);
            }
        }
    }
}
