package com.clevertap.android.sdk.inbox;

/* loaded from: classes4.dex */
public enum CTInboxMessageType extends Enum<CTInboxMessageType> {
    public static final CTInboxMessageType CarouselImageMessage = null;
    public static final CTInboxMessageType CarouselMessage = null;
    public static final CTInboxMessageType IconMessage = null;
    public static final CTInboxMessageType SimpleMessage = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CTInboxMessageType[] f34439a = null;
    private final String inboxMessageType;

    static {
        SimpleMessage = new CTInboxMessageType("SimpleMessage", 0, "simple");
        IconMessage = new CTInboxMessageType("IconMessage", 1, "message-icon");
        CarouselMessage = new CTInboxMessageType("CarouselMessage", 2, "carousel");
        CarouselImageMessage = new CTInboxMessageType("CarouselImageMessage", 3, "carousel-image");
        f34439a = a();
    }

    CTInboxMessageType(String r1, int r2, String r3) {
        this.inboxMessageType = r3;
    }

    public static /* synthetic */ CTInboxMessageType[] a() {
        return new CTInboxMessageType[]{SimpleMessage, IconMessage, CarouselMessage, CarouselImageMessage};
    }

    public static CTInboxMessageType b(String r2) {
        r2.getClass();
        char r02 = 65535;
        switch(r2.hashCode()) {
            case -1799711058: goto L18;
            case -1332589953: goto L14;
            case -902286926: goto L10;
            case 2908512: goto L6;
            default: goto L21;
        };
    L21:
        switch(r02) {
            case 0: goto L31;
            case 1: goto L29;
            case 2: goto L27;
            case 3: goto L25;
            default: goto L22;
        };
    L22:
        return null;
    L25:
        return CarouselMessage;
    L27:
        return SimpleMessage;
    L29:
        return IconMessage;
    L31:
        return CarouselImageMessage;
    L6:
        if (r2.equals("carousel") == false) goto L21;
        r02 = 3;
        goto L21
    L10:
        if (r2.equals("simple") == false) goto L21;
        r02 = 2;
        goto L21
    L14:
        if (r2.equals("message-icon") == false) goto L21;
        r02 = 1;
        goto L21
    L18:
        if (r2.equals("carousel-image") == false) goto L21;
        r02 = 0;
        goto L21
    }

    public static CTInboxMessageType valueOf(String r1) {
        return (CTInboxMessageType) Enum.valueOf(CTInboxMessageType.class, r1);
    }

    public static CTInboxMessageType[] values() {
        return (CTInboxMessageType[]) f34439a.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.inboxMessageType;
    }
}
