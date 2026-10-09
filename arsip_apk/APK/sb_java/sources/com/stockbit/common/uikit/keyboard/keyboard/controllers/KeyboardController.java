package com.stockbit.common.uikit.keyboard.keyboard.controllers;

import com.google.firebase.perf.FirebasePerformance;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

/* loaded from: classes7.dex */
public abstract class KeyboardController {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stockbit/common/uikit/keyboard/keyboard/controllers/KeyboardController$SpecialKey;", "", "<init>", "(Ljava/lang/String;I)V", FirebasePerformance.HttpMethod.DELETE, "BACKSPACE", "CLEAR", "FORWARD", "BACK", "NEXT", "CAPS", "SYMBOL", "ALPHA", "DONE", "common_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum SpecialKey extends Enum<SpecialKey> {
        public static final SpecialKey ALPHA = null;
        public static final SpecialKey BACK = null;
        public static final SpecialKey BACKSPACE = null;
        public static final SpecialKey CAPS = null;
        public static final SpecialKey CLEAR = null;
        public static final SpecialKey DELETE = null;
        public static final SpecialKey DONE = null;
        public static final SpecialKey FORWARD = null;
        public static final SpecialKey NEXT = null;
        public static final SpecialKey SYMBOL = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ SpecialKey[] f61804a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a f61805b = null;

        static {
            DELETE = new SpecialKey(FirebasePerformance.HttpMethod.DELETE, 0);
            BACKSPACE = new SpecialKey("BACKSPACE", 1);
            CLEAR = new SpecialKey("CLEAR", 2);
            FORWARD = new SpecialKey("FORWARD", 3);
            BACK = new SpecialKey("BACK", 4);
            NEXT = new SpecialKey("NEXT", 5);
            CAPS = new SpecialKey("CAPS", 6);
            SYMBOL = new SpecialKey("SYMBOL", 7);
            ALPHA = new SpecialKey("ALPHA", 8);
            DONE = new SpecialKey("DONE", 9);
            SpecialKey[] r02 = a();
            f61804a = r02;
            f61805b = b.a(r02);
        }

        SpecialKey(String r1, int r2) {
        }

        public static final /* synthetic */ SpecialKey[] a() {
            return new SpecialKey[]{DELETE, BACKSPACE, CLEAR, FORWARD, BACK, NEXT, CAPS, SYMBOL, ALPHA, DONE};
        }

        public static a getEntries() {
            return f61805b;
        }

        public static SpecialKey valueOf(String r1) {
            return (SpecialKey) Enum.valueOf(SpecialKey.class, r1);
        }

        public static SpecialKey[] values() {
            return (SpecialKey[]) f61804a.clone();
        }
    }
}
