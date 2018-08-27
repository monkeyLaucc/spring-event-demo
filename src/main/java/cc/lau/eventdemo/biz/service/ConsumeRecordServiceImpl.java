package cc.lau.eventdemo.biz.service;

import cc.lau.eventdemo.biz.entity.Account;
import cc.lau.eventdemo.biz.entity.ConsumeRecord;
import cc.lau.eventdemo.biz.event.ConsumeRecordEvent;
import cc.lau.eventdemo.biz.repository.ConsumeRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * Created by cc on 18/8/25
 */
@Service
public class ConsumeRecordServiceImpl implements ApplicationListener<ConsumeRecordEvent> {

    @Autowired
    private ConsumeRecordRepository consumeRecordRepository;

    public void record(Account account, String type) {
        System.out.println("执行保存消费记录操作");
        consumeRecordRepository.save(new ConsumeRecord().setAccountId(account.getId()).setAccountName(account.getName()).setConsumeMoney(account.getMoney()).setType(type));
    }

    @Override
    public void onApplicationEvent(ConsumeRecordEvent consumeRecordEvent) {
        System.out.println("监听到事件");
        record(consumeRecordEvent.getAccount(), "consume");
        System.out.println("事件处理完成");
    }
}
