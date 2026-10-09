package androidx.camera.core.impl;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public interface Config {

    public enum OptionPriority extends Enum<OptionPriority> {
        public static final OptionPriority ALWAYS_OVERRIDE = null;
        public static final OptionPriority HIGH_PRIORITY_REQUIRED = null;
        public static final OptionPriority OPTIONAL = null;
        public static final OptionPriority REQUIRED = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ OptionPriority[] f5177a = null;

        static {
            ALWAYS_OVERRIDE = new OptionPriority("ALWAYS_OVERRIDE", 0);
            HIGH_PRIORITY_REQUIRED = new OptionPriority("HIGH_PRIORITY_REQUIRED", 1);
            REQUIRED = new OptionPriority("REQUIRED", 2);
            OPTIONAL = new OptionPriority("OPTIONAL", 3);
            f5177a = a();
        }

        OptionPriority(String r1, int r2) {
        }

        public static /* synthetic */ OptionPriority[] a() {
            return new OptionPriority[]{ALWAYS_OVERRIDE, HIGH_PRIORITY_REQUIRED, REQUIRED, OPTIONAL};
        }

        public static OptionPriority valueOf(String r1) {
            return (OptionPriority) Enum.valueOf(OptionPriority.class, r1);
        }

        public static OptionPriority[] values() {
            return (OptionPriority[]) f5177a.clone();
        }
    }

    public static abstract class a {
        public a() {
        }

        public static a a(String r1, Class r2) {
            return b(r1, r2, null);
        }

        public static a b(String r1, Class r2, Object r3) {
            return new C2264i(r1, r2, r3);
        }

        public abstract String c();

        public abstract Object d();

        public abstract Class e();
    }

    public interface b {
        boolean a(a r1);
    }

    static boolean S(OptionPriority r1, OptionPriority r2) {
        OptionPriority r02 = OptionPriority.REQUIRED;
        if (r1 != r02) goto L7;
        if (r2 != r02) goto L9;
        return true;
    L9:
        return false;
    L7:
        return false;
    }

    static Config Z(Config r3, Config r4) {
        if (r3 != null) goto L6;
        if (r4 != null) goto L6;
        return C2298z0.f0();
    L6:
        if (r4 == null) goto L8;
        C2288u0 r02 = C2288u0.i0(r4);
    L9:
        if (r3 == null) goto L15;
        Iterator r1 = r3.h().iterator();
    L12:
        if (r1.hasNext() == false) goto L15;
        y(r02, r4, r3, (a) r1.next());
    L15:
        return C2298z0.g0(r02);
    L8:
        r02 = C2288u0.h0();
        goto L9
    }

    static void y(C2288u0 r2, Config r3, Config r4, a r5) {
        if (Objects.equals(r5, InterfaceC2265i0.f5424u) == false) goto L6;
        androidx.camera.core.resolutionselector.c r1 = (androidx.camera.core.resolutionselector.c) r4.d(r5, null);
        androidx.camera.core.resolutionselector.c r32 = (androidx.camera.core.resolutionselector.c) r3.d(r5, null);
        r2.p(r5, r4.i(r5), androidx.camera.core.impl.utils.s.a(r32, r1));
        return;
    L6:
        r2.p(r5, r4.i(r5), r4.a(r5));
    }

    Object a(a r1);

    void b(String r1, b r2);

    Set c(a r1);

    Object d(a r1, Object r2);

    boolean f(a r1);

    Object g(a r1, OptionPriority r2);

    Set h();

    OptionPriority i(a r1);
}
