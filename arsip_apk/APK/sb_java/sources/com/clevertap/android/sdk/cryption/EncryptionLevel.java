package com.clevertap.android.sdk.cryption;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/clevertap/android/sdk/cryption/EncryptionLevel;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "intValue", "()I", "I", "Companion", "a", "NONE", "MEDIUM", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum EncryptionLevel extends Enum<EncryptionLevel> {
    public static final a Companion = null;
    public static final EncryptionLevel MEDIUM = null;
    public static final EncryptionLevel NONE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EncryptionLevel[] f33737a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f33738b = null;
    private final int value;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final EncryptionLevel a(int r6) {
            EncryptionLevel[] r02 = EncryptionLevel.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            EncryptionLevel r3 = r02[r2];
            if (EncryptionLevel.access$getValue$p(r3) == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return EncryptionLevel.NONE;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        NONE = new EncryptionLevel("NONE", 0, 0);
        MEDIUM = new EncryptionLevel("MEDIUM", 1, 1);
        EncryptionLevel[] r02 = a();
        f33737a = r02;
        f33738b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    EncryptionLevel(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ EncryptionLevel[] a() {
        return new EncryptionLevel[]{NONE, MEDIUM};
    }

    public static final /* synthetic */ int access$getValue$p(EncryptionLevel r02) {
        return r02.value;
    }

    public static final EncryptionLevel fromInt(int r1) {
        return Companion.a(r1);
    }

    public static kotlin.enums.a getEntries() {
        return f33738b;
    }

    public static EncryptionLevel valueOf(String r1) {
        return (EncryptionLevel) Enum.valueOf(EncryptionLevel.class, r1);
    }

    public static EncryptionLevel[] values() {
        return (EncryptionLevel[]) f33737a.clone();
    }

    public final int intValue() {
        return this.value;
    }
}
