package androidx.camera.core.impl.utils;

import com.google.firebase.perf.util.Constants;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class b extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f5518a;

    /* renamed from: b, reason: collision with root package name */
    public ByteOrder f5519b;

    public b(OutputStream r1, ByteOrder r2) {
        super(r1);
        this.f5518a = r1;
        this.f5519b = r2;
    }

    public void c(ByteOrder r1) {
        this.f5519b = r1;
    }

    public void f(int r2) {
        this.f5518a.write(r2);
    }

    public void i(int r3) {
        ByteOrder r02 = this.f5519b;
        if (r02 != ByteOrder.LITTLE_ENDIAN) goto L7;
        this.f5518a.write(r3 & Constants.MAX_HOST_LENGTH);
        this.f5518a.write((r3 >>> 8) & Constants.MAX_HOST_LENGTH);
        this.f5518a.write((r3 >>> 16) & Constants.MAX_HOST_LENGTH);
        this.f5518a.write((r3 >>> 24) & Constants.MAX_HOST_LENGTH);
        return;
    L7:
        if (r02 != ByteOrder.BIG_ENDIAN) goto L10;
        this.f5518a.write((r3 >>> 24) & Constants.MAX_HOST_LENGTH);
        this.f5518a.write((r3 >>> 16) & Constants.MAX_HOST_LENGTH);
        this.f5518a.write((r3 >>> 8) & Constants.MAX_HOST_LENGTH);
        this.f5518a.write(r3 & Constants.MAX_HOST_LENGTH);
        return;
    }

    public void k(short r3) {
        ByteOrder r02 = this.f5519b;
        if (r02 != ByteOrder.LITTLE_ENDIAN) goto L7;
        this.f5518a.write(r3 & 255);
        this.f5518a.write((r3 >>> 8) & Constants.MAX_HOST_LENGTH);
        return;
    L7:
        if (r02 != ByteOrder.BIG_ENDIAN) goto L10;
        this.f5518a.write((r3 >>> 8) & Constants.MAX_HOST_LENGTH);
        this.f5518a.write(r3 & 255);
        return;
    }

    public void l(long r1) {
        i((int) r1);
    }

    public void n(int r1) {
        k((short) r1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r2) {
        this.f5518a.write(r2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r2, int r3, int r4) {
        this.f5518a.write(r2, r3, r4);
    }
}
