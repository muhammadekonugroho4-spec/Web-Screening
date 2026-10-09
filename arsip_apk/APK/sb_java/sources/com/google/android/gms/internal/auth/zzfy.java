package com.google.android.gms.internal.auth;

import com.clevertap.android.sdk.Constants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes5.dex */
final class zzfy {
    public static String zza(zzfw r2, String r3) {
        StringBuilder r02 = new StringBuilder();
        r02.append("# ");
        r02.append(r3);
        zzd(r2, r02, 0);
        return r02.toString();
    }

    public static final void zzb(StringBuilder r6, int r7, String r8, Object r9) {
        if ((r9 instanceof List) == false) goto L9;
        Iterator r92 = ((List) r9).iterator();
    L6:
        if (r92.hasNext() == false) goto L14;
        zzb(r6, r7, r8, r92.next());
        goto L6
    L14:
        return;
    L9:
        if ((r9 instanceof Map) == false) goto L15;
        Iterator r93 = ((Map) r9).entrySet().iterator();
    L12:
        if (r93.hasNext() == false) goto L48;
        zzb(r6, r7, r8, (Map.Entry) r93.next());
        goto L12
    L48:
        return;
    L15:
        r6.append('\n');
        int r02 = 0;
        int r1 = 0;
    L17:
        if (r1 >= r7) goto L19;
        r6.append(' ');
        r1 = r1 + 1;
        goto L17
    L19:
        r6.append(r8);
        if ((r9 instanceof String) == false) goto L24;
        r6.append(": \"");
        r6.append(zzgw.zza(zzee.zzl((String) r9)));
        r6.append('\"');
        return;
    L24:
        if ((r9 instanceof zzee) == false) goto L28;
        r6.append(": \"");
        r6.append(zzgw.zza((zzee) r9));
        r6.append('\"');
        return;
    L28:
        if ((r9 instanceof zzeu) == false) goto L35;
        r6.append(" {");
        zzd((zzeu) r9, r6, r7 + 2);
        r6.append("\n");
    L30:
        if (r02 >= r7) goto L32;
        r6.append(' ');
        r02 = r02 + 1;
        goto L30
    L32:
        r6.append("}");
        return;
    L35:
        if ((r9 instanceof Map.Entry) == false) goto L41;
        r6.append(" {");
        Map.Entry r94 = (Map.Entry) r9;
        int r82 = r7 + 2;
        zzb(r6, r82, Constants.KEY_KEY, r94.getKey());
        zzb(r6, r82, "value", r94.getValue());
        r6.append("\n");
    L37:
        if (r02 >= r7) goto L39;
        r6.append(' ');
        r02 = r02 + 1;
        goto L37
    L39:
        r6.append("}");
        return;
    L41:
        r6.append(": ");
        r6.append(r9);
    }

    private static final String zzc(String r4) {
        StringBuilder r02 = new StringBuilder();
        int r1 = 0;
    L4:
        if (r1 >= r4.length()) goto L10;
        char r2 = r4.charAt(r1);
        if (Character.isUpperCase(r2) == false) goto L8;
        r02.append("_");
    L8:
        r02.append(Character.toLowerCase(r2));
        r1 = r1 + 1;
        goto L4
    L10:
        return r02.toString();
    }

    private static void zzd(zzfw r12, StringBuilder r13, int r14) {
        HashMap r02 = new HashMap();
        HashMap r1 = new HashMap();
        TreeSet r2 = new TreeSet();
        Method[] r3 = r12.getClass().getDeclaredMethods();
        int r4 = r3.length;
        int r6 = 0;
    L4:
        if (r6 >= r4) goto L11;
        Method r8 = r3[r6];
        r1.put(r8.getName(), r8);
        if (r8.getParameterTypes().length != 0) goto L10;
        r02.put(r8.getName(), r8);
        if (r8.getName().startsWith("get") == false) goto L10;
        r2.add(r8.getName());
    L10:
        r6 = r6 + 1;
        goto L4
    L11:
        Iterator r22 = r2.iterator();
    L13:
        if (r22.hasNext() == false) goto L94;
        String r32 = (String) r22.next();
        if (r32.startsWith("get") == false) goto L17;
        String r42 = r32.substring(3);
    L19:
        if (r42.endsWith("List") == false) goto L30;
        if (r42.endsWith("OrBuilderList") == true) goto L30;
        if (r42.equals("List") == true) goto L30;
        String r62 = String.valueOf(r42.substring(0, 1).toLowerCase()).concat(String.valueOf(r42.substring(1, r42.length() - 4)));
        Method r82 = (Method) r02.get(r32);
        if (r82 == null) goto L30;
        if (r82.getReturnType().equals(List.class) == false) goto L30;
        zzb(r13, r14, zzc(r62), zzeu.zze(r82, r12, new Object[0]));
    L30:
        if (r42.endsWith("Map") == false) goto L43;
        if (r42.equals("Map") == true) goto L43;
        String r63 = String.valueOf(r42.substring(0, 1).toLowerCase()).concat(String.valueOf(r42.substring(1, r42.length() - 3)));
        Method r33 = (Method) r02.get(r32);
        if (r33 == null) goto L43;
        if (r33.getReturnType().equals(Map.class) == false) goto L43;
        if (r33.isAnnotationPresent(Deprecated.class) == true) goto L43;
        if (Modifier.isPublic(r33.getModifiers()) == false) goto L43;
        zzb(r13, r14, zzc(r63), zzeu.zze(r33, r12, new Object[0]));
    L43:
        if (((Method) r1.get("set".concat(r42))) == null) goto L13;
        if (r42.endsWith("Bytes") == false) goto L48;
        if (r02.containsKey("get".concat(String.valueOf(r42.substring(0, r42.length() - 5)))) == true) goto L13;
    L48:
        String r34 = String.valueOf(r42.substring(0, 1).toLowerCase()).concat(String.valueOf(r42.substring(1)));
        Method r64 = (Method) r02.get("get".concat(r42));
        Method r43 = (Method) r02.get("has".concat(r42));
        if (r64 == null) goto L13;
        Object r65 = zzeu.zze(r64, r12, new Object[0]);
        if (r43 == null) goto L53;
        if (((Boolean) zzeu.zze(r43, r12, new Object[0])).booleanValue() == false) goto L13;
    L92:
        zzb(r13, r14, zzc(r34), r65);
        goto L13
    L53:
        if ((r65 instanceof Boolean) == true) goto L55;
        if ((r65 instanceof Integer) == true) goto L60;
        if ((r65 instanceof Float) == true) goto L65;
        if ((r65 instanceof Double) == true) goto L70;
        if ((r65 instanceof String) == true) goto L74;
        if ((r65 instanceof zzee) == true) goto L77;
        if ((r65 instanceof zzfw) == true) goto L83;
        if ((r65 instanceof Enum) == false) goto L92;
        if (((Enum) r65).ordinal() == 0) goto L13;
    L83:
        if (r65 == ((zzfw) r65).zzh()) goto L13;
    L77:
        boolean r44 = r65.equals(zzee.zzb);
    L78:
        if (r44 == true) goto L13;
    L74:
        r44 = r65.equals("");
        goto L78
    L70:
        if (Double.doubleToRawLongBits(((Double) r65).doubleValue()) == 0) goto L13;
    L65:
        if (Float.floatToRawIntBits(((Float) r65).floatValue()) == 0) goto L13;
    L60:
        if (((Integer) r65).intValue() == 0) goto L13;
    L55:
        if (((Boolean) r65).booleanValue() == false) goto L13;
    L17:
        r42 = r32;
        goto L19
    L94:
        if ((r12 instanceof zzet) == true) goto L99;
        zzgz r122 = ((zzeu) r12).zzc;
        if (r122 == null) goto L162;
        r122.zze(r13, r14);
        return;
    L162:
        return;
    L99:
        zzet r123 = (zzet) r12;
        throw null;
    }
}
