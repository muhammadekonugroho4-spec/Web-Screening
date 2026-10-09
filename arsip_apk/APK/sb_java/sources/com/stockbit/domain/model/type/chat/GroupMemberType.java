package com.stockbit.domain.model.type.chat;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/domain/model/type/chat/GroupMemberType;", "", "<init>", "(Ljava/lang/String;I)V", "MEMBER_STATUS_ACCEPTED", "MEMBER_STATUS_UNSPECIFIED", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum GroupMemberType extends Enum<GroupMemberType> {
    public static final GroupMemberType MEMBER_STATUS_ACCEPTED = null;
    public static final GroupMemberType MEMBER_STATUS_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ GroupMemberType[] f86305a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f86306b = null;

    static {
        MEMBER_STATUS_ACCEPTED = new GroupMemberType("MEMBER_STATUS_ACCEPTED", 0);
        MEMBER_STATUS_UNSPECIFIED = new GroupMemberType("MEMBER_STATUS_UNSPECIFIED", 1);
        GroupMemberType[] r02 = a();
        f86305a = r02;
        f86306b = b.a(r02);
    }

    GroupMemberType(String r1, int r2) {
    }

    public static final /* synthetic */ GroupMemberType[] a() {
        return new GroupMemberType[]{MEMBER_STATUS_ACCEPTED, MEMBER_STATUS_UNSPECIFIED};
    }

    public static a getEntries() {
        return f86306b;
    }

    public static GroupMemberType valueOf(String r1) {
        return (GroupMemberType) Enum.valueOf(GroupMemberType.class, r1);
    }

    public static GroupMemberType[] values() {
        return (GroupMemberType[]) f86305a.clone();
    }
}
