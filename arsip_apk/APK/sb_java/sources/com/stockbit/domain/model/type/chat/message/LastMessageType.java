package com.stockbit.domain.model.type.chat.message;

import kotlin.Metadata;
import kotlin.e;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/model/type/chat/message/LastMessageType;", "", "<init>", "(Ljava/lang/String;I)V", "ATTACHMENT_TYPE_UNSPECIFIED", "ATTACHMENT_TYPE_PHOTO", "ATTACHMENT_TYPE_GIF", "ATTACHMENT_TYPE_STICKER", "ATTACHMENT_TYPE_POST", "ATTACHMENT_TYPE_PDF", "ATTACHMENT_TYPE_SHARETRADE", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@e
/* loaded from: classes8.dex */
public enum LastMessageType extends Enum<LastMessageType> {
    public static final LastMessageType ATTACHMENT_TYPE_GIF = null;
    public static final LastMessageType ATTACHMENT_TYPE_PDF = null;
    public static final LastMessageType ATTACHMENT_TYPE_PHOTO = null;
    public static final LastMessageType ATTACHMENT_TYPE_POST = null;
    public static final LastMessageType ATTACHMENT_TYPE_SHARETRADE = null;
    public static final LastMessageType ATTACHMENT_TYPE_STICKER = null;
    public static final LastMessageType ATTACHMENT_TYPE_UNSPECIFIED = null;
    public static final a Companion = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LastMessageType[] f86309a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86310b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        ATTACHMENT_TYPE_UNSPECIFIED = new LastMessageType("ATTACHMENT_TYPE_UNSPECIFIED", 0);
        ATTACHMENT_TYPE_PHOTO = new LastMessageType("ATTACHMENT_TYPE_PHOTO", 1);
        ATTACHMENT_TYPE_GIF = new LastMessageType("ATTACHMENT_TYPE_GIF", 2);
        ATTACHMENT_TYPE_STICKER = new LastMessageType("ATTACHMENT_TYPE_STICKER", 3);
        ATTACHMENT_TYPE_POST = new LastMessageType("ATTACHMENT_TYPE_POST", 4);
        ATTACHMENT_TYPE_PDF = new LastMessageType("ATTACHMENT_TYPE_PDF", 5);
        ATTACHMENT_TYPE_SHARETRADE = new LastMessageType("ATTACHMENT_TYPE_SHARETRADE", 6);
        LastMessageType[] r02 = a();
        f86309a = r02;
        f86310b = b.a(r02);
        Companion = new a(null);
    }

    LastMessageType(String r1, int r2) {
    }

    public static final /* synthetic */ LastMessageType[] a() {
        return new LastMessageType[]{ATTACHMENT_TYPE_UNSPECIFIED, ATTACHMENT_TYPE_PHOTO, ATTACHMENT_TYPE_GIF, ATTACHMENT_TYPE_STICKER, ATTACHMENT_TYPE_POST, ATTACHMENT_TYPE_PDF, ATTACHMENT_TYPE_SHARETRADE};
    }

    public static kotlin.enums.a getEntries() {
        return f86310b;
    }

    public static LastMessageType valueOf(String r1) {
        return (LastMessageType) Enum.valueOf(LastMessageType.class, r1);
    }

    public static LastMessageType[] values() {
        return (LastMessageType[]) f86309a.clone();
    }
}
