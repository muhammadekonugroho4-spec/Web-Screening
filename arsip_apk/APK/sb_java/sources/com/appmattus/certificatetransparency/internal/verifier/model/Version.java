package com.appmattus.certificatetransparency.internal.verifier.model;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/verifier/model/Version;", "", "", "number", "<init>", "(Ljava/lang/String;II)V", "I", "getNumber", "()I", "Companion", "a", "V1", "UNKNOWN_VERSION", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum Version extends Enum<Version> {
    public static final a Companion = null;
    public static final Version UNKNOWN_VERSION = null;
    public static final Version V1 = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Version[] f32283a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f32284b = null;
    private final int number;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final Version a(int r6) {
            Version[] r02 = Version.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            Version r3 = r02[r2];
            if (r3.getNumber() == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return Version.UNKNOWN_VERSION;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        V1 = new Version("V1", 0, 0);
        UNKNOWN_VERSION = new Version("UNKNOWN_VERSION", 1, 256);
        Version[] r02 = a();
        f32283a = r02;
        f32284b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    Version(String r1, int r2, int r3) {
        this.number = r3;
    }

    public static final /* synthetic */ Version[] a() {
        return new Version[]{V1, UNKNOWN_VERSION};
    }

    public static kotlin.enums.a getEntries() {
        return f32284b;
    }

    public static Version valueOf(String r1) {
        return (Version) Enum.valueOf(Version.class, r1);
    }

    public static Version[] values() {
        return (Version[]) f32283a.clone();
    }

    public final int getNumber() {
        return this.number;
    }
}
