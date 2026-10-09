package androidx.glance.appwidget.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.glance.appwidget.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3997u {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f25113a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f25114b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f25115c = null;
    public static final byte[] d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f25116e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC3984g f25117f = null;

    /* renamed from: androidx.glance.appwidget.protobuf.u$a */
    public interface a {
    }

    /* renamed from: androidx.glance.appwidget.protobuf.u$b */
    public interface b {
    }

    /* renamed from: androidx.glance.appwidget.protobuf.u$c */
    public interface c {
        boolean isInRange(int r1);
    }

    /* renamed from: androidx.glance.appwidget.protobuf.u$d */
    public interface d extends List, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        d mutableCopyWithCapacity(int r1);
    }

    static {
        f25113a = Charset.forName("US-ASCII");
        f25114b = Charset.forName("UTF-8");
        f25115c = Charset.forName("ISO-8859-1");
        byte[] r02 = new byte[0];
        d = r02;
        f25116e = ByteBuffer.wrap(r02);
        f25117f = AbstractC3984g.i(r02);
    }

    public static Object a(Object r02) {
        r02.getClass();
        return r02;
    }

    public static Object b(Object r02, String r1) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(r1);
    }

    public static int c(boolean r02) {
        if (r02 == false) goto L5;
        return 1231;
    L5:
        return 1237;
    }

    public static int d(byte[] r2) {
        return e(r2, 0, r2.length);
    }

    public static int e(byte[] r02, int r1, int r2) {
        int r03 = g(r2, r02, r1, r2);
        if (r03 != 0) goto L6;
        return 1;
    L6:
        return r03;
    }

    public static int f(long r2) {
        return (int) (r2 ^ (r2 >>> 32));
    }

    public static int g(int r2, byte[] r3, int r4, int r5) {
        int r02 = r4;
    L4:
        if (r02 >= (r4 + r5)) goto L6;
        r2 = (r2 * 31) + r3[r02];
        r02 = r02 + 1;
        goto L4
    L6:
        return r2;
    }
}
