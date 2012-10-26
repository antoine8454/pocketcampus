/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.pocketcampus.platform.sdk.shared.restaurant;

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

/**
 * What the user gets back from a ChosenOrder.
 */
public class ClientOrderReceipt implements org.apache.thrift.TBase<ClientOrderReceipt, ClientOrderReceipt._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ClientOrderReceipt");

  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField NONCE_FIELD_DESC = new org.apache.thrift.protocol.TField("nonce", org.apache.thrift.protocol.TType.BYTE, (short)2);
  private static final org.apache.thrift.protocol.TField ORDER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("orderId", org.apache.thrift.protocol.TType.I64, (short)3);

  public long userId; // required
  public byte nonce; // required
  public long orderId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_ID((short)1, "userId"),
    NONCE((short)2, "nonce"),
    ORDER_ID((short)3, "orderId");

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
        case 1: // USER_ID
          return USER_ID;
        case 2: // NONCE
          return NONCE;
        case 3: // ORDER_ID
          return ORDER_ID;
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
  private static final int __USERID_ISSET_ID = 0;
  private static final int __NONCE_ISSET_ID = 1;
  private static final int __ORDERID_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "Id")));
    tmpMap.put(_Fields.NONCE, new org.apache.thrift.meta_data.FieldMetaData("nonce", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.ORDER_ID, new org.apache.thrift.meta_data.FieldMetaData("orderId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "Id")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ClientOrderReceipt.class, metaDataMap);
  }

  public ClientOrderReceipt() {
  }

  public ClientOrderReceipt(
    long userId,
    byte nonce,
    long orderId)
  {
    this();
    this.userId = userId;
    setUserIdIsSet(true);
    this.nonce = nonce;
    setNonceIsSet(true);
    this.orderId = orderId;
    setOrderIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClientOrderReceipt(ClientOrderReceipt other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.userId = other.userId;
    this.nonce = other.nonce;
    this.orderId = other.orderId;
  }

  public ClientOrderReceipt deepCopy() {
    return new ClientOrderReceipt(this);
  }

  @Override
  public void clear() {
    setUserIdIsSet(false);
    this.userId = 0;
    setNonceIsSet(false);
    this.nonce = 0;
    setOrderIdIsSet(false);
    this.orderId = 0;
  }

  public long getUserId() {
    return this.userId;
  }

  public ClientOrderReceipt setUserId(long userId) {
    this.userId = userId;
    setUserIdIsSet(true);
    return this;
  }

  public void unsetUserId() {
    __isset_bit_vector.clear(__USERID_ISSET_ID);
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return __isset_bit_vector.get(__USERID_ISSET_ID);
  }

  public void setUserIdIsSet(boolean value) {
    __isset_bit_vector.set(__USERID_ISSET_ID, value);
  }

  public byte getNonce() {
    return this.nonce;
  }

  public ClientOrderReceipt setNonce(byte nonce) {
    this.nonce = nonce;
    setNonceIsSet(true);
    return this;
  }

  public void unsetNonce() {
    __isset_bit_vector.clear(__NONCE_ISSET_ID);
  }

  /** Returns true if field nonce is set (has been assigned a value) and false otherwise */
  public boolean isSetNonce() {
    return __isset_bit_vector.get(__NONCE_ISSET_ID);
  }

  public void setNonceIsSet(boolean value) {
    __isset_bit_vector.set(__NONCE_ISSET_ID, value);
  }

  public long getOrderId() {
    return this.orderId;
  }

  public ClientOrderReceipt setOrderId(long orderId) {
    this.orderId = orderId;
    setOrderIdIsSet(true);
    return this;
  }

  public void unsetOrderId() {
    __isset_bit_vector.clear(__ORDERID_ISSET_ID);
  }

  /** Returns true if field orderId is set (has been assigned a value) and false otherwise */
  public boolean isSetOrderId() {
    return __isset_bit_vector.get(__ORDERID_ISSET_ID);
  }

  public void setOrderIdIsSet(boolean value) {
    __isset_bit_vector.set(__ORDERID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((Long)value);
      }
      break;

    case NONCE:
      if (value == null) {
        unsetNonce();
      } else {
        setNonce((Byte)value);
      }
      break;

    case ORDER_ID:
      if (value == null) {
        unsetOrderId();
      } else {
        setOrderId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_ID:
      return Long.valueOf(getUserId());

    case NONCE:
      return Byte.valueOf(getNonce());

    case ORDER_ID:
      return Long.valueOf(getOrderId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_ID:
      return isSetUserId();
    case NONCE:
      return isSetNonce();
    case ORDER_ID:
      return isSetOrderId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ClientOrderReceipt)
      return this.equals((ClientOrderReceipt)that);
    return false;
  }

  public boolean equals(ClientOrderReceipt that) {
    if (that == null)
      return false;

    boolean this_present_userId = true;
    boolean that_present_userId = true;
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (this.userId != that.userId)
        return false;
    }

    boolean this_present_nonce = true;
    boolean that_present_nonce = true;
    if (this_present_nonce || that_present_nonce) {
      if (!(this_present_nonce && that_present_nonce))
        return false;
      if (this.nonce != that.nonce)
        return false;
    }

    boolean this_present_orderId = true;
    boolean that_present_orderId = true;
    if (this_present_orderId || that_present_orderId) {
      if (!(this_present_orderId && that_present_orderId))
        return false;
      if (this.orderId != that.orderId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_userId = true;
    builder.append(present_userId);
    if (present_userId)
      builder.append(userId);

    boolean present_nonce = true;
    builder.append(present_nonce);
    if (present_nonce)
      builder.append(nonce);

    boolean present_orderId = true;
    builder.append(present_orderId);
    if (present_orderId)
      builder.append(orderId);

    return builder.toHashCode();
  }

  public int compareTo(ClientOrderReceipt other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ClientOrderReceipt typedOther = (ClientOrderReceipt)other;

    lastComparison = Boolean.valueOf(isSetUserId()).compareTo(typedOther.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, typedOther.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNonce()).compareTo(typedOther.isSetNonce());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNonce()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nonce, typedOther.nonce);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrderId()).compareTo(typedOther.isSetOrderId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orderId, typedOther.orderId);
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
        case 1: // USER_ID
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.userId = iprot.readI64();
            setUserIdIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NONCE
          if (field.type == org.apache.thrift.protocol.TType.BYTE) {
            this.nonce = iprot.readByte();
            setNonceIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // ORDER_ID
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.orderId = iprot.readI64();
            setOrderIdIsSet(true);
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
    if (!isSetUserId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userId' was not found in serialized data! Struct: " + toString());
    }
    if (!isSetNonce()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nonce' was not found in serialized data! Struct: " + toString());
    }
    if (!isSetOrderId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'orderId' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(USER_ID_FIELD_DESC);
    oprot.writeI64(this.userId);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(NONCE_FIELD_DESC);
    oprot.writeByte(this.nonce);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(ORDER_ID_FIELD_DESC);
    oprot.writeI64(this.orderId);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ClientOrderReceipt(");
    boolean first = true;

    sb.append("userId:");
    sb.append(this.userId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("nonce:");
    sb.append(this.nonce);
    first = false;
    if (!first) sb.append(", ");
    sb.append("orderId:");
    sb.append(this.orderId);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'userId' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'nonce' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'orderId' because it's a primitive and you chose the non-beans generator.
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
