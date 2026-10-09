package com.clevertap.android.sdk.video;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/clevertap/android/sdk/video/VideoLibraryIntegrated;", "", "<init>", "(Ljava/lang/String;I)V", "EXOPLAYER", "MEDIA3", "NONE", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum VideoLibraryIntegrated extends Enum<VideoLibraryIntegrated> {
    public static final VideoLibraryIntegrated EXOPLAYER = null;
    public static final VideoLibraryIntegrated MEDIA3 = null;
    public static final VideoLibraryIntegrated NONE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ VideoLibraryIntegrated[] f34993a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f34994b = null;

    static {
        EXOPLAYER = new VideoLibraryIntegrated("EXOPLAYER", 0);
        MEDIA3 = new VideoLibraryIntegrated("MEDIA3", 1);
        NONE = new VideoLibraryIntegrated("NONE", 2);
        VideoLibraryIntegrated[] r02 = a();
        f34993a = r02;
        f34994b = kotlin.enums.b.a(r02);
    }

    VideoLibraryIntegrated(String r1, int r2) {
    }

    public static final /* synthetic */ VideoLibraryIntegrated[] a() {
        return new VideoLibraryIntegrated[]{EXOPLAYER, MEDIA3, NONE};
    }

    public static kotlin.enums.a getEntries() {
        return f34994b;
    }

    public static VideoLibraryIntegrated valueOf(String r1) {
        return (VideoLibraryIntegrated) Enum.valueOf(VideoLibraryIntegrated.class, r1);
    }

    public static VideoLibraryIntegrated[] values() {
        return (VideoLibraryIntegrated[]) f34993a.clone();
    }
}
