package com.stockbit.usecase.chat.model.chat;

import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/usecase/chat/model/chat/RoomLastMessageType;", "", "<init>", "(Ljava/lang/String;I)V", "ATTACHMENT_TYPE_UNSPECIFIED", "ATTACHMENT_TYPE_PHOTO", "ATTACHMENT_TYPE_GIF", "ATTACHMENT_TYPE_STICKER", "ATTACHMENT_TYPE_POST", "ATTACHMENT_TYPE_PDF", "ATTACHMENT_TYPE_SHARETRADE", "Companion", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum RoomLastMessageType extends Enum<RoomLastMessageType> {
    public static final RoomLastMessageType ATTACHMENT_TYPE_GIF = null;
    public static final RoomLastMessageType ATTACHMENT_TYPE_PDF = null;
    public static final RoomLastMessageType ATTACHMENT_TYPE_PHOTO = null;
    public static final RoomLastMessageType ATTACHMENT_TYPE_POST = null;
    public static final RoomLastMessageType ATTACHMENT_TYPE_SHARETRADE = null;
    public static final RoomLastMessageType ATTACHMENT_TYPE_STICKER = null;
    public static final RoomLastMessageType ATTACHMENT_TYPE_UNSPECIFIED = null;
    public static final a Companion = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RoomLastMessageType[] f155170a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f155171b = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final RoomLastMessageType a(String r6) {
            RoomLastMessageType[] r02 = RoomLastMessageType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            RoomLastMessageType r3 = r02[r2];
            if (p.g(r3.name(), r6) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return RoomLastMessageType.ATTACHMENT_TYPE_UNSPECIFIED;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        ATTACHMENT_TYPE_UNSPECIFIED = new RoomLastMessageType("ATTACHMENT_TYPE_UNSPECIFIED", 0);
        ATTACHMENT_TYPE_PHOTO = new RoomLastMessageType("ATTACHMENT_TYPE_PHOTO", 1);
        ATTACHMENT_TYPE_GIF = new RoomLastMessageType("ATTACHMENT_TYPE_GIF", 2);
        ATTACHMENT_TYPE_STICKER = new RoomLastMessageType("ATTACHMENT_TYPE_STICKER", 3);
        ATTACHMENT_TYPE_POST = new RoomLastMessageType("ATTACHMENT_TYPE_POST", 4);
        ATTACHMENT_TYPE_PDF = new RoomLastMessageType("ATTACHMENT_TYPE_PDF", 5);
        ATTACHMENT_TYPE_SHARETRADE = new RoomLastMessageType("ATTACHMENT_TYPE_SHARETRADE", 6);
        RoomLastMessageType[] r02 = a();
        f155170a = r02;
        f155171b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    RoomLastMessageType(String r1, int r2) {
    }

    public static final /* synthetic */ RoomLastMessageType[] a() {
        return new RoomLastMessageType[]{ATTACHMENT_TYPE_UNSPECIFIED, ATTACHMENT_TYPE_PHOTO, ATTACHMENT_TYPE_GIF, ATTACHMENT_TYPE_STICKER, ATTACHMENT_TYPE_POST, ATTACHMENT_TYPE_PDF, ATTACHMENT_TYPE_SHARETRADE};
    }

    public static kotlin.enums.a getEntries() {
        return f155171b;
    }

    public static RoomLastMessageType valueOf(String r1) {
        return (RoomLastMessageType) Enum.valueOf(RoomLastMessageType.class, r1);
    }

    public static RoomLastMessageType[] values() {
        return (RoomLastMessageType[]) f155170a.clone();
    }
}
