package com.stockbit.domain.model.type;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/stockbit/domain/model/type/MediaShareType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FRIENDS", "IG_STORY", "WHATSAPP", "TELEGRAM", "TWITTER", "MESSAGE", "COPY_LINK", "SHARE_VIA", "REPOST", "OTHER", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum MediaShareType extends Enum<MediaShareType> {
    public static final MediaShareType COPY_LINK = null;
    public static final a Companion = null;
    public static final MediaShareType FRIENDS = null;
    public static final MediaShareType IG_STORY = null;
    public static final MediaShareType MESSAGE = null;
    public static final MediaShareType OTHER = null;
    public static final MediaShareType REPOST = null;
    public static final MediaShareType SHARE_VIA = null;
    public static final MediaShareType TELEGRAM = null;
    public static final MediaShareType TWITTER = null;
    public static final MediaShareType WHATSAPP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MediaShareType[] f86213a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86214b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        FRIENDS = new MediaShareType("FRIENDS", 0, "Friends");
        IG_STORY = new MediaShareType("IG_STORY", 1, "IG Story");
        WHATSAPP = new MediaShareType("WHATSAPP", 2, "WhatsApp");
        TELEGRAM = new MediaShareType("TELEGRAM", 3, "Telegram");
        TWITTER = new MediaShareType("TWITTER", 4, "Twitter");
        MESSAGE = new MediaShareType("MESSAGE", 5, "Messages");
        COPY_LINK = new MediaShareType("COPY_LINK", 6, "Copy Link");
        SHARE_VIA = new MediaShareType("SHARE_VIA", 7, "Share Via");
        REPOST = new MediaShareType("REPOST", 8, "Repost");
        OTHER = new MediaShareType("OTHER", 9, "");
        MediaShareType[] r02 = a();
        f86213a = r02;
        f86214b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    MediaShareType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ MediaShareType[] a() {
        return new MediaShareType[]{FRIENDS, IG_STORY, WHATSAPP, TELEGRAM, TWITTER, MESSAGE, COPY_LINK, SHARE_VIA, REPOST, OTHER};
    }

    public static kotlin.enums.a getEntries() {
        return f86214b;
    }

    public static MediaShareType valueOf(String r1) {
        return (MediaShareType) Enum.valueOf(MediaShareType.class, r1);
    }

    public static MediaShareType[] values() {
        return (MediaShareType[]) f86213a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
