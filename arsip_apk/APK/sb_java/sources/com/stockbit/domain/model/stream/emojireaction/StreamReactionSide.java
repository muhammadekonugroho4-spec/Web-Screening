package com.stockbit.domain.model.stream.emojireaction;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/domain/model/stream/emojireaction/StreamReactionSide;", "", "<init>", "(Ljava/lang/String;I)V", "REACTION_SIDE_UNSPECIFIED", "REACTION_SIDE_LIKE", "REACTION_SIDE_DISLIKE", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum StreamReactionSide extends Enum<StreamReactionSide> {
    public static final StreamReactionSide REACTION_SIDE_DISLIKE = null;
    public static final StreamReactionSide REACTION_SIDE_LIKE = null;
    public static final StreamReactionSide REACTION_SIDE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StreamReactionSide[] f85830a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f85831b = null;

    static {
        REACTION_SIDE_UNSPECIFIED = new StreamReactionSide("REACTION_SIDE_UNSPECIFIED", 0);
        REACTION_SIDE_LIKE = new StreamReactionSide("REACTION_SIDE_LIKE", 1);
        REACTION_SIDE_DISLIKE = new StreamReactionSide("REACTION_SIDE_DISLIKE", 2);
        StreamReactionSide[] r02 = a();
        f85830a = r02;
        f85831b = kotlin.enums.b.a(r02);
    }

    StreamReactionSide(String r1, int r2) {
    }

    public static final /* synthetic */ StreamReactionSide[] a() {
        return new StreamReactionSide[]{REACTION_SIDE_UNSPECIFIED, REACTION_SIDE_LIKE, REACTION_SIDE_DISLIKE};
    }

    public static kotlin.enums.a getEntries() {
        return f85831b;
    }

    public static StreamReactionSide valueOf(String r1) {
        return (StreamReactionSide) Enum.valueOf(StreamReactionSide.class, r1);
    }

    public static StreamReactionSide[] values() {
        return (StreamReactionSide[]) f85830a.clone();
    }
}
