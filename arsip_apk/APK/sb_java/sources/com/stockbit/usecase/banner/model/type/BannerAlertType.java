package com.stockbit.usecase.banner.model.type;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/stockbit/usecase/banner/model/type/BannerAlertType;", "", "<init>", "(Ljava/lang/String;I)V", "ALERT_TYPE_UNSPECIFIED", "ALERT_TYPE_DANGER", "ALERT_TYPE_INFO", "ALERT_TYPE_WARNING", "ALERT_TYPE_SUCCESSFUL", "Companion", "usecase-banner"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum BannerAlertType extends Enum<BannerAlertType> {
    public static final BannerAlertType ALERT_TYPE_DANGER = null;
    public static final BannerAlertType ALERT_TYPE_INFO = null;
    public static final BannerAlertType ALERT_TYPE_SUCCESSFUL = null;
    public static final BannerAlertType ALERT_TYPE_UNSPECIFIED = null;
    public static final BannerAlertType ALERT_TYPE_WARNING = null;
    public static final a Companion = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BannerAlertType[] f154405a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f154406b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final BannerAlertType a(String r6) {
            p.l(r6, "value");
            BannerAlertType[] r02 = BannerAlertType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L9;
            BannerAlertType r3 = r02[r2];
            if (p.g(r3.name(), r6) == true) goto L6;
            r2 = r2 + 1;
            goto L3
        L6:
            return r3;
        L9:
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        public a() {
        }
    }

    static {
        ALERT_TYPE_UNSPECIFIED = new BannerAlertType("ALERT_TYPE_UNSPECIFIED", 0);
        ALERT_TYPE_DANGER = new BannerAlertType("ALERT_TYPE_DANGER", 1);
        ALERT_TYPE_INFO = new BannerAlertType("ALERT_TYPE_INFO", 2);
        ALERT_TYPE_WARNING = new BannerAlertType("ALERT_TYPE_WARNING", 3);
        ALERT_TYPE_SUCCESSFUL = new BannerAlertType("ALERT_TYPE_SUCCESSFUL", 4);
        BannerAlertType[] r02 = a();
        f154405a = r02;
        f154406b = b.a(r02);
        Companion = new a(null);
    }

    BannerAlertType(String r1, int r2) {
    }

    public static final /* synthetic */ BannerAlertType[] a() {
        return new BannerAlertType[]{ALERT_TYPE_UNSPECIFIED, ALERT_TYPE_DANGER, ALERT_TYPE_INFO, ALERT_TYPE_WARNING, ALERT_TYPE_SUCCESSFUL};
    }

    public static kotlin.enums.a getEntries() {
        return f154406b;
    }

    public static BannerAlertType valueOf(String r1) {
        return (BannerAlertType) Enum.valueOf(BannerAlertType.class, r1);
    }

    public static BannerAlertType[] values() {
        return (BannerAlertType[]) f154405a.clone();
    }
}
