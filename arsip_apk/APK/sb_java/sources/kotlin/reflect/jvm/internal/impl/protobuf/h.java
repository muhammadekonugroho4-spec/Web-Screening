package kotlin.reflect.jvm.internal.impl.protobuf;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f179435a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f179436b = null;

    public interface a {
        int getNumber();
    }

    public interface b {
        a findValueByNumber(int r1);
    }

    static {
        byte[] r02 = new byte[0];
        f179435a = r02;
        f179436b = ByteBuffer.wrap(r02);
    }

    public static boolean a(byte[] r02) {
        return t.e(r02);
    }

    public static String b(byte[] r2) {
        return new String(r2, "UTF-8");
    L4:
        e = move-exception;
        throw new RuntimeException("UTF-8 not supported?", e);
    }
}
