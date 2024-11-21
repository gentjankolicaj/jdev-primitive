package io.jdev.primitive;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ObjectUtilsTest {


  @Test
  void positiveTest() {
    assertThat(ObjectUtils.cast("", String.class)).isEqualTo("").hasSize(0);
    assertThat(ObjectUtils.cast(12, Integer.class)).isEqualTo(12);
    assertThat(ObjectUtils.cast(3.14, Double.class)).isEqualTo(3.14);
    assertThat(ObjectUtils.cast(3.14f, Float.class)).isEqualTo(3.14f);

  }


  @Test
  void negativeTest() {
    assertThat(ObjectUtils.cast(null, String.class)).isNull();
  }

}