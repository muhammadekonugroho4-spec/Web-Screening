package com.stockbit.common.utils;

import android.content.ContentResolver;
import android.provider.Settings;

/* renamed from: com.stockbit.common.utils.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC5867q {

    /* renamed from: a, reason: collision with root package name */
    public static final a f62375a = null;

    /* renamed from: com.stockbit.common.utils.q$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final boolean a(ContentResolver r3) {
            if (Settings.Secure.getInt(r3, "development_settings_enabled", 0) <= 0) goto L6;
            return true;
        L6:
            return false;
        }

        public a() {
        }
    }

    static {
        f62375a = new a(null);
    }
}
