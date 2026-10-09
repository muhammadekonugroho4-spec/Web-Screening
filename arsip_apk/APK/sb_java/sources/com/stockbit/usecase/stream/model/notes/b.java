package com.stockbit.usecase.stream.model.notes;

import com.clevertap.android.sdk.Constants;
import java.util.Map;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f163056a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163057b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f163058c;

    public b(String r2, String r3, Map r4) {
        p.l(r2, Constants.KEY_TEXT);
        p.l(r3, "maskedText");
        p.l(r4, "masks");
        this.f163056a = r2;
        this.f163057b = r3;
        this.f163058c = r4;
    }

    public final String a() {
        return this.f163056a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f163056a, r52.f163056a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f163057b, r52.f163057b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f163058c, r52.f163058c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f163056a.hashCode() * 31) + this.f163057b.hashCode()) * 31) + this.f163058c.hashCode();
    }

    public String toString() {
        return "NoteContentUIState(text=" + this.f163056a + ", maskedText=" + this.f163057b + ", masks=" + this.f163058c + ")";
    }
}
