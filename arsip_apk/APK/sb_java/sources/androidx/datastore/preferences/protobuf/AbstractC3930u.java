package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3930u {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f23883a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f23884b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f23885c = null;
    public static final ByteBuffer d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC3917g f23886e = null;

    /* renamed from: androidx.datastore.preferences.protobuf.u$a */
    public interface a {
        boolean isInRange(int r1);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.u$b */
    public interface b extends List, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        b mutableCopyWithCapacity(int r1);
    }

    static {
        f23883a = Charset.forName("UTF-8");
        f23884b = Charset.forName("ISO-8859-1");
        byte[] r02 = new byte[0];
        f23885c = r02;
        d = ByteBuffer.wrap(r02);
        f23886e = AbstractC3917g.h(r02);
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
        int r03 = i(r2, r02, r1, r2);
        if (r03 != 0) goto L6;
        return 1;
    L6:
        return r03;
    }

    public static int f(long r2) {
        return (int) (r2 ^ (r2 >>> 32));
    }

    public static boolean g(byte[] r02) {
        return Utf8.m(r02);
    }

    public static Object h(Object r02, Object r1) {
        return ((H) r02).toBuilder().t((H) r1).buildPartial();
    }

    public static int i(int r2, byte[] r3, int r4, int r5) {
        int r02 = r4;
    L4:
        if (r02 >= (r4 + r5)) goto L6;
        r2 = (r2 * 31) + r3[r02];
        r02 = r02 + 1;
        goto L4
    L6:
        return r2;
    }

    public static String j(byte[] r2) {
        return new String(r2, f23883a);
    }
}
