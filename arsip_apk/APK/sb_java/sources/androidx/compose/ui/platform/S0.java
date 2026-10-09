package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public interface S0 {
    long a();

    default float b() {
        return 2.0f;
    }

    float c();

    default float d() {
        return 16.0f;
    }

    long e();

    long f();

    default float g() {
        return 0.0f;
    }

    default long h() {
        float r02 = 48;
        return androidx.compose.ui.unit.j.a(androidx.compose.ui.unit.i.h(r02), androidx.compose.ui.unit.i.h(r02));
    }

    default float i() {
        return Float.MAX_VALUE;
    }
}
