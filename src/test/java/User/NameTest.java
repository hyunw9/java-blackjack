package User;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class NameTest {

    @Test
    public void 이름_생성_테스트(){
        //given
        String name = "홍길동";

        //when
        Name testName = new Name(name);

        //then
        assertThat(testName.name).isEqualTo("홍길동");
    }
}
