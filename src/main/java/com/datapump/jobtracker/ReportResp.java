/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.datapump.jobtracker;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2017-06-18")
public class ReportResp implements org.apache.thrift.TBase<ReportResp, ReportResp._Fields>, java.io.Serializable, Cloneable, Comparable<ReportResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ReportResp");

  private static final org.apache.thrift.protocol.TField JOB_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("job_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField OPERATION_FIELD_DESC = new org.apache.thrift.protocol.TField("operation", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ReportRespStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ReportRespTupleSchemeFactory();

  public int job_id; // required
  public int operation; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JOB_ID((short)1, "job_id"),
    OPERATION((short)2, "operation");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // JOB_ID
          return JOB_ID;
        case 2: // OPERATION
          return OPERATION;
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
  private static final int __JOB_ID_ISSET_ID = 0;
  private static final int __OPERATION_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB_ID, new org.apache.thrift.meta_data.FieldMetaData("job_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.OPERATION, new org.apache.thrift.meta_data.FieldMetaData("operation", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ReportResp.class, metaDataMap);
  }

  public ReportResp() {
  }

  public ReportResp(
    int job_id,
    int operation)
  {
    this();
    this.job_id = job_id;
    setJob_idIsSet(true);
    this.operation = operation;
    setOperationIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReportResp(ReportResp other) {
    __isset_bitfield = other.__isset_bitfield;
    this.job_id = other.job_id;
    this.operation = other.operation;
  }

  public ReportResp deepCopy() {
    return new ReportResp(this);
  }

  @Override
  public void clear() {
    setJob_idIsSet(false);
    this.job_id = 0;
    setOperationIsSet(false);
    this.operation = 0;
  }

  public int getJob_id() {
    return this.job_id;
  }

  public ReportResp setJob_id(int job_id) {
    this.job_id = job_id;
    setJob_idIsSet(true);
    return this;
  }

  public void unsetJob_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __JOB_ID_ISSET_ID);
  }

  /** Returns true if field job_id is set (has been assigned a value) and false otherwise */
  public boolean isSetJob_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __JOB_ID_ISSET_ID);
  }

  public void setJob_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __JOB_ID_ISSET_ID, value);
  }

  public int getOperation() {
    return this.operation;
  }

  public ReportResp setOperation(int operation) {
    this.operation = operation;
    setOperationIsSet(true);
    return this;
  }

  public void unsetOperation() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __OPERATION_ISSET_ID);
  }

  /** Returns true if field operation is set (has been assigned a value) and false otherwise */
  public boolean isSetOperation() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __OPERATION_ISSET_ID);
  }

  public void setOperationIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __OPERATION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOB_ID:
      if (value == null) {
        unsetJob_id();
      } else {
        setJob_id((Integer)value);
      }
      break;

    case OPERATION:
      if (value == null) {
        unsetOperation();
      } else {
        setOperation((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_ID:
      return getJob_id();

    case OPERATION:
      return getOperation();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOB_ID:
      return isSetJob_id();
    case OPERATION:
      return isSetOperation();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ReportResp)
      return this.equals((ReportResp)that);
    return false;
  }

  public boolean equals(ReportResp that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_job_id = true;
    boolean that_present_job_id = true;
    if (this_present_job_id || that_present_job_id) {
      if (!(this_present_job_id && that_present_job_id))
        return false;
      if (this.job_id != that.job_id)
        return false;
    }

    boolean this_present_operation = true;
    boolean that_present_operation = true;
    if (this_present_operation || that_present_operation) {
      if (!(this_present_operation && that_present_operation))
        return false;
      if (this.operation != that.operation)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + job_id;

    hashCode = hashCode * 8191 + operation;

    return hashCode;
  }

  @Override
  public int compareTo(ReportResp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetJob_id()).compareTo(other.isSetJob_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJob_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.job_id, other.job_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOperation()).compareTo(other.isSetOperation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operation, other.operation);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ReportResp(");
    boolean first = true;

    sb.append("job_id:");
    sb.append(this.job_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("operation:");
    sb.append(this.operation);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ReportRespStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ReportRespStandardScheme getScheme() {
      return new ReportRespStandardScheme();
    }
  }

  private static class ReportRespStandardScheme extends org.apache.thrift.scheme.StandardScheme<ReportResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ReportResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOB_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.job_id = iprot.readI32();
              struct.setJob_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OPERATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.operation = iprot.readI32();
              struct.setOperationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ReportResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(JOB_ID_FIELD_DESC);
      oprot.writeI32(struct.job_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(OPERATION_FIELD_DESC);
      oprot.writeI32(struct.operation);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReportRespTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ReportRespTupleScheme getScheme() {
      return new ReportRespTupleScheme();
    }
  }

  private static class ReportRespTupleScheme extends org.apache.thrift.scheme.TupleScheme<ReportResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ReportResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetJob_id()) {
        optionals.set(0);
      }
      if (struct.isSetOperation()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetJob_id()) {
        oprot.writeI32(struct.job_id);
      }
      if (struct.isSetOperation()) {
        oprot.writeI32(struct.operation);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ReportResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.job_id = iprot.readI32();
        struct.setJob_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.operation = iprot.readI32();
        struct.setOperationIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

