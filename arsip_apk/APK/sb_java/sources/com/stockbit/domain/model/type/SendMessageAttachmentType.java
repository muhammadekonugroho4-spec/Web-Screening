package com.stockbit.domain.model.type;

import kotlin.Metadata;
import kotlin.e;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stockbit/domain/model/type/SendMessageAttachmentType;", "", "<init>", "(Ljava/lang/String;I)V", "UPLOAD_TYPE_UNSPECIFIED", "UPLOAD_TYPE_PICTURE", "UPLOAD_TYPE_DOCUMENT", "UPLOAD_TYPE_STICKER", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@e
/* loaded from: classes8.dex */
public enum SendMessageAttachmentType extends Enum<SendMessageAttachmentType> {
    public static final a Companion = null;
    public static final SendMessageAttachmentType UPLOAD_TYPE_DOCUMENT = null;
    public static final SendMessageAttachmentType UPLOAD_TYPE_PICTURE = null;
    public static final SendMessageAttachmentType UPLOAD_TYPE_STICKER = null;
    public static final SendMessageAttachmentType UPLOAD_TYPE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SendMessageAttachmentType[] f86240a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86241b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        UPLOAD_TYPE_UNSPECIFIED = new SendMessageAttachmentType("UPLOAD_TYPE_UNSPECIFIED", 0);
        UPLOAD_TYPE_PICTURE = new SendMessageAttachmentType("UPLOAD_TYPE_PICTURE", 1);
        UPLOAD_TYPE_DOCUMENT = new SendMessageAttachmentType("UPLOAD_TYPE_DOCUMENT", 2);
        UPLOAD_TYPE_STICKER = new SendMessageAttachmentType("UPLOAD_TYPE_STICKER", 3);
        SendMessageAttachmentType[] r02 = a();
        f86240a = r02;
        f86241b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    SendMessageAttachmentType(String r1, int r2) {
    }

    public static final /* synthetic */ SendMessageAttachmentType[] a() {
        return new SendMessageAttachmentType[]{UPLOAD_TYPE_UNSPECIFIED, UPLOAD_TYPE_PICTURE, UPLOAD_TYPE_DOCUMENT, UPLOAD_TYPE_STICKER};
    }

    public static kotlin.enums.a getEntries() {
        return f86241b;
    }

    public static SendMessageAttachmentType valueOf(String r1) {
        return (SendMessageAttachmentType) Enum.valueOf(SendMessageAttachmentType.class, r1);
    }

    public static SendMessageAttachmentType[] values() {
        return (SendMessageAttachmentType[]) f86240a.clone();
    }
}
