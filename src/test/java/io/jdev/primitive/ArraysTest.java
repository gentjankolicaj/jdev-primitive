package io.jdev.primitive;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ArraysTest {

  @Test
  void getStringValueOf() {
    byte[] arr = new byte[]{1, 2, 3, 4, 5, 66, 11, 100};
    String val = Arrays.getStringValueOf(arr);
    assertThat(val).contains("66111");
  }
}