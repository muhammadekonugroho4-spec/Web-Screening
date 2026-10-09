package com.stockbit.domain.model.type.stream;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/stockbit/domain/model/type/stream/CommentLimitationType;", "", "value", "", "content", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getContent", "COMMENTER_TYPE_EVERYONE", "COMMENTER_TYPE_FOLLOWING", "COMMENTER_TYPE_MENTION", "COMMENTER_TYPE_ONLY_YOU", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum CommentLimitationType extends Enum<CommentLimitationType> {
    public static final CommentLimitationType COMMENTER_TYPE_EVERYONE = null;
    public static final CommentLimitationType COMMENTER_TYPE_FOLLOWING = null;
    public static final CommentLimitationType COMMENTER_TYPE_MENTION = null;
    public static final CommentLimitationType COMMENTER_TYPE_ONLY_YOU = null;
    public static final a Companion = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CommentLimitationType[] f86457a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86458b = null;
    private final String content;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final CommentLimitationType a(String r6) {
            p.l(r6, "value");
            CommentLimitationType[] r02 = CommentLimitationType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            CommentLimitationType r3 = r02[r2];
            if (p.g(r3.getValue(), r6) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return CommentLimitationType.COMMENTER_TYPE_EVERYONE;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        COMMENTER_TYPE_EVERYONE = new CommentLimitationType("COMMENTER_TYPE_EVERYONE", 0, "COMMENTER_TYPE_EVERYONE", "Everyone can comment");
        COMMENTER_TYPE_FOLLOWING = new CommentLimitationType("COMMENTER_TYPE_FOLLOWING", 1, "COMMENTER_TYPE_FOLLOWING", "Only people you follow can comment");
        COMMENTER_TYPE_MENTION = new CommentLimitationType("COMMENTER_TYPE_MENTION", 2, "COMMENTER_TYPE_MENTION", "Only people you mention can comment");
        COMMENTER_TYPE_ONLY_YOU = new CommentLimitationType("COMMENTER_TYPE_ONLY_YOU", 3, "COMMENTER_TYPE_ONLY_YOU", "Only you can comment");
        CommentLimitationType[] r02 = a();
        f86457a = r02;
        f86458b = b.a(r02);
        Companion = new a(null);
    }

    CommentLimitationType(String r1, int r2, String r3, String r4) {
        this.value = r3;
        this.content = r4;
    }

    public static final /* synthetic */ CommentLimitationType[] a() {
        return new CommentLimitationType[]{COMMENTER_TYPE_EVERYONE, COMMENTER_TYPE_FOLLOWING, COMMENTER_TYPE_MENTION, COMMENTER_TYPE_ONLY_YOU};
    }

    public static kotlin.enums.a getEntries() {
        return f86458b;
    }

    public static CommentLimitationType valueOf(String r1) {
        return (CommentLimitationType) Enum.valueOf(CommentLimitationType.class, r1);
    }

    public static CommentLimitationType[] values() {
        return (CommentLimitationType[]) f86457a.clone();
    }

    public final String getContent() {
        return this.content;
    }

    public final String getValue() {
        return this.value;
    }
}
