package com.stockbit.usecase.chat.model.media;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/usecase/chat/model/media/DestinationType;", "", "<init>", "(Ljava/lang/String;I)V", "GROUP_CHAT", "PERSONAL_CHAT", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum DestinationType extends Enum<DestinationType> {
    public static final DestinationType GROUP_CHAT = null;
    public static final DestinationType PERSONAL_CHAT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DestinationType[] f155557a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f155558b = null;

    static {
        GROUP_CHAT = new DestinationType("GROUP_CHAT", 0);
        PERSONAL_CHAT = new DestinationType("PERSONAL_CHAT", 1);
        DestinationType[] r02 = a();
        f155557a = r02;
        f155558b = b.a(r02);
    }

    DestinationType(String r1, int r2) {
    }

    public static final /* synthetic */ DestinationType[] a() {
        return new DestinationType[]{GROUP_CHAT, PERSONAL_CHAT};
    }

    public static a getEntries() {
        return f155558b;
    }

    public static DestinationType valueOf(String r1) {
        return (DestinationType) Enum.valueOf(DestinationType.class, r1);
    }

    public static DestinationType[] values() {
        return (DestinationType[]) f155557a.clone();
    }
}
