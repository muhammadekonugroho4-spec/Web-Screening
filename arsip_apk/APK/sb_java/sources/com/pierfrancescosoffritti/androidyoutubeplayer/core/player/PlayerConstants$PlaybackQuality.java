package com.pierfrancescosoffritti.androidyoutubeplayer.core.player;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackQuality", "", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackQuality;", "<init>", "(Ljava/lang/String;I)V", GrsBaseInfo.CountryCodeSource.UNKNOWN, "SMALL", "MEDIUM", "LARGE", "HD720", "HD1080", "HIGH_RES", "DEFAULT", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum PlayerConstants$PlaybackQuality extends Enum<PlayerConstants$PlaybackQuality> {
    public static final PlayerConstants$PlaybackQuality DEFAULT = null;
    public static final PlayerConstants$PlaybackQuality HD1080 = null;
    public static final PlayerConstants$PlaybackQuality HD720 = null;
    public static final PlayerConstants$PlaybackQuality HIGH_RES = null;
    public static final PlayerConstants$PlaybackQuality LARGE = null;
    public static final PlayerConstants$PlaybackQuality MEDIUM = null;
    public static final PlayerConstants$PlaybackQuality SMALL = null;
    public static final PlayerConstants$PlaybackQuality UNKNOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PlayerConstants$PlaybackQuality[] f43639a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f43640b = null;

    static {
        UNKNOWN = new PlayerConstants$PlaybackQuality(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        SMALL = new PlayerConstants$PlaybackQuality("SMALL", 1);
        MEDIUM = new PlayerConstants$PlaybackQuality("MEDIUM", 2);
        LARGE = new PlayerConstants$PlaybackQuality("LARGE", 3);
        HD720 = new PlayerConstants$PlaybackQuality("HD720", 4);
        HD1080 = new PlayerConstants$PlaybackQuality("HD1080", 5);
        HIGH_RES = new PlayerConstants$PlaybackQuality("HIGH_RES", 6);
        DEFAULT = new PlayerConstants$PlaybackQuality("DEFAULT", 7);
        PlayerConstants$PlaybackQuality[] r02 = a();
        f43639a = r02;
        f43640b = kotlin.enums.b.a(r02);
    }

    PlayerConstants$PlaybackQuality(String r1, int r2) {
    }

    public static final /* synthetic */ PlayerConstants$PlaybackQuality[] a() {
        return new PlayerConstants$PlaybackQuality[]{UNKNOWN, SMALL, MEDIUM, LARGE, HD720, HD1080, HIGH_RES, DEFAULT};
    }

    public static kotlin.enums.a getEntries() {
        return f43640b;
    }

    public static PlayerConstants$PlaybackQuality valueOf(String r1) {
        return (PlayerConstants$PlaybackQuality) Enum.valueOf(PlayerConstants$PlaybackQuality.class, r1);
    }

    public static PlayerConstants$PlaybackQuality[] values() {
        return (PlayerConstants$PlaybackQuality[]) f43639a.clone();
    }
}
