package kr.engsoft.qlrm_example.hello;

import lombok.RequiredArgsConstructor;
import org.qlrm.mapper.JpaResultMapper;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class HelloRepository {
    private final EntityManager em;

    public List<HelloOne> getHelloOne() {
        String sql = "SELECT id FROM MEMBER ";
        Query query = em.createNativeQuery(sql);

        JpaResultMapper jpaResultMapper = new JpaResultMapper();
        return jpaResultMapper.list(query, HelloOne.class);
    }

    public List<HelloTwo> getHelloTwo() {

        String sql = "SELECT id, name FROM MEMBER ";
        Query query = em.createNativeQuery(sql);

        JpaResultMapper jpaResultMapper = new JpaResultMapper();
        return jpaResultMapper.list(query, HelloTwo.class);
    }
}
