package com.bumptech.glide.request;

import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* loaded from: classes4.dex */
public interface RequestCoordinator {

    public enum RequestState extends Enum<RequestState> {
        public static final RequestState CLEARED = null;
        public static final RequestState FAILED = null;
        public static final RequestState PAUSED = null;
        public static final RequestState RUNNING = null;
        public static final RequestState SUCCESS = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ RequestState[] f33267a = null;
        private final boolean isComplete;

        static {
            RequestState r02 = new RequestState(DebugCoroutineInfoImplKt.RUNNING, 0, false);
            RUNNING = r02;
            RequestState r1 = new RequestState("PAUSED", 1, false);
            PAUSED = r1;
            RequestState r3 = new RequestState("CLEARED", 2, false);
            CLEARED = r3;
            RequestState r2 = new RequestState("SUCCESS", 3, true);
            SUCCESS = r2;
            RequestState r5 = new RequestState("FAILED", 4, true);
            FAILED = r5;
            f33267a = new RequestState[]{r02, r1, r3, r2, r5};
        }

        RequestState(String r1, int r2, boolean r3) {
            this.isComplete = r3;
        }

        public static RequestState valueOf(String r1) {
            return (RequestState) Enum.valueOf(RequestState.class, r1);
        }

        public static RequestState[] values() {
            return (RequestState[]) f33267a.clone();
        }

        public boolean a() {
            return this.isComplete;
        }
    }

    boolean b();

    void c(d r1);

    boolean d(d r1);

    boolean e(d r1);

    RequestCoordinator getRoot();

    void h(d r1);

    boolean j(d r1);
}
