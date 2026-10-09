package coil.map;

import coil.request.i;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class a implements d {
    public a() {
    }

    @Override // coil.map.d
    public /* bridge */ /* synthetic */ Object a(Object r1, i r2) {
        return b((byte[]) r1, r2);
    }

    public ByteBuffer b(byte[] r1, i r2) {
        return ByteBuffer.wrap(r1);
    }
}
