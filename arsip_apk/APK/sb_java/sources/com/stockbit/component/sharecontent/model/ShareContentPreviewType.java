package com.stockbit.component.sharecontent.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/component/sharecontent/model/ShareContentPreviewType;", "", "<init>", "(Ljava/lang/String;I)V", "HIDDEN", "SHOWN", "sharecontent_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum ShareContentPreviewType extends Enum<ShareContentPreviewType> {
    public static final ShareContentPreviewType HIDDEN = null;
    public static final ShareContentPreviewType SHOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ShareContentPreviewType[] f77077a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f77078b = null;

    static {
        HIDDEN = new ShareContentPreviewType("HIDDEN", 0);
        SHOWN = new ShareContentPreviewType("SHOWN", 1);
        ShareContentPreviewType[] r02 = a();
        f77077a = r02;
        f77078b = b.a(r02);
    }

    ShareContentPreviewType(String r1, int r2) {
    }

    public static final /* synthetic */ ShareContentPreviewType[] a() {
        return new ShareContentPreviewType[]{HIDDEN, SHOWN};
    }

    public static a getEntries() {
        return f77078b;
    }

    public static ShareContentPreviewType valueOf(String r1) {
        return (ShareContentPreviewType) Enum.valueOf(ShareContentPreviewType.class, r1);
    }

    public static ShareContentPreviewType[] values() {
        return (ShareContentPreviewType[]) f77077a.clone();
    }
}
