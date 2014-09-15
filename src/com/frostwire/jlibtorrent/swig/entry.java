/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class entry {
  private long swigCPtr;
  private boolean swigCMemOwn;

  protected entry(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(entry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_entry(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public entry.data_type type() {
    return entry.data_type.swigToEnum(libtorrent_jni.entry_type(swigCPtr, this));
  }

  public entry(string_entry_map arg0) {
    this(libtorrent_jni.new_entry__SWIG_0(string_entry_map.getCPtr(arg0), arg0), true);
  }

  public entry(String arg0) {
    this(libtorrent_jni.new_entry__SWIG_1(arg0), true);
  }

  public entry(long arg0) {
    this(libtorrent_jni.new_entry__SWIG_2(arg0), true);
  }

  public entry(entry.data_type t) {
    this(libtorrent_jni.new_entry__SWIG_3(t.swigValue()), true);
  }

  public entry() {
    this(libtorrent_jni.new_entry__SWIG_4(), true);
  }

  public boolean op_eq(entry e) {
    return libtorrent_jni.entry_op_eq(swigCPtr, this, entry.getCPtr(e), e);
  }

  public boolean op_neq(entry e) {
    return libtorrent_jni.entry_op_neq(swigCPtr, this, entry.getCPtr(e), e);
  }

  public long integer() {
    return libtorrent_jni.entry_integer__SWIG_0(swigCPtr, this);
  }

  public String string() {
    return libtorrent_jni.entry_string__SWIG_0(swigCPtr, this);
  }

  public string_entry_map dict() {
    return new string_entry_map(libtorrent_jni.entry_dict__SWIG_0(swigCPtr, this), false);
  }

  public void swap(entry e) {
    libtorrent_jni.entry_swap(swigCPtr, this, entry.getCPtr(e), e);
  }

  public entry op_get_at(String key) {
    return new entry(libtorrent_jni.entry_op_get_at__SWIG_0(swigCPtr, this, key), true);
  }

  public entry find_key(String key) {
    long cPtr = libtorrent_jni.entry_find_key__SWIG_0(swigCPtr, this, key);
    return (cPtr == 0) ? null : new entry(cPtr, true);
  }

  public String to_string() {
    return libtorrent_jni.entry_to_string(swigCPtr, this);
  }

  public void setM_type_queried(short value) {
    libtorrent_jni.entry_m_type_queried_set(swigCPtr, this, value);
  }

  public short getM_type_queried() {
    return libtorrent_jni.entry_m_type_queried_get(swigCPtr, this);
  }

  public char_vector bencode() {
    return new char_vector(libtorrent_jni.entry_bencode(swigCPtr, this), true);
  }

  public entry_vector list_v() {
    return new entry_vector(libtorrent_jni.entry_list_v(swigCPtr, this), true);
  }

  public enum data_type {
    int_t,
    string_t,
    list_t,
    dictionary_t,
    undefined_t;

    public final int swigValue() {
      return swigValue;
    }

    public static data_type swigToEnum(int swigValue) {
      data_type[] swigValues = data_type.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (data_type swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + data_type.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private data_type() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private data_type(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private data_type(data_type swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
