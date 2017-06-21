/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.datapump.jobtracker;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2017-06-18")
public class ReportReq implements org.apache.thrift.TBase<ReportReq, ReportReq._Fields>, java.io.Serializable, Cloneable, Comparable<ReportReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ReportReq");

  private static final org.apache.thrift.protocol.TField JOB_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("job_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField JOB_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("job_state", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField SINK_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("sink_count", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField SOURCE_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("source_count", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ReportReqStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ReportReqTupleSchemeFactory();

  public int job_id; // required
  public int job_state; // required
  public long sink_count; // required
  public long source_count; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JOB_ID((short)1, "job_id"),
    JOB_STATE((short)2, "job_state"),
    SINK_COUNT((short)3, "sink_count"),
    SOURCE_COUNT((short)4, "source_count");

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
        case 2: // JOB_STATE
          return JOB_STATE;
        case 3: // SINK_COUNT
          return SINK_COUNT;
        case 4: // SOURCE_COUNT
          return SOURCE_COUNT;
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
  private static final int __JOB_STATE_ISSET_ID = 1;
  private static final int __SINK_COUNT_ISSET_ID = 2;
  private static final int __SOURCE_COUNT_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB_ID, new org.apache.thrift.meta_data.FieldMetaData("job_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.JOB_STATE, new org.apache.thrift.meta_data.FieldMetaData("job_state", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SINK_COUNT, new org.apache.thrift.meta_data.FieldMetaData("sink_count", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SOURCE_COUNT, new org.apache.thrift.meta_data.FieldMetaData("source_count", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ReportReq.class, metaDataMap);
  }

  public ReportReq() {
  }

  public ReportReq(
    int job_id,
    int job_state,
    long sink_count,
    long source_count)
  {
    this();
    this.job_id = job_id;
    setJob_idIsSet(true);
    this.job_state = job_state;
    setJob_stateIsSet(true);
    this.sink_count = sink_count;
    setSink_countIsSet(true);
    this.source_count = source_count;
    setSource_countIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReportReq(ReportReq other) {
    __isset_bitfield = other.__isset_bitfield;
    this.job_id = other.job_id;
    this.job_state = other.job_state;
    this.sink_count = other.sink_count;
    this.source_count = other.source_count;
  }

  public ReportReq deepCopy() {
    return new ReportReq(this);
  }

  @Override
  public void clear() {
    setJob_idIsSet(false);
    this.job_id = 0;
    setJob_stateIsSet(false);
    this.job_state = 0;
    setSink_countIsSet(false);
    this.sink_count = 0;
    setSource_countIsSet(false);
    this.source_count = 0;
  }

  public int getJob_id() {
    return this.job_id;
  }

  public ReportReq setJob_id(int job_id) {
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

  public int getJob_state() {
    return this.job_state;
  }

  public ReportReq setJob_state(int job_state) {
    this.job_state = job_state;
    setJob_stateIsSet(true);
    return this;
  }

  public void unsetJob_state() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __JOB_STATE_ISSET_ID);
  }

  /** Returns true if field job_state is set (has been assigned a value) and false otherwise */
  public boolean isSetJob_state() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __JOB_STATE_ISSET_ID);
  }

  public void setJob_stateIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __JOB_STATE_ISSET_ID, value);
  }

  public long getSink_count() {
    return this.sink_count;
  }

  public ReportReq setSink_count(long sink_count) {
    this.sink_count = sink_count;
    setSink_countIsSet(true);
    return this;
  }

  public void unsetSink_count() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SINK_COUNT_ISSET_ID);
  }

  /** Returns true if field sink_count is set (has been assigned a value) and false otherwise */
  public boolean isSetSink_count() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SINK_COUNT_ISSET_ID);
  }

  public void setSink_countIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SINK_COUNT_ISSET_ID, value);
  }

  public long getSource_count() {
    return this.source_count;
  }

  public ReportReq setSource_count(long source_count) {
    this.source_count = source_count;
    setSource_countIsSet(true);
    return this;
  }

  public void unsetSource_count() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SOURCE_COUNT_ISSET_ID);
  }

  /** Returns true if field source_count is set (has been assigned a value) and false otherwise */
  public boolean isSetSource_count() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SOURCE_COUNT_ISSET_ID);
  }

  public void setSource_countIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SOURCE_COUNT_ISSET_ID, value);
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

    case JOB_STATE:
      if (value == null) {
        unsetJob_state();
      } else {
        setJob_state((Integer)value);
      }
      break;

    case SINK_COUNT:
      if (value == null) {
        unsetSink_count();
      } else {
        setSink_count((Long)value);
      }
      break;

    case SOURCE_COUNT:
      if (value == null) {
        unsetSource_count();
      } else {
        setSource_count((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_ID:
      return getJob_id();

    case JOB_STATE:
      return getJob_state();

    case SINK_COUNT:
      return getSink_count();

    case SOURCE_COUNT:
      return getSource_count();

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
    case JOB_STATE:
      return isSetJob_state();
    case SINK_COUNT:
      return isSetSink_count();
    case SOURCE_COUNT:
      return isSetSource_count();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ReportReq)
      return this.equals((ReportReq)that);
    return false;
  }

  public boolean equals(ReportReq that) {
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

    boolean this_present_job_state = true;
    boolean that_present_job_state = true;
    if (this_present_job_state || that_present_job_state) {
      if (!(this_present_job_state && that_present_job_state))
        return false;
      if (this.job_state != that.job_state)
        return false;
    }

    boolean this_present_sink_count = true;
    boolean that_present_sink_count = true;
    if (this_present_sink_count || that_present_sink_count) {
      if (!(this_present_sink_count && that_present_sink_count))
        return false;
      if (this.sink_count != that.sink_count)
        return false;
    }

    boolean this_present_source_count = true;
    boolean that_present_source_count = true;
    if (this_present_source_count || that_present_source_count) {
      if (!(this_present_source_count && that_present_source_count))
        return false;
      if (this.source_count != that.source_count)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + job_id;

    hashCode = hashCode * 8191 + job_state;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(sink_count);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(source_count);

    return hashCode;
  }

  @Override
  public int compareTo(ReportReq other) {
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
    lastComparison = Boolean.valueOf(isSetJob_state()).compareTo(other.isSetJob_state());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJob_state()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.job_state, other.job_state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSink_count()).compareTo(other.isSetSink_count());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSink_count()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sink_count, other.sink_count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSource_count()).compareTo(other.isSetSource_count());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSource_count()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.source_count, other.source_count);
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
    StringBuilder sb = new StringBuilder("ReportReq(");
    boolean first = true;

    sb.append("job_id:");
    sb.append(this.job_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("job_state:");
    sb.append(this.job_state);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sink_count:");
    sb.append(this.sink_count);
    first = false;
    if (!first) sb.append(", ");
    sb.append("source_count:");
    sb.append(this.source_count);
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

  private static class ReportReqStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ReportReqStandardScheme getScheme() {
      return new ReportReqStandardScheme();
    }
  }

  private static class ReportReqStandardScheme extends org.apache.thrift.scheme.StandardScheme<ReportReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ReportReq struct) throws org.apache.thrift.TException {
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
          case 2: // JOB_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.job_state = iprot.readI32();
              struct.setJob_stateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SINK_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.sink_count = iprot.readI64();
              struct.setSink_countIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SOURCE_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.source_count = iprot.readI64();
              struct.setSource_countIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ReportReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(JOB_ID_FIELD_DESC);
      oprot.writeI32(struct.job_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(JOB_STATE_FIELD_DESC);
      oprot.writeI32(struct.job_state);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SINK_COUNT_FIELD_DESC);
      oprot.writeI64(struct.sink_count);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SOURCE_COUNT_FIELD_DESC);
      oprot.writeI64(struct.source_count);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReportReqTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ReportReqTupleScheme getScheme() {
      return new ReportReqTupleScheme();
    }
  }

  private static class ReportReqTupleScheme extends org.apache.thrift.scheme.TupleScheme<ReportReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ReportReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetJob_id()) {
        optionals.set(0);
      }
      if (struct.isSetJob_state()) {
        optionals.set(1);
      }
      if (struct.isSetSink_count()) {
        optionals.set(2);
      }
      if (struct.isSetSource_count()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetJob_id()) {
        oprot.writeI32(struct.job_id);
      }
      if (struct.isSetJob_state()) {
        oprot.writeI32(struct.job_state);
      }
      if (struct.isSetSink_count()) {
        oprot.writeI64(struct.sink_count);
      }
      if (struct.isSetSource_count()) {
        oprot.writeI64(struct.source_count);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ReportReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.job_id = iprot.readI32();
        struct.setJob_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.job_state = iprot.readI32();
        struct.setJob_stateIsSet(true);
      }
      if (incoming.get(2)) {
        struct.sink_count = iprot.readI64();
        struct.setSink_countIsSet(true);
      }
      if (incoming.get(3)) {
        struct.source_count = iprot.readI64();
        struct.setSource_countIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
