package com.stockbit.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/model/type/ResourcePaging$StatusPaging;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "LOADING", "EMPTY", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum ResourcePaging$StatusPaging extends Enum<ResourcePaging$StatusPaging> {
    public static final ResourcePaging$StatusPaging EMPTY = null;
    public static final ResourcePaging$StatusPaging ERROR = null;
    public static final ResourcePaging$StatusPaging LOADING = null;
    public static final ResourcePaging$StatusPaging SUCCESS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ResourcePaging$StatusPaging[] f122199a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122200b = null;

    static {
        SUCCESS = new ResourcePaging$StatusPaging("SUCCESS", 0);
        ERROR = new ResourcePaging$StatusPaging("ERROR", 1);
        LOADING = new ResourcePaging$StatusPaging("LOADING", 2);
        EMPTY = new ResourcePaging$StatusPaging("EMPTY", 3);
        ResourcePaging$StatusPaging[] r02 = a();
        f122199a = r02;
        f122200b = kotlin.enums.b.a(r02);
    }

    ResourcePaging$StatusPaging(String r1, int r2) {
    }

    public static final /* synthetic */ ResourcePaging$StatusPaging[] a() {
        return new ResourcePaging$StatusPaging[]{SUCCESS, ERROR, LOADING, EMPTY};
    }

    public static kotlin.enums.a getEntries() {
        return f122200b;
    }

    public static ResourcePaging$StatusPaging valueOf(String r1) {
        return (ResourcePaging$StatusPaging) Enum.valueOf(ResourcePaging$StatusPaging.class, r1);
    }

    public static ResourcePaging$StatusPaging[] values() {
        return (ResourcePaging$StatusPaging[]) f122199a.clone();
    }
}
