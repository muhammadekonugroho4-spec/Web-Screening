package com.stockbit.usecase.chat.model.type;

import com.google.firebase.perf.FirebasePerformance;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/usecase/chat/model/type/PostType;", "", "<init>", "(Ljava/lang/String;I)V", "PHOTO", "STICKER", "GIF", FirebasePerformance.HttpMethod.POST, "PDF", "SHARE_TRADE", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum PostType extends Enum<PostType> {
    public static final PostType GIF = null;
    public static final PostType PDF = null;
    public static final PostType PHOTO = null;
    public static final PostType POST = null;
    public static final PostType SHARE_TRADE = null;
    public static final PostType STICKER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PostType[] f155711a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f155712b = null;

    static {
        PHOTO = new PostType("PHOTO", 0);
        STICKER = new PostType("STICKER", 1);
        GIF = new PostType("GIF", 2);
        POST = new PostType(FirebasePerformance.HttpMethod.POST, 3);
        PDF = new PostType("PDF", 4);
        SHARE_TRADE = new PostType("SHARE_TRADE", 5);
        PostType[] r02 = a();
        f155711a = r02;
        f155712b = b.a(r02);
    }

    PostType(String r1, int r2) {
    }

    public static final /* synthetic */ PostType[] a() {
        return new PostType[]{PHOTO, STICKER, GIF, POST, PDF, SHARE_TRADE};
    }

    public static a getEntries() {
        return f155712b;
    }

    public static PostType valueOf(String r1) {
        return (PostType) Enum.valueOf(PostType.class, r1);
    }

    public static PostType[] values() {
        return (PostType[]) f155711a.clone();
    }
}
