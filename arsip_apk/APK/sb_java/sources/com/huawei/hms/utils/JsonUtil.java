package com.huawei.hms.utils;

import android.text.TextUtils;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.support.log.common.Base64;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class JsonUtil {
    protected static final int VAL_BYTE = 2;
    protected static final int VAL_ENTITY = 0;
    protected static final int VAL_LIST = 1;
    protected static final int VAL_MAP = 3;
    protected static final int VAL_NULL = -1;
    protected static final String VAL_TYPE = "_val_type_";

    public JsonUtil() {
    }

    private static String a(IMessageEntity r9) throws IllegalAccessException, JSONException {
        Class<?> r02 = r9.getClass();
        JSONObject r1 = new JSONObject();
    L3:
        if (r02 == null) goto L12;
        Field[] r2 = r02.getDeclaredFields();
        int r3 = r2.length;
        int r4 = 0;
    L5:
        if (r4 >= r3) goto L10;
        Field r5 = r2[r4];
        if (r5.isAnnotationPresent(Packed.class) == false) goto L9;
        boolean r6 = r5.isAccessible();
        a(r5, true);
        String r7 = r5.getName();
        Object r8 = r5.get(r9);
        a(r5, r6);
        a(r7, r8, r1);
    L9:
        r4 = r4 + 1;
        goto L5
    L10:
        r02 = r02.getSuperclass();
        goto L3
    L12:
        return r1.toString();
    }

    private static Object b(IMessageEntity r4, Field r5, JSONObject r6) throws JSONException, IllegalAccessException {
        Object r62 = a(r5.getName(), r6);
        if (r62 != null) goto L32;
    L31:
        return null;
    L32:
    L30:
        HMSLog.e("JsonUtil", "InstantiationException  ");
        goto L31
    L5:
        if (r5.getType().getName().startsWith("com.huawei") == false) goto L11;
        if ((r5.getType().newInstance() instanceof IMessageEntity) == false) goto L11;
        return jsonToEntity((String) r62, (IMessageEntity) r5.getType().newInstance());
    L11:
        if ((r62 instanceof JSONObject) == true) goto L13;
    L29:
        return r62;
    L13:
        if (((JSONObject) r62).has(VAL_TYPE) == false) goto L29;
        int r02 = ((JSONObject) r62).getInt(VAL_TYPE);     // Catch: InstantiationException -> L30
        if (r02 == 1) goto L28;
        if (r02 == 0) goto L28;
        if (r02 != 2) goto L23;
        return a((JSONObject) r62);
    L23:
        if (r02 == 3) goto L25;
        HMSLog.e("JsonUtil", "cannot support type : " + r02);     // Catch: InstantiationException -> L30
        goto L31
    L25:
        return b(r5.getGenericType(), (JSONObject) r62);
    L28:
        return a(r5.getGenericType(), (JSONObject) r62);
    }

    public static String createJsonString(IMessageEntity r4) {
        if (r4 != null) goto L13;
        HMSLog.e("JsonUtil", "createJsonString error, the input IMessageEntity is null");
        return "";
    L13:
        return a(r4);
    L10:
        e = move-exception;
        HMSLog.e("JsonUtil", "catch IllegalAccessException " + e.getMessage());
    L12:
        return "";
    L8:
        e = move-exception;
        HMSLog.e("JsonUtil", "catch JSONException " + e.getMessage());
        goto L12
    }

    public static Object getInfoFromJsonobject(String r2, String r3) {
        if (TextUtils.isEmpty(r2) == false) goto L5;
    L14:
        return null;
    L5:
        if (TextUtils.isEmpty(r3) == true) goto L14;
        JSONObject r02 = new JSONObject(r2);     // Catch: JSONException -> L13
        if (r02.has(r3) == true) goto L10;
        return null;
    L10:
        Object r22 = r02.get(r3);     // Catch: JSONException -> L13
        if ((r22 instanceof String) == false) goto L14;
        return r22;
    L13:
        HMSLog.e("JsonUtil", "getInfoFromJsonobject:parser json error :" + r3);
        goto L14
    }

    public static int getIntValue(JSONObject r1, String r2) throws JSONException {
        if (r1 != null) goto L4;
        return -1;
    L4:
        if (r1.has(r2) == true) goto L6;
        return -1;
    L6:
        return r1.getInt(r2);
    }

    public static String getStringValue(JSONObject r1, String r2) throws JSONException {
        if (r1 != null) goto L4;
        return null;
    L4:
        if (r1.has(r2) == true) goto L6;
        return null;
    L6:
        return r1.getString(r2);
    }

    public static IMessageEntity jsonToEntity(String r8, IMessageEntity r9) {
        Class<?> r1 = r9.getClass();     // Catch: JSONException -> L11
        JSONObject r2 = new JSONObject(r8);     // Catch: JSONException -> L11
    L4:
        if (r1 == null) goto L18;
        Field[] r82 = r1.getDeclaredFields();     // Catch: JSONException -> L11
        int r3 = r82.length;     // Catch: JSONException -> L11
        int r4 = 0;
    L6:
        if (r4 >= r3) goto L15;
        Field r5 = r82[r4];     // Catch: JSONException -> L11
        if (r5.isAnnotationPresent(Packed.class) == false) goto L14;
        a(r9, r5, r2);     // Catch: JSONException -> L11 IllegalAccessException -> L13
    L13:
        HMSLog.e("JsonUtil", "jsonToEntity, set value of the field exception, field name:" + r5.getName());     // Catch: JSONException -> L11
    L14:
        r4 = r4 + 1;     // Catch: JSONException -> L11
        goto L6
    L15:
        r1 = r1.getSuperclass();     // Catch: JSONException -> L11
    L18:
        return r9;
    L11:
        e = move-exception;
        HMSLog.e("JsonUtil", "catch JSONException when parse jsonString" + e.getMessage());
        goto L18
    }

    private static void a(final Field r1, final boolean r2) {
        AccessController.doPrivileged(new AnonymousClass1(r1, r2));
    }

    private static Map b(Type r4, JSONObject r5) throws JSONException, IllegalAccessException, InstantiationException {
        Class r42 = (Class) ((ParameterizedType) r4).getActualTypeArguments()[1];
        JSONArray r02 = new JSONArray(r5.getString("_map_"));
        HashMap r52 = new HashMap();
        int r1 = 0;
    L4:
        if (r1 >= r02.length()) goto L10;
        if ((r42.newInstance() instanceof IMessageEntity) == false) goto L8;
        IMessageEntity r2 = jsonToEntity(r02.getString(r1 + 1), (IMessageEntity) r42.newInstance());
        r52.put(r02.get(r1), r2);
    L9:
        r1 = r1 + 2;
        goto L4
    L8:
        r52.put(r02.get(r1), r02.get(r1 + 1));
        goto L9
    L10:
        return r52;
    }

    private static boolean a(String r2, Object r3, JSONObject r4) throws JSONException, IllegalAccessException {
        if ((r3 instanceof String) == false) goto L6;
        r4.put(r2, (String) r3);
        return true;
    L6:
        if ((r3 instanceof Integer) == false) goto L9;
        r4.put(r2, ((Integer) r3).intValue());
        return true;
    L9:
        if ((r3 instanceof Short) == false) goto L12;
        r4.put(r2, (Short) r3);
        return true;
    L12:
        if ((r3 instanceof Long) == false) goto L15;
        r4.put(r2, (Long) r3);
        return true;
    L15:
        if ((r3 instanceof Float) == false) goto L18;
        r4.put(r2, (Float) r3);
        return true;
    L18:
        if ((r3 instanceof Double) == false) goto L21;
        r4.put(r2, (Double) r3);
        return true;
    L21:
        if ((r3 instanceof Boolean) == false) goto L24;
        r4.put(r2, (Boolean) r3);
        return true;
    L24:
        if ((r3 instanceof JSONObject) == false) goto L27;
        r4.put(r2, (JSONObject) r3);
        return true;
    L27:
        if ((r3 instanceof byte[]) == false) goto L30;
        a(r2, (byte[]) r3, r4);
        return true;
    L30:
        if ((r3 instanceof List) == false) goto L33;
        a(r2, (List) r3, r4);
        return true;
    L33:
        if ((r3 instanceof Map) == false) goto L36;
        a(r2, (Map) r3, r4);
        return true;
    L36:
        if ((r3 instanceof IMessageEntity) == true) goto L43;
    L42:
        return false;
    L43:
        r4.put(r2, a((IMessageEntity) r3));     // Catch: IllegalAccessException -> L40
        return true;
    L40:
        e = move-exception;
        HMSLog.e("JsonUtil", "IllegalAccessException , " + e);
        goto L42
    }

    private static void a(String r4, Map r5, JSONObject r6) throws JSONException, IllegalAccessException {
        Iterator r52 = r5.entrySet().iterator();
        JSONArray r02 = new JSONArray();
    L4:
        if (r52.hasNext() == false) goto L13;
        Map.Entry r1 = (Map.Entry) r52.next();
        Object r2 = r1.getKey();
        Object r12 = r1.getValue();
        if ((r2 instanceof IMessageEntity) == false) goto L8;
        r02.put(a((IMessageEntity) r2));
    L10:
        if ((r12 instanceof IMessageEntity) == true) goto L11;
        r02.put(r12);
        goto L4
    L11:
        r02.put(a((IMessageEntity) r12));
        goto L4
    L8:
        r02.put(r2);
        goto L10
    L13:
        JSONObject r53 = new JSONObject();
        r53.put(VAL_TYPE, 3);
        r53.put("_map_", r02.toString());
        r6.put(r4, r53);
    }

    private static void a(String r3, byte[] r4, JSONObject r5) throws JSONException {
        JSONObject r02 = new JSONObject();
        r02.put(VAL_TYPE, 2);
        r02.put("_byte_", Base64.encode(r4));     // Catch: IllegalArgumentException -> L5
    L7:
        r5.put(r3, r02);
        return;
    L5:
        e = move-exception;
        HMSLog.e("JsonUtil", "writeByte failed : " + e.getMessage());
        goto L7
    }

    private static void a(String r6, List<?> r7, JSONObject r8) throws JSONException, IllegalAccessException {
        JSONObject r02 = new JSONObject();
        r02.put(VAL_TYPE, 1);
        r02.put("_list_size_", r7.size());
        int r3 = 0;
    L4:
        if (r3 >= r7.size()) goto L9;
        a("_list_item_" + r3, r7.get(r3), r02);
        if ((r7.get(r3) instanceof IMessageEntity) == false) goto L8;
        r02.put(VAL_TYPE, 0);
    L8:
        r3 = r3 + 1;
        goto L4
    L9:
        r8.put(r6, r02);
    }

    private static void a(IMessageEntity r2, Field r3, JSONObject r4) throws JSONException, IllegalAccessException {
        Object r42 = b(r2, r3, r4);
        if (r42 == null) goto L6;
        boolean r02 = r3.isAccessible();
        a(r3, true);
        r3.set(r2, r42);
        a(r3, r02);
        return;
    }

    private static Object a(String r2, JSONObject r3) throws JSONException {
        if (r3.has(r2) == false) goto L7;
        return r3.get(r2);
    L7:
        if (r3.has("header") == false) goto L13;
        if (r3.getJSONObject("header").has(r2) == false) goto L13;
        return r3.getJSONObject("header").get(r2);
    L13:
        if (r3.has("body") == true) goto L15;
        return null;
    L15:
        if (r3.getJSONObject("body").has(r2) == true) goto L17;
        return null;
    L17:
        return r3.getJSONObject("body").get(r2);
    }

    private static List<Object> a(Type r7, JSONObject r8) throws JSONException, IllegalAccessException, InstantiationException {
        int r02 = r8.getInt("_list_size_");
        int r1 = r8.getInt(VAL_TYPE);
        ArrayList r2 = new ArrayList(r02);
        int r4 = 0;
    L3:
        if (r4 >= r02) goto L11;
        Object r5 = r8.get("_list_item_" + r4);
        if (r1 != 0) goto L8;
        r2.add(jsonToEntity((String) r5, (IMessageEntity) ((Class) ((ParameterizedType) r7).getActualTypeArguments()[0]).newInstance()));
    L10:
        r4 = r4 + 1;
        goto L3
    L8:
        if (r1 != 1) goto L10;
        r2.add(r5);
        goto L10
    L11:
        return r2;
    }

    private static byte[] a(JSONObject r2) throws JSONException {
        return Base64.decode(r2.getString("_byte_"));
    L4:
        e = move-exception;
        HMSLog.e("JsonUtil", "readByte failed : " + e.getMessage());
        return null;
    }
}
