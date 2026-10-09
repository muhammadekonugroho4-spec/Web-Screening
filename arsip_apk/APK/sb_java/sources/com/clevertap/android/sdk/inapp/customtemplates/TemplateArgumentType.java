package com.clevertap.android.sdk.inapp.customtemplates;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateArgumentType;", "", "", "stringName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", "a", "STRING", "BOOLEAN", "NUMBER", "FILE", "ACTION", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum TemplateArgumentType extends Enum<TemplateArgumentType> {
    public static final TemplateArgumentType ACTION = null;
    public static final TemplateArgumentType BOOLEAN = null;
    public static final a Companion = null;
    public static final TemplateArgumentType FILE = null;
    public static final TemplateArgumentType NUMBER = null;
    public static final TemplateArgumentType STRING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TemplateArgumentType[] f34081a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f34082b = null;
    private final String stringName;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        STRING = new TemplateArgumentType("STRING", 0, "string");
        BOOLEAN = new TemplateArgumentType("BOOLEAN", 1, "boolean");
        NUMBER = new TemplateArgumentType("NUMBER", 2, "number");
        FILE = new TemplateArgumentType("FILE", 3, "file");
        ACTION = new TemplateArgumentType("ACTION", 4, Constants.KEY_ACTION);
        TemplateArgumentType[] r02 = a();
        f34081a = r02;
        f34082b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    TemplateArgumentType(String r1, int r2, String r3) {
        this.stringName = r3;
    }

    public static final /* synthetic */ TemplateArgumentType[] a() {
        return new TemplateArgumentType[]{STRING, BOOLEAN, NUMBER, FILE, ACTION};
    }

    public static final /* synthetic */ String access$getStringName$p(TemplateArgumentType r02) {
        return r02.stringName;
    }

    public static kotlin.enums.a getEntries() {
        return f34082b;
    }

    public static TemplateArgumentType valueOf(String r1) {
        return (TemplateArgumentType) Enum.valueOf(TemplateArgumentType.class, r1);
    }

    public static TemplateArgumentType[] values() {
        return (TemplateArgumentType[]) f34081a.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.stringName;
    }
}
