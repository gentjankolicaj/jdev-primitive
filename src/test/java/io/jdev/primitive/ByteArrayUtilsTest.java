package io.jdev.primitive;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class ByteArrayUtilsTest {


  @Test
  void toByteArray() {
    List<byte[]> empty = List.of();
    assertThat(ByteArrayUtils.toArray(empty)).hasSize(0);

    List<byte[]> list = List.of(new byte[]{1, 2, 3, 4, 5}, new byte[0], new byte[]{6},
        new byte[]{7, 8, 9, 0}, new byte[]{'1', '2'});
    assertThat(ByteArrayUtils.toArray(list)).hasSize(12)
        .containsExactly(new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, '1', '2'});
  }

}