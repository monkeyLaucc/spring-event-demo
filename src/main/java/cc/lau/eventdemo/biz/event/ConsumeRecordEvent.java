package cc.lau.eventdemo.biz.event;

import cc.lau.eventdemo.biz.entity.Account;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * Created by cc on 18/8/25
 */
@Getter
@Setter
public class ConsumeRecordEvent extends ApplicationEvent {

    private Account account;

    public ConsumeRecordEvent(Account account) {
        super(account);
        this.account = account;
    }
}
