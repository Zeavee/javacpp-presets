import com.oracle.svm.shadowed.org.bytedeco.javacpp.*;
import com.oracle.svm.shadowed.org.bytedeco.gsl.*;
import static com.oracle.svm.shadowed.org.bytedeco.gsl.global.gsl.*;

public class Example {
    public static void main(String[] args) {
        /* try to use MKL when available */
        System.setProperty("com.oracle.svm.shadowed.org.bytedeco.openblas.load", "mkl");

        double x = 5.0;
        double y = gsl_sf_bessel_J0(x);
        System.out.printf("J0(%g) = %.18e\n", x, y);
    }
}
