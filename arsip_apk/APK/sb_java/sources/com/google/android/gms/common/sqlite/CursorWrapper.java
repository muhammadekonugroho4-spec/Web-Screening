package com.google.android.gms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes5.dex */
public class CursorWrapper extends android.database.CursorWrapper implements CrossProcessCursor {
    private AbstractWindowedCursor zza;

    @KeepForSdk
    public CursorWrapper(Cursor r3) {
        super(r3);
        int r02 = 0;
    L4:
        if (r02 >= 10) goto L9;
        if ((r3 instanceof android.database.CursorWrapper) == false) goto L9;
        r3 = ((android.database.CursorWrapper) r3).getWrappedCursor();
        r02 = r02 + 1;
    L9:
        if ((r3 instanceof AbstractWindowedCursor) == false) goto L13;
        this.zza = (AbstractWindowedCursor) r3;
        return;
    L13:
        throw new IllegalArgumentException("Unknown type: ".concat(r3.getClass().getName()));
    }

    @Override // android.database.CrossProcessCursor
    @KeepForSdk
    public void fillWindow(int r2, CursorWindow r3) {
        this.zza.fillWindow(r2, r3);
    }

    @Override // android.database.CrossProcessCursor
    @KeepForSdk
    public CursorWindow getWindow() {
        return this.zza.getWindow();
    }

    @Override // android.database.CursorWrapper
    public final /* synthetic */ Cursor getWrappedCursor() {
        return this.zza;
    }

    @Override // android.database.CrossProcessCursor
    public final boolean onMove(int r2, int r3) {
        return this.zza.onMove(r2, r3);
    }

    @KeepForSdk
    public void setWindow(CursorWindow r2) {
        this.zza.setWindow(r2);
    }
}
