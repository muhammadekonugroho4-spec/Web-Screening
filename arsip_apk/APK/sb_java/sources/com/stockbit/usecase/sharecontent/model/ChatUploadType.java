package com.stockbit.usecase.sharecontent.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/usecase/sharecontent/model/ChatUploadType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CHAT_IMAGE", "CHAT_DOCUMENT", "GROUP_AVATAR", "usecase-sharecontent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum ChatUploadType extends Enum<ChatUploadType> {
    public static final ChatUploadType CHAT_DOCUMENT = null;
    public static final ChatUploadType CHAT_IMAGE = null;
    public static final ChatUploadType GROUP_AVATAR = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ChatUploadType[] f162816a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f162817b = null;
    private final String value;

    static {
        CHAT_IMAGE = new ChatUploadType("CHAT_IMAGE", 0, "UPLOAD_TYPE_UNSPECIFIED");
        CHAT_DOCUMENT = new ChatUploadType("CHAT_DOCUMENT", 1, "UPLOAD_TYPE_ATTACHMENT");
        GROUP_AVATAR = new ChatUploadType("GROUP_AVATAR", 2, "UPLOAD_TYPE_GROUP_AVATAR");
        ChatUploadType[] r02 = a();
        f162816a = r02;
        f162817b = kotlin.enums.b.a(r02);
    }

    ChatUploadType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ ChatUploadType[] a() {
        return new ChatUploadType[]{CHAT_IMAGE, CHAT_DOCUMENT, GROUP_AVATAR};
    }

    public static kotlin.enums.a getEntries() {
        return f162817b;
    }

    public static ChatUploadType valueOf(String r1) {
        return (ChatUploadType) Enum.valueOf(ChatUploadType.class, r1);
    }

    public static ChatUploadType[] values() {
        return (ChatUploadType[]) f162816a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
