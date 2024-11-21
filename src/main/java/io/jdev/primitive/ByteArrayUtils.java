package io.jdev.primitive;


import java.util.List;
import org.apache.commons.collections4.CollectionUtils;

public final class ByteArrayUtils {

  public static final byte[] ZERO_BYTES = new byte[0];

  private ByteArrayUtils() {
  }

  public static byte[] toArray(List<byte[]> listArrays) {
    if (CollectionUtils.isEmpty(listArrays)) {
      return new byte[0];
    } else {
      int totalLength = listArrays.stream().mapToInt(arr -> arr.length).sum();
      if (totalLength == 0) {
        return ZERO_BYTES;
      } else {

        //copy buffered blocks in final array
        byte[] finalBlock = new byte[totalLength];
        int offset = 0;

        for (byte[] block : listArrays) {
          System.arraycopy(block, 0, finalBlock, offset, block.length);
          offset += block.length;
        }
        return finalBlock;
      }
    }
  }


}