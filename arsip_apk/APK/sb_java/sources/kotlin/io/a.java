package kotlin.io;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public abstract class a {
    public static final long a(InputStream r5, OutputStream r6, int r7) {
        p.l(r5, "<this>");
        p.l(r6, "out");
        byte[] r72 = new byte[r7];
        int r02 = r5.read(r72);
        long r1 = 0;
    L3:
        if (r02 < 0) goto L5;
        r6.write(r72, 0, r02);
        r1 = r1 + r02;
        r02 = r5.read(r72);
        goto L3
    L5:
        return r1;
    }

    public static /* synthetic */ long b(InputStream r02, OutputStream r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
    L6:
        return a(r02, r1, r2);
    }

    public static final byte[] c(InputStream r4) {
        p.l(r4, "<this>");
        ByteArrayOutputStream r02 = new ByteArrayOutputStream(Math.max(UserMetadata.MAX_INTERNAL_KEY_SIZE, r4.available()));
        b(r4, r02, 0, 2, null);
        byte[] r42 = r02.toByteArray();
        p.k(r42, "toByteArray(...)");
        return r42;
    }
}
