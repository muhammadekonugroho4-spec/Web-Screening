package com.stockbit.usecase.social.subscription.model.type;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/stockbit/usecase/social/subscription/model/type/SocialSubscriptionUIType;", "", "planCode", "", "isRecommended", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getPlanCode", "()Ljava/lang/String;", "()Z", "SUBSCRIPTION_ONE_YEAR", "SUBSCRIPTION_SIX_MONTHS", "SUBSCRIPTION_ONE_MONTH", "SUBSCRIPTION_ONE_DAY", "SUBSCRIPTION_UNSPECIFIED", "Companion", "usecase-social-subscription_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum SocialSubscriptionUIType extends Enum<SocialSubscriptionUIType> {
    public static final a Companion = null;
    public static final SocialSubscriptionUIType SUBSCRIPTION_ONE_DAY = null;
    public static final SocialSubscriptionUIType SUBSCRIPTION_ONE_MONTH = null;
    public static final SocialSubscriptionUIType SUBSCRIPTION_ONE_YEAR = null;
    public static final SocialSubscriptionUIType SUBSCRIPTION_SIX_MONTHS = null;
    public static final SocialSubscriptionUIType SUBSCRIPTION_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SocialSubscriptionUIType[] f162993a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f162994b = null;
    private final boolean isRecommended;
    private final String planCode;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final SocialSubscriptionUIType a(String r4) {
            p.l(r4, "planCode");
            Iterator<E> r02 = SocialSubscriptionUIType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (p.g(((SocialSubscriptionUIType) r1).getPlanCode(), r4) == false) goto L4;
        L9:
            SocialSubscriptionUIType r12 = (SocialSubscriptionUIType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return SocialSubscriptionUIType.SUBSCRIPTION_UNSPECIFIED;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        SUBSCRIPTION_ONE_YEAR = new SocialSubscriptionUIType("SUBSCRIPTION_ONE_YEAR", 0, "GOPRO12", true);
        String r6 = "SUBSCRIPTION_SIX_MONTHS";
        int r7 = 1;
        String r8 = "GOPRO6";
        boolean r9 = false;
        SUBSCRIPTION_SIX_MONTHS = new SocialSubscriptionUIType(r6, r7, r8, r9, 2, null);
        String r72 = "SUBSCRIPTION_ONE_MONTH";
        int r82 = 2;
        String r92 = "GOPRO1";
        boolean r10 = false;
        SUBSCRIPTION_ONE_MONTH = new SocialSubscriptionUIType(r72, r82, r92, r10, 2, null);
        String r83 = "SUBSCRIPTION_ONE_DAY";
        int r93 = 3;
        String r102 = "GOPRO1D";
        boolean r11 = false;
        SUBSCRIPTION_ONE_DAY = new SocialSubscriptionUIType(r83, r93, r102, r11, 2, null);
        String r1 = "SUBSCRIPTION_UNSPECIFIED";
        int r2 = 4;
        String r3 = "_";
        SUBSCRIPTION_UNSPECIFIED = new SocialSubscriptionUIType(r1, r2, r3, false, 2, null);
        SocialSubscriptionUIType[] r02 = a();
        f162993a = r02;
        f162994b = b.a(r02);
        Companion = new a(null);
    }

    SocialSubscriptionUIType(String r1, int r2, String r3, boolean r4) {
        this.planCode = r3;
        this.isRecommended = r4;
    }

    public static final /* synthetic */ SocialSubscriptionUIType[] a() {
        return new SocialSubscriptionUIType[]{SUBSCRIPTION_ONE_YEAR, SUBSCRIPTION_SIX_MONTHS, SUBSCRIPTION_ONE_MONTH, SUBSCRIPTION_ONE_DAY, SUBSCRIPTION_UNSPECIFIED};
    }

    public static kotlin.enums.a getEntries() {
        return f162994b;
    }

    public static SocialSubscriptionUIType valueOf(String r1) {
        return (SocialSubscriptionUIType) Enum.valueOf(SocialSubscriptionUIType.class, r1);
    }

    public static SocialSubscriptionUIType[] values() {
        return (SocialSubscriptionUIType[]) f162993a.clone();
    }

    public final String getPlanCode() {
        return this.planCode;
    }

    public final boolean isRecommended() {
        return this.isRecommended;
    }

    /* synthetic */ SocialSubscriptionUIType(String r1, int r2, String r3, boolean r4, int r5, i r6) {
        if ((r5 & 2) == 0) goto L5;
        r4 = false;
    L5:
        this(r1, r2, r3, r4);
    }
}
