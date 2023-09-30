package User;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NamesTest {

    @Test
    public void 이름_리스트_생성_테스트_성공(){
        //given
        String nameLine = "하니,민지,해린";

        //when
        Names names = Names.createNames(nameLine);

        //then
        assertThat(names.getNames().get(0).name).isEqualTo("하니");
        assertThat(names.getNames().get(1).name).isEqualTo("민지");
        assertThat(names.getNames().get(2).name).isEqualTo("해린");
    }

    @Test
    public void 이름_리스트_생성_테스트_중복_실패(){
        //given
        String nameLine = "하니,민지, 민지";

        //when,then
        assertThatThrownBy(()->Names.createNames(nameLine))
                .hasMessageContaining("이름이 중복됩니다.")
                .isInstanceOf(IllegalArgumentException.class);
    }
}

