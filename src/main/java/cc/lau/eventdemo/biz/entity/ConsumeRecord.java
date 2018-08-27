package cc.lau.eventdemo.biz.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by cc on 18/8/25
 */
@Data
@Entity
@Accessors(chain = true)
public class ConsumeRecord implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer accountId;

    private String accountName;

    private BigDecimal consumeMoney;

    private String type;

}
