package vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserVo {

    private Integer w_uno;

    @Email(message = "* 이메일 주소를 입력해 주세요.")
    private String w_umail;

    @NotNull(message = "* 비밀번호를 입력해 주세요.")
    private String w_upassword;

    @NotNull(message = "* 유저 이름을 입력해 주세요.")
    private String w_uname;

    private int w_ulevel;

    private String w_uip;

    private Timestamp w_uregdate;
}
