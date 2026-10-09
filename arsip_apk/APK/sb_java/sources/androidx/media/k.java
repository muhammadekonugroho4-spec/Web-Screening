package androidx.media;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public class k implements g {

    /* renamed from: a, reason: collision with root package name */
    public String f25904a;

    /* renamed from: b, reason: collision with root package name */
    public int f25905b;

    /* renamed from: c, reason: collision with root package name */
    public int f25906c;

    public k(String r1, int r2, int r3) {
        this.f25904a = r1;
        this.f25905b = r2;
        this.f25906c = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (TextUtils.equals(this.f25904a, r52.f25904a) == true) goto L11;
    L15:
        return false;
    L11:
        if (this.f25905b != r52.f25905b) goto L15;
        if (this.f25906c != r52.f25906c) goto L15;
        return true;
    }

    public int hashCode() {
        return androidx.core.util.c.b(new Object[]{this.f25904a, Integer.valueOf(this.f25905b), Integer.valueOf(this.f25906c)});
    }
}
