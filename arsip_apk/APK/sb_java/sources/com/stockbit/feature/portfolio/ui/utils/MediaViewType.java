package com.stockbit.feature.portfolio.ui.utils;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/feature/portfolio/ui/utils/MediaViewType;", "", "<init>", "(Ljava/lang/String;I)V", "INSTAGRAM_STORY", "INSTAGRAM_POST", "WHATSAPP", "TELEGRAM", "TWITTER", "MESSAGES", "OTHER", "portfolio_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum MediaViewType extends Enum<MediaViewType> {
    public static final MediaViewType INSTAGRAM_POST = null;
    public static final MediaViewType INSTAGRAM_STORY = null;
    public static final MediaViewType MESSAGES = null;
    public static final MediaViewType OTHER = null;
    public static final MediaViewType TELEGRAM = null;
    public static final MediaViewType TWITTER = null;
    public static final MediaViewType WHATSAPP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MediaViewType[] f106572a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f106573b = null;

    static {
        INSTAGRAM_STORY = new MediaViewType("INSTAGRAM_STORY", 0);
        INSTAGRAM_POST = new MediaViewType("INSTAGRAM_POST", 1);
        WHATSAPP = new MediaViewType("WHATSAPP", 2);
        TELEGRAM = new MediaViewType("TELEGRAM", 3);
        TWITTER = new MediaViewType("TWITTER", 4);
        MESSAGES = new MediaViewType("MESSAGES", 5);
        OTHER = new MediaViewType("OTHER", 6);
        MediaViewType[] r02 = a();
        f106572a = r02;
        f106573b = b.a(r02);
    }

    MediaViewType(String r1, int r2) {
    }

    public static final /* synthetic */ MediaViewType[] a() {
        return new MediaViewType[]{INSTAGRAM_STORY, INSTAGRAM_POST, WHATSAPP, TELEGRAM, TWITTER, MESSAGES, OTHER};
    }

    public static a getEntries() {
        return f106573b;
    }

    public static MediaViewType valueOf(String r1) {
        return (MediaViewType) Enum.valueOf(MediaViewType.class, r1);
    }

    public static MediaViewType[] values() {
        return (MediaViewType[]) f106572a.clone();
    }
}
