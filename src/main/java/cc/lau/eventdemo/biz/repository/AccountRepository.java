package cc.lau.eventdemo.biz.repository;

import cc.lau.eventdemo.biz.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by cc on 18/8/25
 */
public interface AccountRepository extends JpaRepository<Account,Integer> {
}
