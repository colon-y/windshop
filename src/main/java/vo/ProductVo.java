package vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductVo {

    private Integer w_pno;

    private String w_pname;

    private Integer w_pprice;

    private String w_pcontent;

    private Timestamp w_pregdate;

    private int w_pamount;
}
