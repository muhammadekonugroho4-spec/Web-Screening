package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes4.dex */
public final class U extends Writer implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final String f24550a;

    /* renamed from: b, reason: collision with root package name */
    public StringBuilder f24551b;

    public U(String r3) {
        this.f24551b = new StringBuilder(128);
        this.f24550a = r3;
    }

    public final void c() {
        if (this.f24551b.length() <= 0) goto L6;
        Log.d(this.f24550a, this.f24551b.toString());
        StringBuilder r02 = this.f24551b;
        r02.delete(0, r02.length());
        return;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        c();
    }

    @Override // java.io.Writer
    public void write(char[] r4, int r5, int r6) {
        int r02 = 0;
    L3:
        if (r02 >= r6) goto L9;
        char r1 = r4[r5 + r02];
        if (r1 != '\n') goto L7;
        c();
    L8:
        r02 = r02 + 1;
        goto L3
    L7:
        this.f24551b.append(r1);
        goto L8
    }
}
