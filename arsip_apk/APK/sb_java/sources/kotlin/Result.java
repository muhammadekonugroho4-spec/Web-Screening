package kotlin;

import com.gojek.ojosdk.exif.ExifInterface;
import java.io.Serializable;

@kotlin.jvm.b
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u001e\u001fB\u0013\bA\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0087\u0088\u0004¢\u0006\u0004\b\u0011\u0010\u0007J\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0086\u0080\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u00020\u0017H\u0096\u0080\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0000X\u0081\u0084\b¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\tR\u0015\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\b¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0015\u0010\u000e\u001a\u00020\u000b8FX\u0086\u0084\b¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r\u0088\u0001\u0004\u0092\u0001\u0004\u0018\u00010\u0005¨\u0006 "}, d2 = {"Lkotlin/Result;", ExifInterface.GpsTrackRef.TRUE_DIRECTION, "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "value", "", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "getValue$annotations", "()V", "isSuccess", "", "isSuccess-impl", "(Ljava/lang/Object;)Z", "isFailure", "isFailure-impl", "getOrNull", "getOrNull-impl", "exceptionOrNull", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "equals", "other", "hashCode", "", "Companion", "Failure", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Result<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final a f177326a = null;
    private final Object value;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\bF\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0082\u0004J\n\u0010\u000b\u001a\u00020\fH\u0096\u0080\u0004J\n\u0010\r\u001a\u00020\u000eH\u0096\u0080\u0004R\u0011\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0084\b¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlin/Result$Failure;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "exception", "", "<init>", "(Ljava/lang/Throwable;)V", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Failure implements Serializable {
        public final Throwable exception;

        public Failure(Throwable r2) {
            kotlin.jvm.internal.p.l(r2, "exception");
            this.exception = r2;
        }

        public boolean equals(Object r2) {
            if ((r2 instanceof Failure) == true) goto L5;
            return false;
        L5:
            if (kotlin.jvm.internal.p.g(this.exception, ((Failure) r2).exception) == false) goto L10;
            return true;
        L10:
            return false;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Failure(" + this.exception + ')';
        }
    }

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f177326a = new a(null);
    }

    public /* synthetic */ Result(Object r1) {
        this.value = r1;
    }

    public static final /* synthetic */ Result a(Object r1) {
        return new Result(r1);
    }

    public static Object b(Object r02) {
        return r02;
    }

    public static boolean c(Object r2, Object r3) {
        if ((r3 instanceof Result) == true) goto L6;
        return false;
    L6:
        if (kotlin.jvm.internal.p.g(r2, ((Result) r3).j()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean d(Object r02, Object r1) {
        return kotlin.jvm.internal.p.g(r02, r1);
    }

    public static final Throwable e(Object r1) {
        if ((r1 instanceof Failure) == true) goto L5;
        return null;
    L5:
        return ((Failure) r1).exception;
    }

    public static int f(Object r02) {
        if (r02 != null) goto L6;
        return 0;
    L6:
        return r02.hashCode();
    }

    public static final boolean g(Object r02) {
        return r02 instanceof Failure;
    }

    public static final boolean h(Object r02) {
        return !(r02 instanceof Failure);
    }

    public static String i(Object r2) {
        if ((r2 instanceof Failure) == false) goto L7;
        return ((Failure) r2).toString();
    L7:
        return "Success(" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return c(this.value, r2);
    }

    public int hashCode() {
        return f(this.value);
    }

    public final /* synthetic */ Object j() {
        return this.value;
    }

    public String toString() {
        return i(this.value);
    }
}
