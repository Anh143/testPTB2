import org.jetbrains.annotations.NotNull;

public class PTB2 {
  public static float @NotNull [] check(int a, int b, int c) {
      float[] nghiem;
      int delta = b * b - 4 * a * c;
      if (delta < 0) {
          nghiem = new float[]{};
          return nghiem;
      } else if (delta == 0) {
          float x = (-b / (2 * a));
          nghiem = new float[]{x};
          return nghiem;
      } else {
          float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
          float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
          nghiem = new float[]{x1, x2};
          return nghiem;
      }
  }
}
