/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.pocketcampus.plugin.isacademia.shared;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IsaScheduleReply implements org.apache.thrift.TBase<IsaScheduleReply, IsaScheduleReply._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("IsaScheduleReply");

  private static final org.apache.thrift.protocol.TField I_SEANCES_FIELD_DESC = new org.apache.thrift.protocol.TField("iSeances", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField I_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("iStatus", org.apache.thrift.protocol.TType.I32, (short)2);

  public List<IsaSeance> iSeances; // required
  public int iStatus; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    I_SEANCES((short)1, "iSeances"),
    I_STATUS((short)2, "iStatus");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // I_SEANCES
          return I_SEANCES;
        case 2: // I_STATUS
          return I_STATUS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ISTATUS_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.I_SEANCES, new org.apache.thrift.meta_data.FieldMetaData("iSeances", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, IsaSeance.class))));
    tmpMap.put(_Fields.I_STATUS, new org.apache.thrift.meta_data.FieldMetaData("iStatus", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(IsaScheduleReply.class, metaDataMap);
  }

  public IsaScheduleReply() {
  }

  public IsaScheduleReply(
    int iStatus)
  {
    this();
    this.iStatus = iStatus;
    setIStatusIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public IsaScheduleReply(IsaScheduleReply other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetISeances()) {
      List<IsaSeance> __this__iSeances = new ArrayList<IsaSeance>();
      for (IsaSeance other_element : other.iSeances) {
        __this__iSeances.add(new IsaSeance(other_element));
      }
      this.iSeances = __this__iSeances;
    }
    this.iStatus = other.iStatus;
  }

  public IsaScheduleReply deepCopy() {
    return new IsaScheduleReply(this);
  }

  @Override
  public void clear() {
    this.iSeances = null;
    setIStatusIsSet(false);
    this.iStatus = 0;
  }

  public int getISeancesSize() {
    return (this.iSeances == null) ? 0 : this.iSeances.size();
  }

  public java.util.Iterator<IsaSeance> getISeancesIterator() {
    return (this.iSeances == null) ? null : this.iSeances.iterator();
  }

  public void addToISeances(IsaSeance elem) {
    if (this.iSeances == null) {
      this.iSeances = new ArrayList<IsaSeance>();
    }
    this.iSeances.add(elem);
  }

  public List<IsaSeance> getISeances() {
    return this.iSeances;
  }

  public IsaScheduleReply setISeances(List<IsaSeance> iSeances) {
    this.iSeances = iSeances;
    return this;
  }

  public void unsetISeances() {
    this.iSeances = null;
  }

  /** Returns true if field iSeances is set (has been assigned a value) and false otherwise */
  public boolean isSetISeances() {
    return this.iSeances != null;
  }

  public void setISeancesIsSet(boolean value) {
    if (!value) {
      this.iSeances = null;
    }
  }

  public int getIStatus() {
    return this.iStatus;
  }

  public IsaScheduleReply setIStatus(int iStatus) {
    this.iStatus = iStatus;
    setIStatusIsSet(true);
    return this;
  }

  public void unsetIStatus() {
    __isset_bit_vector.clear(__ISTATUS_ISSET_ID);
  }

  /** Returns true if field iStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetIStatus() {
    return __isset_bit_vector.get(__ISTATUS_ISSET_ID);
  }

  public void setIStatusIsSet(boolean value) {
    __isset_bit_vector.set(__ISTATUS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case I_SEANCES:
      if (value == null) {
        unsetISeances();
      } else {
        setISeances((List<IsaSeance>)value);
      }
      break;

    case I_STATUS:
      if (value == null) {
        unsetIStatus();
      } else {
        setIStatus((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case I_SEANCES:
      return getISeances();

    case I_STATUS:
      return Integer.valueOf(getIStatus());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case I_SEANCES:
      return isSetISeances();
    case I_STATUS:
      return isSetIStatus();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof IsaScheduleReply)
      return this.equals((IsaScheduleReply)that);
    return false;
  }

  public boolean equals(IsaScheduleReply that) {
    if (that == null)
      return false;

    boolean this_present_iSeances = true && this.isSetISeances();
    boolean that_present_iSeances = true && that.isSetISeances();
    if (this_present_iSeances || that_present_iSeances) {
      if (!(this_present_iSeances && that_present_iSeances))
        return false;
      if (!this.iSeances.equals(that.iSeances))
        return false;
    }

    boolean this_present_iStatus = true;
    boolean that_present_iStatus = true;
    if (this_present_iStatus || that_present_iStatus) {
      if (!(this_present_iStatus && that_present_iStatus))
        return false;
      if (this.iStatus != that.iStatus)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_iSeances = true && (isSetISeances());
    builder.append(present_iSeances);
    if (present_iSeances)
      builder.append(iSeances);

    boolean present_iStatus = true;
    builder.append(present_iStatus);
    if (present_iStatus)
      builder.append(iStatus);

    return builder.toHashCode();
  }

  public int compareTo(IsaScheduleReply other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    IsaScheduleReply typedOther = (IsaScheduleReply)other;

    lastComparison = Boolean.valueOf(isSetISeances()).compareTo(typedOther.isSetISeances());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetISeances()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.iSeances, typedOther.iSeances);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIStatus()).compareTo(typedOther.isSetIStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.iStatus, typedOther.iStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // I_SEANCES
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
              this.iSeances = new ArrayList<IsaSeance>(_list8.size);
              for (int _i9 = 0; _i9 < _list8.size; ++_i9)
              {
                IsaSeance _elem10; // required
                _elem10 = new IsaSeance();
                _elem10.read(iprot);
                this.iSeances.add(_elem10);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // I_STATUS
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.iStatus = iprot.readI32();
            setIStatusIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    if (!isSetIStatus()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'iStatus' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.iSeances != null) {
      if (isSetISeances()) {
        oprot.writeFieldBegin(I_SEANCES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, this.iSeances.size()));
          for (IsaSeance _iter11 : this.iSeances)
          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldBegin(I_STATUS_FIELD_DESC);
    oprot.writeI32(this.iStatus);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("IsaScheduleReply(");
    boolean first = true;

    if (isSetISeances()) {
      sb.append("iSeances:");
      if (this.iSeances == null) {
        sb.append("null");
      } else {
        sb.append(this.iSeances);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("iStatus:");
    sb.append(this.iStatus);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'iStatus' because it's a primitive and you chose the non-beans generator.
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

