package com.example.networkerrordialog.utils;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/example/networkerrordialog/utils/NetworkErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "NO_CONNECTION", "GENERAL", "network-error-dialog_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum NetworkErrorType extends Enum<NetworkErrorType> {
    public static final NetworkErrorType GENERAL = null;
    public static final NetworkErrorType NO_CONNECTION = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ NetworkErrorType[] f35511a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f35512b = null;

    static {
        NO_CONNECTION = new NetworkErrorType("NO_CONNECTION", 0);
        GENERAL = new NetworkErrorType("GENERAL", 1);
        NetworkErrorType[] r02 = a();
        f35511a = r02;
        f35512b = kotlin.enums.b.a(r02);
    }

    NetworkErrorType(String r1, int r2) {
    }

    public static final /* synthetic */ NetworkErrorType[] a() {
        return new NetworkErrorType[]{NO_CONNECTION, GENERAL};
    }

    public static kotlin.enums.a getEntries() {
        return f35512b;
    }

    public static NetworkErrorType valueOf(String r1) {
        return (NetworkErrorType) Enum.valueOf(NetworkErrorType.class, r1);
    }

    public static NetworkErrorType[] values() {
        return (NetworkErrorType[]) f35511a.clone();
    }
}
