package androidx.compose.ui.text.style;

import com.google.firebase.perf.util.Constants;

/* loaded from: classes.dex */
public abstract class g {
    public static final /* synthetic */ int a(int r02, int r1, int r2) {
        return e(r02, r1, r2);
    }

    public static final /* synthetic */ int b(int r02) {
        return f(r02);
    }

    public static final /* synthetic */ int c(int r02) {
        return g(r02);
    }

    public static final /* synthetic */ int d(int r02) {
        return h(r02);
    }

    public static final int e(int r02, int r1, int r2) {
        return (r02 | (r1 << 8)) | (r2 << 16);
    }

    public static final int f(int r02) {
        return r02 & Constants.MAX_HOST_LENGTH;
    }

    public static final int g(int r02) {
        return (r02 >> 8) & Constants.MAX_HOST_LENGTH;
    }

    public static final int h(int r02) {
        return (r02 >> 16) & Constants.MAX_HOST_LENGTH;
    }
}
