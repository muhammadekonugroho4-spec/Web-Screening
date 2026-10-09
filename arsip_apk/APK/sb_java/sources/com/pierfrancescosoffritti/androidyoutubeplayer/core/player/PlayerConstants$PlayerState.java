package com.pierfrancescosoffritti.androidyoutubeplayer.core.player;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerState", "", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerState;", "<init>", "(Ljava/lang/String;I)V", GrsBaseInfo.CountryCodeSource.UNKNOWN, "UNSTARTED", "ENDED", "PLAYING", "PAUSED", "BUFFERING", "VIDEO_CUED", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum PlayerConstants$PlayerState extends Enum<PlayerConstants$PlayerState> {
    public static final PlayerConstants$PlayerState BUFFERING = null;
    public static final PlayerConstants$PlayerState ENDED = null;
    public static final PlayerConstants$PlayerState PAUSED = null;
    public static final PlayerConstants$PlayerState PLAYING = null;
    public static final PlayerConstants$PlayerState UNKNOWN = null;
    public static final PlayerConstants$PlayerState UNSTARTED = null;
    public static final PlayerConstants$PlayerState VIDEO_CUED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PlayerConstants$PlayerState[] f43645a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f43646b = null;

    static {
        UNKNOWN = new PlayerConstants$PlayerState(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        UNSTARTED = new PlayerConstants$PlayerState("UNSTARTED", 1);
        ENDED = new PlayerConstants$PlayerState("ENDED", 2);
        PLAYING = new PlayerConstants$PlayerState("PLAYING", 3);
        PAUSED = new PlayerConstants$PlayerState("PAUSED", 4);
        BUFFERING = new PlayerConstants$PlayerState("BUFFERING", 5);
        VIDEO_CUED = new PlayerConstants$PlayerState("VIDEO_CUED", 6);
        PlayerConstants$PlayerState[] r02 = a();
        f43645a = r02;
        f43646b = kotlin.enums.b.a(r02);
    }

    PlayerConstants$PlayerState(String r1, int r2) {
    }

    public static final /* synthetic */ PlayerConstants$PlayerState[] a() {
        return new PlayerConstants$PlayerState[]{UNKNOWN, UNSTARTED, ENDED, PLAYING, PAUSED, BUFFERING, VIDEO_CUED};
    }

    public static kotlin.enums.a getEntries() {
        return f43646b;
    }

    public static PlayerConstants$PlayerState valueOf(String r1) {
        return (PlayerConstants$PlayerState) Enum.valueOf(PlayerConstants$PlayerState.class, r1);
    }

    public static PlayerConstants$PlayerState[] values() {
        return (PlayerConstants$PlayerState[]) f43645a.clone();
    }
}
