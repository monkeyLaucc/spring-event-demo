package cc.lau.eventdemo.biz.service;

import cc.lau.eventdemo.biz.entity.Account;
import cc.lau.eventdemo.biz.event.ConsumeRecordEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by cc on 18/8/25
 */
@Service
public class ScoreServiceImpl {

    public void getScore(Account account) {
        System.out.println("系统赠送 " + account.getName() + "," + account.getMoney() + "积分");
    }

    @EventListener
    public void onConsumeRecordEvent(ConsumeRecordEvent consumeRecordEvent) {
        System.out.println("积分服务监听到消费事件");
        getScore(consumeRecordEvent.getAccount());
        System.out.println("积分服务处理完成");
    }

}
