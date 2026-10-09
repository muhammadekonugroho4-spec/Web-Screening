package io.sentry.internal.gestures;

import io.sentry.util.v;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class UiElement {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f176266a;

    /* renamed from: b, reason: collision with root package name */
    public final String f176267b;

    /* renamed from: c, reason: collision with root package name */
    public final String f176268c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f176269e;

    public enum Type extends Enum<Type> {
        private static final /* synthetic */ Type[] $VALUES = null;
        public static final Type CLICKABLE = null;
        public static final Type SCROLLABLE = null;

        private static /* synthetic */ Type[] $values() {
            return new Type[]{CLICKABLE, SCROLLABLE};
        }

        static {
            CLICKABLE = new Type("CLICKABLE", 0);
            SCROLLABLE = new Type("SCROLLABLE", 1);
            $VALUES = $values();
        }

        Type(String r1, int r2) {
        }

        public static Type valueOf(String r1) {
            return (Type) Enum.valueOf(Type.class, r1);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public UiElement(Object r2, String r3, String r4, String r5, String r6) {
        this.f176266a = new WeakReference(r2);
        this.f176267b = r3;
        this.f176268c = r4;
        this.d = r5;
        this.f176269e = r6;
    }

    public String a() {
        return this.f176267b;
    }

    public String b() {
        String r02 = this.f176268c;
        if (r02 == null) goto L6;
        return r02;
    L6:
        return (String) v.c(this.d, "UiElement.tag can't be null");
    }

    public String c() {
        return this.f176269e;
    }

    public String d() {
        return this.f176268c;
    }

    public String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L17:
        return false;
    L8:
        if (UiElement.class != r5.getClass()) goto L17;
        UiElement r52 = (UiElement) r5;
        if (v.a(this.f176267b, r52.f176267b) == false) goto L17;
        if (v.a(this.f176268c, r52.f176268c) == false) goto L17;
        if (v.a(this.d, r52.d) == false) goto L17;
        return true;
    }

    public Object f() {
        return this.f176266a.get();
    }

    public int hashCode() {
        return v.b(new Object[]{this.f176266a, this.f176268c, this.d});
    }
}
