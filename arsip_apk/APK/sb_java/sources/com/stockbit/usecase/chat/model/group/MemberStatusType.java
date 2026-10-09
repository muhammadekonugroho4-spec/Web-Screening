package com.stockbit.usecase.chat.model.group;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/usecase/chat/model/group/MemberStatusType;", "", "<init>", "(Ljava/lang/String;I)V", "MEMBER_STATUS_ACCEPTED", "MEMBER_STATUS_UNSPECIFIED", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum MemberStatusType extends Enum<MemberStatusType> {
    public static final MemberStatusType MEMBER_STATUS_ACCEPTED = null;
    public static final MemberStatusType MEMBER_STATUS_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MemberStatusType[] f155531a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f155532b = null;

    static {
        MEMBER_STATUS_ACCEPTED = new MemberStatusType("MEMBER_STATUS_ACCEPTED", 0);
        MEMBER_STATUS_UNSPECIFIED = new MemberStatusType("MEMBER_STATUS_UNSPECIFIED", 1);
        MemberStatusType[] r02 = a();
        f155531a = r02;
        f155532b = kotlin.enums.b.a(r02);
    }

    MemberStatusType(String r1, int r2) {
    }

    public static final /* synthetic */ MemberStatusType[] a() {
        return new MemberStatusType[]{MEMBER_STATUS_ACCEPTED, MEMBER_STATUS_UNSPECIFIED};
    }

    public static kotlin.enums.a getEntries() {
        return f155532b;
    }

    public static MemberStatusType valueOf(String r1) {
        return (MemberStatusType) Enum.valueOf(MemberStatusType.class, r1);
    }

    public static MemberStatusType[] values() {
        return (MemberStatusType[]) f155531a.clone();
    }
}
