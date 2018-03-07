package com.zeasn.spring;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Hash {
	private Map<String, Object> table;

	public Hash() {
		this.table = new Hashtable<>();
	}

	public int size() {
		return this.table.size();
	}

	public void put(String field, Object value) {
		this.table.put(field, value);
	}

	public Object get(String field) {
		return this.table.get(field);
	}

	public Set<String> fields() {
		return this.table.keySet();
	}
	
	public Collection<Object> values(){
		return this.table.values();
	}

	public Set<Map.Entry<String, Object>> entries() {
		return this.table.entrySet();
	}
}