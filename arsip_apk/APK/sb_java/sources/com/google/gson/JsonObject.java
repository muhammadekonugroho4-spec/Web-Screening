package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class JsonObject extends JsonElement {
    private final LinkedTreeMap<String, JsonElement> members;

    public JsonObject() {
        this.members = new LinkedTreeMap(false);
    }

    public void add(String r2, JsonElement r3) {
        LinkedTreeMap<String, JsonElement> r02 = this.members;
        if (r3 != null) goto L5;
        r3 = JsonNull.INSTANCE;
    L5:
        r02.put(r2, r3);
    }

    public void addProperty(String r2, String r3) {
        if (r3 != null) goto L4;
        JsonElement r32 = JsonNull.INSTANCE;
    L5:
        add(r2, r32);
        return;
    L4:
        r32 = new JsonPrimitive(r3);
        goto L5
    }

    public Map<String, JsonElement> asMap() {
        return this.members;
    }

    @Override // com.google.gson.JsonElement
    public /* bridge */ /* synthetic */ JsonElement deepCopy() {
        return deepCopy();
    }

    public Set<Map.Entry<String, JsonElement>> entrySet() {
        return this.members.entrySet();
    }

    public boolean equals(Object r2) {
        if (r2 != this) goto L4;
        return true;
    L4:
        if ((r2 instanceof JsonObject) == true) goto L6;
        return false;
    L6:
        if (((JsonObject) r2).members.equals(this.members) == true) goto L13;
        return false;
    L13:
        return true;
    }

    public JsonElement get(String r2) {
        return this.members.get(r2);
    }

    public JsonArray getAsJsonArray(String r2) {
        return (JsonArray) this.members.get(r2);
    }

    public JsonObject getAsJsonObject(String r2) {
        return (JsonObject) this.members.get(r2);
    }

    public JsonPrimitive getAsJsonPrimitive(String r2) {
        return (JsonPrimitive) this.members.get(r2);
    }

    public boolean has(String r2) {
        return this.members.containsKey(r2);
    }

    public int hashCode() {
        return this.members.hashCode();
    }

    public boolean isEmpty() {
        if (this.members.size() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public Set<String> keySet() {
        return this.members.keySet();
    }

    public JsonElement remove(String r2) {
        return this.members.remove(r2);
    }

    public int size() {
        return this.members.size();
    }

    public void addProperty(String r2, Number r3) {
        if (r3 != null) goto L4;
        JsonElement r32 = JsonNull.INSTANCE;
    L5:
        add(r2, r32);
        return;
    L4:
        r32 = new JsonPrimitive(r3);
        goto L5
    }

    @Override // com.google.gson.JsonElement
    public JsonObject deepCopy() {
        JsonObject r02 = new JsonObject();
        Iterator<Map.Entry<String, JsonElement>> r1 = this.members.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        Map.Entry<String, JsonElement> r2 = r1.next();
        r02.add(r2.getKey(), r2.getValue().deepCopy());
        goto L4
    L6:
        return r02;
    }

    public void addProperty(String r2, Boolean r3) {
        if (r3 != null) goto L4;
        JsonElement r32 = JsonNull.INSTANCE;
    L5:
        add(r2, r32);
        return;
    L4:
        r32 = new JsonPrimitive(r3);
        goto L5
    }

    public void addProperty(String r2, Character r3) {
        if (r3 != null) goto L4;
        JsonElement r32 = JsonNull.INSTANCE;
    L5:
        add(r2, r32);
        return;
    L4:
        r32 = new JsonPrimitive(r3);
        goto L5
    }
}
