package com.stockbit.watchlist.ui.mainv2.state;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f171015a;

    /* renamed from: b, reason: collision with root package name */
    public final WatchlistMainOaProgressUIType f171016b;

    static {
    }

    public s(String r2, WatchlistMainOaProgressUIType r3) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_TEXT);
        kotlin.jvm.internal.p.l(r3, NotificationCompat.CATEGORY_STATUS);
        this.f171015a = r2;
        this.f171016b = r3;
    }

    public final WatchlistMainOaProgressUIType a() {
        return this.f171016b;
    }

    public final String b() {
        return this.f171015a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof s) == true) goto L8;
        return false;
    L8:
        s r52 = (s) r5;
        if (kotlin.jvm.internal.p.g(this.f171015a, r52.f171015a) == true) goto L12;
        return false;
    L12:
        if (this.f171016b == r52.f171016b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f171015a.hashCode() * 31) + this.f171016b.hashCode();
    }

    public String toString() {
        return "WatchlistMainOaVerificationStepUIState(text=" + this.f171015a + ", status=" + this.f171016b + ')';
    }
}
