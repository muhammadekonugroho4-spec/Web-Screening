package com.stockbit.domain.model.type.commentlimitation;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/domain/model/type/commentlimitation/CommentTrackerType;", "", "<init>", "(Ljava/lang/String;I)V", "VIEW", "ACTION", "USER_TYPE", "STATUS", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum CommentTrackerType extends Enum<CommentTrackerType> {
    public static final CommentTrackerType ACTION = null;
    public static final CommentTrackerType STATUS = null;
    public static final CommentTrackerType USER_TYPE = null;
    public static final CommentTrackerType VIEW = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CommentTrackerType[] f86311a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f86312b = null;

    static {
        VIEW = new CommentTrackerType("VIEW", 0);
        ACTION = new CommentTrackerType("ACTION", 1);
        USER_TYPE = new CommentTrackerType("USER_TYPE", 2);
        STATUS = new CommentTrackerType("STATUS", 3);
        CommentTrackerType[] r02 = a();
        f86311a = r02;
        f86312b = b.a(r02);
    }

    CommentTrackerType(String r1, int r2) {
    }

    public static final /* synthetic */ CommentTrackerType[] a() {
        return new CommentTrackerType[]{VIEW, ACTION, USER_TYPE, STATUS};
    }

    public static a getEntries() {
        return f86312b;
    }

    public static CommentTrackerType valueOf(String r1) {
        return (CommentTrackerType) Enum.valueOf(CommentTrackerType.class, r1);
    }

    public static CommentTrackerType[] values() {
        return (CommentTrackerType[]) f86311a.clone();
    }
}
