package com.skydoves.balloon;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/skydoves/balloon/ArrowOrientation;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "BOTTOM", "TOP", "START", "END", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum ArrowOrientation extends Enum<ArrowOrientation> {
    public static final ArrowOrientation BOTTOM = null;
    public static final a Companion = null;
    public static final ArrowOrientation END = null;
    public static final ArrowOrientation START = null;
    public static final ArrowOrientation TOP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ArrowOrientation[] f43946a = null;

    public static final class a {

        /* renamed from: com.skydoves.balloon.ArrowOrientation$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0501a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f43947a = null;

            static {
                int[] r02 = new int[ArrowOrientation.values().length];
                r02[ArrowOrientation.START.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
            L9:
                r02[ArrowOrientation.END.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
            L5:
                f43947a = r02;
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final ArrowOrientation a(ArrowOrientation r2, boolean r3) {
            kotlin.jvm.internal.p.l(r2, "<this>");
            if (r3 == false) goto L9;
            int r32 = C0501a.f43947a[r2.ordinal()];
            if (r32 == 1) goto L13;
            if (r32 != 2) goto L9;
            return ArrowOrientation.START;
        L13:
            return ArrowOrientation.END;
        L9:
            return r2;
        }

        public a() {
        }
    }

    static {
        BOTTOM = new ArrowOrientation("BOTTOM", 0);
        TOP = new ArrowOrientation("TOP", 1);
        START = new ArrowOrientation("START", 2);
        END = new ArrowOrientation("END", 3);
        f43946a = a();
        Companion = new a(null);
    }

    ArrowOrientation(String r1, int r2) {
    }

    public static final /* synthetic */ ArrowOrientation[] a() {
        return new ArrowOrientation[]{BOTTOM, TOP, START, END};
    }

    public static ArrowOrientation valueOf(String r1) {
        return (ArrowOrientation) Enum.valueOf(ArrowOrientation.class, r1);
    }

    public static ArrowOrientation[] values() {
        return (ArrowOrientation[]) f43946a.clone();
    }
}
