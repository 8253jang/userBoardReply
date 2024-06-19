package web.mvc.config;


import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //환경설정을 돕는 클래스
public class Appconfig {

    @PersistenceContext
    private EntityManager entityManager;

    @Bean //<bean
    public JPAQueryFactory getJPAQueryFactory(){
        return new JPAQueryFactory(entityManager);
    }


}
