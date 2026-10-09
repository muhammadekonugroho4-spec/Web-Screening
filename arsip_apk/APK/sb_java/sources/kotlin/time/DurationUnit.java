package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\bB\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0002\u001a\u00020\u0003X\u0080\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/time/DurationUnit;", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "<init>", "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", "getTimeUnit$kotlin_stdlib", "()Ljava/util/concurrent/TimeUnit;", "NANOSECONDS", "MICROSECONDS", "MILLISECONDS", "SECONDS", "MINUTES", "HOURS", "DAYS", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum DurationUnit extends Enum<DurationUnit> {
    public static final DurationUnit DAYS = null;
    public static final DurationUnit HOURS = null;
    public static final DurationUnit MICROSECONDS = null;
    public static final DurationUnit MILLISECONDS = null;
    public static final DurationUnit MINUTES = null;
    public static final DurationUnit NANOSECONDS = null;
    public static final DurationUnit SECONDS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DurationUnit[] f180401a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f180402b = null;
    private final TimeUnit timeUnit;

    static {
        NANOSECONDS = new DurationUnit("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        MICROSECONDS = new DurationUnit("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        MILLISECONDS = new DurationUnit("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        SECONDS = new DurationUnit("SECONDS", 3, TimeUnit.SECONDS);
        MINUTES = new DurationUnit("MINUTES", 4, TimeUnit.MINUTES);
        HOURS = new DurationUnit("HOURS", 5, TimeUnit.HOURS);
        DAYS = new DurationUnit("DAYS", 6, TimeUnit.DAYS);
        DurationUnit[] r02 = a();
        f180401a = r02;
        f180402b = kotlin.enums.b.a(r02);
    }

    DurationUnit(String r1, int r2, TimeUnit r3) {
        this.timeUnit = r3;
    }

    public static final /* synthetic */ DurationUnit[] a() {
        return new DurationUnit[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    public static kotlin.enums.a getEntries() {
        return f180402b;
    }

    public static DurationUnit valueOf(String r1) {
        return (DurationUnit) Enum.valueOf(DurationUnit.class, r1);
    }

    public static DurationUnit[] values() {
        return (DurationUnit[]) f180401a.clone();
    }

    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }
}
