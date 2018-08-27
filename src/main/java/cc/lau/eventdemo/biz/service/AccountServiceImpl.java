package cc.lau.eventdemo.biz.service;

import cc.lau.eventdemo.biz.entity.Account;
import cc.lau.eventdemo.biz.event.ConsumeRecordEvent;
import cc.lau.eventdemo.biz.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Created by cc on 18/8/25
 */
@Service
public class AccountServiceImpl {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private ConsumeRecordServiceImpl consumeRecordService;

    @Autowired
    private ApplicationEventPublisher publisher;


    public void consume() {
        System.out.println("消费扣款");
        Account account = new Account().setName("小7").setMoney(new BigDecimal(132));
        accountRepository.save(account);
        //记录消费记录
//        consumeRecordService.record(account, "消费");
        System.out.println("发布记录消费记录事件");
        publisher.publishEvent(new ConsumeRecordEvent(account));
    }


//    @Override
//    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
//        this.publisher = applicationEventPublisher;
//    }
}
