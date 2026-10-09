package com.stockbit.domain.model.profile;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/stockbit/domain/model/profile/VerifiedStatusType;", "", "<init>", "(Ljava/lang/String;I)V", "VERIFIED_STATUS_UNVERIFIED", "VERIFIED_STATUS_IDENTITY", "VERIFIED_STATUS_COMMUNITY", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum VerifiedStatusType extends Enum<VerifiedStatusType> {
    public static final a Companion = null;
    public static final VerifiedStatusType VERIFIED_STATUS_COMMUNITY = null;
    public static final VerifiedStatusType VERIFIED_STATUS_IDENTITY = null;
    public static final VerifiedStatusType VERIFIED_STATUS_UNVERIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ VerifiedStatusType[] f84632a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f84633b = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final VerifiedStatusType a(String r4) {
            Iterator<E> r02 = VerifiedStatusType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (kotlin.jvm.internal.p.g(((VerifiedStatusType) r1).name(), r4) == false) goto L4;
        L9:
            VerifiedStatusType r12 = (VerifiedStatusType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return VerifiedStatusType.VERIFIED_STATUS_UNVERIFIED;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        VERIFIED_STATUS_UNVERIFIED = new VerifiedStatusType("VERIFIED_STATUS_UNVERIFIED", 0);
        VERIFIED_STATUS_IDENTITY = new VerifiedStatusType("VERIFIED_STATUS_IDENTITY", 1);
        VERIFIED_STATUS_COMMUNITY = new VerifiedStatusType("VERIFIED_STATUS_COMMUNITY", 2);
        VerifiedStatusType[] r02 = a();
        f84632a = r02;
        f84633b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    VerifiedStatusType(String r1, int r2) {
    }

    public static final /* synthetic */ VerifiedStatusType[] a() {
        return new VerifiedStatusType[]{VERIFIED_STATUS_UNVERIFIED, VERIFIED_STATUS_IDENTITY, VERIFIED_STATUS_COMMUNITY};
    }

    public static kotlin.enums.a getEntries() {
        return f84633b;
    }

    public static VerifiedStatusType valueOf(String r1) {
        return (VerifiedStatusType) Enum.valueOf(VerifiedStatusType.class, r1);
    }

    public static VerifiedStatusType[] values() {
        return (VerifiedStatusType[]) f84632a.clone();
    }
}
