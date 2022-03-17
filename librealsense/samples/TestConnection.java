import com.oracle.svm.shadowed.org.bytedeco.javacpp.*;
import com.oracle.svm.shadowed.org.bytedeco.librealsense.*;
import static com.oracle.svm.shadowed.org.bytedeco.librealsense.global.RealSense.*;

public class TestConnection {

    public static void main(String[] args) {
        context context = new context();
        System.out.println("Devices found: " + context.get_device_count());

        device device = context.get_device(0);
        System.out.println("Using device 0, an " + device.get_name());
    }
}
