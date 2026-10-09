package kotlin.io;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public final class d extends ByteArrayOutputStream {
    public d(int r1) {
        super(r1);
    }

    public final byte[] c() {
        byte[] r02 = ((ByteArrayOutputStream) this).buf;
        p.k(r02, "buf");
        return r02;
    }
}
