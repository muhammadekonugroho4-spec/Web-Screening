package com.pierfrancescosoffritti.androidyoutubeplayer.core.player;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackRate", "", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackRate;", "<init>", "(Ljava/lang/String;I)V", GrsBaseInfo.CountryCodeSource.UNKNOWN, "RATE_0_25", "RATE_0_5", "RATE_0_75", "RATE_1", "RATE_1_25", "RATE_1_5", "RATE_1_75", "RATE_2", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum PlayerConstants$PlaybackRate extends Enum<PlayerConstants$PlaybackRate> {
    public static final PlayerConstants$PlaybackRate RATE_0_25 = null;
    public static final PlayerConstants$PlaybackRate RATE_0_5 = null;
    public static final PlayerConstants$PlaybackRate RATE_0_75 = null;
    public static final PlayerConstants$PlaybackRate RATE_1 = null;
    public static final PlayerConstants$PlaybackRate RATE_1_25 = null;
    public static final PlayerConstants$PlaybackRate RATE_1_5 = null;
    public static final PlayerConstants$PlaybackRate RATE_1_75 = null;
    public static final PlayerConstants$PlaybackRate RATE_2 = null;
    public static final PlayerConstants$PlaybackRate UNKNOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PlayerConstants$PlaybackRate[] f43641a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f43642b = null;

    static {
        UNKNOWN = new PlayerConstants$PlaybackRate(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        RATE_0_25 = new PlayerConstants$PlaybackRate("RATE_0_25", 1);
        RATE_0_5 = new PlayerConstants$PlaybackRate("RATE_0_5", 2);
        RATE_0_75 = new PlayerConstants$PlaybackRate("RATE_0_75", 3);
        RATE_1 = new PlayerConstants$PlaybackRate("RATE_1", 4);
        RATE_1_25 = new PlayerConstants$PlaybackRate("RATE_1_25", 5);
        RATE_1_5 = new PlayerConstants$PlaybackRate("RATE_1_5", 6);
        RATE_1_75 = new PlayerConstants$PlaybackRate("RATE_1_75", 7);
        RATE_2 = new PlayerConstants$PlaybackRate("RATE_2", 8);
        PlayerConstants$PlaybackRate[] r02 = a();
        f43641a = r02;
        f43642b = kotlin.enums.b.a(r02);
    }

    PlayerConstants$PlaybackRate(String r1, int r2) {
    }

    public static final /* synthetic */ PlayerConstants$PlaybackRate[] a() {
        return new PlayerConstants$PlaybackRate[]{UNKNOWN, RATE_0_25, RATE_0_5, RATE_0_75, RATE_1, RATE_1_25, RATE_1_5, RATE_1_75, RATE_2};
    }

    public static kotlin.enums.a getEntries() {
        return f43642b;
    }

    public static PlayerConstants$PlaybackRate valueOf(String r1) {
        return (PlayerConstants$PlaybackRate) Enum.valueOf(PlayerConstants$PlaybackRate.class, r1);
    }

    public static PlayerConstants$PlaybackRate[] values() {
        return (PlayerConstants$PlaybackRate[]) f43641a.clone();
    }
}
