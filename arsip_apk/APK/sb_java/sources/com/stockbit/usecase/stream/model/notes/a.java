package com.stockbit.usecase.stream.model.notes;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f163053a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163054b;

    /* renamed from: c, reason: collision with root package name */
    public final NoteMaskType f163055c;

    public a(String r2, String r3, NoteMaskType r4) {
        p.l(r2, "ref");
        p.l(r3, Constants.KEY_TEXT);
        p.l(r4, "type");
        this.f163053a = r2;
        this.f163054b = r3;
        this.f163055c = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f163053a, r52.f163053a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f163054b, r52.f163054b) == true) goto L15;
        return false;
    L15:
        if (this.f163055c == r52.f163055c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f163053a.hashCode() * 31) + this.f163054b.hashCode()) * 31) + this.f163055c.hashCode();
    }

    public String toString() {
        return "NoteContentMaskUIState(ref=" + this.f163053a + ", text=" + this.f163054b + ", type=" + this.f163055c + ")";
    }
}
