package com.stockbit.feature.portfolio.presentation.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/feature/portfolio/presentation/model/UnauthorizedRedirectionType;", "", "<init>", "(Ljava/lang/String;I)V", "LIST", "BUY", "SELL", "EXERCISE", "portfolio_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum UnauthorizedRedirectionType extends Enum<UnauthorizedRedirectionType> {
    public static final UnauthorizedRedirectionType BUY = null;
    public static final UnauthorizedRedirectionType EXERCISE = null;
    public static final UnauthorizedRedirectionType LIST = null;
    public static final UnauthorizedRedirectionType SELL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ UnauthorizedRedirectionType[] f105741a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f105742b = null;

    static {
        LIST = new UnauthorizedRedirectionType("LIST", 0);
        BUY = new UnauthorizedRedirectionType("BUY", 1);
        SELL = new UnauthorizedRedirectionType("SELL", 2);
        EXERCISE = new UnauthorizedRedirectionType("EXERCISE", 3);
        UnauthorizedRedirectionType[] r02 = a();
        f105741a = r02;
        f105742b = b.a(r02);
    }

    UnauthorizedRedirectionType(String r1, int r2) {
    }

    public static final /* synthetic */ UnauthorizedRedirectionType[] a() {
        return new UnauthorizedRedirectionType[]{LIST, BUY, SELL, EXERCISE};
    }

    public static a getEntries() {
        return f105742b;
    }

    public static UnauthorizedRedirectionType valueOf(String r1) {
        return (UnauthorizedRedirectionType) Enum.valueOf(UnauthorizedRedirectionType.class, r1);
    }

    public static UnauthorizedRedirectionType[] values() {
        return (UnauthorizedRedirectionType[]) f105741a.clone();
    }
}
