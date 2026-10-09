package com.stockbit.usecase.banner.model.type;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/stockbit/usecase/banner/model/type/BannerStatusType;", "", "<init>", "(Ljava/lang/String;I)V", "STATUS_UNSPECIFIED", "STATUS_READ", "STATUS_DISMISSED", "Companion", "usecase-banner"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum BannerStatusType extends Enum<BannerStatusType> {
    public static final a Companion = null;
    public static final BannerStatusType STATUS_DISMISSED = null;
    public static final BannerStatusType STATUS_READ = null;
    public static final BannerStatusType STATUS_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BannerStatusType[] f154407a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f154408b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final BannerStatusType a(String r6) {
            p.l(r6, "value");
            BannerStatusType[] r02 = BannerStatusType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L9;
            BannerStatusType r3 = r02[r2];
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
        STATUS_UNSPECIFIED = new BannerStatusType("STATUS_UNSPECIFIED", 0);
        STATUS_READ = new BannerStatusType("STATUS_READ", 1);
        STATUS_DISMISSED = new BannerStatusType("STATUS_DISMISSED", 2);
        BannerStatusType[] r02 = a();
        f154407a = r02;
        f154408b = b.a(r02);
        Companion = new a(null);
    }

    BannerStatusType(String r1, int r2) {
    }

    public static final /* synthetic */ BannerStatusType[] a() {
        return new BannerStatusType[]{STATUS_UNSPECIFIED, STATUS_READ, STATUS_DISMISSED};
    }

    public static kotlin.enums.a getEntries() {
        return f154408b;
    }

    public static BannerStatusType valueOf(String r1) {
        return (BannerStatusType) Enum.valueOf(BannerStatusType.class, r1);
    }

    public static BannerStatusType[] values() {
        return (BannerStatusType[]) f154407a.clone();
    }
}
