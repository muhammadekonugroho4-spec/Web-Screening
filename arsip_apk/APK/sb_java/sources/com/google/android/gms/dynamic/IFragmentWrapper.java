package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes5.dex */
public interface IFragmentWrapper extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public static IFragmentWrapper asInterface(IBinder r2) {
            if (r2 != null) goto L5;
            return null;
        L5:
            IInterface r02 = r2.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            if ((r02 instanceof IFragmentWrapper) == false) goto L10;
            return (IFragmentWrapper) r02;
        L10:
            return new zza(r2);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean zza(int r1, Parcel r2, Parcel r3, int r4) throws RemoteException {
            switch(r1) {
                case 2: goto L30;
                case 3: goto L29;
                case 4: goto L28;
                case 5: goto L27;
                case 6: goto L26;
                case 7: goto L25;
                case 8: goto L24;
                case 9: goto L23;
                case 10: goto L22;
                case 11: goto L21;
                case 12: goto L20;
                case 13: goto L19;
                case 14: goto L18;
                case 15: goto L17;
                case 16: goto L16;
                case 17: goto L15;
                case 18: goto L14;
                case 19: goto L13;
                case 20: goto L12;
                case 21: goto L11;
                case 22: goto L10;
                case 23: goto L9;
                case 24: goto L8;
                case 25: goto L7;
                case 26: goto L6;
                case 27: goto L5;
                default: goto L3;
            };
        L3:
            return false;
        L5:
            IObjectWrapper r12 = IObjectWrapper.Stub.asInterface(r2.readStrongBinder());
            zzc.zzb(r2);
            zzr(r12);
            r3.writeNoException();
            return true;
        L6:
            Intent r13 = (Intent) zzc.zza(r2, Intent.CREATOR);
            int r42 = r2.readInt();
            zzc.zzb(r2);
            zzq(r13, r42);
            r3.writeNoException();
            return true;
        L7:
            Intent r14 = (Intent) zzc.zza(r2, Intent.CREATOR);
            zzc.zzb(r2);
            zzp(r14);
            r3.writeNoException();
            return true;
        L8:
            boolean r15 = zzc.zzf(r2);
            zzc.zzb(r2);
            zzo(r15);
            r3.writeNoException();
            return true;
        L9:
            boolean r16 = zzc.zzf(r2);
            zzc.zzb(r2);
            zzn(r16);
            r3.writeNoException();
            return true;
        L10:
            boolean r17 = zzc.zzf(r2);
            zzc.zzb(r2);
            zzm(r17);
            r3.writeNoException();
            return true;
        L11:
            boolean r18 = zzc.zzf(r2);
            zzc.zzb(r2);
            zzl(r18);
            r3.writeNoException();
            return true;
        L12:
            IObjectWrapper r19 = IObjectWrapper.Stub.asInterface(r2.readStrongBinder());
            zzc.zzb(r2);
            zzk(r19);
            r3.writeNoException();
            return true;
        L13:
            boolean r110 = zzA();
            r3.writeNoException();
            int r22 = zzc.zza;
            r3.writeInt(r110 ? 1 : 0);
            return true;
        L14:
            boolean r111 = zzz();
            r3.writeNoException();
            int r23 = zzc.zza;
            r3.writeInt(r111 ? 1 : 0);
            return true;
        L15:
            boolean r112 = zzy();
            r3.writeNoException();
            int r24 = zzc.zza;
            r3.writeInt(r112 ? 1 : 0);
            return true;
        L16:
            boolean r113 = zzx();
            r3.writeNoException();
            int r25 = zzc.zza;
            r3.writeInt(r113 ? 1 : 0);
            return true;
        L17:
            boolean r114 = zzw();
            r3.writeNoException();
            int r26 = zzc.zza;
            r3.writeInt(r114 ? 1 : 0);
            return true;
        L18:
            boolean r115 = zzv();
            r3.writeNoException();
            int r27 = zzc.zza;
            r3.writeInt(r115 ? 1 : 0);
            return true;
        L19:
            boolean r116 = zzu();
            r3.writeNoException();
            int r28 = zzc.zza;
            r3.writeInt(r116 ? 1 : 0);
            return true;
        L20:
            IObjectWrapper r117 = zzi();
            r3.writeNoException();
            zzc.zze(r3, r117);
            return true;
        L21:
            boolean r118 = zzt();
            r3.writeNoException();
            int r29 = zzc.zza;
            r3.writeInt(r118 ? 1 : 0);
            return true;
        L22:
            int r119 = zzc();
            r3.writeNoException();
            r3.writeInt(r119);
            return true;
        L23:
            IFragmentWrapper r120 = zzf();
            r3.writeNoException();
            zzc.zze(r3, r120);
            return true;
        L24:
            String r121 = zzj();
            r3.writeNoException();
            r3.writeString(r121);
            return true;
        L25:
            boolean r122 = zzs();
            r3.writeNoException();
            int r210 = zzc.zza;
            r3.writeInt(r122 ? 1 : 0);
            return true;
        L26:
            IObjectWrapper r123 = zzh();
            r3.writeNoException();
            zzc.zze(r3, r123);
            return true;
        L27:
            IFragmentWrapper r124 = zze();
            r3.writeNoException();
            zzc.zze(r3, r124);
            return true;
        L28:
            int r125 = zzb();
            r3.writeNoException();
            r3.writeInt(r125);
            return true;
        L29:
            Bundle r126 = zzd();
            r3.writeNoException();
            zzc.zzd(r3, r126);
            return true;
        L30:
            IObjectWrapper r127 = zzg();
            r3.writeNoException();
            zzc.zze(r3, r127);
            return true;
        }
    }

    boolean zzA() throws RemoteException;

    int zzb() throws RemoteException;

    int zzc() throws RemoteException;

    Bundle zzd() throws RemoteException;

    IFragmentWrapper zze() throws RemoteException;

    IFragmentWrapper zzf() throws RemoteException;

    IObjectWrapper zzg() throws RemoteException;

    IObjectWrapper zzh() throws RemoteException;

    IObjectWrapper zzi() throws RemoteException;

    String zzj() throws RemoteException;

    void zzk(IObjectWrapper r1) throws RemoteException;

    void zzl(boolean r1) throws RemoteException;

    void zzm(boolean r1) throws RemoteException;

    void zzn(boolean r1) throws RemoteException;

    void zzo(boolean r1) throws RemoteException;

    void zzp(Intent r1) throws RemoteException;

    void zzq(Intent r1, int r2) throws RemoteException;

    void zzr(IObjectWrapper r1) throws RemoteException;

    boolean zzs() throws RemoteException;

    boolean zzt() throws RemoteException;

    boolean zzu() throws RemoteException;

    boolean zzv() throws RemoteException;

    boolean zzw() throws RemoteException;

    boolean zzx() throws RemoteException;

    boolean zzy() throws RemoteException;

    boolean zzz() throws RemoteException;
}
