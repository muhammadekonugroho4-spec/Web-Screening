package io.sentry.android.replay.video;

import java.io.File;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final File f176028a;

    /* renamed from: b, reason: collision with root package name */
    public int f176029b;

    /* renamed from: c, reason: collision with root package name */
    public int f176030c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f176031e;

    /* renamed from: f, reason: collision with root package name */
    public final String f176032f;

    static {
    }

    public a(File r2, int r3, int r4, int r5, int r6, String r7) {
        p.l(r2, "file");
        p.l(r7, "mimeType");
        this.f176028a = r2;
        this.f176029b = r3;
        this.f176030c = r4;
        this.d = r5;
        this.f176031e = r6;
        this.f176032f = r7;
    }

    public final int a() {
        return this.f176031e;
    }

    public final File b() {
        return this.f176028a;
    }

    public final int c() {
        return this.d;
    }

    public final String d() {
        return this.f176032f;
    }

    public final int e() {
        return this.f176030c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f176028a, r52.f176028a) == true) goto L12;
        return false;
    L12:
        if (this.f176029b == r52.f176029b) goto L15;
        return false;
    L15:
        if (this.f176030c == r52.f176030c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f176031e == r52.f176031e) goto L24;
        return false;
    L24:
        if (p.g(this.f176032f, r52.f176032f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final int f() {
        return this.f176029b;
    }

    public int hashCode() {
        return (((((((((this.f176028a.hashCode() * 31) + Integer.hashCode(this.f176029b)) * 31) + Integer.hashCode(this.f176030c)) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.f176031e)) * 31) + this.f176032f.hashCode();
    }

    public String toString() {
        return "MuxerConfig(file=" + this.f176028a + ", recordingWidth=" + this.f176029b + ", recordingHeight=" + this.f176030c + ", frameRate=" + this.d + ", bitRate=" + this.f176031e + ", mimeType=" + this.f176032f + ')';
    }

    public /* synthetic */ a(File r8, int r9, int r10, int r11, int r12, String r13, int r14, i r15) {
        if ((r14 & 32) == 0) goto L5;
        r13 = "video/avc";
    L5:
        this(r8, r9, r10, r11, r12, r13);
    }
}
