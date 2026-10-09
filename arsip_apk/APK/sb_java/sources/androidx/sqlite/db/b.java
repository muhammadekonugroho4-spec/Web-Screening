package androidx.sqlite.db;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f28079a = null;

    static {
        f28079a = new b();
    }

    public b() {
    }

    public static final File a(Context r1) {
        p.l(r1, "context");
        File r12 = r1.getNoBackupFilesDir();
        p.k(r12, "getNoBackupFilesDir(...)");
        return r12;
    }
}
