package com.stockbit.usecase.chat.model.group;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/stockbit/usecase/chat/model/group/GroupAccessType;", "", "<init>", "(Ljava/lang/String;I)V", "GROUP_TYPE_UNSPECIFIED", "GROUP_TYPE_PRIVATE", "GROUP_TYPE_PUBLIC", "Companion", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum GroupAccessType extends Enum<GroupAccessType> {
    public static final a Companion = null;
    public static final GroupAccessType GROUP_TYPE_PRIVATE = null;
    public static final GroupAccessType GROUP_TYPE_PUBLIC = null;
    public static final GroupAccessType GROUP_TYPE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ GroupAccessType[] f155523a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f155524b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        GROUP_TYPE_UNSPECIFIED = new GroupAccessType("GROUP_TYPE_UNSPECIFIED", 0);
        GROUP_TYPE_PRIVATE = new GroupAccessType("GROUP_TYPE_PRIVATE", 1);
        GROUP_TYPE_PUBLIC = new GroupAccessType("GROUP_TYPE_PUBLIC", 2);
        GroupAccessType[] r02 = a();
        f155523a = r02;
        f155524b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    GroupAccessType(String r1, int r2) {
    }

    public static final /* synthetic */ GroupAccessType[] a() {
        return new GroupAccessType[]{GROUP_TYPE_UNSPECIFIED, GROUP_TYPE_PRIVATE, GROUP_TYPE_PUBLIC};
    }

    public static kotlin.enums.a getEntries() {
        return f155524b;
    }

    public static GroupAccessType valueOf(String r1) {
        return (GroupAccessType) Enum.valueOf(GroupAccessType.class, r1);
    }

    public static GroupAccessType[] values() {
        return (GroupAccessType[]) f155523a.clone();
    }
}
