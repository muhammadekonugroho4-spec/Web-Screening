package com.clevertap.android.sdk.inapp.images.repo;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/clevertap/android/sdk/inapp/images/repo/DownloadState;", "", "<init>", "(Ljava/lang/String;I)V", "QUEUED", "IN_PROGRESS", "SUCCESSFUL", "FAILED", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum DownloadState extends Enum<DownloadState> {
    public static final DownloadState FAILED = null;
    public static final DownloadState IN_PROGRESS = null;
    public static final DownloadState QUEUED = null;
    public static final DownloadState SUCCESSFUL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DownloadState[] f34338a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f34339b = null;

    static {
        QUEUED = new DownloadState("QUEUED", 0);
        IN_PROGRESS = new DownloadState("IN_PROGRESS", 1);
        SUCCESSFUL = new DownloadState("SUCCESSFUL", 2);
        FAILED = new DownloadState("FAILED", 3);
        DownloadState[] r02 = a();
        f34338a = r02;
        f34339b = kotlin.enums.b.a(r02);
    }

    DownloadState(String r1, int r2) {
    }

    public static final /* synthetic */ DownloadState[] a() {
        return new DownloadState[]{QUEUED, IN_PROGRESS, SUCCESSFUL, FAILED};
    }

    public static kotlin.enums.a getEntries() {
        return f34339b;
    }

    public static DownloadState valueOf(String r1) {
        return (DownloadState) Enum.valueOf(DownloadState.class, r1);
    }

    public static DownloadState[] values() {
        return (DownloadState[]) f34338a.clone();
    }
}
