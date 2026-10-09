package com.stockbit.usecase.transaction.model;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f163788a;

    /* renamed from: b, reason: collision with root package name */
    public final a f163789b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f163790c;
    public final boolean d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f163791a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f163792b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f163793c;
        public final BracketInputType d;

        /* renamed from: e, reason: collision with root package name */
        public final String f163794e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f163795f;

        /* renamed from: g, reason: collision with root package name */
        public final String f163796g;

        /* renamed from: h, reason: collision with root package name */
        public final String f163797h;

        /* renamed from: i, reason: collision with root package name */
        public final String f163798i;

        /* renamed from: j, reason: collision with root package name */
        public final String f163799j;

        /* renamed from: k, reason: collision with root package name */
        public final String f163800k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f163801l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f163802m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f163803n;

        public a(boolean r2, boolean r3, boolean r4, BracketInputType r5, String r6, boolean r7, String r8, String r9, String r10, String r11, String r12, boolean r13, boolean r14, boolean r15) {
            p.l(r5, "inputType");
            p.l(r6, "estimatedData");
            p.l(r8, "percent");
            p.l(r9, FirebaseAnalytics.Param.PRICE);
            p.l(r10, "formattedPrice");
            p.l(r11, Constants.KEY_TEXT);
            p.l(r12, "totalSell");
            this.f163791a = r2;
            this.f163792b = r3;
            this.f163793c = r4;
            this.d = r5;
            this.f163794e = r6;
            this.f163795f = r7;
            this.f163796g = r8;
            this.f163797h = r9;
            this.f163798i = r10;
            this.f163799j = r11;
            this.f163800k = r12;
            this.f163801l = r13;
            this.f163802m = r14;
            this.f163803n = r15;
        }

        public final boolean a() {
            return this.f163803n;
        }

        public final String b() {
            return this.f163794e;
        }

        public final String c() {
            return this.f163798i;
        }

        public final String d() {
            return this.f163796g;
        }

        public final String e() {
            return this.f163797h;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f163791a == r52.f163791a) goto L12;
            return false;
        L12:
            if (this.f163792b == r52.f163792b) goto L15;
            return false;
        L15:
            if (this.f163793c == r52.f163793c) goto L18;
            return false;
        L18:
            if (this.d == r52.d) goto L21;
            return false;
        L21:
            if (p.g(this.f163794e, r52.f163794e) == true) goto L24;
            return false;
        L24:
            if (this.f163795f == r52.f163795f) goto L27;
            return false;
        L27:
            if (p.g(this.f163796g, r52.f163796g) == true) goto L30;
            return false;
        L30:
            if (p.g(this.f163797h, r52.f163797h) == true) goto L33;
            return false;
        L33:
            if (p.g(this.f163798i, r52.f163798i) == true) goto L36;
            return false;
        L36:
            if (p.g(this.f163799j, r52.f163799j) == true) goto L39;
            return false;
        L39:
            if (p.g(this.f163800k, r52.f163800k) == true) goto L42;
            return false;
        L42:
            if (this.f163801l == r52.f163801l) goto L45;
            return false;
        L45:
            if (this.f163802m == r52.f163802m) goto L48;
            return false;
        L48:
            if (this.f163803n == r52.f163803n) goto L50;
            return false;
        L50:
            return true;
        }

        public final boolean f() {
            return this.f163801l;
        }

        public final String g() {
            return this.f163799j;
        }

        public final String h() {
            return this.f163800k;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((Boolean.hashCode(this.f163791a) * 31) + Boolean.hashCode(this.f163792b)) * 31) + Boolean.hashCode(this.f163793c)) * 31) + this.d.hashCode()) * 31) + this.f163794e.hashCode()) * 31) + Boolean.hashCode(this.f163795f)) * 31) + this.f163796g.hashCode()) * 31) + this.f163797h.hashCode()) * 31) + this.f163798i.hashCode()) * 31) + this.f163799j.hashCode()) * 31) + this.f163800k.hashCode()) * 31) + Boolean.hashCode(this.f163801l)) * 31) + Boolean.hashCode(this.f163802m)) * 31) + Boolean.hashCode(this.f163803n);
        }

        public final boolean i() {
            return this.f163795f;
        }

        public final boolean j() {
            return this.f163802m;
        }

        public String toString() {
            return "BracketTypeUIData(isChecked=" + this.f163791a + ", isEnabled=" + this.f163792b + ", isVisible=" + this.f163793c + ", inputType=" + this.d + ", estimatedData=" + this.f163794e + ", isError=" + this.f163795f + ", percent=" + this.f163796g + ", price=" + this.f163797h + ", formattedPrice=" + this.f163798i + ", text=" + this.f163799j + ", totalSell=" + this.f163800k + ", skipChanges=" + this.f163801l + ", isValid=" + this.f163802m + ", disablePlusButton=" + this.f163803n + ")";
        }

        public /* synthetic */ a(boolean r16, boolean r17, boolean r18, BracketInputType r19, String r20, boolean r21, String r22, String r23, String r24, String r25, String r26, boolean r27, boolean r28, boolean r29, int r30, i r31) {
            if ((r30 & 1) == 0) goto L5;
            boolean r1 = false;
        L6:
            boolean r4 = true;
            if ((r30 & 2) == 0) goto L9;
            boolean r3 = true;
        L11:
            if ((r30 & 4) != 0) goto L15;
            r4 = r18;
        L15:
            if ((r30 & 8) == 0) goto L17;
            BracketInputType r5 = BracketInputType.PRICE;
        L18:
            String r7 = "";
            if ((r30 & 16) == 0) goto L21;
            String r6 = "";
        L23:
            if ((r30 & 32) == 0) goto L25;
            boolean r8 = false;
        L27:
            if ((r30 & 64) == 0) goto L29;
            String r9 = "";
        L31:
            if ((r30 & 128) == 0) goto L33;
            String r10 = "";
        L35:
            if ((r30 & 256) == 0) goto L37;
            String r11 = "";
        L39:
            if ((r30 & 512) == 0) goto L41;
            String r12 = "";
        L43:
            if ((r30 & 1024) != 0) goto L47;
            r7 = r26;
        L47:
            if ((r30 & 2048) == 0) goto L49;
            boolean r13 = false;
        L51:
            if ((r30 & 4096) == 0) goto L53;
            boolean r14 = false;
        L55:
            if ((r30 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L58;
            boolean r302 = false;
        L59:
            this(r1, r3, r4, r5, r6, r8, r9, r10, r11, r12, r7, r13, r14, r302);
            return;
        L58:
            r302 = r29;
            goto L59
        L53:
            r14 = r28;
            goto L55
        L49:
            r13 = r27;
            goto L51
        L41:
            r12 = r25;
            goto L43
        L37:
            r11 = r24;
            goto L39
        L33:
            r10 = r23;
            goto L35
        L29:
            r9 = r22;
            goto L31
        L25:
            r8 = r21;
            goto L27
        L21:
            r6 = r20;
            goto L23
        L17:
            r5 = r19;
            goto L18
        L9:
            r3 = r17;
            goto L11
        L5:
            r1 = r16;
            goto L6
        }
    }

    public b(a r2, a r3, boolean r4, boolean r5) {
        p.l(r2, "bracketStopLoss");
        p.l(r3, "bracketTakeProfit");
        this.f163788a = r2;
        this.f163789b = r3;
        this.f163790c = r4;
        this.d = r5;
    }

    public final a a() {
        return this.f163788a;
    }

    public final a b() {
        return this.f163789b;
    }

    public final boolean c() {
        return this.f163790c;
    }

    public final boolean d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f163788a, r52.f163788a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f163789b, r52.f163789b) == true) goto L15;
        return false;
    L15:
        if (this.f163790c == r52.f163790c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f163788a.hashCode() * 31) + this.f163789b.hashCode()) * 31) + Boolean.hashCode(this.f163790c)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "BracketLayoutUIData(bracketStopLoss=" + this.f163788a + ", bracketTakeProfit=" + this.f163789b + ", enabledBuyButton=" + this.f163790c + ", keepExistingData=" + this.d + ")";
    }

    public /* synthetic */ b(a r20, a r21, boolean r22, boolean r23, int r24, i r25) {
        if ((r24 & 1) == 0) goto L5;
        a r1 = new a(false, false, false, null, null, false, null, null, null, null, null, false, false, false, 16383, null);
    L7:
        if ((r24 & 2) == 0) goto L9;
        a r2 = new a(false, false, false, null, null, false, null, null, null, null, null, false, false, false, 16383, null);
    L10:
        boolean r3 = false;
        if ((r24 & 4) == 0) goto L13;
        boolean r02 = false;
    L15:
        if ((r24 & 8) != 0) goto L18;
        r3 = r23;
    L18:
        this(r1, r2, r02, r3);
        return;
    L13:
        r02 = r22;
        goto L15
    L9:
        r2 = r21;
        goto L10
    L5:
        r1 = r20;
        goto L7
    }
}
