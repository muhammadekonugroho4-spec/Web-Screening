package kotlinx.serialization.json.internal;

import com.clevertap.android.sdk.Constants;
import com.google.common.base.Ascii;

/* renamed from: kotlinx.serialization.json.internal.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11982i {

    /* renamed from: a, reason: collision with root package name */
    public static final C11982i f180869a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f180870b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f180871c = null;

    static {
        C11982i r02 = new C11982i();
        f180869a = r02;
        f180870b = new char[117];
        f180871c = new byte[126];
        r02.f();
        r02.e();
    }

    public C11982i() {
    }

    public final void a(char r1, char r2) {
        b(r1, r2);
    }

    public final void b(int r2, char r3) {
        if (r3 == 'u') goto L6;
        f180870b[r3] = (char) r2;
        return;
    }

    public final void c(char r1, byte r2) {
        d(r1, r2);
    }

    public final void d(int r2, byte r3) {
        f180871c[r2] = r3;
    }

    public final void e() {
        int r02 = 0;
    L4:
        if (r02 >= 33) goto L6;
        d(r02, Ascii.DEL);
        r02 = r02 + 1;
        goto L4
    L6:
        d(9, (byte) 3);
        d(10, (byte) 3);
        d(13, (byte) 3);
        d(32, (byte) 3);
        c(',', (byte) 4);
        c(':', (byte) 5);
        c('{', (byte) 6);
        c('}', (byte) 7);
        c('[', (byte) 8);
        c(']', (byte) 9);
        c('\"', (byte) 1);
        c('\\', (byte) 2);
    }

    public final void f() {
        int r02 = 0;
    L4:
        if (r02 >= 32) goto L6;
        b(r02, 'u');
        r02 = r02 + 1;
        goto L4
    L6:
        b(8, Constants.INAPP_POSITION_BOTTOM);
        b(9, Constants.INAPP_POSITION_TOP);
        b(10, 'n');
        b(12, 'f');
        b(13, Constants.INAPP_POSITION_RIGHT);
        a('/', '/');
        a('\"', '\"');
        a('\\', '\\');
    }
}
