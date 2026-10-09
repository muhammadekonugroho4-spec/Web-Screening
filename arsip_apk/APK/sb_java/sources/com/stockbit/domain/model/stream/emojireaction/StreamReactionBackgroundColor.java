package com.stockbit.domain.model.stream.emojireaction;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.text.B;
import kotlin.text.y;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/stockbit/domain/model/stream/emojireaction/StreamReactionBackgroundColor;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "YELLOW", "RED", "BLUE", "SURFACE", "ORANGE", "PERIWINKLE", "PINK", "GREEN", "BROWN", "NONE", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum StreamReactionBackgroundColor extends Enum<StreamReactionBackgroundColor> {
    public static final StreamReactionBackgroundColor BLUE = null;
    public static final StreamReactionBackgroundColor BROWN = null;
    public static final a Companion = null;
    public static final StreamReactionBackgroundColor GREEN = null;
    public static final StreamReactionBackgroundColor NONE = null;
    public static final StreamReactionBackgroundColor ORANGE = null;
    public static final StreamReactionBackgroundColor PERIWINKLE = null;
    public static final StreamReactionBackgroundColor PINK = null;
    public static final StreamReactionBackgroundColor RED = null;
    public static final StreamReactionBackgroundColor SURFACE = null;
    public static final StreamReactionBackgroundColor YELLOW = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StreamReactionBackgroundColor[] f85828a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f85829b = null;
    private final String code;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final StreamReactionBackgroundColor a(String r6) {
            Object r02 = null;
            if (r6 == null) goto L5;
            String r62 = B.D1(r6).toString();
        L6:
            if (r62 != null) goto L8;
            r62 = "";
        L8:
            Iterator<E> r1 = StreamReactionBackgroundColor.getEntries().iterator();
        L10:
            if (r1.hasNext() == false) goto L16;
            Object r2 = r1.next();
            StreamReactionBackgroundColor r3 = (StreamReactionBackgroundColor) r2;
            if (r3 == StreamReactionBackgroundColor.NONE) goto L10;
            if (y.J(r3.getCode(), r62, true) == false) goto L10;
            r02 = r2;
        L16:
            StreamReactionBackgroundColor r03 = (StreamReactionBackgroundColor) r02;
            if (r03 == null) goto L19;
            return r03;
        L19:
            return StreamReactionBackgroundColor.NONE;
        L5:
            r62 = null;
            goto L6
        }

        public a() {
        }
    }

    static {
        YELLOW = new StreamReactionBackgroundColor("YELLOW", 0, "REACTION_BACKGROUND_COLOR_YELLOW");
        RED = new StreamReactionBackgroundColor("RED", 1, "REACTION_BACKGROUND_COLOR_RED");
        BLUE = new StreamReactionBackgroundColor("BLUE", 2, "REACTION_BACKGROUND_COLOR_BLUE");
        SURFACE = new StreamReactionBackgroundColor("SURFACE", 3, "REACTION_BACKGROUND_COLOR_SURFACE");
        ORANGE = new StreamReactionBackgroundColor("ORANGE", 4, "REACTION_BACKGROUND_COLOR_ORANGE");
        PERIWINKLE = new StreamReactionBackgroundColor("PERIWINKLE", 5, "REACTION_BACKGROUND_COLOR_PERIWINKLE");
        PINK = new StreamReactionBackgroundColor("PINK", 6, "REACTION_BACKGROUND_COLOR_PINK");
        GREEN = new StreamReactionBackgroundColor("GREEN", 7, "REACTION_BACKGROUND_COLOR_GREEN");
        BROWN = new StreamReactionBackgroundColor("BROWN", 8, "REACTION_BACKGROUND_COLOR_BROWN");
        NONE = new StreamReactionBackgroundColor("NONE", 9, "");
        StreamReactionBackgroundColor[] r02 = a();
        f85828a = r02;
        f85829b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    StreamReactionBackgroundColor(String r1, int r2, String r3) {
        this.code = r3;
    }

    public static final /* synthetic */ StreamReactionBackgroundColor[] a() {
        return new StreamReactionBackgroundColor[]{YELLOW, RED, BLUE, SURFACE, ORANGE, PERIWINKLE, PINK, GREEN, BROWN, NONE};
    }

    public static kotlin.enums.a getEntries() {
        return f85829b;
    }

    public static StreamReactionBackgroundColor valueOf(String r1) {
        return (StreamReactionBackgroundColor) Enum.valueOf(StreamReactionBackgroundColor.class, r1);
    }

    public static StreamReactionBackgroundColor[] values() {
        return (StreamReactionBackgroundColor[]) f85828a.clone();
    }

    public final String getCode() {
        return this.code;
    }
}
