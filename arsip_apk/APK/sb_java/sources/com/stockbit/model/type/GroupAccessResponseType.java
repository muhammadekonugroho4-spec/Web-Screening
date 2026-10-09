package com.stockbit.model.type;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/model/type/GroupAccessResponseType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "GROUP_TYPE_UNSPECIFIED", "GROUP_TYPE_PRIVATE", "GROUP_TYPE_PUBLIC", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum GroupAccessResponseType extends Enum<GroupAccessResponseType> {
    public static final a Companion = null;
    public static final GroupAccessResponseType GROUP_TYPE_PRIVATE = null;
    public static final GroupAccessResponseType GROUP_TYPE_PUBLIC = null;
    public static final GroupAccessResponseType GROUP_TYPE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ GroupAccessResponseType[] f122179a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122180b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        GROUP_TYPE_UNSPECIFIED = new GroupAccessResponseType("GROUP_TYPE_UNSPECIFIED", 0, "GROUP_TYPE_UNSPECIFIED");
        GROUP_TYPE_PRIVATE = new GroupAccessResponseType("GROUP_TYPE_PRIVATE", 1, "GROUP_TYPE_PRIVATE");
        GROUP_TYPE_PUBLIC = new GroupAccessResponseType("GROUP_TYPE_PUBLIC", 2, "GROUP_TYPE_PUBLIC");
        GroupAccessResponseType[] r02 = a();
        f122179a = r02;
        f122180b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    GroupAccessResponseType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ GroupAccessResponseType[] a() {
        return new GroupAccessResponseType[]{GROUP_TYPE_UNSPECIFIED, GROUP_TYPE_PRIVATE, GROUP_TYPE_PUBLIC};
    }

    public static kotlin.enums.a getEntries() {
        return f122180b;
    }

    public static GroupAccessResponseType valueOf(String r1) {
        return (GroupAccessResponseType) Enum.valueOf(GroupAccessResponseType.class, r1);
    }

    public static GroupAccessResponseType[] values() {
        return (GroupAccessResponseType[]) f122179a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
