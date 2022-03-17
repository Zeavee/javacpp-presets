import java.io.File;
import com.oracle.svm.shadowed.org.bytedeco.javacpp.*;
import com.oracle.svm.shadowed.org.bytedeco.qt.Qt5Core.*;
import com.oracle.svm.shadowed.org.bytedeco.qt.Qt5Gui.*;
import com.oracle.svm.shadowed.org.bytedeco.qt.Qt5Widgets.*;
import static com.oracle.svm.shadowed.org.bytedeco.qt.global.Qt5Core.*;
import static com.oracle.svm.shadowed.org.bytedeco.qt.global.Qt5Gui.*;
import static com.oracle.svm.shadowed.org.bytedeco.qt.global.Qt5Widgets.*;

public class GettingStarted {
    private static IntPointer argc;
    private static PointerPointer argv;

    public static void main(String[] args) {
        String path = Loader.load(com.oracle.svm.shadowed.org.bytedeco.qt.global.Qt5Core.class);
        argc = new IntPointer(new int[]{3});
        argv = new PointerPointer("gettingstarted", "-platformpluginpath", new File(path).getParent(), null);

        QApplication app = new QApplication(argc, argv);

        QTextEdit textEdit = new QTextEdit();
        textEdit.show();

        System.exit(app.exec());
    }
}
