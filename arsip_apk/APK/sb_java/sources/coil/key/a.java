package coil.key;

import coil.request.i;
import java.io.File;

/* loaded from: classes4.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30037a;

    public a(boolean r1) {
        this.f30037a = r1;
    }

    @Override // coil.key.b
    public /* bridge */ /* synthetic */ String a(Object r1, i r2) {
        return b((File) r1, r2);
    }

    public String b(File r3, i r4) {
        if (this.f30037a == false) goto L7;
        return r3.getPath() + ':' + r3.lastModified();
    L7:
        return r3.getPath();
    }
}
