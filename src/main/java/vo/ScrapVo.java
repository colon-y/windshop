package vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class ScrapVo {

    private Integer w_scno;

    private Integer w_pno;

    private Integer w_uno;

    private Timestamp w_scregdate;
}
