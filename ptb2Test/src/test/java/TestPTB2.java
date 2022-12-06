import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestPTB2 {
    PTB2 ptb2;
    float[] in;
    float[] out;
    @Test
    void testCaseHaiNghiem(){
        in=new float[]{-1, -3};
        out= ptb2.check(1,4,3);//x1=-1,x2=-3
        Assertions.assertArrayEquals(in,out);
    } @Test
    void testCaseHaiNghiem2(){
        in=new float[]{-1, -2};
        out= ptb2.check(1,3,2);//x1=-1,x2=-2
        Assertions.assertArrayEquals(in,out);
    }
    @Test
void testCaseHaiNghiem3(){
    in=new float[]{3, 1};
    out= ptb2.check(1,-4,3);//x1=3,x2=1
    Assertions.assertArrayEquals(in,out);
}
    @Test
    void testCaseVoNghiem(){
        in=new float[]{};
        out= ptb2.check(1,2,3);//vo nghiem
        Assertions.assertArrayEquals(in,out);
    }
    @Test
    void testCaseVoNghiem1(){
        in=new float[]{};
        out= ptb2.check(1,1,3);//vo nghiem
        Assertions.assertArrayEquals(in,out);
    }
    @Test
    void testCaseNghiemKep(){
        in=new float[]{2};
        out= ptb2.check(1,-4,4);// nghiem kep =2
        Assertions.assertArrayEquals(in,out);
    }
    @Test
    void testCaseNghiemKep2(){
        in=new float[]{-2};
        out= ptb2.check(1,4,4);// nghiem kep =-2
        Assertions.assertArrayEquals(in,out);
    }
   @Test
    void testCaseNghiemKep1(){
        in=new float[]{-1};
        out= ptb2.check(1,2,1);// nghiem kep =-1
        Assertions.assertArrayEquals(in,out);
    }

}
