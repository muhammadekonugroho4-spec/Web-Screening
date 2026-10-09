package com.stockbit.usecase.bonds.model;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class BondDiscoveryUIState {

    /* renamed from: a, reason: collision with root package name */
    public final List f154473a;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/usecase/bonds/model/BondDiscoveryUIState$Badge;", "", Constants.KEY_TEXT, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getText", "()Ljava/lang/String;", "TopShortTerm", "HighestYield", "usecase-bonds"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum Badge extends Enum<Badge> {
        public static final Badge HighestYield = null;
        public static final Badge TopShortTerm = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Badge[] f154474a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f154475b = null;
        private final String text;

        static {
            TopShortTerm = new Badge("TopShortTerm", 0, "Top Short Term");
            HighestYield = new Badge("HighestYield", 1, "Highest Yield");
            Badge[] r02 = a();
            f154474a = r02;
            f154475b = kotlin.enums.b.a(r02);
        }

        Badge(String r1, int r2, String r3) {
            this.text = r3;
        }

        public static final /* synthetic */ Badge[] a() {
            return new Badge[]{TopShortTerm, HighestYield};
        }

        public static kotlin.enums.a getEntries() {
            return f154475b;
        }

        public static Badge valueOf(String r1) {
            return (Badge) Enum.valueOf(Badge.class, r1);
        }

        public static Badge[] values() {
            return (Badge[]) f154474a.clone();
        }

        public final String getText() {
            return this.text;
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f154476a;

        /* renamed from: b, reason: collision with root package name */
        public final String f154477b;

        /* renamed from: c, reason: collision with root package name */
        public final String f154478c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f154479e;

        /* renamed from: f, reason: collision with root package name */
        public final Badge f154480f;

        public a(String r2, String r3, String r4, String r5, String r6, Badge r7) {
            p.l(r2, "symbol");
            p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
            p.l(r4, "yield");
            p.l(r5, "bidPrice");
            p.l(r6, "dueDate");
            this.f154476a = r2;
            this.f154477b = r3;
            this.f154478c = r4;
            this.d = r5;
            this.f154479e = r6;
            this.f154480f = r7;
        }

        public final Badge a() {
            return this.f154480f;
        }

        public final String b() {
            return this.d;
        }

        public final String c() {
            return this.f154479e;
        }

        public final String d() {
            return this.f154477b;
        }

        public final String e() {
            return this.f154476a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f154476a, r52.f154476a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f154477b, r52.f154477b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f154478c, r52.f154478c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f154479e, r52.f154479e) == true) goto L24;
            return false;
        L24:
            if (this.f154480f == r52.f154480f) goto L26;
            return false;
        L26:
            return true;
        }

        public final String f() {
            return this.f154478c;
        }

        public int hashCode() {
            int r02 = ((((((((this.f154476a.hashCode() * 31) + this.f154477b.hashCode()) * 31) + this.f154478c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f154479e.hashCode()) * 31;
            Badge r1 = this.f154480f;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r02 + r12;
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "Item(symbol=" + this.f154476a + ", name=" + this.f154477b + ", yield=" + this.f154478c + ", bidPrice=" + this.d + ", dueDate=" + this.f154479e + ", badge=" + this.f154480f + ")";
        }
    }

    public BondDiscoveryUIState(List r2) {
        p.l(r2, FirebaseAnalytics.Param.ITEMS);
        this.f154473a = r2;
    }

    public final List a() {
        return this.f154473a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BondDiscoveryUIState) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f154473a, ((BondDiscoveryUIState) r4).f154473a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f154473a.hashCode();
    }

    public String toString() {
        return "BondDiscoveryUIState(items=" + this.f154473a + ")";
    }
}
