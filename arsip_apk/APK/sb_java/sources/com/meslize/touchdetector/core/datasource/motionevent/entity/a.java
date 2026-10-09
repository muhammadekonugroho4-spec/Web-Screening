package com.meslize.touchdetector.core.datasource.motionevent.entity;

import android.view.MotionEvent;
import java.util.Calendar;

/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f42086a;

    /* renamed from: b, reason: collision with root package name */
    public final MotionEvent f42087b;

    public a(MotionEvent r3) {
        this.f42086a = Calendar.getInstance().getTimeInMillis();
        this.f42087b = r3;
    }
}
