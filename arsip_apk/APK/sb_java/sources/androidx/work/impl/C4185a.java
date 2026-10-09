package androidx.work.impl;

import android.content.Context;
import java.io.File;

/* renamed from: androidx.work.impl.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4185a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4185a f29236a = null;

    static {
        f29236a = new C4185a();
    }

    public C4185a() {
    }

    public final File a(Context r2) {
        kotlin.jvm.internal.p.l(r2, "context");
        File r22 = r2.getNoBackupFilesDir();
        kotlin.jvm.internal.p.k(r22, "context.noBackupFilesDir");
        return r22;
    }
}
