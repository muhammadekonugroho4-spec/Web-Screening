package com.stockbit.component.sharecontent.navigation;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stockbit/component/sharecontent/navigation/ShareContentNavParam;", "", "<init>", "(Ljava/lang/String;I)V", "FORWARD_CHAT", "GROUP_INVITATION", "STREAM", "PORTFOLIO", "LIVESTREAM", "UNBOXING", "TRADING_COMMUNITY_ACTIVATION", "COMPANY", "SHARE_INTENT", "sharecontent_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum ShareContentNavParam extends Enum<ShareContentNavParam> {
    public static final ShareContentNavParam COMPANY = null;
    public static final ShareContentNavParam FORWARD_CHAT = null;
    public static final ShareContentNavParam GROUP_INVITATION = null;
    public static final ShareContentNavParam LIVESTREAM = null;
    public static final ShareContentNavParam PORTFOLIO = null;
    public static final ShareContentNavParam SHARE_INTENT = null;
    public static final ShareContentNavParam STREAM = null;
    public static final ShareContentNavParam TRADING_COMMUNITY_ACTIVATION = null;
    public static final ShareContentNavParam UNBOXING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ShareContentNavParam[] f77088a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f77089b = null;

    static {
        FORWARD_CHAT = new ShareContentNavParam("FORWARD_CHAT", 0);
        GROUP_INVITATION = new ShareContentNavParam("GROUP_INVITATION", 1);
        STREAM = new ShareContentNavParam("STREAM", 2);
        PORTFOLIO = new ShareContentNavParam("PORTFOLIO", 3);
        LIVESTREAM = new ShareContentNavParam("LIVESTREAM", 4);
        UNBOXING = new ShareContentNavParam("UNBOXING", 5);
        TRADING_COMMUNITY_ACTIVATION = new ShareContentNavParam("TRADING_COMMUNITY_ACTIVATION", 6);
        COMPANY = new ShareContentNavParam("COMPANY", 7);
        SHARE_INTENT = new ShareContentNavParam("SHARE_INTENT", 8);
        ShareContentNavParam[] r02 = a();
        f77088a = r02;
        f77089b = b.a(r02);
    }

    ShareContentNavParam(String r1, int r2) {
    }

    public static final /* synthetic */ ShareContentNavParam[] a() {
        return new ShareContentNavParam[]{FORWARD_CHAT, GROUP_INVITATION, STREAM, PORTFOLIO, LIVESTREAM, UNBOXING, TRADING_COMMUNITY_ACTIVATION, COMPANY, SHARE_INTENT};
    }

    public static a getEntries() {
        return f77089b;
    }

    public static ShareContentNavParam valueOf(String r1) {
        return (ShareContentNavParam) Enum.valueOf(ShareContentNavParam.class, r1);
    }

    public static ShareContentNavParam[] values() {
        return (ShareContentNavParam[]) f77088a.clone();
    }
}
