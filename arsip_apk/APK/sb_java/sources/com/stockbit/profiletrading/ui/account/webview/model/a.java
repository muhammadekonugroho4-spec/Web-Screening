package com.stockbit.profiletrading.ui.account.webview.model;

import com.clevertap.android.sdk.Constants;
import com.stockbit.domain.model.type.CameraType;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f128522a;

    /* renamed from: b, reason: collision with root package name */
    public final String f128523b;

    /* renamed from: c, reason: collision with root package name */
    public final String f128524c;
    public final CameraType d;

    static {
    }

    public a(String r2, String r3, String r4, CameraType r5) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "cameraInfoText");
        p.l(r4, "frameType");
        p.l(r5, "cameraType");
        this.f128522a = r2;
        this.f128523b = r3;
        this.f128524c = r4;
        this.d = r5;
    }

    public final CameraType a() {
        return this.d;
    }

    public final String b() {
        return this.f128524c;
    }

    public final String c() {
        return this.f128522a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f128522a, r52.f128522a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f128523b, r52.f128523b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f128524c, r52.f128524c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f128522a.hashCode() * 31) + this.f128523b.hashCode()) * 31) + this.f128524c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "AmendTradingProfilePhotoUIState(key=" + this.f128522a + ", cameraInfoText=" + this.f128523b + ", frameType=" + this.f128524c + ", cameraType=" + this.d + ')';
    }

    public /* synthetic */ a(String r2, String r3, String r4, CameraType r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = CameraType.NORMAL;
    L14:
        this(r2, r3, r4, r5);
    }
}
