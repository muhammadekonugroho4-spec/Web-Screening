package androidx.compose.ui.input.nestedscroll;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f18035a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int f18036b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f18037c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f18038e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f18039f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f18040g = 0;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final int a() {
            return d.a();
        }

        public final int b() {
            return d.b();
        }

        public a() {
        }
    }

    static {
        f18035a = new a(null);
        int r02 = c(1);
        f18036b = r02;
        int r1 = c(2);
        f18037c = r1;
        d = r02;
        f18038e = r1;
        f18039f = c(3);
        f18040g = r02;
    }

    public static final /* synthetic */ int a() {
        return f18037c;
    }

    public static final /* synthetic */ int b() {
        return f18036b;
    }

    public static int c(int r02) {
        return r02;
    }

    public static final boolean d(int r02, int r1) {
        if (r02 != r1) goto L5;
        return true;
    L5:
        return false;
    }
}
