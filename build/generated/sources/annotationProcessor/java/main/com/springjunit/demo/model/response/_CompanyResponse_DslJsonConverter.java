package com.springjunit.demo.model.response;



@javax.annotation.processing.Generated("dsl_json")
public class _CompanyResponse_DslJsonConverter implements com.dslplatform.json.Configuration {
	private static final java.nio.charset.Charset utf8 = java.nio.charset.Charset.forName("UTF-8");
	@Override
	public void configure(com.dslplatform.json.DslJson __dsljson) {
		ObjectFormatConverter objectConverter = new ObjectFormatConverter(__dsljson);
		__dsljson.registerBinder(com.springjunit.demo.model.response.CompanyResponse.class, objectConverter);
		__dsljson.registerReader(com.springjunit.demo.model.response.CompanyResponse.class, objectConverter);
		__dsljson.registerWriter(com.springjunit.demo.model.response.CompanyResponse.class, objectConverter);
	}
	public final static class ObjectFormatConverter implements com.dslplatform.json.runtime.FormatConverter<com.springjunit.demo.model.response.CompanyResponse>, com.dslplatform.json.JsonReader.BindObject<com.springjunit.demo.model.response.CompanyResponse> {
		private final boolean alwaysSerialize;
		private final com.dslplatform.json.DslJson __dsljson;
		private com.dslplatform.json.JsonReader.ReadObject<com.springjunit.demo.model.response.EmployeeInfo> reader_employeeInfos;
		private com.dslplatform.json.JsonReader.ReadObject<com.springjunit.demo.model.response.EmployeeInfo> reader_employeeInfos() {
			if (reader_employeeInfos == null) {
				java.lang.reflect.Type manifest = com.springjunit.demo.model.response.EmployeeInfo.class;
				reader_employeeInfos = __dsljson.tryFindReader(manifest);
				if (reader_employeeInfos == null) {
					throw new com.dslplatform.json.ConfigurationException("Unable to find reader for " + manifest + ". Enable runtime conversion by initializing DslJson with new DslJson<>(Settings.basicSetup())");
				}
			}
			return reader_employeeInfos;
		}
		private com.dslplatform.json.JsonWriter.WriteObject<com.springjunit.demo.model.response.EmployeeInfo> writer_employeeInfos;
		private com.dslplatform.json.JsonWriter.WriteObject<com.springjunit.demo.model.response.EmployeeInfo> writer_employeeInfos() {
			if (writer_employeeInfos == null) {
				java.lang.reflect.Type manifest = com.springjunit.demo.model.response.EmployeeInfo.class;
				writer_employeeInfos = __dsljson.tryFindWriter(manifest);
				if (writer_employeeInfos == null) {
					throw new com.dslplatform.json.ConfigurationException("Unable to find writer for " + manifest + ". Enable runtime conversion by initializing DslJson with new DslJson<>(Settings.basicSetup())");
				}
			}
			return writer_employeeInfos;
		}
		public ObjectFormatConverter(com.dslplatform.json.DslJson __dsljson) {
			this.alwaysSerialize = !__dsljson.omitDefaults;
			this.__dsljson = __dsljson;
		}
		public com.springjunit.demo.model.response.CompanyResponse read(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			if (reader.wasNull()) return null;
			return bind(reader, new com.springjunit.demo.model.response.CompanyResponse());
		}
		private static final byte[] quoted_id = "\"id\":".getBytes(utf8);
		private static final byte[] name_id = "id".getBytes(utf8);
		private static final byte[] quoted_name = ",\"name\":".getBytes(utf8);
		private static final byte[] name_name = "name".getBytes(utf8);
		private static final byte[] quoted_employeeInfos = ",\"employee_Infos\":".getBytes(utf8);
		private static final byte[] name_employeeInfos = "employee_Infos".getBytes(utf8);
		private static final byte[] quoted_code = ",\"code\":".getBytes(utf8);
		private static final byte[] name_code = "code".getBytes(utf8);
		private static final byte[] quoted_address = ",\"address\":".getBytes(utf8);
		private static final byte[] name_address = "address".getBytes(utf8);
		public final void write(final com.dslplatform.json.JsonWriter writer, final com.springjunit.demo.model.response.CompanyResponse instance) {
			if (instance == null) writer.writeNull();
			else {
				writer.writeByte((byte)'{');
				if (alwaysSerialize) { writeContentFull(writer, instance); writer.writeByte((byte)'}'); }
				else if (writeContentMinimal(writer, instance)) writer.getByteBuffer()[writer.size() - 1] = '}';
				else writer.writeByte((byte)'}');
			}
		}
		public void writeContentFull(final com.dslplatform.json.JsonWriter writer, final com.springjunit.demo.model.response.CompanyResponse instance) {
			writer.writeAscii(quoted_id);
			com.dslplatform.json.NumberConverter.serialize(instance.getId(), writer);
			writer.writeAscii(quoted_name);
			if (instance.getName() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getName(), writer);
			writer.writeAscii(quoted_employeeInfos);
			if (instance.getEmployeeInfos() == null) writer.writeNull();
			else writer.serialize(instance.getEmployeeInfos(), writer_employeeInfos());
			writer.writeAscii(quoted_code);
			if (instance.getCode() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getCode(), writer);
			writer.writeAscii(quoted_address);
			if (instance.getAddress() == null) writer.writeNull();
			else com.dslplatform.json.StringConverter.serialize(instance.getAddress(), writer);
		}
		public boolean writeContentMinimal(final com.dslplatform.json.JsonWriter writer, final com.springjunit.demo.model.response.CompanyResponse instance) {
			boolean hasWritten = false;
			if (instance.getId() != 0) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_id); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.NumberConverter.serialize(instance.getId(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getName() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_name); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getName(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getEmployeeInfos() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_employeeInfos); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				writer.serialize(instance.getEmployeeInfos(), writer_employeeInfos());
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getCode() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_code); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getCode(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			if (instance.getAddress() != null) {
				writer.writeByte((byte)'"'); writer.writeAscii(name_address); writer.writeByte((byte)'"'); writer.writeByte((byte)':');
				com.dslplatform.json.StringConverter.serialize(instance.getAddress(), writer);
				writer.writeByte((byte)','); hasWritten = true;
			}
			return hasWritten;
		}
		public com.springjunit.demo.model.response.CompanyResponse bind(final com.dslplatform.json.JsonReader reader, final com.springjunit.demo.model.response.CompanyResponse instance) throws java.io.IOException {
			if (reader.last() != '{') throw reader.newParseError("Expecting '{' for object start");
			reader.getNextToken();
			bindContent(reader, instance);
			return instance;
		}
		public com.springjunit.demo.model.response.CompanyResponse readContent(final com.dslplatform.json.JsonReader reader) throws java.io.IOException {
			com.springjunit.demo.model.response.CompanyResponse instance = new com.springjunit.demo.model.response.CompanyResponse();
 			bindContent(reader, instance);
			return instance;
		}
		public void bindContent(final com.dslplatform.json.JsonReader reader, final com.springjunit.demo.model.response.CompanyResponse instance) throws java.io.IOException {
			if (reader.last() == '}') return;
			if (reader.fillNameWeakHash() != 205 || !reader.wasLastName(name_id)) { bindSlow(reader, instance, 0); return; }
			reader.getNextToken();
			instance.setId(com.dslplatform.json.NumberConverter.deserializeInt(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 417 || !reader.wasLastName(name_name)) { bindSlow(reader, instance, 1); return; }
			reader.getNextToken();
			instance.setName(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 1470 || !reader.wasLastName(name_employeeInfos)) { bindSlow(reader, instance, 2); return; }
			reader.getNextToken();
			instance.setEmployeeInfos(reader.readCollection(reader_employeeInfos()));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 411 || !reader.wasLastName(name_code)) { bindSlow(reader, instance, 3); return; }
			reader.getNextToken();
			instance.setCode(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() == '}')  return;
			if (reader.last() != ',') throw reader.newParseError("Expecting ',' for other mandatory properties"); else reader.getNextToken();
			if (reader.fillNameWeakHash() != 742 || !reader.wasLastName(name_address)) { bindSlow(reader, instance, 4); return; }
			reader.getNextToken();
			instance.setAddress(com.dslplatform.json.StringConverter.READER.read(reader));
			if (reader.getNextToken() != '}') {
				if (reader.last() == ',') {
					reader.getNextToken();
					reader.fillNameWeakHash();
					bindSlow(reader, instance, 5);
				}
				if (reader.last() != '}') throw reader.newParseError("Expecting '}' for object end");
			}
		}
		private void bindSlow(final com.dslplatform.json.JsonReader reader, final com.springjunit.demo.model.response.CompanyResponse instance, int index) throws java.io.IOException {
			switch(reader.getLastHash()) {
				case 745154899:
					reader.getNextToken();
					instance.setAddress(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case -114201356:
					reader.getNextToken();
					instance.setCode(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case -1279705885:
					reader.getNextToken();
					instance.setEmployeeInfos(reader.readCollection(reader_employeeInfos()));
					reader.getNextToken();
					break;
				case -1925595674:
					reader.getNextToken();
					instance.setName(com.dslplatform.json.StringConverter.READER.read(reader));
					reader.getNextToken();
					break;
				case 926444256:
					reader.getNextToken();
					instance.setId(com.dslplatform.json.NumberConverter.deserializeInt(reader));
					reader.getNextToken();
					break;
				default:
					reader.getNextToken();
					reader.skip();
			}
			while (reader.last() == ','){
				reader.getNextToken();
				switch(reader.fillName()) {
					case 745154899:
						reader.getNextToken();
						instance.setAddress(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case -114201356:
						reader.getNextToken();
						instance.setCode(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case -1279705885:
						reader.getNextToken();
						instance.setEmployeeInfos(reader.readCollection(reader_employeeInfos()));
						reader.getNextToken();
						break;
					case -1925595674:
						reader.getNextToken();
						instance.setName(com.dslplatform.json.StringConverter.READER.read(reader));
						reader.getNextToken();
						break;
					case 926444256:
						reader.getNextToken();
						instance.setId(com.dslplatform.json.NumberConverter.deserializeInt(reader));
						reader.getNextToken();
						break;
					default:
						reader.getNextToken();
						reader.skip();
				}
			}
			if (reader.last() != '}') throw reader.newParseError("Expecting '}' for object end");
		}
	}
}
