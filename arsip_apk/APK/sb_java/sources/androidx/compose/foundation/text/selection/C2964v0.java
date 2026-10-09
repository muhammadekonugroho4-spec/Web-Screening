package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassification;
import androidx.compose.ui.text.E1;

/* renamed from: androidx.compose.foundation.text.selection.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2964v0 {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f11017a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11018b;

    /* renamed from: c, reason: collision with root package name */
    public final TextClassification f11019c;

    public /* synthetic */ C2964v0(CharSequence r1, long r2, TextClassification r4, kotlin.jvm.internal.i r5) {
        this(r1, r2, r4);
    }

    public final long a() {
        return this.f11018b;
    }

    public final CharSequence b() {
        return this.f11017a;
    }

    public final TextClassification c() {
        return this.f11019c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C2964v0) == true) goto L8;
        return false;
    L8:
        C2964v0 r82 = (C2964v0) r8;
        if (kotlin.jvm.internal.p.g(this.f11017a, r82.f11017a) == true) goto L12;
        return false;
    L12:
        if (E1.g(this.f11018b, r82.f11018b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f11019c, r82.f11019c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f11017a.hashCode() * 31) + E1.o(this.f11018b)) * 31) + this.f11019c.hashCode();
    }

    public String toString() {
        return "TextClassificationResult(text=" + this.f11017a + ", selection=" + E1.q(this.f11018b) + ", textClassification=" + this.f11019c + ')';
    }

    public C2964v0(CharSequence r1, long r2, TextClassification r4) {
        this.f11017a = r1;
        this.f11018b = r2;
        this.f11019c = r4;
    }
}
