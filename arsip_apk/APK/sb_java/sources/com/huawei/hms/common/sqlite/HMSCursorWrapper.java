package com.huawei.hms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;

/* loaded from: classes6.dex */
public class HMSCursorWrapper extends CursorWrapper implements CrossProcessCursor {

    /* renamed from: a, reason: collision with root package name */
    private AbstractWindowedCursor f39136a;

    public HMSCursorWrapper(Cursor r5) {
        super(r5);
        if (r5 == null) goto L19;
        if ((r5 instanceof CursorWrapper) == false) goto L17;
        Cursor r52 = ((CursorWrapper) r5).getWrappedCursor();
        if (r52 == null) goto L15;
        if ((r52 instanceof AbstractWindowedCursor) == false) goto L13;
        this.f39136a = (AbstractWindowedCursor) r52;
        return;
    L13:
        throw new IllegalArgumentException("getWrappedCursor:" + r52 + " is not a subclass for CursorWrapper");
    L15:
        throw new IllegalArgumentException("getWrappedCursor cannot be null");
    L17:
        throw new IllegalArgumentException("cursor:" + r5 + " is not a subclass for CursorWrapper");
    L19:
        throw new IllegalArgumentException("cursor cannot be null");
    }

    @Override // android.database.CrossProcessCursor
    public void fillWindow(int r2, CursorWindow r3) {
        this.f39136a.fillWindow(r2, r3);
    }

    @Override // android.database.CrossProcessCursor
    public CursorWindow getWindow() {
        return this.f39136a.getWindow();
    }

    @Override // android.database.CursorWrapper
    public Cursor getWrappedCursor() {
        return this.f39136a;
    }

    @Override // android.database.CrossProcessCursor
    public boolean onMove(int r2, int r3) {
        return this.f39136a.onMove(r2, r3);
    }

    public void setWindow(CursorWindow r2) {
        this.f39136a.setWindow(r2);
    }
}
