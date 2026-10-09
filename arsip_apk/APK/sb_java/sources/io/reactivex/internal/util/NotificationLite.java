package io.reactivex.internal.util;

import com.clevertap.android.sdk.Constants;
import io.reactivex.h;
import java.io.Serializable;

/* loaded from: classes2.dex */
public enum NotificationLite extends Enum<NotificationLite> {
    public static final NotificationLite COMPLETE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ NotificationLite[] f174624a = null;

    public static final class DisposableNotification implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        final io.reactivex.disposables.b upstream;

        public DisposableNotification(io.reactivex.disposables.b r1) {
            this.upstream = r1;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.upstream + Constants.AES_SUFFIX;
        }
    }

    public static final class ErrorNotification implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: e, reason: collision with root package name */
        final Throwable f174625e;

        public ErrorNotification(Throwable r1) {
            this.f174625e = r1;
        }

        public boolean equals(Object r2) {
            if ((r2 instanceof ErrorNotification) == true) goto L5;
            return false;
        L5:
            return io.reactivex.internal.functions.b.c(this.f174625e, ((ErrorNotification) r2).f174625e);
        }

        public int hashCode() {
            return this.f174625e.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f174625e + Constants.AES_SUFFIX;
        }
    }

    public static final class SubscriptionNotification implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        final org.reactivestreams.c upstream;

        public SubscriptionNotification(org.reactivestreams.c r1) {
            this.upstream = r1;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.upstream + Constants.AES_SUFFIX;
        }
    }

    static {
        NotificationLite r02 = new NotificationLite("COMPLETE", 0);
        COMPLETE = r02;
        f174624a = new NotificationLite[]{r02};
    }

    NotificationLite(String r1, int r2) {
    }

    public static <T> boolean accept(Object r2, org.reactivestreams.b r3) {
        if (r2 != COMPLETE) goto L7;
        r3.onComplete();
        return true;
    L7:
        if ((r2 instanceof ErrorNotification) == false) goto L10;
        r3.onError(((ErrorNotification) r2).f174625e);
        return true;
    L10:
        r3.onNext(r2);
        return false;
    }

    public static <T> boolean acceptFull(Object r2, org.reactivestreams.b r3) {
        if (r2 != COMPLETE) goto L7;
        r3.onComplete();
        return true;
    L7:
        if ((r2 instanceof ErrorNotification) == false) goto L11;
        r3.onError(((ErrorNotification) r2).f174625e);
        return true;
    L11:
        if ((r2 instanceof SubscriptionNotification) == false) goto L14;
        r3.onSubscribe(((SubscriptionNotification) r2).upstream);
        return false;
    L14:
        r3.onNext(r2);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(io.reactivex.disposables.b r1) {
        return new DisposableNotification(r1);
    }

    public static Object error(Throwable r1) {
        return new ErrorNotification(r1);
    }

    public static io.reactivex.disposables.b getDisposable(Object r02) {
        return ((DisposableNotification) r02).upstream;
    }

    public static Throwable getError(Object r02) {
        return ((ErrorNotification) r02).f174625e;
    }

    public static org.reactivestreams.c getSubscription(Object r02) {
        return ((SubscriptionNotification) r02).upstream;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object r02) {
        return r02;
    }

    public static boolean isComplete(Object r1) {
        if (r1 != COMPLETE) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean isDisposable(Object r02) {
        return r02 instanceof DisposableNotification;
    }

    public static boolean isError(Object r02) {
        return r02 instanceof ErrorNotification;
    }

    public static boolean isSubscription(Object r02) {
        return r02 instanceof SubscriptionNotification;
    }

    public static <T> Object next(T r02) {
        return r02;
    }

    public static Object subscription(org.reactivestreams.c r1) {
        return new SubscriptionNotification(r1);
    }

    public static NotificationLite valueOf(String r1) {
        return (NotificationLite) Enum.valueOf(NotificationLite.class, r1);
    }

    public static NotificationLite[] values() {
        return (NotificationLite[]) f174624a.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object r2, h r3) {
        if (r2 != COMPLETE) goto L7;
        r3.onComplete();
        return true;
    L7:
        if ((r2 instanceof ErrorNotification) == false) goto L10;
        r3.onError(((ErrorNotification) r2).f174625e);
        return true;
    L10:
        r3.onNext(r2);
        return false;
    }

    public static <T> boolean acceptFull(Object r2, h r3) {
        if (r2 != COMPLETE) goto L7;
        r3.onComplete();
        return true;
    L7:
        if ((r2 instanceof ErrorNotification) == false) goto L11;
        r3.onError(((ErrorNotification) r2).f174625e);
        return true;
    L11:
        if ((r2 instanceof DisposableNotification) == false) goto L14;
        r3.a(((DisposableNotification) r2).upstream);
        return false;
    L14:
        r3.onNext(r2);
        return false;
    }
}
