package com.facebook.internal;

import java.util.EnumSet;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\t\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/internal/SmartLoginOption;", "", "", "value", "<init>", "(Ljava/lang/String;IJ)V", "J", "getValue", "()J", "Companion", "a", "None", "Enabled", "RequireConfirm", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum SmartLoginOption extends Enum<SmartLoginOption> {
    public static final a Companion = null;
    public static final SmartLoginOption Enabled = null;
    public static final SmartLoginOption None = null;
    public static final SmartLoginOption RequireConfirm = null;

    /* renamed from: a, reason: collision with root package name */
    public static final EnumSet f36391a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ SmartLoginOption[] f36392b = null;
    private final long value;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final EnumSet a(long r8) {
            EnumSet r02 = EnumSet.noneOf(SmartLoginOption.class);
            Iterator r1 = SmartLoginOption.access$getALL$cp().iterator();
        L4:
            if (r1.hasNext() == false) goto L8;
            SmartLoginOption r2 = (SmartLoginOption) r1.next();
            if ((r2.getValue() & r8) == 0) goto L4;
            r02.add(r2);
            goto L4
        L8:
            kotlin.jvm.internal.p.k(r02, "result");
            return r02;
        }

        public a() {
        }
    }

    static {
        None = new SmartLoginOption("None", 0, 0);
        Enabled = new SmartLoginOption("Enabled", 1, 1);
        RequireConfirm = new SmartLoginOption("RequireConfirm", 2, 2);
        f36392b = a();
        Companion = new a(null);
        EnumSet r02 = EnumSet.allOf(SmartLoginOption.class);
        kotlin.jvm.internal.p.k(r02, "allOf(SmartLoginOption::class.java)");
        f36391a = r02;
    }

    SmartLoginOption(String r1, int r2, long r3) {
        this.value = r3;
    }

    public static final /* synthetic */ SmartLoginOption[] a() {
        return new SmartLoginOption[]{None, Enabled, RequireConfirm};
    }

    public static final /* synthetic */ EnumSet access$getALL$cp() {
        return f36391a;
    }

    public static final EnumSet<SmartLoginOption> parseOptions(long r1) {
        return Companion.a(r1);
    }

    public static SmartLoginOption valueOf(String r1) {
        return (SmartLoginOption) Enum.valueOf(SmartLoginOption.class, r1);
    }

    public static SmartLoginOption[] values() {
        return (SmartLoginOption[]) f36392b.clone();
    }

    public final long getValue() {
        return this.value;
    }
}
