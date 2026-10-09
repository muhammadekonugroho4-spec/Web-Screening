package com.stockbit.domain.model.alert;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/stockbit/domain/model/alert/AlertExpirationPeriod;", "", "apiValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getApiValue", "()Ljava/lang/String;", "Unspecified", "OneWeek", "OneMonth", "ThreeMonth", "SixMonth", "OneYear", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum AlertExpirationPeriod extends Enum<AlertExpirationPeriod> {
    public static final a Companion = null;
    public static final AlertExpirationPeriod OneMonth = null;
    public static final AlertExpirationPeriod OneWeek = null;
    public static final AlertExpirationPeriod OneYear = null;
    public static final AlertExpirationPeriod SixMonth = null;
    public static final AlertExpirationPeriod ThreeMonth = null;
    public static final AlertExpirationPeriod Unspecified = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AlertExpirationPeriod[] f80561a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f80562b = null;
    private final String apiValue;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final AlertExpirationPeriod a(String r4) {
            kotlin.jvm.internal.p.l(r4, "apiValue");
            Iterator<E> r02 = AlertExpirationPeriod.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (kotlin.jvm.internal.p.g(r4, ((AlertExpirationPeriod) r1).getApiValue()) == false) goto L4;
        L10:
            return (AlertExpirationPeriod) r1;
        L8:
            r1 = null;
            goto L10
        }

        public a() {
        }
    }

    static {
        Unspecified = new AlertExpirationPeriod("Unspecified", 0, "EXPIRATION_UNSPECIFIED");
        OneWeek = new AlertExpirationPeriod("OneWeek", 1, "EXPIRATION_ONE_WEEK");
        OneMonth = new AlertExpirationPeriod("OneMonth", 2, "EXPIRATION_ONE_MONTH");
        ThreeMonth = new AlertExpirationPeriod("ThreeMonth", 3, "EXPIRATION_THREE_MONTH");
        SixMonth = new AlertExpirationPeriod("SixMonth", 4, "EXPIRATION_SIX_MONTH");
        OneYear = new AlertExpirationPeriod("OneYear", 5, "EXPIRATION_ONE_YEAR");
        AlertExpirationPeriod[] r02 = a();
        f80561a = r02;
        f80562b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    AlertExpirationPeriod(String r1, int r2, String r3) {
        this.apiValue = r3;
    }

    public static final /* synthetic */ AlertExpirationPeriod[] a() {
        return new AlertExpirationPeriod[]{Unspecified, OneWeek, OneMonth, ThreeMonth, SixMonth, OneYear};
    }

    public static kotlin.enums.a getEntries() {
        return f80562b;
    }

    public static AlertExpirationPeriod valueOf(String r1) {
        return (AlertExpirationPeriod) Enum.valueOf(AlertExpirationPeriod.class, r1);
    }

    public static AlertExpirationPeriod[] values() {
        return (AlertExpirationPeriod[]) f80561a.clone();
    }

    public final String getApiValue() {
        return this.apiValue;
    }
}
