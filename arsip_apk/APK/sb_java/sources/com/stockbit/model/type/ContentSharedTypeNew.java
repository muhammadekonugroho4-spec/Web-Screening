package com.stockbit.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stockbit/model/type/ContentSharedTypeNew;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TYPE_UNSPECIFIED", "TYPE_NEW_USER_JOIN", "SHARED_CONTENT_TYPE_STREAM", "SHARED_CONTENT_TYPE_GROUP_INVITATION", "TYPE_GROUP_INVITATION", "TYPE_SHARETRADE", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum ContentSharedTypeNew extends Enum<ContentSharedTypeNew> {
    public static final ContentSharedTypeNew SHARED_CONTENT_TYPE_GROUP_INVITATION = null;
    public static final ContentSharedTypeNew SHARED_CONTENT_TYPE_STREAM = null;
    public static final ContentSharedTypeNew TYPE_GROUP_INVITATION = null;
    public static final ContentSharedTypeNew TYPE_NEW_USER_JOIN = null;
    public static final ContentSharedTypeNew TYPE_SHARETRADE = null;
    public static final ContentSharedTypeNew TYPE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ContentSharedTypeNew[] f122173a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122174b = null;
    private final String value;

    static {
        TYPE_UNSPECIFIED = new ContentSharedTypeNew("TYPE_UNSPECIFIED", 0, "TYPE_UNSPECIFIED");
        TYPE_NEW_USER_JOIN = new ContentSharedTypeNew("TYPE_NEW_USER_JOIN", 1, "TYPE_NEW_USER_JOIN");
        SHARED_CONTENT_TYPE_STREAM = new ContentSharedTypeNew("SHARED_CONTENT_TYPE_STREAM", 2, "SHARED_CONTENT_TYPE_STREAM");
        SHARED_CONTENT_TYPE_GROUP_INVITATION = new ContentSharedTypeNew("SHARED_CONTENT_TYPE_GROUP_INVITATION", 3, "SHARED_CONTENT_TYPE_GROUP_INVITATION");
        TYPE_GROUP_INVITATION = new ContentSharedTypeNew("TYPE_GROUP_INVITATION", 4, "TYPE_GROUP_INVITATION");
        TYPE_SHARETRADE = new ContentSharedTypeNew("TYPE_SHARETRADE", 5, "TYPE_SHARETRADE");
        ContentSharedTypeNew[] r02 = a();
        f122173a = r02;
        f122174b = kotlin.enums.b.a(r02);
    }

    ContentSharedTypeNew(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ ContentSharedTypeNew[] a() {
        return new ContentSharedTypeNew[]{TYPE_UNSPECIFIED, TYPE_NEW_USER_JOIN, SHARED_CONTENT_TYPE_STREAM, SHARED_CONTENT_TYPE_GROUP_INVITATION, TYPE_GROUP_INVITATION, TYPE_SHARETRADE};
    }

    public static kotlin.enums.a getEntries() {
        return f122174b;
    }

    public static ContentSharedTypeNew valueOf(String r1) {
        return (ContentSharedTypeNew) Enum.valueOf(ContentSharedTypeNew.class, r1);
    }

    public static ContentSharedTypeNew[] values() {
        return (ContentSharedTypeNew[]) f122173a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
