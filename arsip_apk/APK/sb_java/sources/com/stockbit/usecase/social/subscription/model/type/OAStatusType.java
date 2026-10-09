package com.stockbit.usecase.social.subscription.model.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stockbit/usecase/social/subscription/model/type/OAStatusType;", "", "<init>", "(Ljava/lang/String;I)V", "UNREGISTERED", "INCOMPLETE", "ON_PROGRESS", "REJECTED", "COMPLETED", "usecase-social-subscription_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum OAStatusType extends Enum<OAStatusType> {
    public static final OAStatusType COMPLETED = null;
    public static final OAStatusType INCOMPLETE = null;
    public static final OAStatusType ON_PROGRESS = null;
    public static final OAStatusType REJECTED = null;
    public static final OAStatusType UNREGISTERED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OAStatusType[] f162991a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f162992b = null;

    static {
        UNREGISTERED = new OAStatusType("UNREGISTERED", 0);
        INCOMPLETE = new OAStatusType("INCOMPLETE", 1);
        ON_PROGRESS = new OAStatusType("ON_PROGRESS", 2);
        REJECTED = new OAStatusType("REJECTED", 3);
        COMPLETED = new OAStatusType("COMPLETED", 4);
        OAStatusType[] r02 = a();
        f162991a = r02;
        f162992b = b.a(r02);
    }

    OAStatusType(String r1, int r2) {
    }

    public static final /* synthetic */ OAStatusType[] a() {
        return new OAStatusType[]{UNREGISTERED, INCOMPLETE, ON_PROGRESS, REJECTED, COMPLETED};
    }

    public static a getEntries() {
        return f162992b;
    }

    public static OAStatusType valueOf(String r1) {
        return (OAStatusType) Enum.valueOf(OAStatusType.class, r1);
    }

    public static OAStatusType[] values() {
        return (OAStatusType[]) f162991a.clone();
    }
}
