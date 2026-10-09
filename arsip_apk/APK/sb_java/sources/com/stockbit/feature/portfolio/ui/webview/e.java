package com.stockbit.feature.portfolio.ui.webview;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class e implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f106586c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f106587a;

    /* renamed from: b, reason: collision with root package name */
    public final String f106588b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final e a(Bundle r5) {
            p.l(r5, "bundle");
            r5.setClassLoader(e.class.getClassLoader());
            String r2 = "";
            if (r5.containsKey(Constants.KEY_TITLE) == false) goto L5;
            String r02 = r5.getString(Constants.KEY_TITLE);
        L7:
            if (r5.containsKey("url") == false) goto L10;
            r2 = r5.getString("url");
        L10:
            return new e(r02, r2);
        L5:
            r02 = "";
            goto L7
        }

        public a() {
        }
    }

    static {
        f106586c = new a(null);
    }

    public e(String r1, String r2) {
        this.f106587a = r1;
        this.f106588b = r2;
    }

    public static final e fromBundle(Bundle r1) {
        return f106586c.a(r1);
    }

    public final String a() {
        return this.f106587a;
    }

    public final String b() {
        return this.f106588b;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString(Constants.KEY_TITLE, this.f106587a);
        r02.putString("url", this.f106588b);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f106587a, r52.f106587a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f106588b, r52.f106588b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f106587a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f106588b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "PortfolioWebViewFragmentArgs(title=" + this.f106587a + ", url=" + this.f106588b + ')';
    }
}
