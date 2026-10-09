package com.pierfrancescosoffritti.androidyoutubeplayer.core.player;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerError", "", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerError;", "<init>", "(Ljava/lang/String;I)V", GrsBaseInfo.CountryCodeSource.UNKNOWN, "INVALID_PARAMETER_IN_REQUEST", "HTML_5_PLAYER", "VIDEO_NOT_FOUND", "VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER", "REQUEST_MISSING_HTTP_REFERER", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum PlayerConstants$PlayerError extends Enum<PlayerConstants$PlayerError> {
    public static final PlayerConstants$PlayerError HTML_5_PLAYER = null;
    public static final PlayerConstants$PlayerError INVALID_PARAMETER_IN_REQUEST = null;
    public static final PlayerConstants$PlayerError REQUEST_MISSING_HTTP_REFERER = null;
    public static final PlayerConstants$PlayerError UNKNOWN = null;
    public static final PlayerConstants$PlayerError VIDEO_NOT_FOUND = null;
    public static final PlayerConstants$PlayerError VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PlayerConstants$PlayerError[] f43643a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f43644b = null;

    static {
        UNKNOWN = new PlayerConstants$PlayerError(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        INVALID_PARAMETER_IN_REQUEST = new PlayerConstants$PlayerError("INVALID_PARAMETER_IN_REQUEST", 1);
        HTML_5_PLAYER = new PlayerConstants$PlayerError("HTML_5_PLAYER", 2);
        VIDEO_NOT_FOUND = new PlayerConstants$PlayerError("VIDEO_NOT_FOUND", 3);
        VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER = new PlayerConstants$PlayerError("VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER", 4);
        REQUEST_MISSING_HTTP_REFERER = new PlayerConstants$PlayerError("REQUEST_MISSING_HTTP_REFERER", 5);
        PlayerConstants$PlayerError[] r02 = a();
        f43643a = r02;
        f43644b = kotlin.enums.b.a(r02);
    }

    PlayerConstants$PlayerError(String r1, int r2) {
    }

    public static final /* synthetic */ PlayerConstants$PlayerError[] a() {
        return new PlayerConstants$PlayerError[]{UNKNOWN, INVALID_PARAMETER_IN_REQUEST, HTML_5_PLAYER, VIDEO_NOT_FOUND, VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER, REQUEST_MISSING_HTTP_REFERER};
    }

    public static kotlin.enums.a getEntries() {
        return f43644b;
    }

    public static PlayerConstants$PlayerError valueOf(String r1) {
        return (PlayerConstants$PlayerError) Enum.valueOf(PlayerConstants$PlayerError.class, r1);
    }

    public static PlayerConstants$PlayerError[] values() {
        return (PlayerConstants$PlayerError[]) f43643a.clone();
    }
}
