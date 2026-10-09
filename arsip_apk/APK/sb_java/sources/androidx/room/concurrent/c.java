package androidx.room.concurrent;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f27806a;

    /* renamed from: b, reason: collision with root package name */
    public FileChannel f27807b;

    public c(String r2) {
        p.l(r2, "filename");
        this.f27806a = r2 + ".lck";
    }

    public final void a() {
        if (this.f27807b != null) goto L22;
        File r02 = new File(this.f27806a);     // Catch: Throwable -> L8
        File r1 = r02.getParentFile();     // Catch: Throwable -> L8
        if (r1 == null) goto L10;
        r1.mkdirs();     // Catch: Throwable -> L8
    L10:
        FileChannel r03 = new FileOutputStream(r02).getChannel();     // Catch: Throwable -> L8
        this.f27807b = r03;     // Catch: Throwable -> L8
        if (r03 == null) goto L21;
        r03.lock();     // Catch: Throwable -> L8
        return;
    L21:
        return;
    L8:
        th = move-exception;
        FileChannel r12 = this.f27807b;
        if (r12 == null) goto L17;
        r12.close();
    L17:
        this.f27807b = null;
        throw new IllegalStateException("Unable to lock file: '" + this.f27806a + "'.", th);
    }

    public final void b() {
        FileChannel r02 = this.f27807b;
        if (r02 != null) goto L12;
        return;
    L12:
        r02.close();     // Catch: Throwable -> L9
        this.f27807b = null;
        return;
    L9:
        th = move-exception;
        this.f27807b = null;
        throw th;
    }
}
