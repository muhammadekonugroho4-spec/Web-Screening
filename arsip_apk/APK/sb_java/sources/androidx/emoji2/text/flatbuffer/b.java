package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public final class b extends c {
    public b() {
    }

    public static b h(ByteBuffer r1) {
        return i(r1, new b());
    }

    public static b i(ByteBuffer r2, b r3) {
        r2.order(ByteOrder.LITTLE_ENDIAN);
        return r3.f(r2.getInt(r2.position()) + r2.position(), r2);
    }

    public b f(int r1, ByteBuffer r2) {
        g(r1, r2);
        return this;
    }

    public void g(int r1, ByteBuffer r2) {
        c(r1, r2);
    }

    public a j(a r2, int r3) {
        int r02 = b(6);
        if (r02 != 0) goto L5;
        return null;
    L5:
        return r2.f(a(d(r02) + (r3 * 4)), this.f24034b);
    }

    public int k() {
        int r02 = b(6);
        if (r02 != 0) goto L5;
        return 0;
    L5:
        return e(r02);
    }

    public int l() {
        int r02 = b(4);
        if (r02 != 0) goto L5;
        return 0;
    L5:
        return this.f24034b.getInt(r02 + this.f24033a);
    }
}
