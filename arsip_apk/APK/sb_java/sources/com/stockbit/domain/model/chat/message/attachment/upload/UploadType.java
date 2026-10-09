package com.stockbit.domain.model.chat.message.attachment.upload;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stockbit/domain/model/chat/message/attachment/upload/UploadType;", "", "<init>", "(Ljava/lang/String;I)V", "UPLOAD_TYPE_UNSPECIFIED", "UPLOAD_TYPE_PICTURE", "UPLOAD_TYPE_DOCUMENT", "UPLOAD_TYPE_STICKER", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum UploadType extends Enum<UploadType> {
    public static final a Companion = null;
    public static final UploadType UPLOAD_TYPE_DOCUMENT = null;
    public static final UploadType UPLOAD_TYPE_PICTURE = null;
    public static final UploadType UPLOAD_TYPE_STICKER = null;
    public static final UploadType UPLOAD_TYPE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ UploadType[] f81277a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f81278b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final UploadType a(String r4) {
            Iterator<E> r02 = UploadType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (p.g(((UploadType) r1).name(), r4) == false) goto L4;
        L9:
            UploadType r12 = (UploadType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return UploadType.UPLOAD_TYPE_UNSPECIFIED;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        UPLOAD_TYPE_UNSPECIFIED = new UploadType("UPLOAD_TYPE_UNSPECIFIED", 0);
        UPLOAD_TYPE_PICTURE = new UploadType("UPLOAD_TYPE_PICTURE", 1);
        UPLOAD_TYPE_DOCUMENT = new UploadType("UPLOAD_TYPE_DOCUMENT", 2);
        UPLOAD_TYPE_STICKER = new UploadType("UPLOAD_TYPE_STICKER", 3);
        UploadType[] r02 = a();
        f81277a = r02;
        f81278b = b.a(r02);
        Companion = new a(null);
    }

    UploadType(String r1, int r2) {
    }

    public static final /* synthetic */ UploadType[] a() {
        return new UploadType[]{UPLOAD_TYPE_UNSPECIFIED, UPLOAD_TYPE_PICTURE, UPLOAD_TYPE_DOCUMENT, UPLOAD_TYPE_STICKER};
    }

    public static kotlin.enums.a getEntries() {
        return f81278b;
    }

    public static UploadType valueOf(String r1) {
        return (UploadType) Enum.valueOf(UploadType.class, r1);
    }

    public static UploadType[] values() {
        return (UploadType[]) f81277a.clone();
    }
}
