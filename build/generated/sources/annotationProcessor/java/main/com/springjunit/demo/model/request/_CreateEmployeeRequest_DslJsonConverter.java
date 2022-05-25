package com.springjunit.demo.model.request;



@javax.annotation.processing.Generated("dsl_json")
public class _CreateEmployeeRequest_DslJsonConverter implements com.dslplatform.json.Configuration {
	private static final java.nio.charset.Charset utf8 = java.nio.charset.Charset.forName("UTF-8");
	@Override
	public void configure(com.dslplatform.json.DslJson __dsljson) {
		ObjectFormatConverter objectConverter = new ObjectFormatConverter(__dsljson);
		__dsljson.registerBinder(com.springjunit.demo.model.request.CreateEmployeeRequest.class, objectConverter);
		__dsljson.registerReader(com.springjunit.demo.model.request.CreateEmployeeRequest.class, objectConverter);
		__dsljson.registerWriter(com.springjunit.demo.model.request.CreateEmployeeRequest.class, objectConverter);
	}
	public final static class ObjectFormatConverter implements com.dslplatform.json.runtime.FormatConverter<com.springjunit.demo.model.request.CreateEmployeeRequest>, com.dslplatform.json.JsonReader.BindObject<com.springjunit.demo.model.request.CreateEmployeeRequest> {
		private final boolean alwaysSerialize;
		private final com.dslplatform.json.DslJson __dsljson;
		private final com.dslplatform.json.JsonReader.ReadObject<java.lang.Integer> reader_stationIds;
		private final com.dslplatform.json.JsonWriter.WriteObject<java.lang.Integer> writer_stationIds;
		private com.dslplatform.json.JsonReader.ReadObject<java.util.Date> reader_dateOfBirth;
		private com.dslplatform.json.JsonReader.ReadObject<java.util.Date> reader_dateOfBirth() {
			if (reader_dateOfBirth == null) {
				java.lang.reflect.Type manifest = java.util.Date.class;
				reader_dateOfBirth = __dsljson.tryFindReader(manifest);
				if (reader_dateOfBirth == null) {
					throw new com.dslplatform.json.ConfigurationException("Unable to find reader for " + manifest + ". Enable runtime conversion by initializing DslJson with new DslJson<>(Settings.basicSetup())");
				}
			}
			return reader_dateOfBirth;
		}
		private com.dslplatform.json.JsonWriter.WriteObject<java.util.Date> writer_dateOfBirth;
		private com.dslplatform.json.JsonWriter.WriteObject<java.util.Date> writer_dateOfBirth() {
			if (writer_dateOfBirth == null) {
				java.lang.reflect.Type manifest = java.util.Date.class;
				writer_dateOfBirth = __dsljson.tryFindWriter(manifest);
				if (writer_dateOfBirth == null) {
					throw new com.dslplatform.json.ConfigurationException("Unable to find writer for " + manifest + ". Enable runtime conversion by initializing DslJson with new DslJson<>(Settings.basicSetup())");
				}
			}
			return writer_dateOfBirth;
		}
		private com.dslplatform.json.JsonReader.ReadObject<com.springjunit.demo.model.request.PropertiesRequest> reader_positions;
		private com.dslplatform.json.JsonReader.ReadObject<com.springjunit.demo.model.request.PropertiesRequest> reader_positions() {
			if (reader_positions == null) {
				java.lang.reflect.Type manifest = com.springjunit.demo.model.request.PropertiesRequest.class;
				reader_positions = __dsljson.tryFindReader(manifest);
				if (reader_positions == null) {
					throw new com.dslplatform.json.ConfigurationException("Unable to find reader for " + manifest + ". Enable runtime conversion by initializing DslJson with new DslJson<>(Settings.basicSetup())");
				}
			}
			return reader_positions;
		}
		private com.dslplatform.json.JsonWriter.WriteObject<com.springjunit.demo.model.request.PropertiesRequest> writer_positions;
		private com.dslplatform.json.JsonWriter.WriteObject<com.springjunit.demo.model.request.PropertiesRequest> writer_positions() {
			if (writer_positions == null) {
				java.lang.reflect.Type manifest = com.springjunit.demo.model.request.PropertiesRequest.class;
				writer_positions = __dsljson.tryFindWriter(manifest);
				if (writer_positions == null) {
					throw new com.dslplatform.json.ConfigurationException("Unable to find writer for " + manifest + ". Enable runtime conversion by initializing DslJson with new DslJson<>(Settings.basicSetup())");
				}
			}
			return writer_positions;
		}
		public ObjectFormatConverter(com.dslplatform.json.DslJson __dsljson) {
			this.alwaysSerialize = !__dsljson.omitDefaults;
			this.__dsljson = __dsljson;
			this.reader_stationIds = com.dslplatform.json.NumberConverter.NULLABLE_INT_READER;
			this.writer_stationIds = com.dslplatform.json.NumberConverter.INT_WRITER;
		}
		public com.springjunit.demo.model.request.CreateEmployeeRequest read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if (reader.wasNull()) return null;
			return bind(reader, new com.springjunit.demo.model.request.CreateEmployeeRequest());
		}
		private static final byte[] quoted_email = "\"email\":".getBytes(utf8);
		private static final byte[] name_email = "email".getBytes(utf8);
		private static final byte[] quoted_positions = ",\"positions\":".getBytes(utf8);
		private static final byte[] name_positions = "positions".getBytes(utf8);
		private static final byte[] quoted_dateOfBirth = ",\"date_of_birth\":".getBytes(utf8);
		private static final byte[] name_dateOfBirth = "date_of_birth".getBytes(utf8);
		private static final byte[] quoted_fullAddress = ",\"fullAddress\":".getBytes(utf8);
		private static final byte[] name_fullAddress = "fullAddress".getBytes(utf8);
		private static final byte[] quoted_name = ",\"name\":".getBytes(utf8);
		private static final byte[] name_name = "name".getBytes(utf8);
		private static final byte[] quoted_sex = ",\"sex\":".getBytes(utf8);
		private static final byte[] name_sex = "sex".getBytes(utf8);
		private static final byte[] quoted_identityCardNumber = ",\"identityCardNumber\":".getBytes(utf8);
		private static final byte[] name_identityCardNumber = "identityCardNumber".getBytes(utf8);
		private static final byte[] quoted_stationIds = ",\"station_ids\":".getBytes(utf8);
		private static final byte[] name_stationIds = "station_ids".getBytes(utf8);
		private static final byte[] quoted_phone = ",\"phone\":".getBytes(utf8);
		private static final byte[] name_phone = "phone".getBytes(utf8);
		private static final byte[] quoted_address = ",\"address\":".getBytes(utf8);
		private static final byte[] name_address = "address".getBytes(utf8);
		private static final byte[] quoted_code = ",\"code\":".getBytes(utf8);
		private static final byte[] name_code = "code".getBytes(utf8);
		public final void write(final com.dslplatform.json.JsonWriter writer, final com.springjunit.demo.model.request.CreateEmployeeRequest instance) {
			if (instance == null) writer.writeNull();
			else {
				writer.writeByte((byte)'{');
				if (alwaysSerialize) { writeContentFull(writer, instance); writer.writeByte((byte)'}'); }
				else if (writeContentMinimal(writer, instance)) writer.getByteBuffer()[writer.size() - 1] = '}';
				else writer.writeByte((byte)'}');
			}
		}
		public void writeContentFull(final com.dslplatform.json.JsonWriter writer, final com.springjunit.demo.model.request.CreateEmployeeRequest instance) {
			writer.writeAscii(quoted_email);
			if (instance.getEmail() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getEmail(), writer);
			writer.writeAscii(quoted_positions);
			if (instance.getPositions() == null) throw new com.dslplatform.json.ConfigurationException("Property 'positions' is not allowed to be null");
			writer_positions().write(writer, instance.getPositions());
			writer.writeAscii(quoted_dateOfBirth);
			if (instance.getDateOfBirth() == null) writer.writeNull();
			else writer_dateOfBirth().write(writer, instance.getDateOfBirth());
			writer.writeAscii(quoted_fullAddress);
			if (instance.getFullAddress() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getFullAddress(), writer);
			writer.writeAscii(quoted_name);
			if (instance.getName() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getName(), writer);
			writer.writeAscii(quoted_sex);
			if (instance.getSex() == null) writer.writeNull();
			else { writer.writeByte((byte)'"'); writer.writeAscii(instance.getSex().name()); writer.writeByte((byte)'"'); }
			writer.writeAscii(quoted_identityCardNumber);
			if (instance.getIdentityCardNumber() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getIdentityCardNumber(), writer);
			writer.writeAscii(quoted_stationIds);
			if (instance.getStationIds() == null) writer.writeNull();
			else writer.serializeRaw(instance.getStationIds(), writer_stationIds);
			writer.writeAscii(quoted_phone);
			if (instance.getPhone() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getPhone(), writer);
			writer.writeAscii(quoted_address);
			if (instance.getAddress() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getAddress(), writer);
			writer.writeAscii(quoted_code);
			if (instance.getCode() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getCode(), writer);
		}
		public boolean writeContentMinimal(final com.dslplatform.json.JsonWriter writer, final com.springjunit.demo.model.request.CreateEmployeeRequest instance) {
			boolean hasWritten = false;
			if (instance.getEmail() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_email); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getEmail(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getPositions() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_positions); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				writer_positions().write(writer, instance.getPositions());
				writer.writeByte((byte)','); hasWritten = true;
			} else if (instance.getPositions() == null) throw new com.dslplatform.json.ConfigurationException("Property 'positions' is not allowed to be null");
			if (instance.getDateOfBirth() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_dateOfBirth); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				writer_dateOfBirth().write(writer, instance.getDateOfBirth());
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getFullAddress() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_fullAddress); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getFullAddress(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getName() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_name); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getName(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getSex() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_sex); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				{ writer.writeByte((byte)'"'); writer.writeAscii(instance.getSex().name()); writer.writeByte((byte)'"'); }
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getIdentityCardNumber() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_identityCardNumber); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getIdentityCardNumber(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getStationIds() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_stationIds); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				writer.serializeRaw(instance.getStationIds(), writer_stationIds);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getPhone() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_phone); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getPhone(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getAddress() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_address); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getAddress(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getCode() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_code); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getCode(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			return hasWritten;
		}
		public com.springjunit.demo.model.request.CreateEmployeeRequest bind(final com.dslplatform.json.JsonReader reader, final com.springjunit.demo.model.request.CreateEmployeeRequest instance) throws java.io.IOException {
			if (reader.last() != '{') throw reader.newParseError("Expecting '{' for object start");
			reader.getNextToken();
			bindContent(reader, instance);
			return instance;
		}
		public com.springjunit.demo.model.request.CreateEmployeeRequest readContent(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			com.springjunit.demo.model.request.CreateEmployeeRequest instance = new com.springjunit.demo.model.request.CreateEmployeeRequest();
 			bindContent(reader, instance);
			return instance;
		}
		public void bindContent(final com.dslplatform.json.JsonReader reader, final com.springjunit.demo.model.request.CreateEmployeeRequest instance) throws java.io.IOException {
			if (reader.last() == '}') {
				if (instance.getPositions() == null) instance.setPositions(new com.springjunit.demo.model.request.PropertiesRequest());
				return;
			}
			if (reader.fillNameWeakHash() != 520 || !reader.wasLastName(name_email)) { bindSlow(reader, instance, 0); return; }
			reader.getNextToken();
			instance.setEmail(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  {
				if (instance.getPositions() == null) instance.setPositions(new com.springjunit.demo.model.request.PropertiesRequest());
				return;
			}
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 1000 || !reader.wasLastName(name_positions)) { bindSlow(reader, instance, 1); return; }
			reader.getNextToken();
			if (reader.wasNull()) throw reader.newParseErrorAt("Property 'positions' is not allowed to be null", 0);
			instance.setPositions(reader_positions().read(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 1354 || !reader.wasLastName(name_dateOfBirth)) { bindSlow(reader, instance, 2); return; }
			reader.getNextToken();
			instance.setDateOfBirth(reader_dateOfBirth().read(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 1145 || !reader.wasLastName(name_fullAddress)) { bindSlow(reader, instance, 3); return; }
			reader.getNextToken();
			instance.setFullAddress(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 417 || !reader.wasLastName(name_name)) { bindSlow(reader, instance, 4); return; }
			reader.getNextToken();
			instance.setName(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 336 || !reader.wasLastName(name_sex)) { bindSlow(reader, instance, 5); return; }
			reader.getNextToken();
			instance.setSex(reader.wasNull() ? null : com.springjunit.demo.model.bo._Gender_DslJsonConverter.EnumConverter.readStatic(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 1869 || !reader.wasLastName(name_identityCardNumber)) { bindSlow(reader, instance, 6); return; }
			reader.getNextToken();
			instance.setIdentityCardNumber(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 1185 || !reader.wasLastName(name_stationIds)) { bindSlow(reader, instance, 7); return; }
			reader.getNextToken();
			instance.setStationIds(reader.readCollection(reader_stationIds));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 538 || !reader.wasLastName(name_phone)) { bindSlow(reader, instance, 8); return; }
			reader.getNextToken();
			instance.setPhone(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 742 || !reader.wasLastName(name_address)) { bindSlow(reader, instance, 9); return; }
			reader.getNextToken();
			instance.setAddress(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 411 || !reader.wasLastName(name_code)) { bindSlow(reader, instance, 10); return; }
			reader.getNextToken();
			instance.setCode(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() != '}') {
				if (reader.last() == ',') {
					reader.getNextToken();
					reader.fillNameWeakHash();
					bindSlow(reader, instance, 11);
				}
				if (reader.last() != '}') throw reader.newParseError("Expecting '}' for object end");
			}
		}
		private void bindSlow(final com.dslplatform.json.JsonReader reader, final com.springjunit.demo.model.request.CreateEmployeeRequest instance, int index) throws java.io.IOException {
			boolean __detected_positions__ = index > 1;
			switch(reader.getLastHash()) {
				case -114201356:
					reader.getNextToken();
					instance.setCode(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case 745154899:
					reader.getNextToken();
					instance.setAddress(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case 2000032175:
					reader.getNextToken();
					instance.setPhone(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case 1501105326:
					reader.getNextToken();
					instance.setStationIds(reader.readCollection(reader_stationIds));
					reader.getNextToken();
					break;
				case 473211880:
					reader.getNextToken();
					instance.setIdentityCardNumber(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case -769189401:
					reader.getNextToken();
					instance.setSex(reader.wasNull() ? null : com.springjunit.demo.model.bo._Gender_DslJsonConverter.EnumConverter.readStatic(reader));
					reader.getNextToken();
					break;
				case -1925595674:
					reader.getNextToken();
					instance.setName(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case 630859148:
					reader.getNextToken();
					instance.setFullAddress(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case -1130377219:
					reader.getNextToken();
					instance.setDateOfBirth(reader_dateOfBirth().read(reader));
					reader.getNextToken();
					break;
				case 1591249019:
					__detected_positions__ = true;
					reader.getNextToken();
					if (reader.wasNull()) throw reader.newParseErrorAt("Property 'positions' is not allowed to be null", 0);
					instance.setPositions(reader_positions().read(reader));
					reader.getNextToken();
					break;
				case -1970842681:
					reader.getNextToken();
					instance.setEmail(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				default:
					reader.getNextToken();
					reader.skip();
			}
			while (reader.last() == ','){
				reader.getNextToken();
				switch(reader.fillName()) {
					case -114201356:
						reader.getNextToken();
						instance.setCode(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case 745154899:
						reader.getNextToken();
						instance.setAddress(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case 2000032175:
						reader.getNextToken();
						instance.setPhone(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case 1501105326:
						reader.getNextToken();
						instance.setStationIds(reader.readCollection(reader_stationIds));
						reader.getNextToken();
						break;
					case 473211880:
						reader.getNextToken();
						instance.setIdentityCardNumber(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case -769189401:
						reader.getNextToken();
						instance.setSex(reader.wasNull() ? null : com.springjunit.demo.model.bo._Gender_DslJsonConverter.EnumConverter.readStatic(reader));
						reader.getNextToken();
						break;
					case -1925595674:
						reader.getNextToken();
						instance.setName(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case 630859148:
						reader.getNextToken();
						instance.setFullAddress(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case -1130377219:
						reader.getNextToken();
						instance.setDateOfBirth(reader_dateOfBirth().read(reader));
						reader.getNextToken();
						break;
					case 1591249019:
						__detected_positions__ = true;
						reader.getNextToken();
						if (reader.wasNull()) throw reader.newParseErrorAt("Property 'positions' is not allowed to be null", 0);
						instance.setPositions(reader_positions().read(reader));
						reader.getNextToken();
						break;
					case -1970842681:
						reader.getNextToken();
						instance.setEmail(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					default:
						reader.getNextToken();
						reader.skip();
				}
			}
			if (reader.last() != '}') throw reader.newParseError("Expecting '}' for object end");
			if (!__detected_positions__ && instance.getPositions() == null) {
				instance.setPositions(new com.springjunit.demo.model.request.PropertiesRequest());
			}
		}
	}
}
