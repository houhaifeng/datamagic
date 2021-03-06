/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package cn.wind.com.reader.model;
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

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class RssProvider implements TBase<RssProvider, RssProvider._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("RssProvider");

  private static final TField ID_FIELD_DESC = new TField("id", TType.I64, (short)1);
  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)2);
  private static final TField URL_FIELD_DESC = new TField("url", TType.STRING, (short)3);
  private static final TField DESCRIPTION_FIELD_DESC = new TField("description", TType.STRING, (short)4);
  private static final TField CATEGORY_FIELD_DESC = new TField("category", TType.I64, (short)5);
  private static final TField PARENT_ID_FIELD_DESC = new TField("parentId", TType.I64, (short)6);

  private long id;
  private String name;
  private String url;
  private String description;
  private long category;
  private long parentId;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    ID((short)1, "id"),
    NAME((short)2, "name"),
    URL((short)3, "url"),
    DESCRIPTION((short)4, "description"),
    CATEGORY((short)5, "category"),
    PARENT_ID((short)6, "parentId");

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
        case 1: // ID
          return ID;
        case 2: // NAME
          return NAME;
        case 3: // URL
          return URL;
        case 4: // DESCRIPTION
          return DESCRIPTION;
        case 5: // CATEGORY
          return CATEGORY;
        case 6: // PARENT_ID
          return PARENT_ID;
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
  private static final int __ID_ISSET_ID = 0;
  private static final int __CATEGORY_ISSET_ID = 1;
  private static final int __PARENTID_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new FieldMetaData("id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.NAME, new FieldMetaData("name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.URL, new FieldMetaData("url", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.DESCRIPTION, new FieldMetaData("description", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.CATEGORY, new FieldMetaData("category", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.PARENT_ID, new FieldMetaData("parentId", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(RssProvider.class, metaDataMap);
  }

  public RssProvider() {
  }

  public RssProvider(
    long id,
    String name,
    String url,
    String description,
    long category,
    long parentId)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.name = name;
    this.url = url;
    this.description = description;
    this.category = category;
    setCategoryIsSet(true);
    this.parentId = parentId;
    setParentIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RssProvider(RssProvider other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.id = other.id;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetUrl()) {
      this.url = other.url;
    }
    if (other.isSetDescription()) {
      this.description = other.description;
    }
    this.category = other.category;
    this.parentId = other.parentId;
  }

  public RssProvider deepCopy() {
    return new RssProvider(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.name = null;
    this.url = null;
    this.description = null;
    setCategoryIsSet(false);
    this.category = 0;
    setParentIdIsSet(false);
    this.parentId = 0;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
    setIdIsSet(true);
  }

  public void unsetId() {
    __isset_bit_vector.clear(__ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been asigned a value) and false otherwise */
  public boolean isSetId() {
    return __isset_bit_vector.get(__ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bit_vector.set(__ID_ISSET_ID, value);
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been asigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void unsetUrl() {
    this.url = null;
  }

  /** Returns true if field url is set (has been asigned a value) and false otherwise */
  public boolean isSetUrl() {
    return this.url != null;
  }

  public void setUrlIsSet(boolean value) {
    if (!value) {
      this.url = null;
    }
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void unsetDescription() {
    this.description = null;
  }

  /** Returns true if field description is set (has been asigned a value) and false otherwise */
  public boolean isSetDescription() {
    return this.description != null;
  }

  public void setDescriptionIsSet(boolean value) {
    if (!value) {
      this.description = null;
    }
  }

  public long getCategory() {
    return this.category;
  }

  public void setCategory(long category) {
    this.category = category;
    setCategoryIsSet(true);
  }

  public void unsetCategory() {
    __isset_bit_vector.clear(__CATEGORY_ISSET_ID);
  }

  /** Returns true if field category is set (has been asigned a value) and false otherwise */
  public boolean isSetCategory() {
    return __isset_bit_vector.get(__CATEGORY_ISSET_ID);
  }

  public void setCategoryIsSet(boolean value) {
    __isset_bit_vector.set(__CATEGORY_ISSET_ID, value);
  }

  public long getParentId() {
    return this.parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
    setParentIdIsSet(true);
  }

  public void unsetParentId() {
    __isset_bit_vector.clear(__PARENTID_ISSET_ID);
  }

  /** Returns true if field parentId is set (has been asigned a value) and false otherwise */
  public boolean isSetParentId() {
    return __isset_bit_vector.get(__PARENTID_ISSET_ID);
  }

  public void setParentIdIsSet(boolean value) {
    __isset_bit_vector.set(__PARENTID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Long)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case URL:
      if (value == null) {
        unsetUrl();
      } else {
        setUrl((String)value);
      }
      break;

    case DESCRIPTION:
      if (value == null) {
        unsetDescription();
      } else {
        setDescription((String)value);
      }
      break;

    case CATEGORY:
      if (value == null) {
        unsetCategory();
      } else {
        setCategory((Long)value);
      }
      break;

    case PARENT_ID:
      if (value == null) {
        unsetParentId();
      } else {
        setParentId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return new Long(getId());

    case NAME:
      return getName();

    case URL:
      return getUrl();

    case DESCRIPTION:
      return getDescription();

    case CATEGORY:
      return new Long(getCategory());

    case PARENT_ID:
      return new Long(getParentId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case NAME:
      return isSetName();
    case URL:
      return isSetUrl();
    case DESCRIPTION:
      return isSetDescription();
    case CATEGORY:
      return isSetCategory();
    case PARENT_ID:
      return isSetParentId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RssProvider)
      return this.equals((RssProvider)that);
    return false;
  }

  public boolean equals(RssProvider that) {
    if (that == null)
      return false;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_url = true && this.isSetUrl();
    boolean that_present_url = true && that.isSetUrl();
    if (this_present_url || that_present_url) {
      if (!(this_present_url && that_present_url))
        return false;
      if (!this.url.equals(that.url))
        return false;
    }

    boolean this_present_description = true && this.isSetDescription();
    boolean that_present_description = true && that.isSetDescription();
    if (this_present_description || that_present_description) {
      if (!(this_present_description && that_present_description))
        return false;
      if (!this.description.equals(that.description))
        return false;
    }

    boolean this_present_category = true;
    boolean that_present_category = true;
    if (this_present_category || that_present_category) {
      if (!(this_present_category && that_present_category))
        return false;
      if (this.category != that.category)
        return false;
    }

    boolean this_present_parentId = true;
    boolean that_present_parentId = true;
    if (this_present_parentId || that_present_parentId) {
      if (!(this_present_parentId && that_present_parentId))
        return false;
      if (this.parentId != that.parentId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(RssProvider other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    RssProvider typedOther = (RssProvider)other;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUrl()).compareTo(typedOther.isSetUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUrl()) {
      lastComparison = TBaseHelper.compareTo(this.url, typedOther.url);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDescription()).compareTo(typedOther.isSetDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescription()) {
      lastComparison = TBaseHelper.compareTo(this.description, typedOther.description);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCategory()).compareTo(typedOther.isSetCategory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCategory()) {
      lastComparison = TBaseHelper.compareTo(this.category, typedOther.category);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParentId()).compareTo(typedOther.isSetParentId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParentId()) {
      lastComparison = TBaseHelper.compareTo(this.parentId, typedOther.parentId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // ID
          if (field.type == TType.I64) {
            this.id = iprot.readI64();
            setIdIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NAME
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // URL
          if (field.type == TType.STRING) {
            this.url = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // DESCRIPTION
          if (field.type == TType.STRING) {
            this.description = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // CATEGORY
          if (field.type == TType.I64) {
            this.category = iprot.readI64();
            setCategoryIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // PARENT_ID
          if (field.type == TType.I64) {
            this.parentId = iprot.readI64();
            setParentIdIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(ID_FIELD_DESC);
    oprot.writeI64(this.id);
    oprot.writeFieldEnd();
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    if (this.url != null) {
      oprot.writeFieldBegin(URL_FIELD_DESC);
      oprot.writeString(this.url);
      oprot.writeFieldEnd();
    }
    if (this.description != null) {
      oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
      oprot.writeString(this.description);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(CATEGORY_FIELD_DESC);
    oprot.writeI64(this.category);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(PARENT_ID_FIELD_DESC);
    oprot.writeI64(this.parentId);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RssProvider(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("url:");
    if (this.url == null) {
      sb.append("null");
    } else {
      sb.append(this.url);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("description:");
    if (this.description == null) {
      sb.append("null");
    } else {
      sb.append(this.description);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("category:");
    sb.append(this.category);
    first = false;
    if (!first) sb.append(", ");
    sb.append("parentId:");
    sb.append(this.parentId);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

