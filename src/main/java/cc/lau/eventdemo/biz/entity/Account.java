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
@Accessors(chain = true)
@Entity
public class Account implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private BigDecimal money;

}
