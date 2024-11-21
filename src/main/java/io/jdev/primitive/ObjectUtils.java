package io.jdev.primitive;

/**
 * @author gentjan kolicaj
 * @Date: 11/21/24 8:18 PM
 */
public final class ObjectUtils {

  private ObjectUtils() {
  }

  @SuppressWarnings("unchecked")
  public static <T> T cast(Object object, Class<T> clazz) {
    return object == null ? null : (T) object;
  }


}
