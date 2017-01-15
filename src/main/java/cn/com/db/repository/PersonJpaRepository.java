package cn.com.db.repository;

import cn.com.db.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by xiaxuan on 16/11/29.
 */
@Repository
@Transactional
public interface PersonJpaRepository extends JpaRepository<Person, Long> {
}
