package com.stockbit.component.dialog.singleoption;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f70833a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70834b;

    static {
    }

    public a(String r2, String r3) {
        p.l(r2, Constants.KEY_TITLE);
        p.l(r3, "param");
        this.f70833a = r2;
        this.f70834b = r3;
    }

    public final String a() {
        return this.f70834b;
    }

    public final String b() {
        return this.f70833a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f70833a, r52.f70833a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f70834b, r52.f70834b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f70833a.hashCode() * 31) + this.f70834b.hashCode();
    }

    public String toString() {
        return "DialogSingleOption(title=" + this.f70833a + ", param=" + this.f70834b + ')';
    }
}
