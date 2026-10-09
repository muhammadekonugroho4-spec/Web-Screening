package com.stockbit.trading.ui.openingaccount;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.domain.model.valueobject.securities.OcrResult;
import java.io.Serializable;

/* renamed from: com.stockbit.trading.ui.openingaccount.o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C10718o implements InterfaceC4094y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f148175e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final int f148176f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f148177a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f148178b;

    /* renamed from: c, reason: collision with root package name */
    public final OcrResult f148179c;
    public final String d;

    /* renamed from: com.stockbit.trading.ui.openingaccount.o$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C10718o a(Bundle r7) {
            kotlin.jvm.internal.p.l(r7, "bundle");
            r7.setClassLoader(C10718o.class.getClassLoader());
            boolean r2 = false;
            if (r7.containsKey("isFromSocial") == false) goto L5;
            boolean r02 = r7.getBoolean("isFromSocial");
        L7:
            if (r7.containsKey("registerWithBibit") == false) goto L9;
            r2 = r7.getBoolean("registerWithBibit");
        L9:
            String r4 = null;
            if (r7.containsKey("ocrResult") == true) goto L12;
            OcrResult r1 = null;
        L21:
            if (r7.containsKey("referralCode") == false) goto L24;
            r4 = r7.getString("referralCode");
        L24:
            return new C10718o(r02, r2, r1, r4);
        L12:
            if (Parcelable.class.isAssignableFrom(OcrResult.class) == false) goto L14;
        L18:
            r1 = (OcrResult) r7.get("ocrResult");
            goto L21
        L14:
            if (Serializable.class.isAssignableFrom(OcrResult.class) == true) goto L18;
            throw new UnsupportedOperationException(OcrResult.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L5:
            r02 = false;
            goto L7
        }

        public a() {
        }
    }

    static {
        f148175e = new a(null);
        f148176f = 8;
    }

    public C10718o(boolean r1, boolean r2, OcrResult r3, String r4) {
        this.f148177a = r1;
        this.f148178b = r2;
        this.f148179c = r3;
        this.d = r4;
    }

    public static final C10718o fromBundle(Bundle r1) {
        return f148175e.a(r1);
    }

    public final OcrResult a() {
        return this.f148179c;
    }

    public final boolean b() {
        return this.f148178b;
    }

    public final boolean c() {
        return this.f148177a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C10718o) == true) goto L8;
        return false;
    L8:
        C10718o r52 = (C10718o) r5;
        if (this.f148177a == r52.f148177a) goto L12;
        return false;
    L12:
        if (this.f148178b == r52.f148178b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f148179c, r52.f148179c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((Boolean.hashCode(this.f148177a) * 31) + Boolean.hashCode(this.f148178b)) * 31;
        OcrResult r1 = this.f148179c;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.d;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "RegisterTradingFragmentArgs(isFromSocial=" + this.f148177a + ", registerWithBibit=" + this.f148178b + ", ocrResult=" + this.f148179c + ", referralCode=" + this.d + ')';
    }
}
