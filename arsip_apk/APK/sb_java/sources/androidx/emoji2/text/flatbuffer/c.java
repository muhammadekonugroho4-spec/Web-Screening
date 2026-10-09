package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public int f24033a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f24034b;

    /* renamed from: c, reason: collision with root package name */
    public int f24035c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public d f24036e;

    public c() {
        this.f24036e = d.a();
    }

    public int a(int r2) {
        return r2 + this.f24034b.getInt(r2);
    }

    public int b(int r3) {
        if (r3 < this.d) goto L5;
        return 0;
    L5:
        return this.f24034b.getShort(this.f24035c + r3);
    }

    public void c(int r1, ByteBuffer r2) {
        this.f24034b = r2;
        if (r2 == null) goto L6;
        this.f24033a = r1;
        int r12 = r1 - r2.getInt(r1);
        this.f24035c = r12;
        this.d = this.f24034b.getShort(r12);
        return;
    L6:
        this.f24033a = 0;
        this.f24035c = 0;
        this.d = 0;
    }

    public int d(int r2) {
        int r22 = r2 + this.f24033a;
        return (r22 + this.f24034b.getInt(r22)) + 4;
    }

    public int e(int r2) {
        int r22 = r2 + this.f24033a;
        int r23 = r22 + this.f24034b.getInt(r22);
        return this.f24034b.getInt(r23);
    }
}
