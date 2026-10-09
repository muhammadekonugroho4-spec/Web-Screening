package com.stockbit.model.params.tipping;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/stockbit/model/params/tipping/TippingActivityTypeParams;", "", "<init>", "(Ljava/lang/String;I)V", "TIP_TAB_TIPPING", "TIP_TAB_CLAIM", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum TippingActivityTypeParams extends Enum<TippingActivityTypeParams> {
    public static final a Companion = null;
    public static final TippingActivityTypeParams TIP_TAB_CLAIM = null;
    public static final TippingActivityTypeParams TIP_TAB_TIPPING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TippingActivityTypeParams[] f122158a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122159b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final TippingActivityTypeParams a(String r6) {
            TippingActivityTypeParams[] r02 = TippingActivityTypeParams.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            TippingActivityTypeParams r3 = r02[r2];
            if (p.g(r3.name(), r6) == true) goto L6;
            r2 = r2 + 1;
            goto L3
        L6:
            return r3;
        L8:
            return null;
        }

        public a() {
        }
    }

    static {
        TIP_TAB_TIPPING = new TippingActivityTypeParams("TIP_TAB_TIPPING", 0);
        TIP_TAB_CLAIM = new TippingActivityTypeParams("TIP_TAB_CLAIM", 1);
        TippingActivityTypeParams[] r02 = a();
        f122158a = r02;
        f122159b = b.a(r02);
        Companion = new a(null);
    }

    TippingActivityTypeParams(String r1, int r2) {
    }

    public static final /* synthetic */ TippingActivityTypeParams[] a() {
        return new TippingActivityTypeParams[]{TIP_TAB_TIPPING, TIP_TAB_CLAIM};
    }

    public static kotlin.enums.a getEntries() {
        return f122159b;
    }

    public static TippingActivityTypeParams valueOf(String r1) {
        return (TippingActivityTypeParams) Enum.valueOf(TippingActivityTypeParams.class, r1);
    }

    public static TippingActivityTypeParams[] values() {
        return (TippingActivityTypeParams[]) f122158a.clone();
    }
}
