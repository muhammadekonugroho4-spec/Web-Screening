package com.stockbit.usecase.chat.model.media;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stockbit/usecase/chat/model/media/MediaType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CAMERA", "GALLERY", "GIF", "STICKER", "DOCUMENT", "NONE", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum MediaType extends Enum<MediaType> {
    public static final MediaType CAMERA = null;
    public static final MediaType DOCUMENT = null;
    public static final MediaType GALLERY = null;
    public static final MediaType GIF = null;
    public static final MediaType NONE = null;
    public static final MediaType STICKER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MediaType[] f155559a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f155560b = null;
    private final String value;

    static {
        CAMERA = new MediaType("CAMERA", 0, "Take Picture From Camera");
        GALLERY = new MediaType("GALLERY", 1, "Choose Existing Picture");
        GIF = new MediaType("GIF", 2, "GIF");
        STICKER = new MediaType("STICKER", 3, "STICKER");
        DOCUMENT = new MediaType("DOCUMENT", 4, "Document");
        NONE = new MediaType("NONE", 5, "None");
        MediaType[] r02 = a();
        f155559a = r02;
        f155560b = b.a(r02);
    }

    MediaType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ MediaType[] a() {
        return new MediaType[]{CAMERA, GALLERY, GIF, STICKER, DOCUMENT, NONE};
    }

    public static a getEntries() {
        return f155560b;
    }

    public static MediaType valueOf(String r1) {
        return (MediaType) Enum.valueOf(MediaType.class, r1);
    }

    public static MediaType[] values() {
        return (MediaType[]) f155559a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
