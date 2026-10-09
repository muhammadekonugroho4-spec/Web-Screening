package com.stockbit.domain.model.type.stream;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stockbit/domain/model/type/stream/StreamPostType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "IDEAS", "PREDICTION", "POLLING", "NEWS", "REPOST", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum StreamPostType extends Enum<StreamPostType> {
    public static final StreamPostType IDEAS = null;
    public static final StreamPostType NEWS = null;
    public static final StreamPostType POLLING = null;
    public static final StreamPostType PREDICTION = null;
    public static final StreamPostType REPOST = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StreamPostType[] f86487a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86488b = null;
    private final String value;

    static {
        IDEAS = new StreamPostType("IDEAS", 0, "Ideas");
        PREDICTION = new StreamPostType("PREDICTION", 1, "Prediction");
        POLLING = new StreamPostType("POLLING", 2, "Polling");
        NEWS = new StreamPostType("NEWS", 3, "News");
        REPOST = new StreamPostType("REPOST", 4, "Repost");
        StreamPostType[] r02 = a();
        f86487a = r02;
        f86488b = b.a(r02);
    }

    StreamPostType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ StreamPostType[] a() {
        return new StreamPostType[]{IDEAS, PREDICTION, POLLING, NEWS, REPOST};
    }

    public static kotlin.enums.a getEntries() {
        return f86488b;
    }

    public static StreamPostType valueOf(String r1) {
        return (StreamPostType) Enum.valueOf(StreamPostType.class, r1);
    }

    public static StreamPostType[] values() {
        return (StreamPostType[]) f86487a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
