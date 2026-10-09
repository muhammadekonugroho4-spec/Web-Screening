package androidx.room.util;

import com.google.firebase.messaging.Constants;

/* loaded from: classes4.dex */
public final class e implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f27982a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27983b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27984c;
    public final String d;

    public e(int r2, int r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r4, Constants.MessagePayloadKeys.FROM);
        kotlin.jvm.internal.p.l(r5, "to");
        this.f27982a = r2;
        this.f27983b = r3;
        this.f27984c = r4;
        this.d = r5;
    }

    public int a(e r3) {
        kotlin.jvm.internal.p.l(r3, "other");
        int r02 = this.f27982a - r3.f27982a;
        if (r02 == 0) goto L5;
        return r02;
    L5:
        return this.f27983b - r3.f27983b;
    }

    public final String b() {
        return this.f27984c;
    }

    public final int c() {
        return this.f27982a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return a((e) r1);
    }

    public final String d() {
        return this.d;
    }
}
