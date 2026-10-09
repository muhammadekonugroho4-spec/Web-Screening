package com.android.billingclient.api;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.android.billingclient.api.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4352m {

    /* renamed from: a, reason: collision with root package name */
    public final String f31867a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f31868b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31869c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f31870e;

    /* renamed from: f, reason: collision with root package name */
    public final String f31871f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31872g;

    /* renamed from: h, reason: collision with root package name */
    public final String f31873h;

    /* renamed from: i, reason: collision with root package name */
    public final String f31874i;

    /* renamed from: j, reason: collision with root package name */
    public final List f31875j;

    /* renamed from: k, reason: collision with root package name */
    public final List f31876k;

    /* renamed from: com.android.billingclient.api.m$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f31877a;

        /* renamed from: b, reason: collision with root package name */
        public final int f31878b;

        public a(JSONObject r2) {
            this.f31877a = r2.getInt("commitmentPaymentsCount");
            this.f31878b = r2.optInt("subsequentCommitmentPaymentsCount");
        }
    }

    /* renamed from: com.android.billingclient.api.m$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f31879a;

        /* renamed from: b, reason: collision with root package name */
        public final long f31880b;

        /* renamed from: c, reason: collision with root package name */
        public final String f31881c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f31882e;

        /* renamed from: f, reason: collision with root package name */
        public final String f31883f;

        /* renamed from: g, reason: collision with root package name */
        public final List f31884g;

        /* renamed from: h, reason: collision with root package name */
        public final Long f31885h;

        /* renamed from: i, reason: collision with root package name */
        public final a f31886i;

        /* renamed from: j, reason: collision with root package name */
        public final d f31887j;

        /* renamed from: k, reason: collision with root package name */
        public final C0302b f31888k;

        /* renamed from: l, reason: collision with root package name */
        public final String f31889l;

        /* renamed from: m, reason: collision with root package name */
        public final c f31890m;

        /* renamed from: n, reason: collision with root package name */
        public final m0 f31891n;

        /* renamed from: com.android.billingclient.api.m$b$a */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final Integer f31892a;

            /* renamed from: b, reason: collision with root package name */
            public final C0301a f31893b;

            /* renamed from: com.android.billingclient.api.m$b$a$a, reason: collision with other inner class name */
            public static final class C0301a {

                /* renamed from: a, reason: collision with root package name */
                public final String f31894a;

                /* renamed from: b, reason: collision with root package name */
                public final long f31895b;

                /* renamed from: c, reason: collision with root package name */
                public final String f31896c;

                public C0301a(JSONObject r3) {
                    this.f31894a = r3.optString("formattedDiscountAmount");
                    this.f31895b = r3.optLong("discountAmountMicros");
                    this.f31896c = r3.optString("discountAmountCurrencyCode");
                }
            }

            public a(JSONObject r4) {
                C0301a r2 = null;
                if (r4.has("percentageDiscount") == false) goto L5;
                Integer r02 = Integer.valueOf(r4.optInt("percentageDiscount"));
            L6:
                this.f31892a = r02;
                JSONObject r42 = r4.optJSONObject("discountAmount");
                if (r42 == null) goto L10;
                r2 = new C0301a(r42);
            L10:
                this.f31893b = r2;
                return;
            L5:
                r02 = null;
                goto L6
            }
        }

        /* renamed from: com.android.billingclient.api.m$b$b, reason: collision with other inner class name */
        public static final class C0302b {

            /* renamed from: a, reason: collision with root package name */
            public final int f31897a;

            /* renamed from: b, reason: collision with root package name */
            public final int f31898b;

            public C0302b(JSONObject r2) {
                this.f31897a = r2.getInt("maximumQuantity");
                this.f31898b = r2.getInt("remainingQuantity");
            }
        }

        /* renamed from: com.android.billingclient.api.m$b$c */
        public static final class c {

            /* renamed from: a, reason: collision with root package name */
            public final String f31899a;

            /* renamed from: b, reason: collision with root package name */
            public final String f31900b;

            public c(JSONObject r3) {
                this.f31899a = r3.getString("rentalPeriod");
                String r32 = r3.optString("rentalExpirationPeriod");
                if (true != r32.isEmpty()) goto L5;
                r32 = null;
            L5:
                this.f31900b = r32;
            }
        }

        /* renamed from: com.android.billingclient.api.m$b$d */
        public static final class d {

            /* renamed from: a, reason: collision with root package name */
            public final Long f31901a;

            /* renamed from: b, reason: collision with root package name */
            public final Long f31902b;

            public d(JSONObject r4) {
                Long r2 = null;
                if (r4.has("startTimeMillis") == false) goto L5;
                Long r02 = Long.valueOf(r4.optLong("startTimeMillis"));
            L6:
                this.f31901a = r02;
                if (r4.has("endTimeMillis") == false) goto L9;
                r2 = Long.valueOf(r4.optLong("endTimeMillis"));
            L9:
                this.f31902b = r2;
                return;
            L5:
                r02 = null;
                goto L6
            }
        }

        public b(JSONObject r6) {
            this.f31879a = r6.optString("formattedPrice");
            this.f31880b = r6.optLong("priceAmountMicros");
            this.f31881c = r6.optString("priceCurrencyCode");
            String r02 = r6.optString("offerIdToken");
            m0 r2 = null;
            if (true != r02.isEmpty()) goto L5;
            r02 = null;
        L5:
            this.d = r02;
            String r03 = r6.optString("offerId");
            if (true != r03.isEmpty()) goto L8;
            r03 = null;
        L8:
            this.f31882e = r03;
            String r04 = r6.optString("purchaseOptionId");
            if (true != r04.isEmpty()) goto L11;
            r04 = null;
        L11:
            this.f31883f = r04;
            r6.optInt("offerType");
            JSONArray r05 = r6.optJSONArray("offerTags");
            this.f31884g = new ArrayList();
            if (r05 == null) goto L18;
            int r1 = 0;
        L15:
            if (r1 >= r05.length()) goto L18;
            this.f31884g.add(r05.getString(r1));
            r1 = r1 + 1;
        L18:
            if (r6.has("fullPriceMicros") == false) goto L20;
            Long r06 = Long.valueOf(r6.optLong("fullPriceMicros"));
        L21:
            this.f31885h = r06;
            JSONObject r07 = r6.optJSONObject("discountDisplayInfo");
            if (r07 != null) goto L24;
            a r12 = null;
        L25:
            this.f31886i = r12;
            JSONObject r08 = r6.optJSONObject("validTimeWindow");
            if (r08 != null) goto L28;
            d r13 = null;
        L29:
            this.f31887j = r13;
            JSONObject r09 = r6.optJSONObject("limitedQuantityInfo");
            if (r09 != null) goto L32;
            C0302b r14 = null;
        L33:
            this.f31888k = r14;
            this.f31889l = r6.optString("serializedDocid");
            JSONObject r010 = r6.optJSONObject("preorderDetails");
            if (r010 == null) goto L36;
            r010.getLong("preorderReleaseTimeMillis");
            r010.getLong("preorderPresaleEndTimeMillis");
        L36:
            JSONObject r011 = r6.optJSONObject("rentalDetails");
            if (r011 != null) goto L39;
            c r15 = null;
        L40:
            this.f31890m = r15;
            JSONObject r012 = r6.optJSONObject("autoPayDetails");
            if (r012 == null) goto L44;
            r2 = new m0(r012);
        L44:
            this.f31891n = r2;
            JSONArray r62 = r6.optJSONArray("pricingPhases");
            if (r62 != null) goto L47;
            return;
        L47:
            new d(r62);
            return;
        L39:
            r15 = new c(r011);
            goto L40
        L32:
            r14 = new C0302b(r09);
            goto L33
        L28:
            r13 = new d(r08);
            goto L29
        L24:
            r12 = new a(r07);
            goto L25
        L20:
            r06 = null;
            goto L21
        }

        public String a() {
            return this.d;
        }

        public final m0 b() {
            return this.f31891n;
        }

        public final String c() {
            return this.f31889l;
        }
    }

    /* renamed from: com.android.billingclient.api.m$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f31903a;

        /* renamed from: b, reason: collision with root package name */
        public final long f31904b;

        /* renamed from: c, reason: collision with root package name */
        public final String f31905c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final int f31906e;

        /* renamed from: f, reason: collision with root package name */
        public final int f31907f;

        public c(JSONObject r3) {
            this.d = r3.optString("billingPeriod");
            this.f31905c = r3.optString("priceCurrencyCode");
            this.f31903a = r3.optString("formattedPrice");
            this.f31904b = r3.optLong("priceAmountMicros");
            this.f31907f = r3.optInt("recurrenceMode");
            this.f31906e = r3.optInt("billingCycleCount");
        }

        public String a() {
            return this.f31903a;
        }
    }

    /* renamed from: com.android.billingclient.api.m$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final List f31908a;

        public d(JSONArray r5) {
            ArrayList r02 = new ArrayList();
            if (r5 == null) goto L11;
            int r1 = 0;
        L6:
            if (r1 >= r5.length()) goto L11;
            JSONObject r2 = r5.optJSONObject(r1);
            if (r2 == null) goto L10;
            r02.add(new c(r2));
        L10:
            r1 = r1 + 1;
        L11:
            this.f31908a = r02;
        }

        public List a() {
            return this.f31908a;
        }
    }

    /* renamed from: com.android.billingclient.api.m$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final String f31909a;

        /* renamed from: b, reason: collision with root package name */
        public final String f31910b;

        /* renamed from: c, reason: collision with root package name */
        public final String f31911c;
        public final d d;

        /* renamed from: e, reason: collision with root package name */
        public final List f31912e;

        /* renamed from: f, reason: collision with root package name */
        public final a f31913f;

        public e(JSONObject r6) {
            this.f31909a = r6.optString("basePlanId");
            String r1 = r6.optString("offerId");
            a r3 = null;
            if (true != r1.isEmpty()) goto L5;
            r1 = null;
        L5:
            this.f31910b = r1;
            this.f31911c = r6.getString("offerIdToken");
            this.d = new d(r6.getJSONArray("pricingPhases"));
            JSONObject r12 = r6.optJSONObject("installmentPlanDetails");
            if (r12 == null) goto L9;
            r3 = new a(r12);
        L9:
            this.f31913f = r3;
            JSONObject r13 = r6.optJSONObject("transitionPlanDetails");
            if (r13 == null) goto L15;
            r13.getString("productId");
            r13.optString(Constants.KEY_TITLE);
            r13.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            r13.optString("description");
            r13.optString("basePlanId");
            JSONObject r02 = r13.optJSONObject("pricingPhase");
            if (r02 == null) goto L15;
            new c(r02);
        L15:
            ArrayList r03 = new ArrayList();
            JSONArray r62 = r6.optJSONArray("offerTags");
            if (r62 == null) goto L21;
            int r14 = 0;
        L19:
            if (r14 >= r62.length()) goto L21;
            r03.add(r62.getString(r14));
            r14 = r14 + 1;
        L21:
            this.f31912e = r03;
        }

        public String a() {
            return this.f31909a;
        }

        public String b() {
            return this.f31911c;
        }

        public d c() {
            return this.d;
        }
    }

    public C4352m(String r7) {
        this.f31867a = r7;
        JSONObject r02 = new JSONObject(r7);
        this.f31868b = r02;
        String r72 = r02.optString("productId");
        this.f31869c = r72;
        String r1 = r02.optString("type");
        this.d = r1;
        if (TextUtils.isEmpty(r72) == true) goto L36;
        if (TextUtils.isEmpty(r1) == true) goto L34;
        this.f31870e = r02.optString(Constants.KEY_TITLE);
        this.f31871f = r02.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f31872g = r02.optString("description");
        r02.optString("packageDisplayName");
        r02.optString("iconUrl");
        this.f31873h = r02.optString("skuDetailsToken");
        this.f31874i = r02.optString("serializedDocid");
        JSONArray r73 = r02.optJSONArray("subscriptionOfferDetails");
        int r2 = 0;
        if (r73 == null) goto L14;
        ArrayList r12 = new ArrayList();
        int r3 = 0;
    L10:
        if (r3 >= r73.length()) goto L12;
        r12.add(new e(r73.getJSONObject(r3)));
        r3 = r3 + 1;
        goto L10
    L12:
        this.f31875j = r12;
    L21:
        JSONObject r74 = this.f31868b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray r13 = this.f31868b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList r32 = new ArrayList();
        if (r13 != null) goto L24;
        if (r74 == null) goto L31;
        r32.add(new b(r74));
        this.f31876k = r32;
        return;
    L31:
        this.f31876k = null;
        return;
    L24:
        if (r2 >= r13.length()) goto L26;
        r32.add(new b(r13.getJSONObject(r2)));
        r2 = r2 + 1;
        goto L24
    L26:
        this.f31876k = r32;
        return;
    L14:
        if (r1.equals("subs") == false) goto L16;
    L19:
        ArrayList r75 = new ArrayList();
    L20:
        this.f31875j = r75;
        goto L21
    L16:
        if (r1.equals("play_pass_subs") == true) goto L19;
        r75 = null;
        goto L20
    L34:
        throw new IllegalArgumentException("Product type cannot be empty.");
    L36:
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public b a() {
        List r02 = this.f31876k;
        if (r02 != null) goto L5;
        return null;
    L5:
        if (r02.isEmpty() == false) goto L7;
        return null;
    L7:
        return (b) r02.get(0);
    }

    public List b() {
        return this.f31876k;
    }

    public String c() {
        return this.f31869c;
    }

    public String d() {
        return this.d;
    }

    public List e() {
        return this.f31875j;
    }

    public boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof C4352m) == true) goto L10;
        return false;
    L10:
        return TextUtils.equals(this.f31867a, ((C4352m) r2).f31867a);
    }

    public final String f() {
        return this.f31868b.optString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
    }

    public final String g() {
        return this.f31873h;
    }

    public String h() {
        return this.f31874i;
    }

    public int hashCode() {
        return this.f31867a.hashCode();
    }

    public final List i() {
        return this.f31876k;
    }

    public String toString() {
        List r02 = this.f31875j;
        return "ProductDetails{jsonString='" + this.f31867a + "', parsedJson=" + this.f31868b.toString() + ", productId='" + this.f31869c + "', productType='" + this.d + "', title='" + this.f31870e + "', productDetailsToken='" + this.f31873h + "', subscriptionOfferDetails=" + String.valueOf(r02) + "}";
    }
}
