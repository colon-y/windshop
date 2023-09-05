package vo;

import lombok.*;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BoardVo {

    private Integer w_bno;

    private String w_btitle;

    private String w_bcontent;

    private Timestamp w_bregdate;

    private Integer w_uno;

    //xss 제목과 작성자  스크립트 제거 처리를 한다.
    public void setting() {
        this.w_btitle=cleanXSS(this.w_btitle);
    }

    //xss 스크립트 제거
    private String cleanXSS(String value) {
        value = value.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
        value = value.replaceAll("\\(", "&#40;").replaceAll("\\)", "&#41;");
        value = value.replaceAll("'", "&#39;");
        value = value.replaceAll("eval\\((.*)\\)", "");
        value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");
        value = value.replaceAll("script", "");
        return value;
    }
}
