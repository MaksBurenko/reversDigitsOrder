import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ReversDigitsOrderTest {
    @Test
    public void numberShouldReversString (){

        assertThat(ReversDigitsOrder.revers(12389), is(98321));

    }

    @Test
    public void numberShouldReversShort (){

        assertThat(ReversDigitsOrder.reversShort(12389), is(98321));

    }

    @Test
    public void numberShouldReversNumber (){

        assertThat(ReversDigitsOrder.reversShort(12389), is(98321));

    }
}
