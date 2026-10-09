package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class a extends c {
    public a() {
    }

    public a f(int r1, ByteBuffer r2) {
        g(r1, r2);
        return this;
    }

    public void g(int r1, ByteBuffer r2) {
        c(r1, r2);
    }

    public int h(int r3) {
        int r02 = b(16);
        if (r02 != 0) goto L5;
        return 0;
    L5:
        return this.f24034b.getInt(d(r02) + (r3 * 4));
    }

    public int i() {
        int r02 = b(16);
        if (r02 != 0) goto L5;
        return 0;
    L5:
        return e(r02);
    }

    public boolean j() {
        int r02 = b(6);
        if (r02 != 0) goto L5;
    L8:
        return false;
    L5:
        if (this.f24034b.get(r02 + this.f24033a) == 0) goto L8;
        return true;
    }

    public short k() {
        int r02 = b(14);
        if (r02 != 0) goto L5;
        return 0;
    L5:
        return this.f24034b.getShort(r02 + this.f24033a);
    }

    public int l() {
        int r02 = b(4);
        if (r02 != 0) goto L5;
        return 0;
    L5:
        return this.f24034b.getInt(r02 + this.f24033a);
    }

    public short m() {
        int r02 = b(8);
        if (r02 != 0) goto L5;
        return 0;
    L5:
        return this.f24034b.getShort(r02 + this.f24033a);
    }

    public short n() {
        int r02 = b(12);
        if (r02 != 0) goto L5;
        return 0;
    L5:
        return this.f24034b.getShort(r02 + this.f24033a);
    }
}
