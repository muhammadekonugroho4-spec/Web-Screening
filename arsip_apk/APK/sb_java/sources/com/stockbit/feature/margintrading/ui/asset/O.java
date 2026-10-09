package com.stockbit.feature.margintrading.ui.asset;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* loaded from: classes9.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final List f99476a;

    /* renamed from: b, reason: collision with root package name */
    public final String f99477b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f99478a;

        /* renamed from: b, reason: collision with root package name */
        public final String f99479b;

        /* renamed from: c, reason: collision with root package name */
        public final int f99480c;

        static {
        }

        public /* synthetic */ a(String r1, String r2, int r3, kotlin.jvm.internal.i r4) {
            this(r1, r2, r3);
        }

        public final String a() {
            return this.f99478a;
        }

        public final String b() {
            return this.f99479b;
        }

        public final int c() {
            return this.f99480c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f99478a, r52.f99478a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f99479b, r52.f99479b) == true) goto L15;
            return false;
        L15:
            if (this.f99480c == r52.f99480c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f99478a.hashCode() * 31) + this.f99479b.hashCode()) * 31) + kotlin.p.d(this.f99480c);
        }

        public String toString() {
            return "ItemChip(id=" + this.f99478a + ", name=" + this.f99479b + ", numberOfSelectedAsset=" + kotlin.p.e(this.f99480c) + ')';
        }

        public a(String r2, String r3, int r4) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
            kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
            this.f99478a = r2;
            this.f99479b = r3;
            this.f99480c = r4;
        }
    }

    static {
    }

    public O(List r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "chips");
        this.f99476a = r2;
        this.f99477b = r3;
    }

    public final List a() {
        return this.f99476a;
    }

    public final String b() {
        return this.f99477b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof O) == true) goto L8;
        return false;
    L8:
        O r52 = (O) r5;
        if (kotlin.jvm.internal.p.g(this.f99476a, r52.f99476a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f99477b, r52.f99477b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f99476a.hashCode() * 31;
        String r1 = this.f99477b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "AddAssetCollateralPortfolioChipsState(chips=" + this.f99476a + ", selectedId=" + this.f99477b + ')';
    }
}
