package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

@ShowFirstParty
@KeepForSdk
@SafeParcelable.Class(creator = "BitmapTeleporterCreator")
/* loaded from: classes5.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = null;

    @SafeParcelable.VersionField(id = 1)
    final int zaa;

    @SafeParcelable.Field(id = 2)
    ParcelFileDescriptor zab;

    @SafeParcelable.Field(id = 3)
    final int zac;
    private Bitmap zad;
    private boolean zae;
    private File zaf;

    static {
        CREATOR = new zaa();
    }

    @SafeParcelable.Constructor
    public BitmapTeleporter(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) ParcelFileDescriptor r2, @SafeParcelable.Param(id = 3) int r3) {
        this.zaa = r1;
        this.zab = r2;
        this.zac = r3;
        this.zad = null;
        this.zae = false;
    }

    private static final void zaa(Closeable r2) {
        r2.close();     // Catch: IOException -> L4
        return;
    L4:
        e = move-exception;
        Log.w("BitmapTeleporter", "Could not close stream", e);
    }

    @KeepForSdk
    public Bitmap get() {
        if (this.zae == true) goto L15;
        DataInputStream r02 = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) Preconditions.checkNotNull(this.zab)));
        byte[] r1 = new byte[r02.readInt()];     // Catch: Throwable -> L7 IOException -> L9
        int r2 = r02.readInt();     // Catch: Throwable -> L7 IOException -> L9
        int r3 = r02.readInt();     // Catch: Throwable -> L7 IOException -> L9
        Bitmap.Config r4 = Bitmap.Config.valueOf(r02.readUTF());     // Catch: Throwable -> L7 IOException -> L9
        r02.read(r1);     // Catch: Throwable -> L7 IOException -> L9
        zaa(r02);
        ByteBuffer r03 = ByteBuffer.wrap(r1);
        Bitmap r12 = Bitmap.createBitmap(r2, r3, r4);
        r12.copyPixelsFromBuffer(r03);
        this.zad = r12;
        this.zae = true;
        goto L15
    L7:
        th = move-exception;
        zaa(r02);
        throw th;
    L9:
        e = move-exception;
        throw new IllegalStateException("Could not read from parcel file descriptor", e);     // Catch: Throwable -> L7
    L15:
        return this.zad;
    }

    @KeepForSdk
    public void release() {
        if (this.zae == true) goto L11;
        ((ParcelFileDescriptor) Preconditions.checkNotNull(this.zab)).close();     // Catch: IOException -> L6
        return;
    L6:
        e = move-exception;
        Log.w("BitmapTeleporter", "Could not close PFD", e);
        return;
    }

    @KeepForSdk
    public void setTempDir(File r2) {
        if (r2 == null) goto L6;
        this.zaf = r2;
        return;
    L6:
        throw new NullPointerException("Cannot set null temp directory");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r7, int r8) {
        if (this.zab != null) goto L25;
        Bitmap r02 = (Bitmap) Preconditions.checkNotNull(this.zad);
        ByteBuffer r1 = ByteBuffer.allocate(r02.getRowBytes() * r02.getHeight());
        r02.copyPixelsToBuffer(r1);
        byte[] r12 = r1.array();
        File r3 = this.zaf;
        if (r3 == null) goto L24;
        File r32 = File.createTempFile("teleporter", ".tmp", r3);     // Catch: IOException -> L20
        FileOutputStream r4 = new FileOutputStream(r32);     // Catch: FileNotFoundException -> L18
        this.zab = ParcelFileDescriptor.open(r32, 268435456);     // Catch: FileNotFoundException -> L18
        r32.delete();
        DataOutputStream r33 = new DataOutputStream(new BufferedOutputStream(r4));
        r33.writeInt(r12.length);     // Catch: Throwable -> L11 IOException -> L13
        r33.writeInt(r02.getWidth());     // Catch: Throwable -> L11 IOException -> L13
        r33.writeInt(r02.getHeight());     // Catch: Throwable -> L11 IOException -> L13
        r33.writeUTF(r02.getConfig().toString());     // Catch: Throwable -> L11 IOException -> L13
        r33.write(r12);     // Catch: Throwable -> L11 IOException -> L13
        zaa(r33);
        goto L25
    L11:
        th = move-exception;
        zaa(r33);
        throw th;
    L13:
        e = move-exception;
        throw new IllegalStateException("Could not write into unlinked file", e);     // Catch: Throwable -> L11
    L19:
        throw new IllegalStateException("Temporary file is somehow already deleted");
    L20:
        e = move-exception;
        throw new IllegalStateException("Could not create temporary file", e);
    L24:
        throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
    L25:
        int r13 = SafeParcelWriter.beginObjectHeader(r7);
        SafeParcelWriter.writeInt(r7, 1, this.zaa);
        ParcelFileDescriptor r03 = this.zab;
        SafeParcelWriter.writeParcelable(r7, 2, r03, r8 | 1, false);
        SafeParcelWriter.writeInt(r7, 3, this.zac);
        SafeParcelWriter.finishObjectHeader(r7, r13);
        this.zab = null;
    }

    @KeepForSdk
    public BitmapTeleporter(Bitmap r3) {
        this.zaa = 1;
        this.zab = null;
        this.zac = 0;
        this.zad = r3;
        this.zae = true;
    }
}
