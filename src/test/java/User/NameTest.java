package User;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


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

    @Test
    public void 이름_생성_이름값_NULL(){
        //given
        String nameLine = null;

        //when,then
        assertThatThrownBy(()-> Name.createName(nameLine))
                .hasMessageContaining("이름은 Null 값이 될 수 없습니다.")
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    public void 이름_생성_길이_검증(){
        //given
        String nameLine= "";

        //when,then
        assertThatThrownBy(()->Name.validateNameLength(nameLine))
                .hasMessageContaining("이름 길이는 1글자 이상이어야 합니다.")
                .isInstanceOf(IllegalArgumentException.class);
    }
}

