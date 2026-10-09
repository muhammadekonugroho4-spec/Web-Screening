package androidx.camera.core.internal.compat.workaround;

import androidx.camera.core.W;
import androidx.camera.core.impl.G0;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final IncorrectJpegMetadataQuirk f5687a;

    public d(G0 r2) {
        this.f5687a = (IncorrectJpegMetadataQuirk) r2.b(IncorrectJpegMetadataQuirk.class);
    }

    public byte[] a(W r2) {
        IncorrectJpegMetadataQuirk r02 = this.f5687a;
        if (r02 != null) goto L7;
        ByteBuffer r22 = r2.S()[0].g();
        byte[] r03 = new byte[r22.capacity()];
        r22.rewind();
        r22.get(r03);
        return r03;
    L7:
        return r02.g(r2);
    }
}
