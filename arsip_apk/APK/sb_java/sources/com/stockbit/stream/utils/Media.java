package com.stockbit.stream.utils;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/stream/utils/Media;", "", "<init>", "(Ljava/lang/String;I)V", "IG_STORY", "WHATSAPP", "TELEGRAM", "TWITTER", "MESSAGES", "OTHER", "stream_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum Media extends Enum<Media> {
    public static final Media IG_STORY = null;
    public static final Media MESSAGES = null;
    public static final Media OTHER = null;
    public static final Media TELEGRAM = null;
    public static final Media TWITTER = null;
    public static final Media WHATSAPP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Media[] f145300a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f145301b = null;

    static {
        IG_STORY = new Media("IG_STORY", 0);
        WHATSAPP = new Media("WHATSAPP", 1);
        TELEGRAM = new Media("TELEGRAM", 2);
        TWITTER = new Media("TWITTER", 3);
        MESSAGES = new Media("MESSAGES", 4);
        OTHER = new Media("OTHER", 5);
        Media[] r02 = a();
        f145300a = r02;
        f145301b = kotlin.enums.b.a(r02);
    }

    Media(String r1, int r2) {
    }

    public static final /* synthetic */ Media[] a() {
        return new Media[]{IG_STORY, WHATSAPP, TELEGRAM, TWITTER, MESSAGES, OTHER};
    }

    public static kotlin.enums.a getEntries() {
        return f145301b;
    }

    public static Media valueOf(String r1) {
        return (Media) Enum.valueOf(Media.class, r1);
    }

    public static Media[] values() {
        return (Media[]) f145300a.clone();
    }
}
